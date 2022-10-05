package ar.com.cdt.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//        LocalDate localDate = new LocalDate();
//        
//        
//		DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY-MM-dd");
//		
//		DateTime dt = fmt.parseDateTime("2022-01-05");
//
//		System.out.println(localDate);
//		System.out.println(dt);
//		if(dt.toLocalDate().isAfter(localDate)) {
//	        System.out.println("inactivo");
//
//		}else {
//			System.out.println("activo");
//		}

		// FECHA DE AHORA
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//		Date now = new Date(System.currentTimeMillis());
//		System.out.println(formatter.format(now));


		
		SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
		Date now = new Date(System.currentTimeMillis());
		System.out.println(sdformat.format(now));
		Date d1 = sdformat.parse("04-10-2022");
		System.out.println(sdformat.format(d1));
		if (d1.compareTo(now) > 0) {
			System.out.println("Proyecto inactivo");
		} else {
			System.out.println("Proyecto activo");
		} 
	}

}
