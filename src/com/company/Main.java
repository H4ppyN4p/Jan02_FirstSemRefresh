package com.company;

import Assign01.Assign01_ArrayList;
import Assign02.Book;
import Assign02.Library;
import Assign03.CutGrass;
import Assign04.CreateSquare;
import Assign05.StringManipulator;
import Assign06.CompareStrings;
import Assign07.Search;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Assign 1 variables
        ArrayList<String> arrayListOfStrings = new ArrayList<String>();

        arrayListOfStrings.add("String");
        arrayListOfStrings.add("Boolean");
        arrayListOfStrings.add("Long");
        arrayListOfStrings.add("Integer");

        //Assign 2 variables
        Book oldBookOne = new Book(0111, "oldBookOne", 2019);
        Book newBookOne = new Book(1111, "newBookOne", 2020);
        Book newBookTwo = new Book(1112, "newBookTwo", 2021);
        Book newBookThree = new Book(1113, "newBookThree", 2022);

        Library theLibrary = new Library();
        theLibrary.addBookToLibrary(newBookOne);
        theLibrary.addBookToLibrary(newBookTwo);
        theLibrary.addBookToLibrary(newBookThree);

        Scanner input = new Scanner(System.in);

        boolean isRunning = true;
        int checkInput = 0;

        while (isRunning) {
            System.out.println();
            System.out.println("Choose an option");

            System.out.println("""
                    
                    1: See assignment 01 - ArrayList
                    2: See assignment 02 - Book
                    3: See assignment 03 - Cut grass
                    4: see assignment 04 - Create Square
                    5: see assignment 05 - Manipulate String
                    6: see assignment 06 - Sort by first letter
                    """);
            checkInput = input.nextInt();


            switch (checkInput) {
                case 1:
                    //assignment 01
                    Assign01_ArrayList assign01 = new Assign01_ArrayList();

                    assign01.setStringToFind("Stuff");
                    assign01.setArrayListOfStrings(arrayListOfStrings);
                    if (assign01.doesArrayListContainString() == true) {
                        System.out.println("The String has been found");
                    }
                    break;
                case 2:
                    //assignment 02
                    if (theLibrary.checkIfBookExist(newBookOne) == true){
                        System.out.println("The book is in the library");
                    } else {
                        System.out.println("The book is not in the library");
                    }
                    break;
                case 3:
                    //assignment 03
                    System.out.println("How high is the grass currently - use double");
                    double grassCurrentHeight = input.nextDouble();
                    System.out.println("How high is the  grass allowed to be - use double");
                    double grassMaxHeight = input.nextDouble();

                    CutGrass grassToCut = new CutGrass();

                    System.out.println(grassToCut.calculateWhenToCutGrass(grassCurrentHeight, grassMaxHeight));
                    break;
                case 4:
                    //assignment 04
                    System.out.println("How big should the square be? Use a whole number");
                    int squareSize = input.nextInt();

                    System.out.println("What single character do you want the square to be made of?");
                    char charToPrint = input.next().charAt(0);

                    CreateSquare squareCreator = new CreateSquare();
                    squareCreator.squareProducer(squareSize, charToPrint);


                    break;
                case 5:
                    //assignment 05
                    System.out.println("Enter a sentence:");
                    String stringToBeManipulated = input.nextLine();

                    StringManipulator stringManipulator = new StringManipulator();
                    stringManipulator.manipulateString("Hej mit navn ER TobIAs HamMEken aRBoe");
                    break;
                case 6:
                    //assignment 06
                    ArrayList<String> arrayListOfWords = new ArrayList<String>();

                    System.out.println("Enter word 1 out of 5");
                    arrayListOfWords.add(input.next());
                    System.out.println("Enter word 2 out of 5");
                    arrayListOfWords.add(input.next());
                    System.out.println("Enter word 3 out of 5");
                    arrayListOfWords.add(input.next());
                    System.out.println("Enter word 4 out of 5");
                    arrayListOfWords.add(input.next());
                    System.out.println("Enter word 5 out of 5");
                    arrayListOfWords.add(input.next());

                    Collections.sort(arrayListOfWords, new CompareStrings());

                    System.out.println();
                    System.out.println("Sorted by first letter");
                    System.out.println();

                    for (String word: arrayListOfWords
                         ) {
                        System.out.println(word);
                    }
                    break;
                case 7:
                    ArrayList<String> arrayListOfWordsToSearchThrough = new ArrayList<String>();

                    arrayListOfWordsToSearchThrough.add("abe");
                    arrayListOfWordsToSearchThrough.add("banan");
                    arrayListOfWordsToSearchThrough.add("citrus");
                    arrayListOfWordsToSearchThrough.add("diamand");
                    arrayListOfWordsToSearchThrough.add("engefær");

                    System.out.println("Skriv et ord at søge efter");
                    String wordToSearchFor = input.next().toLowerCase(Locale.ROOT);

                    Search search = new Search();
                    int indexPosition = search.searchArrayForWord(wordToSearchFor, arrayListOfWordsToSearchThrough);
                    System.out.println(indexPosition);

            }

        }
    }
}
