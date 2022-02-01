package Assign07;

import java.util.ArrayList;

public class Search {

    public int searchArrayForWord(String wordToSearchFor, ArrayList<String> arrayListOfWords){

        int arraySize = arrayListOfWords.size();
        int i = 0;
        int notFound = -1;

        for (; i < arraySize; i++){
            if (arrayListOfWords.get(i).equals(wordToSearchFor)){
                return i;
            }
        }

        return notFound;
    }
}
