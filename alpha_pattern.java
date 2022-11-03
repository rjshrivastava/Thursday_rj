/*
 Write a program to display the following pattern
A
BC
DEF
GHIJ
KLMNO

 */


package pk;

public class alpha_pattern
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		char ch = 'A';

		for (int i = 0; i <= 4; i++) {

		for (int j = 0; j <= i; j++) {

			System.out.print(ch++);}

		System.out.println();

		}

	}

}
