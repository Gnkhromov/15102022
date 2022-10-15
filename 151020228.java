import java.util.Scanner;
public class Main
{
    private static Scanner read;
	public static void main(String[] args) 
	    {   
	        System.out.println("Введите температуру в градусах цельсия");
	        Scanner scunner = new Scanner(System.in);
	        float celsiy = scunner.nextFloat();
            System.out.println("Ваша температура в градусах фаренгейта:" + (((celsiy*1.8)+32)));
	    }   
}
		
	

    
	
