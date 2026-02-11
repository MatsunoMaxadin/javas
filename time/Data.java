import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class Data{
	
	
	public static String getNowHour(){
		SimpleDateFormat agora = new SimpleDateFormat("'Novo acesso em' dd/MM/yyyy', às' HH:mm:ss");
		return agora.format(new Date());
	}
}
