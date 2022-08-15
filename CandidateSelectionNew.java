package com.ibsplc.java.day10;

import java.util.ArrayList;
import java.util.List;

public class CandidateSelectionNew {
	
	List<Candidate> candListNew = new ArrayList<Candidate>();

	public void checkEligibility (String candidateName, String qualification, double percentage, int year, char hasAllDocuments) throws NotEligibleException, NoDocumentException{
		
		try {
		if(qualification == "B.E" || qualification == "B.Tech") {
			if(percentage>=60.00) {
				if(2010 <= year && year <= 2013) {
					if(hasAllDocuments == 'Y' || hasAllDocuments == 'y') {
						Candidate cand = new Candidate(candidateName,qualification,percentage,year,hasAllDocuments);
						candListNew.add(cand);
						System.out.println("Candidate is eligible");
					}
					else {
						throw new NoDocumentException();
					}
				}
				else {
					throw new NotEligibleException();
				}
			}
			else {
				throw new NotEligibleException();
			}
		}
		else {
			throw new NotEligibleException();
		}
		}
		catch(NotEligibleException | NoDocumentException e) {
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) throws NoDocumentException, NotEligibleException{
		
		CandidateSelectionNew cs = new CandidateSelectionNew();
		
		cs.checkEligibility("Karan", "B.Tech", 75.00, 2012, 'n');
	}
}
