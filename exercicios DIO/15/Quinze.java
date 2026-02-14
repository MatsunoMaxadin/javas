import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Quinze{
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua data de nascimento (ano mes dia)");
		LocalDate nascimento = LocalDate.of(entrada.nextInt(), entrada.nextInt(), entrada.nextInt());
		LocalDate hoje = LocalDate.now();

		System.out.println("Anos: " + ChronoUnit.YEARS.between(nascimento, hoje));
		System.out.println("Meses: " + ChronoUnit.MONTHS.between(nascimento.withYear(hoje.getYear()), hoje));		
		System.out.println("Dias: " + ChronoUnit.DAYS.between(nascimento.withYear(hoje.getYear()).withMonth(hoje.getMonthValue()), hoje));
		
	}
}
