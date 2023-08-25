package question1;

/*Write a function to convert a decimal number string into binary string.
For example, string A contains “123” which is decimal value 123. Convert
this string into binary string.*/

public class Ques1 {

	
	public static String decimalToBinary(String str)
	{
//		System.out.println("inside method"); 
		char[] arr = str.toCharArray();
		int decimal =0;
		for(int i=0;i<arr.length;i++) 
		{
			int digit = (int)arr[i]-48;
			decimal=decimal*10+digit;
			
		}
//		System.out.println(decimal);
		StringBuffer sb = new StringBuffer();
		while(decimal!=0)
		{
			int rem = decimal%2;
			decimal = decimal/2;
			sb.insert(0, rem);
		}
		
		
//		System.out.println(sb.toString());
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
//		System.out.println("inside main");
		String str = decimalToBinary("123");
		System.out.println(str);
	}
}
