import configuration.AppConfig;
import controller.ConverterController;
import service.FilePathService;


import java.io.IOException;


public class DecathlonResultConvertApp {


    public static void main(String[] args) throws IOException {
        ConverterController converterController = new ConverterController();
        FilePathService filePathService = new FilePathService();
        while (true){
            AppConfig.saveFilePath = filePathService.requestSavePath();
            converterController.convertCSVtoXML(filePathService.requestFilePath());//"D:\\results.csv"
            System.out.println(AppConfig.saveFilePath + AppConfig.fileName);

        }


    }

}
