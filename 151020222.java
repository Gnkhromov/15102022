import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    int chisl = 4;
		System.out.println("Введите 4 целых числа");
		for(int i; i<chisl; i++)
		{
		    Scanner input = new Scanner(System.in);
            int a = nextInt();
            int b = nextInt();
            int c = nextInt();
            int d = nextInt();
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
}
