package com.samoye.samrock;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TopArtistActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //TopArtist ArrayList
        ArrayList<Music> topArtist = new ArrayList<Music>();
        topArtist.add(new Music("Roddy Ricch", "United States of America"));
        topArtist.add(new Music("Justin Bieber", "United States of America"));
        topArtist.add(new Music("Burna Boy", "Nigeria"));
        topArtist.add(new Music("Wizkid", "Nigeria"));
        topArtist.add(new Music("DaBaby", "United States of America"));
        topArtist.add(new Music("Lil Baby", "United States of America"));
        topArtist.add(new Music("Lil Durk", "United States of America"));
        topArtist.add(new Music("DAX", "United States of America"));
        topArtist.add(new Music("Post Malone", "United States of America"));
        topArtist.add(new Music("Roddy Wave", "United States of America"));
        topArtist.add(new Music("Koffee", "Jamiaca"));

        MusicAdapter adapter = new MusicAdapter(this, topArtist);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
