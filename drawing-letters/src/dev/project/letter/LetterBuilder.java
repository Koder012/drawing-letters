package dev.project.letter;

public class LetterBuilder {

    public static void buildingLetterA(){
        for(int i = 1; i <= 5;i++){
            for(int j = 1; j <= 9;j++){
                if((j == 6-i) || (i == 3 && j >= 3 && j <= 7) || (j == 4 + i))
                    System.out.print("+");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
