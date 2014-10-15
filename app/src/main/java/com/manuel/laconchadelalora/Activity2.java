package com.manuel.laconchadelalora;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Activity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


       /* Button buttonB = (Button)findViewById(R.id.RightIn);
        buttonB.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent();
                intent.setClass(Activity2.this, MyActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
            }});*/


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == android.R.id.home) {


            /*Intent intent = new Intent();
            intent.setClass(Activity2.this, MyActivity.class);
            startActivity(intent);
*/
            this.finish();
            overridePendingTransition(R.anim.left_in, R.anim.right_out);


            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
