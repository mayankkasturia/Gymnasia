package android.csulb.edu.gymnasia4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Menleandescription extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menleandescription);

        //final Context context = ;
        final TextView textview = (TextView)findViewById(R.id.mleantextView);
        final ImageView img = (ImageView)findViewById(R.id.mleanimageView);
        final TextView description = (TextView)findViewById(R.id.mleandesciption);

        Intent rec_intent= getIntent();
        Bundle my_b1 =rec_intent.getExtras();
        int val1= my_b1.getInt("val");

        if(val1==0) {
            textview.setText("Shoulders");
            img.setImageResource(R.drawable.mlean_shoulders);
            img.getLayoutParams().height=800;
            description.setText(getString(R.string.mlean_shoulders_desc));
        }
        if(val1==1) {
            textview.setText("Biceps/ Triceps");
            img.setImageResource(R.drawable.mlean_arms);
            description.setText(getString(R.string.mlean_biandtri));
        }
        if(val1==2) {
            textview.setText("Legs");
            img.setImageResource(R.drawable.mlean_legs);
            description.setText(getString(R.string.mlean_Legs));
        }
        if(val1==3) {
            textview.setText("Abdomen");
            img.setImageResource(R.drawable.mlean_abs);
            img.getLayoutParams().height=800;
            description.setText(getString(R.string.mlean_abs));
        }
        if(val1==4) {

            textview.setText("Cardio");
            img.setImageResource(R.drawable.mlean_cardio);
            img.getLayoutParams().height = 800;
            description.setText(getString(R.string.mlean_cardio));
        }
        if (val1==5){
            textview.setText("Back Body");
            img.setImageResource(R.drawable.mlean_back);
            img.getLayoutParams().height=800;
            description.setText(getString(R.string.mlean_back));
        }
    }
}
