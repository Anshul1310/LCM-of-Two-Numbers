import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber=scan.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber=scan.nextInt();
        int lcm=0;
        boolean again=true;
        int greatestNumber=Math.max(firstNumber,secondNumber);
        while(again){
            if(greatestNumber%firstNumber==0 && greatestNumber%secondNumber==0){
                lcm=greatestNumber;
                break;
            }
            greatestNumber++;
        }
        System.out.println("LCM is "+greatestNumber);
        }
	}
}
