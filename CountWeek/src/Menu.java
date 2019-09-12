import java.util.Scanner;

public class Menu {
	
	public Scanner reader;
	
	public Menu() {
		
	}
	
	
	public static void Start(){
		Scanner reader =new Scanner(System.in);
		System.out.println("Bienvenido a calcular día de la semana");
		System.out.println("Si me das una fecha te diré qué día de la semana cae.");
		
		while(true) {
			System.out.println();
			System.out.println("Díme el año:");
			int year = Integer.parseInt(reader.nextLine());
			System.out.println("Díme el mes (numéricamente):");
			int month = Integer.parseInt(reader.nextLine());
			System.out.println("Díme el día:");
			int day = Integer.parseInt(reader.nextLine());
			System.out.println("Ese día coincide en:");
			System.out.println(CountTime.diaDeSemana(new Date(year,month,day)));
			
		}
	}

}
