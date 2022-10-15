import java.util.Scanner;
public class Main
{
    private static Scanner read;
	public static void main(String[] args) 
	    {   
	        System.out.println("Введите ваш рост");
	        Scanner scunner = new Scanner(System.in);
	        float rost = scunner.nextFloat();
	        System.out.println("Введите ваш вес");
            float ves = scunner.nextFloat();
            System.out.println("Ваш имт:" + (ves/(rost*rost*0.0001)));
	    }   
}
