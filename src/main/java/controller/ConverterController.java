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

    public ConverterController(ConverterService converterService, RankService rankService, GenerateXML generateXML, ReaderService readerService) {
        this.converterService = converterService;
        this.rankService = rankService;
        this.generateXML = generateXML;
        this.readerService = readerService;
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
