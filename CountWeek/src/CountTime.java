
public class CountTime {
	
	public static final int[] DAYSXMONTH = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static final int[] DAYSXMONTHBIS = {31,29,31,30,31,30,31,31,30,31,30,31};
	public static final String[] DAYOFWEEK = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sábado"};
	public static final Date ORIGIN = new Date(1978,1,1);
	
	
	
	
	
	public static boolean anioBisiesto(Date date) {
		if(date.getYear() % 4== 0 && date.getYear() %100 == 0 && date.getYear() %400 == 0) {
			return true;
		}else if (date.getYear() % 4== 0 && date.getYear() %100 == 0 && date.getYear() %400 !=0) {
			return false;
		}else if (date.getYear() % 4== 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean validarFecha(Date date) {
		if(anioBisiesto(date)) {
			if (date.getYear() > ORIGIN.getYear() && date.getMonth() < 13 && date.getDay() <= DAYSXMONTHBIS[(date.getMonth()-1)] ) {
				return true;
			}else {
				return false;
			}
				
		}else {
			if (date.getYear() > ORIGIN.getYear() && date.getMonth() < 13 && date.getDay() <= DAYSXMONTH[(date.getMonth()-1)] ) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	public static int calcularDias(Date date) {
		int count = 0;
		 Date i = ORIGIN;
		while (i.getYear() <date.getYear()) {
			if(anioBisiesto(i)) {
				count = count + 366;
			}else {
				count = count +365;
			}
			i.setYear(i.getYear()+1);
		}
		
		while(i.getMonth() < date.getMonth()) {
			if(anioBisiesto(date)) {
				count = count + DAYSXMONTHBIS[i.getMonth()-1];
			}else {
				count = count + DAYSXMONTH[i.getMonth()-1];
			}
			i.setMonth(i.getMonth()+1);
		}
		count = count + date.getDay();
		return count;
	}
	
	public static String diaDeSemana(Date date) {
		if(CountTime.validarFecha(date)) {
		int count = calcularDias(date);
		return DAYOFWEEK[count%7 -1];
		}else {
			System.out.println("Esta fecha no es válida");
			return "Vuelve a probar.";
		}
	}
}
