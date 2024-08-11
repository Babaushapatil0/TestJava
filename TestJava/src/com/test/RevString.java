package com.test;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		revStringWithCharAt( "CHANDRU BHAI" );
		System.out.println("===================================================");

		revStringWithToCharArray("BABUSHA");

		System.out.println("\n===================================================");

		revStringWithStringBuilder("PATIL");
	}

	/**
	 * 
	 * @param str
	 */
	public static void revStringWithCharAt( String str ) {

		
		String emptyStr = "";

		for( int loop = str.length() - 1 ; loop >= 0 ; loop-- ) {

			emptyStr = emptyStr + str.charAt(loop);
		}

		System.out.println( "Rev String : " + emptyStr);
	}

	public static void revStringWithToCharArray( String str ) {
		
		char[] strchar = str.toCharArray();
		for( int i = strchar.length-1 ; i>=0; i-- ) {
			System.out.print( strchar[i] );
		}
	}

	public static void revStringWithStringBuilder( String str ) {

		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}
}
