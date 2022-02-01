package Assign05;

public class StringManipulator {

    public String manipulateString(String stringToManipulate){
        String stringAfterManipulation = "";

        String[] arrayOfString = stringToManipulate.split(" ");

        for (String string: arrayOfString
             ) {

            char[] charArray = string.toCharArray();

            if (evaluateCharacters(charArray) == true){
                stringAfterManipulation += string + " ";
            } else {
                stringAfterManipulation += evaluateFixWord(charArray) + " ";
            }

        }

        System.out.println(stringAfterManipulation);
        return stringAfterManipulation;
    }

    public boolean evaluateCharacters(char[] arrayOfChars){
        boolean isAllUppercase = true;

        for (char character: arrayOfChars
             ) {
            if (Character.isUpperCase(character) == true){

            } else {
                isAllUppercase = false;
            }
        }

        return isAllUppercase;
    }

    public String evaluateFixWord(char[] arrayOfChars){
        int arraySize = arrayOfChars.length;
        String stringToReturn = "";

        if (arraySize < 4) {
            for (char character: arrayOfChars
                 ) {
                stringToReturn += Character.toLowerCase(character);
            }
        } else {
            for (int i = 0; i < arraySize; i++){
                if (i == 0){
                    stringToReturn += Character.toUpperCase(arrayOfChars[i]);
                } else {
                    stringToReturn += Character.toLowerCase(arrayOfChars[i]);
                }
            }
        }

        return stringToReturn;
    }
}
