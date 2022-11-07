package controller;

import configuration.AppConfig;
import org.junit.Test;
import service.ReaderService;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.Assert.*;

public class ConverterControllerTest {

    @Test
    public void convertCSVtoXML() throws FileNotFoundException {
        ConverterController converterController = new ConverterController();
        ReaderService readerService = new ReaderService();
        AppConfig.saveFilePath = "src/test/resources/generated_files/";
        converterController.convertCSVtoXML("src/test/resources/results.csv");

        List<String> generatedLines = readerService.readLines("src/test/resources/generated_files/result.xml");
        List<String> compareLines = readerService.readLines("src/test/resources/result.xml");

        assertEquals(true,generatedLines.equals(compareLines));

    }
}