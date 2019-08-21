package Package;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
    public static void main(String[] args) throws Exception {
        int i = 0;
        FileReader file = new FileReader(args[args.length-1]);
        Scanner text = new Scanner(file);
        Pattern pattern;
        Matcher matcher;
        while (text.hasNextLine()) {
            String line = text.nextLine();
            String word;
            for (int n = 0; n < args.length - 1; n++ ) {
                word = args[n];
               // System.out.println(word);
                pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
                matcher = pattern.matcher(line);
                if(matcher.find()) {
                    System.out.println((i++) + ". " + line);
                    break;
                }
            }

        }
        text.close();
        file.close();
    }
}