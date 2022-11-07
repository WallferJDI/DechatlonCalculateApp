package service;

import configuration.AppConfig;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilePathService {
   private  BufferedReader reader;

    public String requestSavePath() throws IOException {
        reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print(AppConfig.REQUEST_DIRECTORY_PATH_MESSAGE);
        String savePath = reader.readLine();
        if (new File(savePath).isDirectory()){
            return savePath;
        }else{
            System.out.println(AppConfig.ILLEGAL_PATH_MESSAGE);
            return requestSavePath();
        }
    }

    public String requestFilePath() throws IOException {
        reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print(AppConfig.REQUEST_FILE_PATH_MESSAGE);
        String filePath = reader.readLine();
        if(new File(filePath).exists()){
             return filePath;
        }else {
            System.out.println(AppConfig.ILLEGAL_PATH_MESSAGE);
            return requestFilePath();
        }
    }
}
