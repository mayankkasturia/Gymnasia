package android.csulb.edu.gymnasia4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class WomenWorkout extends AppCompatActivity {

    ListView list;
    String[] itemname ={"Shoulders",
            "Biceps/ Triceps",
            "Legs",
            "Abdomen",
            "Cardio",
            "Back body"};

    Integer[] imgid ={R.drawable.shoulders,R.drawable.biadtri,R.drawable.legwork,R.drawable.abs,R.drawable.cardio,R.drawable.back,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_workout);

        FemaleListAdapter adapter=new FemaleListAdapter(this,itemname,imgid);
        list=(ListView) findViewById(R.id.femlist);
        list.setAdapter(adapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent my_intent = new Intent(WomenWorkout.this, WomenDescription.class);
                Bundle my_bundle = new Bundle();
                my_bundle.putInt("val", i);
                my_intent.putExtras(my_bundle);
                startActivity(my_intent);

                //String Selected_item= itemname[i]+" "+i;
                //Toast.makeText(getApplicationContext(),Selected_item, Toast.LENGTH_SHORT).show();
            }
        });

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
