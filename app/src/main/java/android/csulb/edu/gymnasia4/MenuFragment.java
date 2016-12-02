package android.csulb.edu.gymnasia4;

import android.csulb.edu.gymnasia4.exercise.Abs;
import android.csulb.edu.gymnasia4.exercise.Back;
import android.csulb.edu.gymnasia4.exercise.Biseps;
import android.csulb.edu.gymnasia4.exercise.Shoulders;
import android.csulb.edu.gymnasia4.exercise.Triceps;
import android.csulb.edu.gymnasia4.exercise.chest;
import android.csulb.edu.gymnasia4.exercise.legs;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Mayankkasturia on 12/8/2015.
 */
public class MenuFragment extends Fragment {
    Fragment frag;
    android.support.v4.app.FragmentTransaction fragTrans;
    public MenuFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.menu_frag,container,false);
        frag = new chest();
        fragTrans=getFragmentManager().beginTransaction().add(R.id.container,frag);
        fragTrans.commit();

        ImageButton chestbtn=(ImageButton)view.findViewById(R.id.imageButton2);
        ImageButton shoulderbtn=(ImageButton)view.findViewById(R.id.imageButton3);
        ImageButton backbtn=(ImageButton)view.findViewById(R.id.imageButton4);
        ImageButton tribtn=(ImageButton)view.findViewById(R.id.imageButton5);
        ImageButton biebtn=(ImageButton)view.findViewById(R.id.imageButton6);
        ImageButton absbtn=(ImageButton)view.findViewById(R.id.imageButton7);
        ImageButton legsbtn=(ImageButton)view.findViewById(R.id.imageButton8);

        chestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new chest();
                fragTrans=getFragmentManager().beginTransaction().replace(R.id.container,frag);
                fragTrans.commit();
            }
        });

        shoulderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new Shoulders();
                fragTrans=getFragmentManager().beginTransaction().replace(R.id.container,frag);
                fragTrans.commit();
            }
        });
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new Back();
                fragTrans=getFragmentManager().beginTransaction().replace(R.id.container,frag);
                fragTrans.commit();
            }
        });
        tribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new Triceps();
                fragTrans=getFragmentManager().beginTransaction().replace(R.id.container,frag);
                fragTrans.commit();
            }
        });
        biebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new Biseps();
                fragTrans=getFragmentManager().beginTransaction().replace(R.id.container,frag);
                fragTrans.commit();
            }
        });
        absbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new Abs();
                fragTrans=getFragmentManager().beginTransaction().replace(R.id.container,frag);
                fragTrans.commit();
            }
        });
        legsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new legs();
                fragTrans=getFragmentManager().beginTransaction().replace(R.id.container,frag);
                fragTrans.commit();
            }
        });
                return view;
    }
}
