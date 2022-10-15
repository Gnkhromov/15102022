import java.util.Scanner;
public class Main
{
    private static Scanner read;
	public static void main(String[] args) 
	    {   
	        System.out.println("Введите числа для умножения");
	        Scanner scunner = new Scanner(System.in);
	        float a = scunner.nextFloat();
	        float b = scunner.nextFloat();
	        float result = 0;
	        for(int i = 0; i < b; i++)
	        {
	            result = result + a;
	        }
	        System.out.println("Результат умножения:" + result);
	    }   
}
		
	

    
	
