package android.csulb.edu.gymnasia4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mayankkasturia on 12/4/2015.
 */
public class FemaleListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    public FemaleListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.femlist_layout, itemname);
        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.femlist_layout, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.femitem);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.femicon);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;
    }
}
