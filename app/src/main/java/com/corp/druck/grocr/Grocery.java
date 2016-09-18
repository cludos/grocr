package com.corp.druck.grocr;
import java.util.Date;
/**
 * Created by Carolyn on 9/17/2016.
 */
public class Grocery {
    private String name;
    private int daysLeft;
    private int date;

    /** Creates a new grocery item
     * @param name of Grocery
     * @param daysLeft till spoiled
     * @param date when bought
     */
    public Grocery(String name, int daysLeft, int date){
        this.name = name;
        this.daysLeft = daysLeft;
        this.date = date;
    }

    public int getDaysLeft(){
        return daysLeft;
    }

    public String getName(){
        return name;
    }

    public int getDate(){
        return date;
    }

//    public int decreaseDaysLeft(){
//        daysLeft -= 1;
//        return daysLeft;
//    }

    public int decreaseDaysLeft(int elapsed){
        daysLeft -= elapsed;
        return daysLeft;
    }
}
