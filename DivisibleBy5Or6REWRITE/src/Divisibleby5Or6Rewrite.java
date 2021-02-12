import java.util.*;
import java.io.*;
public class Divisibleby5Or6Rewrite {

	public static void main(String[] args) throws IOException
	{
		@SuppressWarnings("unused")
		Scanner in = new Scanner(System.in);
		boolean runProgram = true;
		int userinputNumber;
		
		System.out.println("\t\t\t\t\tWelcome to the Divisible By 5 or 6 Program!!!\n");
		
		
		while(runProgram)
		{
			userinputNumber = getInput();
			AndStatement(userinputNumber);
			
			System.out.println("Would you like to run the program again? 1=yes and 2=no");
			int NewInput = in.nextInt();
			if (!(NewInput==1))
				{
					runProgram = false;
				}
					else
						{
							runProgram = true;
						}
		}
					System.out.println("\nThanks for running the program!!!");
	}

	
	public static int getInput() throws IOException
		{
			int userinput;
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			System.out.println("\nPlease input any integer and only integers!");
			userinput = in.nextInt();
			return userinput;
		}
	public static void AndStatement(int userinputNumber)
		{
			int Int_Num_Mod_quoteint_1;
			int Int_Num_Mod_quoteint_2;
			Int_Num_Mod_quoteint_1 = userinputNumber % 5;
			Int_Num_Mod_quoteint_2 = userinputNumber % 6;
		
		if ((Int_Num_Mod_quoteint_1 == 0) && (Int_Num_Mod_quoteint_2 == 0))
			System.out.println("Is " + userinputNumber + " Divisible by 5 and 6? True\n");
		else
			{
			System.out.println("Is " + userinputNumber + " Divisible by 5 and 6? False\n");
			}
			
			OrStatement(userinputNumber);
			OneButNotBothStatement(userinputNumber);
		
		}
	
	public static void OrStatement(int userinputNumber)
		{
			int Int_Num_Mod_quoteint_1;
			int Int_Num_Mod_quoteint_2;
			Int_Num_Mod_quoteint_1 = userinputNumber % 5;
			Int_Num_Mod_quoteint_2 = userinputNumber % 6;
			if ((Int_Num_Mod_quoteint_1 == 0) || (Int_Num_Mod_quoteint_2 == 0))
				{	
					System.out.println("Is " + userinputNumber + " Divisible by 5 or 6? True\n");
				}
				else
					{
						System.out.println("Is " + userinputNumber + " Divisible by 5 or 6? False\n");
					}
		
		
	
		}
	public static void OneButNotBothStatement(int userinputNumber)	
	{
		int Int_Num_Mod_quoteint_1;
		int Int_Num_Mod_quoteint_2;
		Int_Num_Mod_quoteint_1 = userinputNumber % 5;
		Int_Num_Mod_quoteint_2 = userinputNumber % 6;
		
		if (!(Int_Num_Mod_quoteint_1 == 0) && (Int_Num_Mod_quoteint_2 == 0))
			System.out.println("Is " + userinputNumber + " Divisible by 5 or 6 but not both? True\n");
		else
			if ((Int_Num_Mod_quoteint_1 == 0) && !(Int_Num_Mod_quoteint_2 == 0))
		
				System.out.println("Is " + userinputNumber + " Divisible by 5 or 6 but not both? True\n");
			else
				System.out.println("Is " + userinputNumber + " Divisible by 5 or 6 but not both? False\n");
		
		
	}
		
		
}

