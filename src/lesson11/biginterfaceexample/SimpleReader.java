package lesson11.biginterfaceexample;

/**
 * Created by susanoo on 16.07.17.
 */
public class SimpleReader implements Readable {
    @Override
    public void readFilesFromStorage(Storage storage) {
        System.out.println();
        System.out.println("All files from storage:");
        for(File file : storage.getFiles()){
            if(file != null){
                System.out.println(file.getName());
            }
            else{
                System.out.println(file);
            }
        }
    }
}
