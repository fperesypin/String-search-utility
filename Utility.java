package Package;
import java.io.*;
import java.util.*;

public class Utility {
    public static void main(String[] args) throws Exception {
        int i = 0;
        FileReader file = new FileReader(args[args.length-1]);
        Scanner text = new Scanner(file);
        while (text.hasNextLine()) {
            boolean success = false;
            String line = text.nextLine();
            for (String word : args) {
                if (line.toLowerCase().contains(word.toLowerCase())) {
                    success = true;
                    break;
                }
            }
            if(success) System.out.println((i++) + ". " + line);
        }
        text.close();
        file.close();
    }
}