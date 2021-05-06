package com.samoye.samrock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //Songs ArrayList
        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music("Black", "Dave"));
        songs.add(new Music("Blinded By Your Grace", "Stormzy"));
        songs.add(new Music("Jaiye", "Ladipoe"));
        songs.add(new Music("Grace", "Wizkid"));
        songs.add(new Music("Die Young", "Roddy Ricch"));
        songs.add(new Music("Better", "Khalid"));
        songs.add(new Music("Game Over", "Dave"));
        songs.add(new Music("Ojoro", "Terri"));
        songs.add(new Music("LOTR", "Ladipoe"));
        songs.add(new Music("Awe Refix", "Dotman"));
        songs.add(new Music("Muje", "Barry Jhay"));
        songs.add(new Music("Okay", "Adekunle Gold"));

        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
