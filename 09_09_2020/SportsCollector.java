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
    private static String entryCode;

    public static void main(String[] args) {

        System.out.println(entryCode + " is your entry code.");
    }

    public SportsCollector(String sport, int schoolNumber, String venue, String entryCode) {
        this.sport = sport;
        this.schoolNumber = schoolNumber;
        this.venue = venue;
        this.entryCode = entryCode;
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
        return entryCode;
    }

    public void setEntryCode(String entryCode) {
        this.entryCode = schoolNumber + sport.substring(0, 2) + venue.substring(0, 1);
    }

    @Override
    public String toString() {
        return "SportsCollector{" + "sport=" + sport + ", schoolNumber=" + schoolNumber + ", Venue=" + venue + ", entryCode=" + entryCode + '}';
    }


}
