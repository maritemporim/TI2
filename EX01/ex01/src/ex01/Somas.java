package ex01;
import java.util.*;

public class Somas {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int n1, n2, soma;
		System.out.println("Digite o primeiro número: ");
		n1 =  sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.println("Soma: "+ soma);
	}
}
