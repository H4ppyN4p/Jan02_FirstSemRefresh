package Assign01;

import java.util.ArrayList;

public class Assign01_ArrayList {

    private boolean doesContainString = false;
    private String stringToFind = "";
    private ArrayList<String> arrayListOfStrings = new ArrayList<String>();


    public Assign01_ArrayList(){
    }

    public boolean doesArrayListContainString(){
        boolean checkForString = false;

        for (String stringInArray: arrayListOfStrings
             ) {
            if (stringInArray.contentEquals(stringToFind)){
                checkForString = true;
            }
        }

        if (checkForString == true){
            doesContainString = true;
        } else {
            doesContainString = false;
        };

        if (doesContainString == false){
            arrayListOfStrings.add(stringToFind);
        }

        return doesContainString;
    }

    public void setArrayListOfStrings(ArrayList<String> arrayListOfStrings){
        this.arrayListOfStrings = arrayListOfStrings;
    }

    public void setStringToFind(String stringToFind){
        this.stringToFind = stringToFind;
    }
}
