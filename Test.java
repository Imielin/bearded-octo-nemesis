package test;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		while(true){
		System.out.println("podaj liczbe");
		int n= new Scanner(System.in).nextInt();
		
		System.out.println("Ada jesli serio to bedziesz czyta� to to si� kurna r�wna " +fibbonachi(n)+" ");
		// TODO Auto-generated method stub
		System.out.println("chcesz sie w to dalej bawi�? (t/n) ");
		String text = new Scanner(System.in).nextLine();
		char txt= text.charAt(0);
		if(txt=='t'){
			System.out.println("Ada serio? to trudno ");	
		}
		else if(txt=='n'){
			System.exit(0);
		}
		else {
			System.out.println("taki z ciebie cwaniak? �le wpisane i teraz b�dzie �mier�");
			while(true){
				System.out.println("�MIER� ");	
				java.awt.Toolkit.getDefaultToolkit().beep();
			}
		}
		}

	}
	public static int fibbonachi(int n)
	{
		if(n==1 || n==2){
			return 1;
		}
		return fibbonachi(n-1) + fibbonachi(n-2);
	}

}
