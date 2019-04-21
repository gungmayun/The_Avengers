package com.example.gungmayun.the_avengers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNameRemarks = new ArrayList<>();
    private ArrayList<String> mActors = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");
        initData();
        //initRecyclerView();
        showRecyclerList();
    }

    private void initData() {
        AvengersData avengersData = new AvengersData();
        avengersData.initAvengersData();

        mNames = avengersData.getmNames();
        mImageUrls = avengersData.getmImageUrls();
        mNameRemarks = avengersData.getmNameRemarks();
        mActors = avengersData.getmActors();
        mDescription = avengersData.getmDescriptions();
    }

    //private void initRecyclerView(){
        //Log.d(TAG, "initRecyclerView: initrecyclerview.");
        //RecyclerView recyclerView = findViewById(R.id.recycler_view);
        //RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, mImageUrls, mNameRemarks, mActors, mDescription);
        //recyclerView.setAdapter(adapter);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
    //}
    
    private void showRecyclerList(){
        Log.d(TAG, "showRecyclerList: showrecyclerlist.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mNameRemarks, mActors, mDescription);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void showRecyclerGrid() {
        Log.d(TAG, "showRecyclerGrid: showrecyclergrid");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        GridActivity adapter = new GridActivity(this, mNames, mImageUrls, mNameRemarks, mActors, mDescription);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }

    private void showRecyclerCardView(){
        Log.d(TAG, "showRecyclerCardView: showrecyclercardview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        CardViewActivity adapter = new CardViewActivity(this, mNames, mImageUrls, mNameRemarks, mActors, mDescription);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyclerList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode CardView");
                showRecyclerCardView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}
