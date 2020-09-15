package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
//        words.add("one");
//        Word w = new Word("one", "lutti");
//        words.add(w);
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo'e"));
        words.add(new Word("ten", "na'aacha"));



        WordAdapter adapter = new WordAdapter(this, words);

//        GridView listView = (GridView) findViewById(R.id.list);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

//        // Find the root view so we can add child views to it
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//
//        // Create a variable to keep track of the current index position
//        int index = 0;
//
//        // Keep looping until we've reached the end of the list (which means keep looping
//        // as long as the current index position is less than the length of the list)
//        while (index < words.size()) {
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//
//            // Set the text to be word at the current index
//            wordView.setText(words.get(index));
//
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//
//            // Increment the index variable by 1
//            index++;
//        }

//        // increments by 1 each time the code in the loop is executed.
//        for (int index = 0; index < words.size(); index++) {
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//            rootView.addView(wordView);
//        }
    }
}