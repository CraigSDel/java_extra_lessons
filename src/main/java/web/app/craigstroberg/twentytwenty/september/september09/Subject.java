package web.app.craigstroberg.twentytwenty.september.september09;

import java.util.Scanner;

public class Subject {

    private int subjectID;
    private String subjectName;
    private String category;
    private boolean designated;

    public Subject(int subjectID, String subjectName, String category) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        if (category != null || !category.isEmpty() || category.contains("*")) {
            this.designated = true;
            this.category = category.substring(category.indexOf("*"));
        } else {
            this.designated = false;
            this.category = category;
        }
    }

    public Subject(int subjectID, String subjectName, String category, boolean designated) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.category = category;
        this.designated = designated;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isDesignated() {

        boolean designated = false;

        Scanner subject = new Scanner(subjectName).useDelimiter("*");

        while (subject.hasNext()) {

            String Subject = subject.nextLine();

            if (Subject.contains("*")) {
                designated = true;
            } else {
                designated = false;


            }
        }
        return designated;
    }

    public void setDesignated(boolean designated) {
        this.designated = designated;
    }

    @Override
    public String toString() {
        if (designated) {
            return subjectName + "\t" + " (" + category + ") \n\t" + "This is a designated subject";
        } else {
            return subjectName + "\t" + " (" + category + ") \n\t" + "This is not a designated subject";
        }
    }

}
