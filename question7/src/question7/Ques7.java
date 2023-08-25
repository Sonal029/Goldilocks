package question7;

/**
 *Write a program that take the command line input and print all received inputs
 */
public class Ques7 {

	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}
