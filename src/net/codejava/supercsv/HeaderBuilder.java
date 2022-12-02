package net.codejava.supercsv;

public class HeaderBuilder {
	public static String buildHeader(String[] headerbuild)
	{
	
		header headerItems = new header();
    	headerItems.setRecordType(headerbuild[0]);
    	headerItems.setTotalLines(headerbuild[1]);
    	headerItems.setTotalAmt(headerbuild[2]);
    	headerItems.setMinAmt(headerbuild[3]);
    	headerItems.setCurrentDate(headerbuild[4]);
    	
    	System.out.println(headerItems);
		return null;
    	
		
	}
	
	

}
