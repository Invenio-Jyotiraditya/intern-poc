package net.codejava.supercsv;

public class header {
	private String recordType;
	private String totalLines;
	private String totalAmt;
	private String minAmt;
	private String currentDate;
	
	
//		//empty constructor is required in this program
//	
//	public header( String recordType,Integer totalLines,Float totalAmt,Integer minAmt,String currentDate) {
//	this.recordType=recordType;	
//	this.totalLines=totalLines;
//	this.totalAmt=totalAmt;
//	this.minAmt=minAmt;
//	this.currentDate=currentDate;
//	}
//	
	//getters and setters

	public String getRecordType() {
		return recordType;
	}
	public String getTotalLines() {
		return totalLines;
	}
	public String getTotalAmt() {
		return totalAmt;
	}
	public String getMinAmt() {
		return minAmt;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	
	

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public void setTotalLines(String headerbuild) {
		this.totalLines = headerbuild;
	}
	public void setTotalAmt(String headerbuild) {
		this.totalAmt = headerbuild;
	}
	public void setMinAmt(String headerbuild) {
		this.minAmt = headerbuild;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	@java.lang.Override
	public java.lang.String toString() {
		return "header{" +
				"recordType='" + recordType + '\'' +
				", totalLines=" + totalLines +
				", totalAmt=" + totalAmt +
				", minAmt=" + minAmt +
				", currentDate='" + currentDate + '\'' +
				'}';
	}
}
