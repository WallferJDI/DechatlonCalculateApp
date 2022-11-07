package controller;

import model.Athletic;
import service.ConverterService;
import service.RankService;
import service.ReaderService;
import utils.GenerateXML;

import java.io.FileNotFoundException;

import java.util.List;

public class ConverterController {

    private final ConverterService converterService;
    private final RankService rankService;
    private final GenerateXML generateXML;
    private final ReaderService readerService;

    public ConverterController() {
        rankService =  new RankService();
        converterService = new ConverterService();
        generateXML = new GenerateXML();
        readerService = new ReaderService();
    }

    public void convertCSVtoXML(String filePath){
        try {
            List<Athletic> athleticList =  converterService.convertToAthleticList( readerService.readLines(filePath));
            generateXML.athleticToXML(rankService.defineRanks(athleticList));

        }catch (FileNotFoundException fileNotFoundException){
            System.out.println(fileNotFoundException.getMessage());
        }


    }
}
