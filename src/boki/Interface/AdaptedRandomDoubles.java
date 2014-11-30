package boki.Interface;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

// 透過Adapted模式 繼承RandomDoubles並實作Readable
public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
	private int count;
	public AdaptedRandomDoubles(int count) {
		this.count = count;
	}
	public int read(CharBuffer cb) throws IOException {
		// indicates end of input
		if (count-- == 0) {
			return -1;
		}
		String rs = Double.toString(next()) + " ";
		cb.append(rs);
		return rs.length();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomDoubles(7));
		while (s.hasNextDouble()) {
			System.out.println(s.nextDouble() + " ");
		}
	}
}
