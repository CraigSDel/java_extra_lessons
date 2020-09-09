import java.util.Scanner;

public class Subject {

    private int subjectID;
    private String subjectName;
    private String category;
    private boolean designated;

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

        while(subject.hasNext()){

            String Subject = subject.nextLine();

            if(Subject.contains("*")){
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
        return "Subject{" + "subjectID=" + subjectID + ", subjectName=" + subjectName + ", category=" + category + ", designated=" + designated + '}';
    }

}
