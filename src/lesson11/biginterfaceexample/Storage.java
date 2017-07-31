package lesson11.biginterfaceexample;

/**
 * Created by susanoo on 16.07.17.
 */
public class Storage {
    private File[] files = new File[5];

    public Storage(File[] files) {
        this.files = files;
    }

    public File[] getFiles() {
        return files;
    }
}
