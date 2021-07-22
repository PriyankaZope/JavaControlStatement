package com.Day8Abstraction;

public class ExamDetails extends StudentDetails {
	String strFName = "QWE";
	String strLName = "ASD";
	int studentId = 102;
	String examName []={"CET" , "JEE" , "JEE Advanced ", "NEET" ,"NDA" , "TES"};
	

	@Override
	public void setStudentName() {
		System.out.println("------------------------------------");
		System.out.println("\n\tExam Details");
		String fullName = strFName + strLName;
				System.out.println("Student Name :"+fullName);
		
	}

	@Override
	public void studentID() {
		System.out.println("Student ID : "+studentId);
		
	}
	public void examName(String examName){
		System.out.println("\tExam Name :"+examName);
		if (examName.equals("CET")){
			System.out.println("\tlast year cut-off :110");
		}else if (examName.equals("JEE")){
			System.out.println("\tlast year cut-off : 182");
		}else if (examName.equals("JEE Advanced")){
			System.out.println("\tlast year cut-off : 253");
		}else if (examName.equals("NEET")){
			System.out.println("\tlast year cut-off : 160 ");
		}else if (examName.equals("NDA")){
			System.out.println("\tlast year cut-off : 96 ");
		}else if (examName.equals("TES")){
			System.out.println("\tlast year cut-off : 359 ");
		}else System.out.println("\tYou chosen wrong Exam");
		
	}

}
