package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
//        words.add("one");
//        Word w = new Word("one", "lutti");
//        words.add(w);
        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("green", "chokokki", R.drawable.color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));



        WordAdapter adapter = new WordAdapter(this, words);

     // GridView listView = (GridView) findViewById(R.id.list);
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