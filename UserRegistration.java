package com.bridgelabz.userRegistrationRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
	 
       public static void checkValidFirstName(String firstName) {
		
		     boolean isFirstName;
		     String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
		     Pattern pattern = Pattern.compile(firstNameRegex);
		     if (firstName == null) {
		    	 isFirstName = false;
		     }
		     Matcher matcher = pattern.matcher(firstName);
		     isFirstName =  matcher.matches();
        
		     if(isFirstName)
		    	 System.out.println(firstName+" is a Valid First Name");
		     else
		    	 System.out.println(firstName+" is an Invalid First Name");
		     
       }
       
       public static void checkValidLastName(String lastName) {

   	         boolean isLastName;
   	         String lastNameRegex = "[A-Z]{1}[a-z]{2,}";
   	         Pattern pattern = Pattern.compile(lastNameRegex);
   	         if (lastName == null) {
   	        	 isLastName = false;
   	         }
   	         Matcher matcher = pattern.matcher(lastName);
   	         isLastName = matcher.matches();

   	         if (isLastName)
   	        	 System.out.println(lastName + " is Valid Last Name");
   	         else
   	        	 System.out.println(lastName + " is an Invalid Last Name");
   		
   	}
       
         public static void checkValidEmail(String email){
   		
   		     boolean isEmail;
   		     String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
   		     Pattern pattern = Pattern.compile(emailRegex);
   		     if (email == null) {
               isEmail = false;
           }
   		     Matcher matcher = pattern.matcher(email);
   		     isEmail =  matcher.matches();
           
   		     if(isEmail)
   		    	 System.out.println(email+" is a Valid Email address");
   		     else
   		    	 System.out.println(email+" is an Invalid Email address");
   	}
         
         
         public static void checkValidMobileNumber(String mobileNumber){
     		
     		boolean isMobileNumber;
     		String mobileRegex = "^[0-9]{2}\\s{1}[0-9]{10}$";
     		Pattern pattern = Pattern.compile(mobileRegex);
     		if (mobileNumber == null) {
                 isMobileNumber = false;
             }
             Matcher matcher = pattern.matcher(mobileNumber);
             isMobileNumber =  matcher.matches();
             
             if(isMobileNumber)
     			System.out.println(mobileNumber+" is a Valid  Mobile Number");
     		else
     			System.out.println(mobileNumber+" is an Invalid Mobile Number");
     	}
         
         public static void checkValidPassword(String password) {

     		boolean isPassword;
     		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]*([@#$%^&-+=()])*).{8,}$";
     		Pattern patternObject = Pattern.compile(passwordRegex);
     		if (password == null) {
     			isPassword = false;
     		}
     		Matcher matcherObject = patternObject.matcher(password);
     		isPassword = matcherObject.matches();

     		if (isPassword)
     			System.out.println(password + " is a Valid  Password\n");
     		else
     			System.out.println(password + " is an Invalid Password");
     	}

         
          public static void main(String[] args) {
		
		  System.out.println(" Welcome To User Registration Program ");
		  
		  Scanner scanner = new Scanner(System.in);
			
		  System.out.println("Enter Your First Name : ");
		  String firstName = scanner.next();
		  checkValidFirstName(firstName);
			
		  System.out.println("Enter Your Last Name :");
		  String lastName = scanner.next();
		  checkValidLastName(lastName);
		  
		  System.out.println("Enter Your Email Address:");
		  String email = scanner.next();
		  checkValidEmail(email);
		  
		  System.out.println("Enter Your Mobile Number:");
		  String mobileNumber = scanner.nextLine();
		  checkValidMobileNumber(mobileNumber);
		  
		  System.out.println("Enter Your Password");
		  String password = scanner.nextLine();
		  checkValidPassword(password);


		  scanner.close();
			
	   }
	   
}

	
			
		 			
		

	

	

