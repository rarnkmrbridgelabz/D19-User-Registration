package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void checkValidFirstName(String firstName) {

		boolean isFirstName;
		String firstNameRegex = "^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern patternObject = Pattern.compile(firstNameRegex);
		if (firstName == null) {
			isFirstName = false;
		}
		Matcher matcherObject = patternObject.matcher(firstName);
		isFirstName = matcherObject.matches();

		if (isFirstName)
			System.out.println(firstName + " is an Valid First Name");
		else
			System.out.println(firstName + " is an Invalid First Name");
	}

	public static void checkValidLastName(String lastName) {

		boolean isLastName;
		String lastNameRegex = "^[A-Z]{1}$";
		Pattern patternObject = Pattern.compile(lastNameRegex);
		if (lastName == null) {
			isLastName = false;
		}
		Matcher matcherObject = patternObject.matcher(lastName);
		isLastName = matcherObject.matches();

		if (isLastName)
			System.out.println(lastName + " is an Valid Last Name");
		else
			System.out.println(lastName + " is an Invalid Last Name");
	}

	public static void checkValidEmail(String email) {

		boolean isEmail;
		String emailRegex = "[a-zA-Z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})*$";
		Pattern patternObject = Pattern.compile(emailRegex);
		if (email == null) {
			isEmail = false;
		}
		Matcher matcherObject = patternObject.matcher(email);
		isEmail = matcherObject.matches();

		if (isEmail)
			System.out.println(email + " is a Valid Email address");
		else
			System.out.println(email + " is an Invalid Email address");
	}

	public static void checkValidMobileNumber(String mobileNumber) {

		boolean isMobileNumber;
		String mobile = "^[+](91)( )[6-9]{1}[0-9]{9}$";
		Pattern patternObject = Pattern.compile(mobile);
		if (mobileNumber == null) {
			isMobileNumber = false;
		}
		Matcher matcherObject = patternObject.matcher(mobileNumber);
		isMobileNumber = matcherObject.matches();

		if (isMobileNumber)
			System.out.println(mobileNumber + " is a Valid  Mobile Number");
		else
			System.out.println(mobileNumber + " is an Invalid Mobile Number");
	}

	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Enter Your First Name");
		String firstName = scannerObject.next();
		checkValidFirstName(firstName);
		System.out.println();

		System.out.println("Enter Your Last Name");
		String lastName = scannerObject.next();
		checkValidLastName(lastName);
		System.out.println();

		System.out.println("Enter Your Email Address");
		String email = scannerObject.next();
		checkValidEmail(email);
		System.out.println();
		
		System.out.println("Enter Your Mobile Number");
		String mobileNumber = scannerObject.next();
		checkValidMobileNumber(mobileNumber);
		System.out.println();

		scannerObject.close();

	}
}