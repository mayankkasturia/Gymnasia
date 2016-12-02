package android.csulb.edu.gymnasia4.exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.csulb.edu.gymnasia4.R;
import android.widget.ImageView;
import android.widget.TextView;

public class AbsDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_description);
        final TextView textview = (TextView)findViewById(R.id.chest_textView);
        final ImageView img = (ImageView)findViewById(R.id.chest_imageView);
        final ImageView description = (ImageView)findViewById(R.id.chest_imageView2);

        Intent rec_intent= getIntent();
        Bundle my_b1 =rec_intent.getExtras();
        int val1= my_b1.getInt("val");

        if(val1==0) {
            textview.setText(getString(R.string.straightarm));
            img.setImageResource(R.drawable.abs_1);
            description.setImageResource(R.drawable.abs_11);

        }
        if(val1==1) {
            textview.setText(getString(R.string.latpulldowns));
            img.setImageResource(R.drawable.abs_2);
            description.setImageResource(R.drawable.abs_22);
        }
        if(val1==2) {
            textview.setText(getString(R.string.inclineleg));
            img.setImageResource(R.drawable.abs_3);
            description.setImageResource(R.drawable.abs_33);
        }
        if(val1==3) {
            textview.setText(getString(R.string.inclinebench));
            img.setImageResource(R.drawable.abs_4);
            description.setImageResource(R.drawable.abs_44);
        }
        if(val1==4) {
            textview.setText(getString(R.string.broom));
            img.setImageResource(R.drawable.abs_5);
            description.setImageResource(R.drawable.abs_55);
        }
        if(val1==5) {
            textview.setText(getString(R.string.roman));
            img.setImageResource(R.drawable.abs_6);
            description.setImageResource(R.drawable.abs_66);
        }


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
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
        if (android.R.id.home == item.getItemId()) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }


}