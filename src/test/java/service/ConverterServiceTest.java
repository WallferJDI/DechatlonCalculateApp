package service;

import model.Athletic;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ConverterServiceTest {

    @Test
    public void convertToAthleticList() throws FileNotFoundException {
        ConverterService converterService = new ConverterService();
        List<String> stringList = new ArrayList<>();
        stringList.add("John Smith;12.61;5.00;9.22;1.50;60.39;16.43;21.60;2.60;35.81;5:25.72");
        stringList.add("Simon Var;11.61;5.00;9.22;1.50;60.39;16.43;21.60;2.60;35.81;6:25.72");
        List<Athletic> athleticList = converterService.convertToAthleticList(stringList);

        AthleticGenerate athleticGenerate = new AthleticGenerate();
        assertEquals(athleticGenerate.createAthletic1(),athleticList.get(0));
        assertEquals(athleticGenerate.createAthletic2(),athleticList.get(1));

    }


}