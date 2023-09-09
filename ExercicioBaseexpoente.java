import java.util.Scanner;
	public class ExercicioBaseexpoente {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
	int num,num1,expoente;
	System.out.println("digite o numero que vc quer saber e a potencia");
	num=ler.nextInt();
	num1=num;
	System.out.println("digite o expoente do seu numero");
	expoente=ler.nextInt();
	while (expoente>1) {
	num1=num1*num;	
	expoente=expoente-1;
	}
	System.out.println("  o numero  e sua potencia e "+num1 );
	ler.close();
}
}
 