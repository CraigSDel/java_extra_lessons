package web.app.craigstroberg.twentytwenty.october.october25;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ItemsOnANewLine {

    public static void main(String[] args) {

        String fileName = "Sports.txt";

        BufferedWriter writer = null;
        try {

            String[] customer = new String[1];
            customer[0] = "name,surname,dob";
            String[] customerDetailsSplit = customer[0].split(",");

            writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(customerDetailsSplit[0] + "\n"
                    + customerDetailsSplit[1] + "\n"
                    + customerDetailsSplit[2] + "\n");

            writer.close();

            for (int i = 0; i < item.length; i++) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
