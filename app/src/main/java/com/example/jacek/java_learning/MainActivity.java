package com.example.jacek.java_learning;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //LinearLayout ll = this.findViewById(R.id.linlay);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout LL = findViewById(R.id.linlay);

        ScrollView SV = new ScrollView(this);
        SV.setLayoutParams(new ScrollView.LayoutParams(ScrollView.LayoutParams.MATCH_PARENT,ScrollView.LayoutParams.MATCH_PARENT));
        LL.addView(SV);

        LinearLayout linearLayout = new LinearLayout(this);
        //this.setContentView(linearLayout);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        SV.addView(linearLayout);

        /* WZÓR:

        TextView text = new TextView(this);
        text.setText(" TextView Programmatically Example.");
        linearLayout.addView(text);

        */

        String mnoga = "bottles";
        String first = "of beer on the wall";
        String second = "of beer. \nTake one down and pass it around,";
        String end = "no more bottles";
        String no_more1 = "No more bottles of beer on the wall, no more bottles of bear.";
        String no_more2 = "Go to the store and buy some more, 99 bottles of beer on the wall.";
        int liczba = 99;

        while(liczba > 0){
            TextView text = new TextView(this);
            text.setText(liczba + " " + mnoga + " " + first + ", " + liczba + " " + mnoga + " " + second + " ");
            linearLayout.addView(text);

            liczba -= 1;
            if(liczba == 1){
                mnoga = "bottle";
            }
            if(liczba > 0){
                TextView text2 = new TextView(this);
                text2.setText(liczba + " " + mnoga + " " + first + ".\n\n");
                linearLayout.addView(text2);
            }
            else{
                TextView text2 = new TextView(this);
                text2.setText(end + " " + first + ".\n\n");
                linearLayout.addView(text2);
            }
        }

        TextView text3 = new TextView(this);
        text3.setText(no_more1);
        linearLayout.addView(text3);

        TextView text4 = new TextView(this);
        text4.setText(no_more2);
        linearLayout.addView(text4);
    }
}
