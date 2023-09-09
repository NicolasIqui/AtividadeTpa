import java.util.Scanner;
public class ExercicioFatorial {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		long num,fator;
		System.out.println("digite o numero que vc quer saber o seu fatorial");
		num=ler.nextLong();
		fator=num-1;
		while (fator>1){
			num=num*fator;
			fator=fator-1;
		}	
		System.out.println(" o seu fatorial e "+num );
		ler.close();
		}
		}
