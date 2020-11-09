package web.app.craigstroberg.twentytwenty.october.october25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Album {

    private Photo[] album = new Photo[250];
    private int size = 0;

    public Album() {
        try {
            Scanner scFile = new Scanner(new File("src\\main\\resources\\photos.txt"));
            while (scFile.hasNext()) {
                String line = scFile.nextLine();
                System.out.println(line);
                String[] photoDetails = line.split("#");
                String[] tags = null;
                if (photoDetails.length == 5 && photoDetails[4] != null) {
                    tags = photoDetails[4].split(",");
                }
                album[size] = new Photo(photoDetails[0], photoDetails[1], Integer.valueOf(photoDetails[2]), photoDetails[3], tags);
                size++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String listAll() {
        String out = "";
        for (int i = 0; i < size; i++) {
            out += album[i].getName() + "\t" + album[i].getFormat() + "\n";
        }
        return out;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i+1; j < size; j++) {
                if (album[i].getFormat().compareTo(album[j].getFormat()) < 0) {
                    Photo photo = album[i];
                    album[i] = album[j];
                    album[j] = photo;
                }
            }
        }
    }

    public String listSome(String fileFormat, String keyword) {
        if (fileFormat == null || fileFormat.isEmpty() || keyword == null || keyword.isEmpty()) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            if (album[i] != null && album[i].getFormat().equalsIgnoreCase(fileFormat)) {
                String[] tags = album[i].getTags();
                for (int j = 0; j < tags.length; j++) {
                    if (tags[j].equalsIgnoreCase(keyword)) {
                        return album[i].toString();
                    }
                }
            }
        }
        return null;
    }

    public void addTagToAllImages(String tag){
        for (int i = 0; i < album.length; i++) {
            album[i].addTag(tag);
        }
    }

    @Override
    public String toString() {
        return "Album{" + "album=" + album + ", size=" + size + '}';
    }

}