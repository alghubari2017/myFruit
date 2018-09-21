package com.alghubari.mystories;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v4.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {

            BlankFragment headFragment = new BlankFragment();


            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .add(R.id.head_container, headFragment)
                    .commit();
            headFragment.setImImageId(AndroidImageAssets.getHeads());
            headFragment.setmListIndex(1);
            // Create and display the body and leg BodyPartFragments

            BlankFragment bodyFragment = new BlankFragment();
            bodyFragment.setImImageId(AndroidImageAssets.getBodies());
            fragmentManager.beginTransaction()
                    .add(R.id.body_container, bodyFragment)
                    .commit();

            BlankFragment legFragment = new BlankFragment();
            legFragment.setImImageId(AndroidImageAssets.getLegs());
            fragmentManager.beginTransaction()
                    .add(R.id.leg_container, legFragment)
                    .commit();
// Create and display the body and leg BodyPartFragments


        }

    }
}