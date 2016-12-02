package android.csulb.edu.gymnasia4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CalculateBmi extends Activity implements View.OnClickListener {
    TextView notes;
    RadioGroup rg;
    RadioButton radiolbs;
    RadioButton radiokgs;
    EditText ht;
    EditText wt;
    TextView result;
    Button calc;
    float bmi = (float) 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_bmi);

        ht=(EditText)findViewById(R.id.bmieditText2);
        wt=(EditText)findViewById(R.id.bmieditText);
        result=(TextView)findViewById(R.id.bmitextView7);
        calc=(Button)findViewById(R.id.bmibutton);
        calc.setOnClickListener(this);
        radiolbs=(RadioButton)findViewById(R.id.bmiradioButton2);
        radiokgs=(RadioButton)findViewById(R.id.bmiradioButton);
        notes=(TextView)findViewById(R.id.bmitextView6);


    }


    @Override
    public void onClick(View v){


        rg= (RadioGroup)findViewById(R.id.bmiradioGroup);
        Float height=Float.parseFloat(ht.getText().toString());
        Float weight=Float.parseFloat(wt.getText().toString());
        Float heightsq= height*height;


        if (radiokgs.isChecked()){
            bmi= weight/heightsq;
            result.setText(String.valueOf(bmi));

        }
        else {
            if (radiolbs.isChecked()) {
                bmi = (weight / heightsq) * 703;
                result.setText(String.valueOf(bmi));
            }
        }

        if (bmi<15.0){
            notes.setText("You are extremely underweight.Please consult a doctor at the earliest.");
        }
        else
        if (bmi>15.0 && bmi<16.0){
            notes.setText("You are severely underweight. Consult a doctor or nutritionist to help changing your dietary habits");
        }
        else
        if(bmi>16.0 && bmi<18.5){
            notes.setText("You are underweight. Work more on your dietary habits and try supplements after consulting a nutritionist");
        }
        else
        if(bmi>18.5 && bmi<25){
            notes.setText("Congratulations you have a perfectly healthy BMI. Keep up your good work !!!!");
        }
        else if (bmi>25 && bmi<30){
            notes.setText("You are overweight. Its time to hit the gym and sweat it out!!!");
        }
        else if (bmi>30 && bmi<35){
            notes.setText("You are in Class 1 Obesity. Add a bit of cardio to your everyday workout.");
        }
        else if (bmi>35 && bmi<40){
            notes.setText("You are in Class 2 Obesity. Consult a nutritionist and hire a personal trainer if possible. Its time to work hard for the fitness you want.");
        }
        else
            notes.setText("You are in Class 3 Obesity. Consult a doctor at the earliest.");
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculate_bmi, menu);
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
