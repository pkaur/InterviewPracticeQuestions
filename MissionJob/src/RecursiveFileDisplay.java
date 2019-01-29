import java.io.File;
import java.io.IOException;

public class RecursiveFileDisplay {

    public static void main(String[] args){

        File currentDir = new File("/Users/niteshnayak/Documents/test1");
        displayContent(currentDir);
    }

    public static void displayContent(File dir){

        try{

            File[] files = dir.listFiles();
            for(File file: files){

                if(file.isDirectory()){

                    System.out.println("Directory : " + file.getName());
                    displayContent(file);
                } else {
                    System.out.println("File : " + file.getName());

                }

            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
