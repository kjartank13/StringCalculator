


import java.util.Scanner;

public class tdd {
	
//	public static boolean checkChar(char a)
//	{
//		for (int i = 0; i <= 9; i++)
//		{
//			if (a == i)
//				return true;
//		}
//		return false;
//	}
//	
//	public static boolean checkForLetters(String s)
//	{
//		for (int i = 0; i < s.length(); i++)
//		{
//			if (checkChar(s.charAt(i)) == false)
//				return true;
//		}
//		return false;
//	}
	
	
	public static int Add(String str)
	{
//		if (checkForLetters(str) == true)
//			throw new IllegalArgumentException("Invalid input");
		
		
		if (str.isEmpty())
			return 0;
		
		
		
		else if (str.length() >= 1 && !str.contains(","))
		{
			int x = Integer.parseInt(str);
			return x;
		}
		
		else 
		{
			int[] nums = new int[str.length()];
		
			for (int i = 0; i < str.length(); i++)
			{
				if (str.substring(i, i+1).equals(",") || str.substring(i, i+1).equals(null)){
					nums[0] = Integer.parseInt(str.substring(0, i));
					nums[1] = Integer.parseInt(str.substring(i+1, str.length()));
					continue;
				}
			}
			
			return nums[0] + nums[1] + nums[2];
		}
	
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int output = Add(str);
		System.out.println(output);
		
		
			
	}
}

