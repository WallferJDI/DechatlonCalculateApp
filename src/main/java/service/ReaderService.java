package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderService {

    public List<String> readLines(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        List<String> lineList = new ArrayList<>();
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if(!isBlank(line))
                lineList.add(line);
        }
        return lineList;
    }
    public  boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }




}
