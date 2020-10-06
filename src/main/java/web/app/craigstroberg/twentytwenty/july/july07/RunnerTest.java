/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.app.craigstroberg.twentytwenty.july.july07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author craigstroberg
 */
public class RunnerTest {

    public static void main(String[] args) {
//        exampleDateFormatter();
//        Date addedDates = exampleAddingDates();
//        System.out.println("Added Times " + addedDates);
        long age = janesDob("1996/06/18");
        System.out.println(new Date(age));
    }

    private static void exampleDateFormatter() {
        String dobWithDashes = "1996-06-18";

//        final Date dob = new Date("1996/06/18");
        final Date dob = new Date("1996/06/18");
//        Runner runner = new Runner("Jane", new Date("1996/06/18"));
//        We need to get back to this one :)
//        Runner runner = new Runner("Jane", new Date("1996-06-18"));
        Runner runner = new Runner("Jane", dob);
        //yyyy -> lowerCase
        //month -> UPPERCASE
        //date -> lowercase
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = null;
        try {
            parsedDate = simpleDateFormat.parse(dobWithDashes);
//            throw new ParseException(dobWithDashes, 0);
        } catch (ParseException ex) {
            // You know this but this is cool
//            Logger.getLogger(RunnerTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("We are unable to create a date from " + dobWithDashes);
        }
        System.out.println(parsedDate);
        System.out.println(simpleDateFormat.format(dob));
    }

    private static Date exampleAddingDates() {
        final Date dateOne = new Date("1970/06/18");
        final Date dateTwo = new Date("1996/06/18");
        System.out.println("dateOne - " + dateOne.getTime());
        System.out.println("dateTwo - " + dateTwo.getTime());
        Long dateInTime = dateOne.getTime() + dateTwo.getTime();
        System.out.println("dateInTime " + dateInTime);
        return new Date(dateInTime);
    }

    private static long janesDob(String string) {
        final Date today = new Date();
        final Date dateOfBirth = new Date(string);
        return today.getTime() - dateOfBirth.getTime();
    }
}
