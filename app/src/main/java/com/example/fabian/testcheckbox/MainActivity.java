package com.example.fabian.testcheckbox;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cb1 = (CheckBox) findViewById( R.id.checkBox );
        cb2 = (CheckBox) findViewById( R.id.checkBox2 );
        cb3 = (CheckBox) findViewById( R.id.checkBox3 );

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if( isChecked ){
                    Drawable ic = getResources().getDrawable( R.drawable.ic_left_checked );
                    buttonView.setCompoundDrawablesWithIntrinsicBounds(null, ic, null, null);
                }else if( !isChecked ){
                    Drawable ic = getResources().getDrawable( R.drawable.ic_left );
                    buttonView.setCompoundDrawablesWithIntrinsicBounds(null, ic, null, null);
                }
            }
        });

        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if( isChecked ){
                    Drawable ic = getResources().getDrawable( R.drawable.ic_top_checked );
                    buttonView.setCompoundDrawablesWithIntrinsicBounds(null, ic, null, null);
                }else if( !isChecked ){
                    Drawable ic = getResources().getDrawable( R.drawable.ic_top );
                    buttonView.setCompoundDrawablesWithIntrinsicBounds(null, ic, null, null);
                }
            }
        });

        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if( isChecked ){
                    Drawable ic = getResources().getDrawable( R.drawable.ic_right_checked );
                    buttonView.setCompoundDrawablesWithIntrinsicBounds(null, ic, null, null);
                }else if( !isChecked ){
                    Drawable ic = getResources().getDrawable( R.drawable.ic_right );
                    buttonView.setCompoundDrawablesWithIntrinsicBounds(null, ic, null, null);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
