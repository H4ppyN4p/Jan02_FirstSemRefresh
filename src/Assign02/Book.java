package Assign02;

public class Book {

    private int numberISBN = 0;
    private String titel = "";
    private int yearOfRelease = 0;

    public Book(int numberISBN, String titel, int yearOfReleaste) {
        this.numberISBN = numberISBN;
        this.titel = titel;
        this.yearOfRelease = yearOfReleaste;
    }

    public int getNumberISBN() {
        return numberISBN;
    }

    public void setNumberISBN(int numberISBN) {
        this.numberISBN = numberISBN;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString(){
        return numberISBN + " " + titel + " " + yearOfRelease;
    }
}
