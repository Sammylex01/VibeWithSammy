package com.samoye.samrock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView header = (TextView) findViewById(R.id.header);

        // Find the View that shows the songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the topArtist category
        TextView topArtist = (TextView) findViewById(R.id.top_artist);

        // Set a click listener on that View
        topArtist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the topArtist category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TopArtistActivity}
                Intent topArtistIntent = new Intent(MainActivity.this, TopArtistActivity.class);

                // Start the new activity
                startActivity(topArtistIntent);
            }
        });

        // Find the View that shows the topSongs category
        TextView topSongs = (TextView) findViewById(R.id.top_songs);

        // Set a click listener on that View
        topSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the topSongs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TopSongsActivity}
                Intent topSongsIntent = new Intent(MainActivity.this, TopSongsActivity.class);

                // Start the new activity
                startActivity(topSongsIntent);
            }
        });

    }
}