package com.corp.druck.grocr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private GroceryList groceryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groceryList = new GroceryList();
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.grocery_name);
        String groceryName = editText.getText().toString();
        editText = (EditText) findViewById(R.id.days);
        Integer daysLeft = Integer.parseInt(editText.getText().toString());
        groceryList.addGrocery(groceryName, daysLeft);
    }
}
