package dqy19tekrari;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Day19Tekrari {
    public static void main(String[] args) {
        LocalDate currentdate = LocalDate.now();
        System.out.println(currentdate);


        LocalTime currenttime = LocalTime.now();
        System.out.println(currenttime);

        LocalDateTime currentDaTime = LocalDateTime.now();
        System.out.println(currentDaTime);


//Exemple=japonyadaki zamani bul
        LocalDateTime currentJaponya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentJaponya);

        LocalDateTime currentIs = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentIs);

        //789gun sonrasini bul
        LocalDate currentDate2 = LocalDate.of(2022, 10, 24);
        LocalDate emeklilik = currentDate2.plusDays(789);
        System.out.println(emeklilik);


//exemple iki cocugun doum tarihleri farkini bul
        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);


        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);

//exemple
        LocalDate Istanbul = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyet = LocalDate.of(1923, 10, 29);


        Long aySayisi = ChronoUnit.MONTHS.between(Istanbul, cumhuriyet);

        System.out.println(aySayisi);


        LocalDate myDate = LocalDate.of(1985, 4, 20);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();
        System.out.println(day + " - " + month);
        if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
            System.out.println(" koc");

        }
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        DateTimeFormatter dtF = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = dtF.format(currentDate);

        System.out.println(formattedDate);


        DateTimeFormatter dtF2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtF2.format(currentDate);

        System.out.println(formattedDate2);


        //exemple1: japonya ile almanya arasindaki zaman farkini hesaplayan kodu yaz
        LocalDateTime japon = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark = ChronoUnit.HOURS.between(germany, japon);
        System.out.println(fark);

/*
//sabit bir tarih olusturun
        LocalDate myDate1=LocalDate.of(2011, Month.APRIL,13);
//        System.out.println(myDate1);
*/
    }
}

