package lesson11.biginterfaceexample;

/**
 * Created by susanoo on 16.07.17.
 */
public class FileReader implements Readable{
    @Override
    public void readFilesFromStorage(Storage storage) {
        printFile(findMaxsizeFile(storage.getFiles()));
    }

    private File findMaxsizeFile(File[] files){
        File maxFileSize = files[0];

        for(File file : files){
            if(file != null) {
                if (file.getSize() > maxFileSize.getSize()) {
                    maxFileSize = file;
                }
            }
        }
        return maxFileSize;
    }

    private void printFile(File file){
        System.out.println("Max file will be printed now...");
        System.out.println(file.getName());
        System.out.println(file.getExtension());
        System.out.println(file.getPath());
        System.out.println(file.getSize());
    }
}
