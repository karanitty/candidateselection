package com.ibsplc.java.day10;

public class Candidate{
	
	String candidateName;
	String qualification;
	double percentage;
	int yearOfPassing;
	char hasAllDocuments;
	
	
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Candidate(String candidateName, String qualification, double percentage, int yearOfPassing,
			char hasAllDocuments) {
		super();
		this.candidateName = candidateName;
		this.qualification = qualification;
		this.percentage = percentage;
		this.yearOfPassing = yearOfPassing;
		this.hasAllDocuments = hasAllDocuments;
	}

	public String getCandidateName() {
		return candidateName;
	}
	
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	
	public String getQualification() {
		return qualification;
	}
	
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public int getYearOfPassing() {
		return yearOfPassing;
	}
	
	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	
	public char getHasAllDocuments() {
		return hasAllDocuments;
	}
	
	public void setHasAllDocuments(char hasAllDocuments) {
		this.hasAllDocuments = hasAllDocuments;
	}

	@Override
	public String toString() {
		return "Candidate [candidateName=" + candidateName + ", qualification=" + qualification + ", percentage="
				+ percentage + ", yearOfPassing=" + yearOfPassing + ", hasAllDocuments=" + hasAllDocuments + "]";
	}
}
