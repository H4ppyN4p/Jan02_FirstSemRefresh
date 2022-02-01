package Assign04;

public class CreateSquare {

    public void squareProducer(int squareSize, char charToPrint){
        for (int i = 0; i < squareSize; i++){
            for (int ii = 0; ii < squareSize; ii++){
                System.out.print(charToPrint + " ");
            }
            System.out.println();
        }
    }
}
