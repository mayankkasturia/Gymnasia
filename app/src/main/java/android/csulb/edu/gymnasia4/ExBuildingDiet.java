package android.csulb.edu.gymnasia4;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class ExBuildingDiet extends AppCompatActivity {
    private Context context;
    private int duration = Toast.LENGTH_SHORT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_building_diet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        TextView Introduction = (TextView)findViewById(R.id.bulkintro);
        TextView Brkfst = (TextView)findViewById(R.id.breakfast);
        TextView Lunch = (TextView)findViewById(R.id.lunch);
        TextView Eveningmeal = (TextView)findViewById(R.id.eveningmeal);
        TextView Snack = (TextView)findViewById(R.id.snack);
        TextView Dinner = (TextView)findViewById(R.id.dinner);

        Introduction.setText("This is an example of how to prepare your own volume diet. You do not have to follow this diet;" +
                "it's just a simple example of how to combine foods to gain muscle mass");


        Brkfst.setText("- 1st oat meal with milk. \n- 2nd Turkey/tuna/low fat cheese\n-3rd Orange Juice");

        Lunch.setText("- 2 egg whites and 1 egg yolk scrambled with a can of tuna in water \n or \n- Sandwich of whole grain bread with" +
                "a can of tuna in water(or turkey)");

        Eveningmeal.setText("- 1st cooked brown rice or whole wheat pasta \n- 2nd grilled chiken breast, salmon or beef steak");

        Snack.setText("- Canned tuna in water sandwich(or turkey) and banana");

        Dinner.setText("- Tortilla of ham with two egg whites and one egg \n or \n- Cooked brown rice and a fish fillet \n or\n-" +
                " Cooked whole wheat pasta and baked hake");


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
