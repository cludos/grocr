package com.corp.druck.grocr;

import java.util.Date;
import java.util.List;
import java.util.Calendar;
/**
 * Created by Carolyn on 9/17/2016.
 */
public class GroceryList {
    private List<Grocery> fridge;
    private Calendar calendar;
    private int lastDay;
    /**
     * Creates new GroceryList that is empty
     */
    public GroceryList(){
        calendar = Calendar.getInstance();
        lastDay = calendar.DAY_OF_YEAR;
    }

    /**
     * Adds a Grocery to the list
     * @param name
     * @param daysLeft
     */
    public void addGrocery(String name,int daysLeft){
        fridge.add(new Grocery(name,daysLeft,new Date()));
    }

    public void update(){
        int daysElapsed = calendar.DAY_OF_MONTH-lastDay;
        lastDay = calendar.DAY_OF_MONTH;
    }

}
