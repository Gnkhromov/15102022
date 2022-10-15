import java.util.Scanner;
public class Main
{
    private static Scanner read;
	public static void main(String[] args) 
	    {   
	        System.out.println("Введите последовательно стороны треугольника");
	        Scanner scunner = new Scanner(System.in);
	        int a = scunner.nextInt();
	        int b = scunner.nextInt();
	        int c = scunner.nextInt();
	        if((a + b) > c & (b + c) > a & (a + c) > b)
	        {
	            System.out.println("Треугольник с такими сторонами возможен");
	        }
	        else
	        {
	            System.out.println("Треугольник с такими сторонами не существует");
	        }
	    }   
}
		
	

    
	
