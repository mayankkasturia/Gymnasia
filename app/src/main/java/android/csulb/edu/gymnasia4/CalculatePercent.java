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

public class CalculatePercent extends Activity implements View.OnClickListener{
    TextView notes;
    RadioGroup rg;
    RadioButton radioinch;
    RadioButton radiometer;
    EditText ht;
    EditText wt;
    TextView result;
    Button calc;
    double bai =  0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_percent);
        ht=(EditText)findViewById(R.id.baieditText2);
        wt=(EditText)findViewById(R.id.baieditText);
        result=(TextView)findViewById(R.id.baitextView7);
        calc=(Button)findViewById(R.id.baibutton);
        calc.setOnClickListener(this);
        radioinch=(RadioButton)findViewById(R.id.bairadioButton2);
        radiometer=(RadioButton)findViewById(R.id.bairadioButton);
        notes=(TextView)findViewById(R.id.baitextView6);


    }


    @Override
    public void onClick(View v){


        rg= (RadioGroup)findViewById(R.id.bairadioGroup);
        Double height=Double.parseDouble(ht.getText().toString());
        Double waist=Double.parseDouble(wt.getText().toString());



        if (radiometer.isChecked()){
            Double heightroot= height*(Math.sqrt(height));
            bai= ((100*waist)/heightroot)-18;
            result.setText(String.valueOf(bai));

        }
        else
        if (radioinch.isChecked()) {
            Double height1= height/39.370;
            Double waist1= waist/39.370;
            Double heightroot1= height1*(Math.sqrt(height1));


            bai= ((100*waist1)/heightroot1)-18;
            result.setText(String.valueOf(bai+"%"));
        }




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculate_percent, menu);
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
