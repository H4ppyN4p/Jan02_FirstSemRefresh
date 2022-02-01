package Assign06;

import java.util.Comparator;

public class CompareStrings implements Comparator<String> {
    public int compare(String stringOne, String stringTwo){
        return stringTwo.compareTo(stringOne);
    }
}
