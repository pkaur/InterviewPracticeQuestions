package StringManipulation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountWordsInFile {


    public static void countWords(File f) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(f));
        HashMap<String, Integer> hm = new HashMap<>();
        String readLine = "";
        int count=1;

        while ((readLine = br.readLine()) != null) {

            String[] words = readLine.split(" ");

            for (String s : words) {

                if (!hm.containsKey(s)) {
                    hm.put(s, count);
                } else {
                    hm.put(s, hm.get(s) + 1);
                }
            }

            for (Map.Entry<String, Integer> entry : hm.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }

    public static void main(String[] args) throws Exception {

        File f = new File("/Users/niteshnayak/IdeaProjects/MissionJob/file.txt");
        countWords(f);
    }
}
