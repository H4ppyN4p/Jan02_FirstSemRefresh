package Assign02;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> arrayListOfBooks = new ArrayList<Book>();
    private boolean isBookInLibrary = false;

    public Library() {
    }

    public void addBookToLibrary(Book bookToAdd){
        arrayListOfBooks.add(bookToAdd);
    }

    public boolean checkIfBookExist(Book bookToCheck){
        boolean doesBookExistInLibrary = false;

        for (Book bookInLibrary: arrayListOfBooks
             ) {
            if (bookToCheck.getNumberISBN() == bookInLibrary.getNumberISBN()) {
                doesBookExistInLibrary = true;
            }
        }

        if (doesBookExistInLibrary == true){
            isBookInLibrary = true;
        } else {
            isBookInLibrary = false;
        }

        return isBookInLibrary;
    }

}
