package web.app.craigstroberg.twentytwenty.october.october25;

public class Photo {

    private String name;
    private String format;
    private int size;
    private String taken;
    private String[] tags;

    public Photo(String n, String f, int s, String t, String[] tg) {
        this.name = formatName(n);
        this.format = f;
        this.size = s;
        this.taken = t;
        this.tags = tg;

    }

    private int roundToMB(int s) {
        return (int) Math.round(s / 1024);
    }

    private String formatName(String n) {
        String substring = n.substring(3);
        if (substring.length() < 4) {
            substring = String.format("%04d", Integer.valueOf(substring));
        }
        return n.substring(0, 3) + "_" + substring;
    }

    public boolean findTag(String tag) {
        if (tag == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (tags[i] != null && tags[i].equals(tag)) {
                return true;
            }
        }
        return false;
    }

    public void addTag(String newTag) {
        int temp = 0;
        for (int i = 0; i < size; i++) {
            if (tags[i] != null && tags[i].equals(newTag)) {
                temp++;
            }
        }
        if (temp < 5) {
            size++;
            tags[size] = newTag;
        }
    }

    public String getName() {
        return name;
    }

    public String getFormat() {

        return format;

    }

    public int getSize() {
        return size;
    }

    public String getTaken() {
        return taken;
    }

    public String[] getTags() {
        return tags;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTaken(String taken) {
        this.taken = taken;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        String tempTags = "";
        for (int i = 0; i < tags.length; i++) {
            if (tags[i] != null) {
                tempTags += tempTags + "/";
            }
        }
        return name + "\t" + format + "\t" + size + "\t" + taken + "\t" + tempTags;
    }
}
