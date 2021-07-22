package com.Day8Abstraction;

public class TestAbstaction {

	public static void main(String[] args) {
      
		StudentDetails objStudentDetails = new CollegeDetails();                        //reference object
		objStudentDetails.setCity("Pune");
		objStudentDetails.setStudentName();
		objStudentDetails.studentID();
	
		CollegeDetails objCollegeDetails = new CollegeDetails();                    //object for concrete method
		objCollegeDetails.studentCollageName("Modern College , Pune");
		objCollegeDetails.studentStream("Science");
		
		StudentDetails objStudentDetails_1 = new ExamDetails();                   //reference obj with Exam Details class
		objStudentDetails_1.setStudentName();
		objStudentDetails_1.studentID();
		
		ExamDetails objExamDetails = new ExamDetails();
		objExamDetails.examName("NEET");
		
		
		
		
		
		
	}

}
