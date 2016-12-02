package android.csulb.edu.gymnasia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class LeanGainDiet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean_gain_diet);
        TextView Introduction = (TextView)findViewById(R.id.cuttingintro);
        TextView Brkfst = (TextView)findViewById(R.id.breakfast);
        TextView Lunch = (TextView)findViewById(R.id.lunch);
        TextView Eveningmeal = (TextView)findViewById(R.id.eveningmeal);
        TextView Snack = (TextView)findViewById(R.id.snack);
        TextView Dinner = (TextView)findViewById(R.id.dinner);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Introduction.setText("This is an example of how to prepare your own definition diet. You do not have to follow this diet;" +
                "it's just a simple example of how to combine foods to define muscle mass");


        Brkfst.setText("-  oat meal with skim milk");

        Lunch.setText("- 2 egg whites and 1 egg yolk scrambled with a can of tuna in water \n or \n- Sandwich of whole grain bread with" +
                "a can of tuna in water(or turkey)");

        Eveningmeal.setText("- 1st Broccoli and grilled mushrooms, 2nd Grilled chicken breast \n or\n or- 1st Green salad, 2nd Grilled turkey breast (or Beef)");

        Snack.setText("- Canned tuna in water sandwich(or turkey)");

        Dinner.setText("- Grilled Prawns \n or \n- Grilled Hake \n or\n-" +
                " Grilled salmon");

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
