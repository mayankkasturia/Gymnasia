package android.csulb.edu.gymnasia4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class WomenDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_description);
        final TextView textview = (TextView)findViewById(R.id.femtextView);
        final ImageView img = (ImageView)findViewById(R.id.femimageView);
        final TextView description = (TextView)findViewById(R.id.femdesciption);

        Intent rec_intent= getIntent();
        Bundle my_b1 =rec_intent.getExtras();
        int val1= my_b1.getInt("val");

        if(val1==0) {
            textview.setText("Shoulders");
            img.setImageResource(R.drawable.shoulders);
            img.getLayoutParams().height=800;
            description.setText(getString(R.string.femshoulders_desc));
        }
        if(val1==1) {
            textview.setText("Biceps/ Triceps");
            img.setImageResource(R.drawable.biadtri);
            description.setText(getString(R.string.fembiandtri_desc));
        }
        if(val1==2) {
            textview.setText("Legs");
            img.setImageResource(R.drawable.legwork);
            description.setText(getString(R.string.femleg_desc));
        }
        if(val1==3) {
            textview.setText("Abdomen");
            img.setImageResource(R.drawable.abs);
            img.getLayoutParams().height=800;
            description.setText(getString(R.string.femabs_desc));
        }
        if(val1==4) {

            textview.setText("Cardio");
            img.setImageResource(R.drawable.cardio);
            img.getLayoutParams().height = 800;
            description.setText(getString(R.string.femcardio_desc));
        }
        if (val1==5){
            textview.setText("Back Body");
            img.setImageResource(R.drawable.back);
            img.getLayoutParams().height=800;
            description.setText(getString(R.string.fembackwork_desc));
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_women_description, menu);
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
