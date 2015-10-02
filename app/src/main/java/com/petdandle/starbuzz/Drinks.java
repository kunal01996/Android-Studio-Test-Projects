package com.petdandle.starbuzz;

/**
 * Created by Pooja on 9/30/2015.
 */
public class Drinks {

        private String name;
        private String description;
        private int imageResourceId;

        public static final Drinks[] drinks = {
                new Drinks("Latte","A couple of esprasso shots with steamed milk", R.drawable.latte),
                new Drinks("Cappuccino", "Esprasso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
                new Drinks("Filter", "Highest quality Coffe beans roasted and brewed fresh", R.drawable.filter)};

        public Drinks(String name, String description, int imageResourceId)
        {
            this.description = description;
            this.name = name;
            this.imageResourceId = imageResourceId;


        }

        public String getDiscription()
        {
            return description;
        }
        public String getName()
        {
            return name;
        }
        public int getImageResourceId()
        {
            return imageResourceId;
        }
        public String toString()
        {
            return this.name;
        }


}
