import java.util.Scanner;

public class Menu {
	
	public Scanner reader;
	
	public Menu() {
		
	}
	
	
	public static void Start(){
		Scanner reader =new Scanner(System.in);
		System.out.println("Bienvenido a calcular d�a de la semana");
		System.out.println("Si me das una fecha te dir� qu� d�a de la semana cae.");
		
		while(true) {
			System.out.println();
			System.out.println("D�me el a�o:");
			int year = Integer.parseInt(reader.nextLine());
			System.out.println("D�me el mes (num�ricamente):");
			int month = Integer.parseInt(reader.nextLine());
			System.out.println("D�me el d�a:");
			int day = Integer.parseInt(reader.nextLine());
			System.out.println("Ese d�a coincide en:");
			System.out.println(CountTime.diaDeSemana(new Date(year,month,day)));
			
		}
	}

}
