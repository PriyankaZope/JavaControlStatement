package com.Day8Abstraction;

public class CollegeDetails extends StudentDetails {
	String strFName = "ABC";
	String strLName = "XYZ";
	int studentId = 101;
	String stream []={"Science" , "Commerce" ,"Arts"};	

	@Override
	public void setStudentName() {
		System.out.println("------------------------------------");

		System.out.println("\n\tCollege Details");
		String strFullName = strFName+strLName;
		System.out.println("Student Name :"+strFullName);
		
	}

	@Override
	public void studentID() {
		System.out.println("Student ID :"+studentId);
		
	}
	public void studentCollageName(String clgName){
		System.out.println("College Name :"+clgName);
		
	}
	public void studentStream(String stream ){
		System.out.println("\tStudent Stream : "+stream);
		if(stream.equalsIgnoreCase("Science")){
			System.out.println("\tDegree : BE , B.Tech , MBBS , B.Sc , B.Pharm");
		}else if (stream.equalsIgnoreCase("Commerce")){
			System.out.println("\tDegree : B.Com , CA ");
		}else if (stream.equalsIgnoreCase("Arts")){
			System.out.println("\tDegree : BA(English) , BA(History)");
		}
	}
	

}
