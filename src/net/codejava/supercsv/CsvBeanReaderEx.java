package net.codejava.supercsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CsvBeanReaderEx {

	 private static final String COMMA_DELIMITER = ";";
	 public static void main(String args[])
	 {
		 
		 File file = new File("C:\\Users\\Jyotiraditya.Panda\\eclipse-workspace\\New Project\\inveniojavaproject17\\read-file-java-poc1.csv");
	        BufferedReader br = null;
	        try
	        {
	        	br = new BufferedReader(new FileReader(file));   
	        	
	        	List<line> csvList = new ArrayList<line>();
	        	String line = "";
	        	br.readLine(); 
	        	
	        	
	        	while ((line = br.readLine()) != null) 
	        	{
	        		String[] headList=line.split(COMMA_DELIMITER);
	        			 if(headList[0].equalsIgnoreCase("HAUDIT"))
	        			 {
	        			 
	                     String head = HeaderBuilder.buildHeader(headList);
	                     
	        			 }
	        			 else {
	        				 
	        			   LineBuilder.buildLine(headList);
	        				 
	        			 		}
	        	  }
	      
	      }
	 catch(Exception e){
		 System.err.println(e);
	 }
	 }
}
	
	
