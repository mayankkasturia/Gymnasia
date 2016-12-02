package android.csulb.edu.gymnasia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Suplements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suplements);
        TextView Supplement = (TextView)findViewById(R.id.supplement);
        TextView Protein = (TextView)findViewById(R.id.protien);
        TextView Multivitamin = (TextView)findViewById(R.id.multivitamin);
        TextView Filler = (TextView)findViewById(R.id.filler);
        TextView Creatine = (TextView)findViewById(R.id.creatine);
        TextView Glucosamine = (TextView)findViewById(R.id.glucosamine);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Supplement.setText("Nutritional supplements are not miracle products; supplements will not change our bodies overnight. " +
                "These products will help us meet our goals by supplementing out diet. You'll get the most out of  your supplements only if you " +
                "follow your diet, control your food intake and do your exercises");

        Protein.setText("Muscle regeneration and repair of torn tissues from weight training. If we want to develop solid,fat-free(lean) muscle" +
                ", then we must have a high protein diet. By this I mean beef, poultry and fish, as well as eggs, so that when protein plays a key" +
                " role in supplementing a diet of this kind.");

        Multivitamin.setText("For various reasons, we do not always consume the amount of vitamins and minerals that we need to stay well and feel " +
                "good, so this supplement will supply this organic necessity. Also, during weight training or aerobics, countless minerals,  which are " +
                "essential to our mood, are lost. This supplement helps in effective recovery ");


        Filler.setText("These accelerate metabolism, some of them perform a process that could help born fat faster than normal. Some fat burners contain" +
                " such elements as guarana and caffeine, which speed us up, motivating us to train harder and thereby promoting effective fat burning." +
                "Others help inhibit food anxiety, preventing us from going off the diet. There are several effects that these cause, but all have a common goal" +
                ": losing weight.");



        Creatine.setText("This is an organic acid found in muscles. It is a precursor of strength and is found mainly in red meat. This supplement" +
                "does not work for everyone; it is indicated for those people who are genetically weaker. They will change thanks to the use of this product" +
                ", but not those who are naturally strong");

        Glucosamine.setText("This is an excellent supplement for protection against muscle or joint injuries from working with heavy weights or intense " +
                "workouts; it keeps our joints lubricated and reinforced, reducing the chance of injury.");

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
