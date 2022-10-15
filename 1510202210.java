import java.util.Scanner;
public class Main
{
    private static Scanner read;
	public static void main(String[] args) 
	    {   
	        System.out.println("Введите ваше число");
	        Scanner scunner = new Scanner(System.in);
	        float chislo = scunner.nextFloat();
            System.out.println("Квадрат вашего числа:" + (chislo*chislo));
            System.out.println("Куб вашего числа:" + (chislo*chislo*chislo));
            System.out.println("Четвертая степень вашего числа:" + (chislo*chislo*chislo*chislo));
	    }   
}
		
	

    
	
