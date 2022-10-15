import java.util.Scanner;
public class Main
{
    private static Scanner read;
	public static void main(String[] args) 
	    {   
	        System.out.println("Введите 4 целых числа");
	        Scanner scunner = new Scanner(System.in);
	        int a = scunner.nextInt();
            int b = scunner.nextInt();
            int c = scunner.nextInt();
            int d = scunner.nextInt();
            if(a==b & b==c & c ==d)
            {
                System.out.println("Все четыре числа равны");
            }
            else
            {
                System.out.println("Числа не равны");
            }
	    }
}
		
	

    
