package service;


import model.Athletic;

import java.util.*;

public class RankService {

    private List<Athletic> athleticPointsList = new ArrayList<>();
    private List<Athletic> alreadyCheckedInstances  = new ArrayList<>();

    public List<Athletic> defineRanks(List<Athletic> athleticList){
        athleticList.forEach((athletic -> {
            athletic.setPoints(athletic.calculatePoints());

        }));
        athleticPointsList = athleticList;
        return calculateRank(athleticPointsList);
    }


    private List<Athletic> calculateRank(List<Athletic> athleticPointsList){
        Collections.sort(athleticPointsList, new Comparator<Athletic>() {
            @Override
            public int compare(Athletic o1, Athletic o2) {
                return  o2.getPoints() - o1.getPoints();
            }
        });

        Integer rank = 1;
        for(int i=0; i < athleticPointsList.size();i++){
           athleticPointsList.get(i).setRank(String.valueOf(rank++));
        }

        athleticPointsList.forEach(e->setEqualsRank(findEqualInstances(e.getPoints())));
        return  athleticPointsList;

    }

    private List<Athletic>  findEqualInstances(Integer points){
        List<Athletic> equalAthletics = new ArrayList<>();
        for (Athletic ath:athleticPointsList) {
            if(ath.getPoints().equals(points)){
                if(!alreadyCheckedInstances.contains(ath)){
                    equalAthletics.add(ath);
                }
                alreadyCheckedInstances.add(ath);
            }
        }
        return equalAthletics;
    }

    private void setEqualsRank(List<Athletic> equalAthletics){
        if(equalAthletics.size()>1){
            String rankSame = equalAthletics.get(0).getRank() + "-"+equalAthletics.get(equalAthletics.size()-1).getRank();
            for(Athletic athleticPoints:equalAthletics){
                athleticPointsList.forEach((e) -> {
                    if(e.equals(athleticPoints)){
                        e.setRank(rankSame);
                    }});
            }
        }
    }


}
