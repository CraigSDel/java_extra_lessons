package web.app.craigstroberg.twentytwenty.september.september09;

public class SportsCollector {

    /*The School codes recorded so far are:
        int 1 - St Alban’s College
        int 2 - St Mary’s DSG
        int 3 - St Stithians College
        int 4 - St John’s College
        int 5 - Woodhill College*/

    private String sport;
    private int schoolNumber;
    private String venue;

    public static void main(String[] args) {
        SportsCollector sportsCollector = new SportsCollector("Hockey", 5, "Jome");
        System.out.println(sportsCollector.getEntryCode());
        System.out.println(sportsCollector + " is your entry code.");
    }

    public SportsCollector(String sport, int schoolNumber, String venue) {
        this.sport = sport;
        this.schoolNumber = schoolNumber;
        this.venue = venue;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getEntryCode() {
        return this.schoolNumber + this.sport.substring(0, 3).toUpperCase() + this.venue.substring(0, 1);
    }

    @Override
    public String toString() {
        return "SportsCollector{" + "sport=" + sport + ", schoolNumber=" + schoolNumber + ", Venue=" + venue + '}';
    }


}
