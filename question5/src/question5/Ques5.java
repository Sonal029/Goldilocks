package question5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Write a program to store the value in Hashmap (key, store) and then
search those given value from the hashmap and print it.
a. Name is key and age is value so store some sample values like 
i. (Ram, 36), (shyam,60)*/


public class Ques5 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to search");
		String name =sc.nextLine();
		Map<String, Integer> map = new HashMap<>();
		
		map.put("ram", 36);
		map.put("shyam" , 60);
		
		
		if(map.containsKey(name))
		{
			int age= map.get(name);
			System.out.println(name + " : "+ age);
		}
		else
		{
			System.out.println("Name not present in the map");
		}
		
		
	}
}
