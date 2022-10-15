import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Введите ваш рост");
		Scanner input = new Scanner(System.in);
		float rost = input.nextFloat();
		System.out.println("Введите ваш вес");
		float ves = input.nextFloat();
		float imt = (ves/(rost*rost))
		System.out.println("Ваш имт:" + imt);
	}
}