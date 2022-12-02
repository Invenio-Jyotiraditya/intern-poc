package net.codejava.supercsv;

public class line {
	private String recordType;
	private String lineNumber;
	private String refDocNum;
	private String city;
	private String amount;
	
//	public line() {
		//this empty constructor is required in this program
//	}
//	public line(String recordType,Integer lineNumber,String refDocNum,String city,Integer amount) {
//		this.recordType=recordType;
//		this.lineNumber=lineNumber;
//		this.refDocNum=refDocNum;
//		this.city=city;
//		this.amount=amount;
//	}
	
	//getters and setters
	
	public String getRecordType() {
		return recordType;
	}
	public String getLineNumber() {
		return lineNumber;
	}
	public String getRefDocNum() {
		return refDocNum;
	}
	public String getCity() {
		return city;
	}
	public String getAmount() {
		return amount;
	}
	
	
	
	
	
	
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void setRefDocNum(String refDocNum) {
		this.refDocNum = refDocNum;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	@java.lang.Override
	public java.lang.String toString() {
		return "line{" +
				"recordType='" + recordType + '\'' +
				", lineNumber=" + lineNumber +
				", refDocNum='" + refDocNum + '\'' +
				", city='" + city + '\'' +
				", amount=" + amount +
				'}';
	}
}
