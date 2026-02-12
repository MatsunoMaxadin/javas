import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
public abstract class Data{
	
	
	public static String getNowHour(){
		DateTimeFormatter agora = DateTimeFormatter.ofPattern("'Novo acesso em' dd/MM/yyyy', às' HH:mm:ss");
		return LocalDateTime.now().format(agora);
	}
}
