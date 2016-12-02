package android.csulb.edu.gymnasia4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MenGainDescription extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_gain_description);

        //final Context context = ;
        final TextView textview = (TextView)findViewById(R.id.mgaintextView);
        final ImageView img = (ImageView)findViewById(R.id.mgainimageView);
        final TextView description = (TextView)findViewById(R.id.mgaindesciption);

        Intent rec_intent= getIntent();
        Bundle my_b1 =rec_intent.getExtras();
        int val1= my_b1.getInt("val");

        if(val1==0) {
            textview.setText("Shoulders");
            img.setImageResource(R.drawable.mgain_shoulders);
            img.getLayoutParams().height=800;
            description.setText(getString(R.string.mgain_shoulders_desc));
        }
        if(val1==1) {
            textview.setText("Biceps/ Triceps");
            img.setImageResource(R.drawable.mgain_arms);
            description.setText(getString(R.string.mgain_biandtri));
        }
        if(val1==2) {
            textview.setText("Legs");
            img.setImageResource(R.drawable.mgain_legs);
            description.setText(getString(R.string.mgain_Legs));
        }
        if(val1==3) {
            textview.setText("Abdomen");
            img.setImageResource(R.drawable.mgain_abs);
            img.getLayoutParams().height=800;
            description.setText(getString(R.string.mgain_abs));
        }
        if(val1==4) {

            textview.setText("Cardio");
            img.setImageResource(R.drawable.mgain_cardio);
            img.getLayoutParams().height = 800;
            description.setText(getString(R.string.mgain_cardio));
        }
        if (val1==5){
            textview.setText("Back Body");
            img.setImageResource(R.drawable.mgain_back);
            img.getLayoutParams().height=800;
            description.setText(getString(R.string.mgain_back));
        }
    }
}
