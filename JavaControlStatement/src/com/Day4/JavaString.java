package com.Day4;

public class JavaString {
	//Example of .equals Method 
	public void equalsMethodExample(){
		String collegeName = "Modern College";
		String clgName = "Modern College";
		String clgName_1="modern college";
		String clgName_2="Fergusson College";
		String collegeName_1=new String("Modern College");
		
		System.out.println("========================================");
		System.out.println(".equals Method ");
		
		System.out.println("Compairing 'Modern College' and 'Modern College' :"+collegeName.equals(clgName));
		System.out.println("Compairing 'Modern College' and 'modern college' :"+collegeName.equalsIgnoreCase(clgName_1));
		System.out.println("Compairing 'Modern College' and 'Fergusson College' :"+collegeName.equals(clgName_2));
		System.out.println("Compairing 'Modern College' and 'modern college' :"+clgName.equals(collegeName_1));
		System.out.println("Compairing 'Modern College' and 'Modern College' :"+collegeName==clgName);
		System.out.println("Compairing 'Modern College' and 'modern college' :"+collegeName==collegeName_1);
	}

	//Example of .length Method
	public void lengthMethodExample(){
		String countryName = "Singapore";
		String countryName_1 = "Shri Lanka";
		String countryName_2="Switzerland";
		
		System.out.println("========================================");
		System.out.println(".length Method");
		
		System.out.println("Length of 'Singapore' is :"+countryName.length());
		System.out.println("Length of 'Shri Lanka' is :"+countryName_1.length());
		System.out.println("Length of 'Switzerland' is :"+countryName_2.length());
		
	}
	
	//Example of .charAt
	public void charAtExample(){
		String name="Java";  
		String name_1="Python";
		char ch=name.charAt(1);  
		char ch1 = name_1.charAt(2);
		
		System.out.println("========================================");
		System.out.println(".charAt Method");
		System.out.println(".charAt(1) for Java is :"+ch); 
		System.out.println(".charAt(2) for Java is :"+ch1);
	}
	
	//Example of .concat
	public void concatExample(){
		    String componyName = "Verve-Square";  
	        String componyName_1 = "Technology";  
	        String ComponyName_2 = "Pvt. Ltd";  
	        String str4 = componyName.concat(componyName_1);          
	        String cmpFullName = str4.concat(ComponyName_2);
	        
	        System.out.println("========================================");
			System.out.println(".concat Method");
			
			System.out.println("Compony Full Name is :"+cmpFullName);
	}
	
	//Example of .compareTo
	public void compareToExample(){
		String fruit="Mango";  
		String fruit_1="";  
		String fruit_2="Banana"; 
		
		System.out.println("========================================");
		System.out.println(".compareTo Method");
		System.out.println(fruit.compareTo(fruit_1));  
		System.out.println(fruit_1.compareTo(fruit_2));  
	}
	
	//Example of .replace Method
	public void replaceMethodExample(){
		String name="Switzerland is a tourist destination";  
		String replaceString=name.replace('a','e');
		
		System.out.println("========================================");
		System.out.println(".replace Method");
		
		System.out.println(replaceString);  
	}
	
	//Example of replaceAll Method
	public void replaceAllExample(){
		String statement="I am the employee of Verve-Square technology pvt ltd";  
		String replaceString=statement.replaceAll("a","e");  
		
		System.out.println("========================================");
		System.out.println(".replaceAll Method");
		System.out.println("After replacing 'a' and 'e' statement is :"+replaceString);  
	}
	
	//Example of .contains Method 
	public void containsExample(){
		String statement="Every moment is a fresh beginning";  
		
		System.out.println("========================================");
		System.out.println(".contains Method");
		System.out.println(statement.contains("Every"));  
		System.out.println(statement.contains("hello"));  
		System.out.println(statement.contains("fresh beginning"));  
	}
	
	//Example of .indexOf Method
	public void indexOfMethodExample(){
		 String statement = "Today is 4th day of training";         
	           
		    System.out.println("========================================");
			System.out.println(".indexOf Method");
	        System.out.println("index of statement is : "+statement.indexOf("is"));       
	}
	
	//Example of .lastIndex Method
	public void lastIndexMethodExample() {
		 String statement = "tommorow is the Saturday";  
		 
		    System.out.println("========================================");
			System.out.println(".indexOf Method");
	        System.out.println("Last index if statement is :"+statement.lastIndexOf("the"));        
		
	}
	
	//Example of .endsWith Method and .startsWithMethod
	public void endsWithExample(){
		 String statement = "Welcome to Verve-Square Technology pvt. .ltd";  
		 
		  System.out.println("========================================");
			System.out.println(".endsWith Method");
	    
	        System.out.println(statement.endsWith(".ltd"));  
	        if(statement.endsWith(".ltd")) {  
	            System.out.println("String ends with .ltd");  
	        }else System.out.println("It does not end with .ltd");  
	        System.out.println("Statement starts with 'Welcome' :"+statement.startsWith("Welcome"));
	}
	//Example of .valueOf Method
	public void valueOfMethod(){
		    int no =50;
		    double no2 = 10.30;
           String s1 = String.valueOf(no);
           String s2 = String.valueOf(no2);

 		  System.out.println("========================================");
 			System.out.println(".valueOf Method");
		    System.out.println("Value of int no is :"+s1);
		    System.out.println("Value of int no is :"+s2);
	}
	
	//Example of .trim Method
	public void trimMethodExample(){
		String s1="  Hello Java   ";  
		
		System.out.println("========================================");
		System.out.println(".trim Method");
		System.out.println(s1+"javatpoint");//without trim
		System.out.println(s1.trim()+"javatpoint");//with trim
	}
	
	//Example of .isEmpty Method
	public void isEmptyMethodExample(){
		String language="";  
		String language_1="Python";  
		System.out.println("========================================");
		System.out.println(".isEmpty Method");  
		System.out.println(language.isEmpty());  
		System.out.println(language_1.isEmpty());  
	}
	
	//Example of .splitMethod
	public void splitMethodExample() {
		String statement="Today's Assignment on String Functions ";  
		String[] words=statement.split("\\s");
		
		for(String finalstatement:words){  
		
		System.out.println("========================================");
		System.out.println(".split Method");  
		System.out.println("statement after split :"+finalstatement);
		
		}
	}
	public static void main(String[] args) {
		JavaString objJavaString = new JavaString();
		objJavaString.equalsMethodExample();
		objJavaString.lengthMethodExample();
		objJavaString.charAtExample();
		objJavaString.concatExample();
		objJavaString.compareToExample();
		objJavaString.replaceMethodExample();
		objJavaString.replaceAllExample();
		objJavaString.containsExample();
		objJavaString.indexOfMethodExample();
		objJavaString.lastIndexMethodExample();
		objJavaString.endsWithExample();
		objJavaString.valueOfMethod();
		objJavaString.trimMethodExample();
		objJavaString.isEmptyMethodExample();
		objJavaString.splitMethodExample();
		objJavaString.splitMethodExample();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	