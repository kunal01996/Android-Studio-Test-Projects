package com.petdandle.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.List;

public class DrinkCategoryActivity extends ListActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ListView listView = getListView();
        ArrayAdapter<Drinks> listAdapter= new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Drinks.drinks);
        listView.setAdapter(listAdapter);



    }

@Override
    public void onListItemClick(ListView listView, View view, int position, long id)
    {
        Intent intent = new Intent(this, DrinkActivity.class);


        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }


}