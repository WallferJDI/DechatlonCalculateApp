package service;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReaderServiceTest {


    @Test
    public void readLines() throws FileNotFoundException {
        ReaderService readerService = new ReaderService();


        List<String> lines = readerService.readLines("src/test/resources/results.csv");
        assertEquals(6,lines.size());
        assertEquals("John Smith;12.61;5.00;9.22;1.50;60.39;16.43;21.60;2.60;35.81;5:25.72",lines.get(0).trim());
        assertEquals("Foo Bar;13.43;4.35;8.64;1.50;66.06;19.05;24.89;2.20;33.48;6:51.01",lines.get(3).trim());
        assertEquals("Tibaso Kanajo;12.21;4.12;9.1;1.50;32.06;19.05;18.89;2.20;33.48;8:51.01",lines.get(5).trim());


    }

    @Test
    public void isBlank() {
        ReaderService readerService = new ReaderService();
        assertEquals(true,readerService.isBlank("   "));
        assertEquals(true,readerService.isBlank(null));
        assertEquals(false,readerService.isBlank("no blank"));
    }
}