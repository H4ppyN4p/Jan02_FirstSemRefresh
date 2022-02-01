package Assign03;

public class CutGrass {

    public int calculateWhenToCutGrass(double currentGrassLength, double maxGrassLength){
       double daysUntilGrassCut = (maxGrassLength - currentGrassLength) / 0.8;
        int daysUntilGrassCutInt = (int) daysUntilGrassCut;
       return daysUntilGrassCutInt;
    }

}
