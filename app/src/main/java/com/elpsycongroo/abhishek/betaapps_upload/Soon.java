package com.elpsycongroo.abhishek.betaapps_upload;

/**
 * Created by Prathik on 02-Dec-16.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Prathik on 02-Dec-16.
 */

public class Soon extends Fragment {

    public Soon()
    {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.coming_soon, container, false);


        return rootView;
    }
}
