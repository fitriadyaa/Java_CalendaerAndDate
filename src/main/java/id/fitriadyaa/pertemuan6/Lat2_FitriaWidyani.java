/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.fitriadyaa.pertemuan6;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author fitriadyaa
 */
public class Lat2_FitriaWidyani {
    public static void main(String[] args) {
    // creating a Calendar object
    Calendar c1 = Calendar.getInstance();
    // set Month
    // MONTH starts with 0 i.e. ( 0 - Jan)
    c1.set(Calendar.MONTH, 03);
    // set Date
    c1.set(Calendar.DATE, 06);
    // set Year
    c1.set(Calendar.YEAR, 2023);
    // creating a date object with specified time.
    Date dateOne = c1.getTime();
    System.out.println("Date: " + dateOne);
    System.out.println(dateOne.getTime());
    } 
}
