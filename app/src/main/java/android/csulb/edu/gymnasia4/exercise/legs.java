package android.csulb.edu.gymnasia4.exercise;

import android.content.Context;
import android.content.Intent;
import android.csulb.edu.gymnasia4.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Mayankkasturia on 12/8/2015.
 */
public class legs extends android.support.v4.app.Fragment {
    public legs() {
    }
    ListView list;
    String[] itemname ={"Squats",
            "Angled leg press",
            "Leg extension",
            "Seated leg curls","Standing calf raise","Seated calf raise","Machine adduction"};

    Integer[] imgid ={R.drawable.g3,R.drawable.g3,R.drawable.g3,R.drawable.g3,R.drawable.g3,
            R.drawable.g3,R.drawable.g3};
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.chest_frg,null);

        CustomListAdapter adapter=new CustomListAdapter(getContext(),itemname,imgid);
        list=(ListView) rootView.findViewById(R.id.chest_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent my_intent = new Intent(getContext(),LegDescription.class);
                Bundle my_bundle = new Bundle();
                my_bundle.putInt("val", i);
                my_intent.putExtras(my_bundle);
                startActivity(my_intent);

                //String Selected_item= itemname[i]+" "+i;
                //Toast.makeText(getActivity(),Selected_item, Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }


}

