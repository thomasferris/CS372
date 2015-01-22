package com.example.nt2.pr4_2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import java.util.Random;
import java.lang.*;
import android.graphics.*;

public class MainActivity extends ActionBarActivity {
    Random rand = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void headsTails (){
        int result = rand.nextInt(2);
        TextView f = (TextView)this.findViewById(R.id.textHeads);
        TextView t =  (TextView)this.findViewById(R.id.textTails);
        ImageView x = (ImageView)this.findViewById(R.id.imageHeads);
        x.setImageResource(R.drawable.heads);

        if (result == 0){
            f.setVisibility(View.VISIBLE);
            x.setVisibility(View.VISIBLE);
        }
        else if (result ==1){
            t.setVisibility(View.VISIBLE);
        }
    }
}
