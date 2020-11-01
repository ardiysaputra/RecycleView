package com.example.praktekrecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] movie = {"Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice "};
    private String[] movieYear = {"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016"};

    private ArrayList<Movie2451> movieList;

    private RecyclerrView rvMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieList = new ArrayList<>();

        for (int i = 0; i < (movie.length) ; i++) {
            Movie2451 mov = new Movie2451(movie[i],movieYear[i]);
            movieList.add(mov);
        }

        rvMovie = findViewById(R.id.rvMovie);
        rvMovie.setHasFixedSize(true);

        rvMovie.setLayoutManager(new LinearLayoutManager(this));

        MovieAdapter2451 movieAdapter = new MovieAdapter2451(movieList);
        rvMovie.setAdapter(movieAdapter);

    }
}