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
public class Abs extends android.support.v4.app.Fragment {
    public Abs() {
    }
    ListView list;
    String[] itemname ={"Calves over bench sit-ups",
            "Machine crunches",
            "Incline leg raise",
            "Incline bench sit-ups",
            "Broom sticks twist","Roman chair side bench"};

    Integer[] imgid ={R.drawable.g5,R.drawable.g5,R.drawable.g5,R.drawable.g5,R.drawable.g5,R.drawable.g5,R.drawable.g5};
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

                Intent my_intent = new Intent(getContext(),AbsDescription.class);
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

