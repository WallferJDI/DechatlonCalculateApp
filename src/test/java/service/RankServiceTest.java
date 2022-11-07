package service;

import model.Athletic;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RankServiceTest {

    @Test
    public void defineRanks() {
        List<Athletic> athleticList = new ArrayList<>();
        AthleticGenerate athleticGenerate = new AthleticGenerate();
        athleticList.add(athleticGenerate.createAthletic1());
        athleticList.add(athleticGenerate.createAthletic2());
        athleticList.add(athleticGenerate.createAthletic3SameAs2());

        RankService rankService = new RankService();
        List<Athletic> athleticPointsList = rankService.defineRanks(athleticList);
        assertEquals("John Smith",athleticPointsList.get(0).getName());
        assertEquals("1",athleticPointsList.get(0).getRank());
        assertEquals(athleticPointsList.get(1).getRank(),athleticPointsList.get(2).getRank());
    }
}