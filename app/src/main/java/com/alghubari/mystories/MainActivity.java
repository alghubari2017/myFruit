package com.alghubari.mystories;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
//import android.support.v4.app.FragmentManager;
import  com.alghubari.mystories.MasterListFargment;
// This activity is responsible for displaying the master list of all images
// Implement the MasterListFragment callback, OnImageClickListener
import com.alghubari.mystories.R;
public class MainActivity extends AppCompatActivity implements MasterListFargment.OnImageClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }





    @Override
    public void onImageSelected(int position) {
        Toast.makeText(this, "Position clicked = " + position, Toast.LENGTH_SHORT).show();

    }
}