package be.intecbrussel;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {


        WeekDays[] days = WeekDays.values();

        for (WeekDays dy : days) {
            System.out.println(dy + " index: " + dy.ordinal());
        }


        Colour[] colours = Colour.values();

        for (Colour col : colours) {
            System.out.println(col + " index: " + col.ordinal());
        }

        Currency[] currency = Currency.values();

        for (Currency curr : currency) {
            System.out.println(curr + " index: " + curr.ordinal());
        }



        CarClass car = new CarClass(Colour.BLUE);
        car.getColour();

        //System.out.println();





    }
}
