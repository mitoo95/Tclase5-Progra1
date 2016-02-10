import java.util.Scanner;

public class Tclase52{
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		int num2 = rd.nextInt();

		System.out.println(" -------- ");

		for(int num1 = 1; num1 <= num2; num1++){
			System.out.println(num1);
		}
	}
}