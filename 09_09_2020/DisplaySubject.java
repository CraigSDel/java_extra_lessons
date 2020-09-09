import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplaySubject {


    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "Subjects.txt";

        Scanner scFile = new Scanner(new File(fileName));

        int subjectID = Integer.valueOf(fileName.substring(fileName.indexOf(',') + 1));
        String subjectName = "",
                category = "",
                line = "";

        while(scFile.hasNext()){

            line = scFile.nextLine();

            Scanner scLine = new Scanner(line).useDelimiter(",");

            subjectID = scLine.nextInt();
            subjectName = scLine.next();
            category = scLine.next();

            scLine.close();

        }
    }

}
