package com.example.mohsallam.fragmentcommunication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.plus.PlusOneButton;

import org.greenrobot.eventbus.EventBus;

/**
 * A fragment with a Google +1 button.
 */
public class PlusOneFragment extends Fragment {

    TextClicked mCallback;
    private int i;

    public interface TextClicked{
        public void sendText(String text);
    }
    private Button mPlusOneButton;


    public PlusOneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_plus_one, container, false);


        mPlusOneButton =  view.findViewById(R.id.plus_one_button);
        mPlusOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageEvent(i++));
            }
        });


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }


}
