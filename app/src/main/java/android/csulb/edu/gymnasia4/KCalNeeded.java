package android.csulb.edu.gymnasia4;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class KCalNeeded extends AppCompatActivity {
    private Context context;
    private int duration = Toast.LENGTH_SHORT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kcal_needed);
        final Calculator CalObject = new Calculator();
        final EditText Centimeter = (EditText)findViewById(R.id.cm);
        final EditText Weight = (EditText)findViewById(R.id.weight);
        final EditText Age = (EditText)findViewById(R.id.age);
        final Button Calculate = (Button)findViewById(R.id.calculate);
        final RadioButton Male = (RadioButton)findViewById(R.id.male);
        final RadioButton Female = (RadioButton)findViewById(R.id.female);
        final TextView Result = (TextView)findViewById(R.id.result);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Height;
                double weight;
                int age;
                if (Centimeter.getText().length() == 0 && Weight.getText().length() == 0 && Age.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Fill the columns in order to obtain nutrition", duration).show();
                    return;
                }
                if (Centimeter.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Height can't be empty", duration).show();
                    return;
                }//toast
                else {
                    Height = Double.parseDouble(Centimeter.getText().toString());
                }


                if (Weight.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "weight can't be empty", duration).show();
                    return;
                }//toast
                else {
                    weight = Double.parseDouble(Weight.getText().toString());
                }

                if (Age.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Age can't be empty", duration).show();
                    return;
                }//toast
                else {
                    age = Integer.parseInt(Age.getText().toString());
                }

                double result;


                if (Male.isChecked()) {
                    result = CalObject.Male_Cal_Calculator(age, Height, weight);


                    Result.setText(String.valueOf(result) + " Calories per day");
                }


                if (Female.isChecked()) {
                    result = CalObject.Female_Cal_Calculator(age, Height, weight);
                    Result.setText(String.valueOf(result) + " Calories per day");

                }

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
