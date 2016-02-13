package com.example.julian.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.JokeSource;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        JokeSource jokeSource = new JokeSource();
        TextView jokeTextView = (TextView) findViewById(R.id.joke_textView);
        jokeTextView.setText(jokeSource.getJoke());
    }
}
