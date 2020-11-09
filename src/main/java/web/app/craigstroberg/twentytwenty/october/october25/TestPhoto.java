package web.app.craigstroberg.twentytwenty.october.october25;

public class TestPhoto {

    public static void main(String[] args) {

        Album album = new Album();

        System.out.println(album.toString());

        album.sort();
        System.out.println("sorted list:");
        System.out.println(album.listAll());
        album.addTagToAllImages("holiday");
    }
}
