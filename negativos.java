package arranjos;

import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num =0;
		
		System.out.println("Quantos numeros vc ira digitar: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero entre -10 e 10 : ");
			num = sc.nextInt();
			
			if (num >= -10 && num <= 10) {
				vect[i] = num;
			}else {
				System.out.println("Numero invalid");
				i--;
			}
		}	
		System.out.println(" ====== NUMERO NEGATIVOS ======");
		System.out.println();
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] >= -10 && vect[i] <= -1) {
				System.out.println(vect[i]);
			}	
		}
	}
}
