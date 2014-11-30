package boki.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("^PBS[0-9]P*$");
		
		String re = "^PBS[0-9]{3}P.*$";
		
		String s1 = "PBS200W_1020101.csv";
		String s2 = "PBS400P_10210111422.pdf";
		String s3 = "PBS430P1_1020101.pdf";
		String s4 = "PBS500P3_1020101.pdf";
		String s5 = "ºÊ¹î°|_err.xls";
		String s6 = "PBS780P1_1020101_100.pdf";
		
		System.out.println(s1.matches(re));
		System.out.println(s2.matches(re));
		System.out.println(s3.matches(re));
		System.out.println(s4.matches(re));
		System.out.println(s5.matches(re));
		System.out.println(s6.matches(re));
/*		
		Matcher matcher = pattern.matcher(s1);
		System.out.println(matcher.find());
		matcher = pattern.matcher(s2);
		System.out.println(matcher.find());
		matcher = pattern.matcher(s3);
		System.out.println(matcher.find());
		matcher = pattern.matcher(s4);
		System.out.println(matcher.find());
		matcher = pattern.matcher(s5);
		System.out.println(matcher.find());
		matcher = pattern.matcher(s6);
		System.out.println(matcher.find());
		*/
	}

}

