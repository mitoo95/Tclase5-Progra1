import java.util.Scanner;

public class Tclase53{
	public static void main(String args[]){

		Scanner rd = new Scanner(System.in);

		double suma = 0;
		int valor;
		double prom;

		for(double conta = 0; conta < 10; conta++){
			System.out.println("Ingrese 10 valores: ");
			valor = rd.nextInt();
			suma = suma + valor;
		}
		prom = suma / 10;
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("El promedio es: "+prom);
	}
}