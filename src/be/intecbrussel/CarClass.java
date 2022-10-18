package be.intecbrussel;

import java.util.Scanner;

public class CarClass {


    Scanner myScan = new Scanner(System.in);

    Colour colour;

    public CarClass(Colour colour) {
        this.colour = colour;
    }


    public void getColour() {

        System.out.println("choose the colour of your car: ");
        Colour col = Colour.valueOf(myScan.nextLine().toUpperCase());

        switch (col) {
            case RED:
                System.out.println("colour is Red");
                break;
            case PURPLE:
                System.out.println("colour is Purple");
                break;
            case GREEN:
                System.out.println("colour is Green");
                break;
            case BLUE:
                System.out.println("colour is Blue");
                break;
            case WHITE:
                System.out.println("colour is White");
                break;
            case GRAY:
                System.out.println("colour is Gray");
                break;
        }
    }




}
