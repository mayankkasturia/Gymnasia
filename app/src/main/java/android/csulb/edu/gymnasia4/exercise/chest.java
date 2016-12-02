package android.csulb.edu.gymnasia4.exercise;

import android.content.Context;
import android.content.Intent;
import android.csulb.edu.gymnasia4.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mayankkasturia on 12/8/2015.
 */
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * Created by Mayankkasturia on 12/8/2015.
 */
public class chest extends android.support.v4.app.Fragment {
public chest() {
        }
        ListView list;
        String[] itemname ={"Bench press",
        "Incline press",
        "Decline press",
        "Push-ups",
        "Dumbbell flys","Dumbbell pullovers","Cable crossover flys"};

        Integer[] imgid ={R.drawable.g1,R.drawable.g1,R.drawable.g1,R.drawable.g1,R.drawable.g1,R.drawable.g1,R.drawable.g1};
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

        Intent my_intent = new Intent(getContext(),ChestDescription.class);
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

