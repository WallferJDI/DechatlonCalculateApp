import configuration.AppConfig;
import controller.ConverterController;
import service.ConverterService;
import service.FilePathService;
import service.RankService;
import service.ReaderService;
import utils.GenerateXML;


import java.io.IOException;


public class DecathlonResultConvertApp {


    public static void main(String[] args) throws IOException {
        ConverterController converterController = new ConverterController(new ConverterService(), new RankService(), new GenerateXML(), new ReaderService());
        FilePathService filePathService = new FilePathService();
        AppConfig.saveFilePath = filePathService.requestSavePath();
        converterController.convertCSVtoXML(filePathService.requestFilePath());
        System.out.println(AppConfig.saveFilePath + AppConfig.fileName);




    }

}
