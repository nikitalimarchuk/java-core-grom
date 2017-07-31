package lesson11.biginterfaceexample;

/**
 * Created by susanoo on 16.07.17.
 */
public class Demo {
    public static void main(String[] args) {
        File file1 = new File("test1.txt", "C:/user/home1", "txt", 11);
        File file2 = new File("test2.jpg", "C:/user/home2", "jpg", 122);
        File file3 = new File("test3.mp3", "C:/user/home3", "mp3", 512);
        File file4 = new File("test4.mp4", "C:/user/home4", "mp4", 2048);
        File file5 = new File("test5.mp4", "C:/user/home4", "mp4", 2048);

        File[] files = new File[]{file1, file2, null, file4, file5};
        Storage storage = new Storage(files);

        FileReader fileReader = new FileReader();
        SimpleReader simpleReader = new SimpleReader();

        read(storage, fileReader);
        read(storage, simpleReader);
    }

    private static void read(Storage storage, Readable readable){
        readable.readFilesFromStorage(storage);
    }
}
