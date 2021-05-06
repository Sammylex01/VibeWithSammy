package com.samoye.samrock;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TopSongsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //TopSongs ArrayList
        ArrayList<Music> topSongs = new ArrayList<Music>();
        topSongs.add(new Music("Peaches", "Justin Bieber Ft Giveon, Daniel Ceasar"));
        topSongs.add(new Music("Rockstar", "Dababy Ft Roddy Ricch"));
        topSongs.add(new Music("Kilometre", "Burna Boy"));
        topSongs.add(new Music("It Is What It Is", "Adekunle Gold"));
        topSongs.add(new Music("Forever", "Gakyie Ft Omay Lhay"));
        topSongs.add(new Music("History", "Cheque Ft Fireboy DML"));
        topSongs.add(new Music("Focus", "Joeboy"));
        topSongs.add(new Music("Titanium", "Dave"));
        topSongs.add(new Music("Super Heroes", "Stormzy"));
        topSongs.add(new Music("Godly", "Omah Lhay"));
        topSongs.add(new Music("Terri", "Come Around"));

        MusicAdapter adapter = new MusicAdapter(this, topSongs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
