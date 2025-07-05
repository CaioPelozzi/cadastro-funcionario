package model.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FuncoesDatas {
	
	public FuncoesDatas() {
		
	}
	
	public static LocalDate stringToDate(String data) throws RuntimeException {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFmt = LocalDate.parse(data, fmt);
		return dataFmt;
	}
	
	public static String dateToString(LocalDate data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFmt = data.format(formatter);
		return dataFmt;
	}
	
	
	
}
