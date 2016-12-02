package android.csulb.edu.gymnasia4.exercise;

/**
 * Created by Mayankkasturia on 10/12/2015.
 */
import android.app.Activity;
import android.content.Context;
import android.csulb.edu.gymnasia4.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mayankkasturia on 10/8/2015.
 */
public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    public CustomListAdapter(Context context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.mylist, itemname);
        this.context = (Activity) context;
        this.itemname = itemname;
        this.imgid = imgid;
    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.chest_item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.chest_icon);
        TextView txtTitle1 = (TextView) rowView.findViewById(R.id.chest_small_item);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        if(txtTitle.getText() == "Bench press" || txtTitle.getText() == "Incline press"||
                txtTitle.getText() == "Decline press" || txtTitle.getText() == "Push-ups"||
                txtTitle.getText() == "Dumbbell flys" || txtTitle.getText() == "Dumbbell pullovers"||
                txtTitle.getText() == "Cable crossover flys"){
            txtTitle1.setText("Chest");}

        if(txtTitle.getText() == "Dumbbell press" || txtTitle.getText() == "Back press"||
                txtTitle.getText() == "Lateral raises" || txtTitle.getText() == "Bent-over lateral raise"||
                txtTitle.getText() == "Front raise" || txtTitle.getText() == "Upright rows"||
                txtTitle.getText() == "Barbell/Dumbbell shrugs"){
            txtTitle1.setText("Shoulders");}

        if(txtTitle.getText() == "Lat pull-downs" || txtTitle.getText() == "Close-grip lat pull-down"||
                txtTitle.getText() == "One arm dumbbell row" || txtTitle.getText() == "T-bar rows"||
                txtTitle.getText() == "Seated row" || txtTitle.getText() == "Dead-Lift"||
                txtTitle.getText() == "Straight arm lat pull-down"){
            txtTitle1.setText("Back");}

        if(txtTitle.getText() == "Triceps extension" || txtTitle.getText() == "One arm dumbbell triceps extension"||
                txtTitle.getText() == "Close grip bench press" || txtTitle.getText() == "Dumbbell triceps extension"||
                txtTitle.getText() == "Push-down" || txtTitle.getText() == "Reverse push-down"||
                txtTitle.getText() == "Triceps dip"){
            txtTitle1.setText("Triceps");}

        if(txtTitle.getText() == "Barbell curl" || txtTitle.getText() == "Curl biceps"||
                txtTitle.getText() == "Hammer curl" || txtTitle.getText() == "Concentration curl"||
                txtTitle.getText() == "Preacher curls" || txtTitle.getText() == "High pulley Curl"){
            txtTitle1.setText("Biceps");}

        if(txtTitle.getText() == "Calves over bench sit-ups" || txtTitle.getText() == "Machine crunches"||
                txtTitle.getText() == "Incline leg raise" || txtTitle.getText() == "Incline bench sit-ups"||
                txtTitle.getText() == "Broom sticks twist" || txtTitle.getText() == "Roman chair side bench"){
            txtTitle1.setText("Abdominal");}

        if(txtTitle.getText() == "Squats" || txtTitle.getText() == "Angled leg press"||
                txtTitle.getText() == "Leg extension" || txtTitle.getText() == "Seated leg curls"||
                txtTitle.getText() == "Standing calf raise" || txtTitle.getText() == "Seated calf raise"||
                txtTitle.getText() == "Machine adduction"){
            txtTitle1.setText("Legs");}
        return rowView;
    }
}
