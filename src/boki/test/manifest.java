package boki.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class manifest {
	public static void main(String[] args)throws Exception {
		String srcPath = "D:/manifest_compr/PBS102052901.xls";
		String tarPath = "D:/manifest_compr/manifest.xls";
		compareXLS(srcPath, tarPath);
    }
	
	public static void compareXLS(String srcPath, String tarPath) throws Exception{
		InputStream is1 = new FileInputStream(srcPath);
		InputStream is2 = new FileInputStream(tarPath);
		
        HSSFWorkbook srcXLS = new HSSFWorkbook(new POIFSFileSystem(is1));
        HSSFWorkbook tarXLS = new HSSFWorkbook(new POIFSFileSystem(is2));
        
        HSSFSheet srcSht = srcXLS.getSheetAt(0);
        HSSFSheet tarSht = tarXLS.getSheetAt(0);
        
        int rowNum = tarSht.getLastRowNum();
        	
        // 紀錄新增清單
        Map<String , HSSFRow> insrtMeni = new LinkedHashMap<String , HSSFRow>();
        
        // 來源xls列數從第一列開始(pass表頭)
        for (int i = 1; i <= srcSht.getLastRowNum(); i++) {
        	// 取得第i列資料
        	HSSFRow srcRow = srcSht.getRow(i);
        	
        	// new陣列儲存一列的cell資料
        	String[] cellAry = new String[srcRow.getLastCellNum()];
        	
    		// 若來源xls之"程式異動別"="N",放到新增map中
        	if ("N".equalsIgnoreCase(srcRow.getCell(1).toString())) {
        		// 以檔名+CC目錄位置為key
        		insrtMeni.put(srcRow.getCell(0).toString()+"_"+srcRow.getCell(2).toString(), 
        				srcRow);
        		
            // 若來源xls之"程式異動別"="U",放到陣列中，再去更新menifact檔
        	} else if ("U".equalsIgnoreCase(srcRow.getCell(1).toString())) {
                for (int j = 0; j < srcRow.getLastCellNum(); j++) {                	
            		// 把每一列cell資料放到陣列中
                	cellAry[j] = srcRow.getCell(j) == null ? "" : srcRow.getCell(j).toString();
                }
                // 更新menifact檔
                replace(cellAry, tarSht);
        	} else if ("D".equalsIgnoreCase(srcRow.getCell(1).toString())) {
        		delete(srcRow, tarSht, rowNum);
        		--rowNum;
        	}
        }
        
        // 若有需新增的清單，更新menifact
        for (String key : insrtMeni.keySet()) {
        	++rowNum;
        	
        	HSSFRow newRow = tarSht.createRow(rowNum);

        	HSSFRow insertRow = (HSSFRow)insrtMeni.get(key);
        	
        	newRow.createCell(0).setCellValue(insertRow.getCell(0).toString());
        	
        	newRow.createCell(1).setCellValue(insertRow.getCell(2).toString());
        	
        	newRow.createCell(2).setCellValue(insertRow.getCell(3).toString());
        	
        	newRow.createCell(3).setCellValue(insertRow.getCell(4).toString());
        	
        	newRow.createCell(4).setCellValue(insertRow.getCell(5).toString());
        	
        	newRow.createCell(5).setCellValue(insertRow.getCell(6).toString());
        }
        
        FileOutputStream fileOut = new FileOutputStream(tarPath);                        
        
        tarXLS.write(fileOut);
        
        if (is1 != null) {
        	is1.close();
        }
        if (is2 != null) {
            is2.close();
        }
	}
	
	// 刪除menifact列資料
	public static void delete(HSSFRow delRow, HSSFSheet tarSht, int rowNum) {
		
		for (int i = 1; i <= tarSht.getLastRowNum(); i++) {
        	HSSFRow tarRow = tarSht.getRow(i);
        	
        	// 檢查改館清單"程式檔案名稱"等於menifact清單"程式檔案名稱"
        	if (delRow.getCell(0).toString().equalsIgnoreCase(tarRow.getCell(0).toString()) &&
        		delRow.getCell(2).toString().equalsIgnoreCase(tarRow.getCell(1).toString())) {
        		System.out.println("delete rowNum = " + i);
        		// 移除目標ROW
        		removeRow(tarSht, i, rowNum);
        		
        		break;
        	}
        }
	}
	
	// 刪除列
	public static void removeRow(HSSFSheet tarSht, int rowIndex, int rowNum) {
	    int lastRowNum=tarSht.getLastRowNum();
	    if (rowIndex>=0 && rowIndex< rowNum) {
	    	tarSht.shiftRows(rowIndex+1,rowNum, -1);
	    }
	    
	    if (rowIndex==rowNum) {
	        HSSFRow removingRow=tarSht.getRow(rowIndex);
	        if (removingRow!=null) {
	        	tarSht.removeRow(removingRow);
	        }
	    }
	}
	
	// 更新menifact檔版本號
	public static void replace(String[] cellAry, HSSFSheet tarSht) throws Exception {
		
		for (int i = 1; i <= tarSht.getLastRowNum(); i++) {
        	HSSFRow tarRow = tarSht.getRow(i);
        	
        	// 檢查改館清單"程式檔案名稱"等於menifact清單"程式檔案名稱"
        	if (cellAry[0].equalsIgnoreCase(tarRow.getCell(0).toString()) &&
        		cellAry[2].equalsIgnoreCase(tarRow.getCell(1).toString())) {
        		System.out.println("replace rowNum = " + i);
        		
        		// 派送規則名稱
        		tarRow.getCell(2).setCellValue(cellAry[3]);
        		// 功能代號
        		tarRow.getCell(3).setCellValue(cellAry[4]);
        		// 報表代號
        		tarRow.getCell(4).setCellValue(cellAry[5]);
        		// 進館版本資訊
        		tarRow.getCell(5).setCellValue(cellAry[6]);
        		
        		break;
        	}
        }
	}
}
