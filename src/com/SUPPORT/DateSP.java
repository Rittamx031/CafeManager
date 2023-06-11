/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.lib;

import java.io.File;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.*; // import the LocalDate class
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

/**
 *
 * @author RITTAM
 */
public class DateSP {
    private static String datepattern = "dd-MM-yyyy";
    private static String timepattern = "HH:mm:ss";
    private static String datetimepattern = "dd-MM-yyyy HH:mm:ss";

    public  static String getDatepattern() {
        return datepattern;
    }

    public static String getTimepattern() {
        return timepattern;
    }

    public static String getDatetimepattern() {
        return datetimepattern;
    }
    
    public static LocalDate toDate(String date, String pattern) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(date, myFormatObj);
    }

    public static LocalTime toTime(String date, String pattern) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(pattern);
        return LocalTime.parse(date, myFormatObj);
    }

    public static LocalDateTime toDateTime(String date, String pattern) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(date, myFormatObj);
    }

    public static String DateToString(LocalDate time, String pattern) {
                String datetime="";
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(pattern);
         datetime = time.format(myFormatObj);
        return datetime;
    }

    public static String TimeToString(LocalTime time, String pattern) {
        String datetime="";
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(pattern);
         datetime = time.format(myFormatObj);
        return datetime;
    }

    public static String DateTimeToString(LocalDateTime time, String pattern) {
        String datetime="";
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(pattern);
         datetime = time.format(myFormatObj);
        return datetime;
    }

}   
