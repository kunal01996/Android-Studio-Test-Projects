package com.petdandle.starbuzz;


import android.app.Activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKNO = "drinkNo";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        //Get Information from Intent



        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        Drinks drinks = Drinks.drinks[drinkNo];
        //Populate the drink page

        ImageView imageView = (ImageView) findViewById(R.id.latte);
        imageView.setImageResource(drinks.getImageResourceId());
        imageView.setContentDescription(drinks.getName());
        TextView textView = (TextView) findViewById(R.id.name);
        textView.setText(drinks.getName());
        TextView textView1 = (TextView)findViewById(R.id.description);
        textView1.setText(drinks.getDiscription());


    }

}