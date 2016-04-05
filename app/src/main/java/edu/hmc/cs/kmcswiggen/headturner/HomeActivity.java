package edu.hmc.cs.kmcswiggen.headturner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Endemic on 4/4/2016.
 * Based entirely on http://code.tutsplus.com/tutorials/build-a-custom-launcher-on-android--cms-21358
 */
public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void showApps(View v) {
        Intent i = new Intent(this, AppsListActivity.class);
        startActivity(i);
    }
}
