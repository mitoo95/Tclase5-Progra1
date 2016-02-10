import java.util.Scanner;

public class Tclase57{

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);

		int num;
		int fact = 1;

		System.out.println("Ingrese un numero: ");
		num = rd.nextInt();

		for(int i = 1; i <= num; i++){
			fact = fact * i;
		}
		System.out.println("El factorial es:"+fact);
	}
}