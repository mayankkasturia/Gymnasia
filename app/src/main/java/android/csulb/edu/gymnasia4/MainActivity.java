package android.csulb.edu.gymnasia4;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private DrawerLayout drawerLayout;
    private ListView listView;
    String[] Applist={"Exercise Guide",
            "Muscle Building Workout","Lean Body Workout","Women Workout",
            "KCal needed","Mass Gain Diet","Lean Gain Diet","Supplements",
            "Calculate BMI","Calculate %fat",
            "Follow us",};

    private ActionBarDrawerToggle drawerListener;

    int[] image= {R.drawable.exercise1,R.drawable.exercise2,R.drawable.exercise3,R.drawable.exercise4,R.drawable.exercise5,
            R.drawable.exercise6,R.drawable.exercise7,R.drawable.exercise8,R.drawable.exercise9,R.drawable.exercise10,R.drawable.exercise11};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imgbtn=(ImageButton) findViewById(R.id.imageButton);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebook="https://www.facebook.com/gymnasiamalta/";
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(facebook));
                startActivity(intent);
            }
        });
        drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
        listView=(ListView)findViewById(R.id.drawerList);
        MyAdapter myAdapter=new MyAdapter(this,Applist,image);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(this);
        drawerListener=new ActionBarDrawerToggle(this,drawerLayout,R.string.navigation_drawer_open, R.string.navigation_drawer_close){

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                setTitile("Gymnasia");
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

            }
        };
        drawerLayout.setDrawerListener(drawerListener);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_drawer);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerListener.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerListener.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerListener.syncState();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectItem(position);

        drawerLayout.closeDrawers();

        switch (position){
            case 0://Exercise guide
                Intent my_intent = new Intent(MainActivity.this,Exercise_Guide.class);
                startActivity(my_intent);

                break;
            case 1:// Men building workout
                my_intent =new Intent(MainActivity.this,MenGain.class);
                startActivity(my_intent);

                break;
            case 2://Lean body workout
                my_intent =new Intent(MainActivity.this,MenLean.class);
                startActivity(my_intent);

                break;

            case 3://women workout
                my_intent =new Intent(MainActivity.this,WomenWorkout.class);
                startActivity(my_intent);

                break;
            case 4://kcal needed
                Intent my_intent1 =new Intent(MainActivity.this,KCalNeeded.class);
                startActivity(my_intent1);

                break;
            case 5:// ex building diet
                my_intent =new Intent(MainActivity.this,ExBuildingDiet.class);
                startActivity(my_intent);

                break;
            case 6:// ex cutting diet
                my_intent =new Intent(MainActivity.this,LeanGainDiet.class);
                startActivity(my_intent);

                break;
            case 7://supplements
                my_intent =new Intent(MainActivity.this,Suplements.class);
                startActivity(my_intent);

                break;
            case 8://calculate bmi
                my_intent =new Intent(MainActivity.this,CalculateBmi.class);
                startActivity(my_intent);

                break;
            case 9:// calculate % fat
                my_intent =new Intent(MainActivity.this,CalculatePercent.class);
                startActivity(my_intent);

                break;
            case 10://follow us
                String facebook="https://www.facebook.com/gymnasiamalta/";
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(facebook));
                startActivity(intent);
                break;
    }


                }

    public void selectItem(int position) {
    listView.setItemChecked(position, true);
        setTitile(Applist[position]);
    }

    public void setTitile(String Applist) {
        getSupportActionBar().setTitle(Applist);
    }
}
class MyAdapter extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] Applist;
    private final int[] image;

    public MyAdapter(Activity context, String[] Applist, int[] image ){
        super(context, R.layout.custom_row,Applist);
        this.context=context;
        this.image=image;
        this.Applist=Applist;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;

            LayoutInflater inflater = context.getLayoutInflater();;
            row = inflater.inflate(R.layout.custom_row,null,true);


        TextView titleTextView=(TextView) row.findViewById(R.id.textView11);
        ImageView titleImgView=(ImageView) row.findViewById(R.id.imageView4);

        titleTextView.setText(Applist[position]);
        titleImgView.setImageResource(image[position]);
        return row;
    }
}