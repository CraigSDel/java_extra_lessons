/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.app.craigstroberg.twentytwenty.july.july07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author craigstroberg
 */
public class Farm {

    public static void main(String[] args) throws ParseException {
        String fileName = "farm.txt";
        Animal[] animals = new Animal[10];

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String fileLine = bufferedReader.readLine();
            //What is the line we expect - Cat#Jane#01/01/12
            while (fileLine != null) {
                System.out.println(fileLine);
                //What we got - Cat#Jane#01/01/12
                String tempLine = fileLine;
                //What we want - Cat
                final String animalType = tempLine.substring(0, tempLine.indexOf('#'));
                System.out.println(animalType);

                //Read from the hash + 1 (to exclude the hash) to the end of the line
                tempLine = tempLine.substring(tempLine.indexOf('#') + 1);
                final String animalName = tempLine.substring(0, tempLine.indexOf('#'));

                //What we want to be left with - Jane#01/01/12
                //Read from the hash + 1 (to exclude the hash) to the end of the line
                System.out.println(animalName);
                tempLine = tempLine.substring(tempLine.indexOf('#') + 1);

                //What we want - Jane
                //What we want to be left with - 01/01/12                                                    
                //What we want - 01/01/12
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
                final Date dateOfBirth = simpleDateFormat.parse(tempLine);
                System.out.println(dateOfBirth);

                //What we would like to do is create an animal instance
                Animal animal = new Animal(dateOfBirth, animalName, animalType);
                System.out.println(animal);
                //Now try to read the next line
                fileLine = bufferedReader.readLine();
                animals[0] = animal;
                animals[1] = animal;
                animals[2] = animal;
                animals[3] = animal;
                animals[4] = animal;
                animals[5] = animal;
                animals[6] = animal;
                animals[7] = animal;
                animals[8] = animal;
                animals[9] = animal;
                System.out.println(animals);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
