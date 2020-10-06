package web.app.craigstroberg.twentytwenty.september.september09;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SportStore {

    String spName;
    int scCode;
    String venue;
    String entryCode;

    public static void main(String[] args) throws IOException {

        String fileName = "Sports.txt";

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter sports name#" + "Schools code#" + "the venue#" + "and the entry code:");

        String input = userInput.nextLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

        writer.append('\n');
        writer.append(input);
        writer.close();

    }

}
