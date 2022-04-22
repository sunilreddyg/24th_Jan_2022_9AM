package mq.java.variables;

public class String_Comparison_Methods {

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 			=> String is a non primitive datatype
		 * 			=> String store set of  characters
		 * 			=> String is not only a datatype and
		 * 				also called as Class
		 * 			=> Because set of events to validate
		 * 				stored characters
		 */
		
		
		/*
		 * equals:-->
		 * 			Method verify equal comparision between
		 * 			two strings [Validation is casesensitive]
		 */
		String actual_res="Account Created";
		String expected_res="Account CreaTed";
		
		boolean flag=actual_res.equals(expected_res);
		System.out.println("Equal Comparision is ---> "+flag);
		
		
		/*
		 * equalignorecase:-->
		 * 			Method verify equal comparision between
		 * 			two string by ignoring casesesitive
		 * 			
		 */
		boolean flag1=actual_res.equalsIgnoreCase(expected_res);
		System.out.println("EqualIgnro case comparision is --> "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		Verify substring characters available at
		 * 		main string
		 */
		String status="Account 100 created";
		System.out.println(status.contains("Account"));
		System.out.println(status.contains("created"));
		System.out.println(status.contains("Account created"));
		
		/*
		 * length:-->
		 * 		Method return characters count available at string 
		 * 		with in integer format
		 */
		String mobilenumber="9030248855";
		int count=mobilenumber.length();
		System.out.println("mobile number length is ---> "+count);
		boolean flag4=count==10;
		System.out.println("Is Mobile number in 10 digits ---> "+flag4);
		
		/*
		 * substring:-->
		 * 		Method get sub string charcters from main string
		 */
		String AccountNumber="123488881478";
		String sub=AccountNumber.substring(6);
		System.out.println("Last 6 Digit characters are --> "+sub);
		String start=AccountNumber.substring(0, 4);
		System.out.println("Account Number start charecters are --> "+start);


		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		boolean flag5=AccountNumber.startsWith("1234");
		System.out.println("Starts with Comparision is --> "+flag5);
		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=AccountNumber.endsWith("1478");
		System.out.println("ends with Comparision is --> "+flag6);
		
		
		/*
		 * isempty:-->
		 * 		method return characters available status in 
		 * 		boolean format
		 * 		=> Return true when string doesn't have any charactes
		 * 		=> Return false when string has characters
		 */
		String var="";
		String var1="Hello";
		System.out.println("var empty status is ---> "+var.isEmpty());
		System.out.println("Var1 empty statu is ---> "+var1.isEmpty());
		
		
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at 7th index number is =>"+ch);
		

		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Rep=browsername.replace('F', 'G');
		System.out.println("After replace character is --> "+Rep);
		System.out.println(browsername.replaceAll("o", "i"));
		
		
		/*
		 * Concat:-->
		 * 			Add new string to existing charactes
		 */
		String New_browser=browsername.concat(",Safari");
		System.out.println(New_browser);
		
		/*
		 * tolowercase:-->
		 * 			Convert all uppercase characters in lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		System.out.println(toolname.toUpperCase());
		
	}

}
