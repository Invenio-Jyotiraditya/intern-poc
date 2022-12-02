package net.codejava.supercsv;

import java.util.ArrayList;
import java.util.HashMap;

public class LineBuilder {
	
	
	static HashMap<String,ArrayList> map=new HashMap<String,ArrayList>();
	
	
	public static void buildLine(String[] lineBuild)
	{
		ArrayList<String> arrayList = new ArrayList<> ();
		
		line lineItems= new line();
		lineItems.setAmount(lineBuild[4]);
		lineItems.setCity(lineBuild[3]);
		lineItems.setLineNumber(lineBuild[1]);
		lineItems.setRecordType(lineBuild[0]);
		lineItems.setRefDocNum(lineBuild[2]);
		
		arrayList.add(lineItems.getRecordType());
		arrayList.add(lineItems.getLineNumber());
		arrayList.add(lineItems.getRefDocNum());
		arrayList.add(lineItems.getCity());
		arrayList.add(lineItems.getAmount());
		
		
		
		
		map.put(lineItems.getRefDocNum(),arrayList);
		System.out.println(map);
		
		
		
	}
	

}
