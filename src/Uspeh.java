import java.util.Scanner;
public class Uspeh{	
	public static void metodUspeh(Double bodovi) {
		if (bodovi >= 8.5) {
			System.out.println("Одличен");
		}else if (bodovi >= 7.5) {
			System.out.println("Многу добар");
		}else if (bodovi >= 5.5) {
			System.out.println("Добар");
		}else if (bodovi >= 3.5) {
			System.out.println("Задоволува");
		}else{
			System.out.println ("Не Задоволува");
		}
	}
public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.println("Vnesi bodovi od 1-10\n");
	System.out.println("Broj na bodovi:");
	double bodovi = input.nextDouble();
	System.out.println("Za broj na bodovi" +bodovi);
	metodUspeh(bodovi);
}
	
}