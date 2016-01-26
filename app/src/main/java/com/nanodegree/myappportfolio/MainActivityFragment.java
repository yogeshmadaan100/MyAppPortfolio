package com.nanodegree.myappportfolio;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {
    ViewGroup rootView;
    Button btnSpotifyStreamer,btnSuperDuo,btnBuildItBigger,btnXYZReader,btnCapstone;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        rootView  = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);
        initViews();
        return rootView;
    }

    public void initViews()
    {
        btnSpotifyStreamer = (Button) rootView.findViewById(R.id.btnSpotifyStreamer);
        btnSuperDuo = (Button) rootView.findViewById(R.id.btnSuperDuo);
        btnBuildItBigger = (Button) rootView.findViewById(R.id.btnBuildItBigger);
        btnXYZReader = (Button) rootView.findViewById(R.id.btnXYZReader);
        btnCapstone = (Button) rootView.findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(this);
        btnSpotifyStreamer.setOnClickListener(this);
        btnSuperDuo.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXYZReader.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnBuildItBigger:
                showSnackbar(getResources().getString(R.string.textBuiltItBigger));
                break;
            case R.id.btnCapstone:
                showSnackbar(getResources().getString(R.string.textCapstone));
                break;
            case R.id.btnSpotifyStreamer:
                showSnackbar(getResources().getString(R.string.textSpotifyRunner));
                break;
            case R.id.btnSuperDuo:
                showSnackbar(getResources().getString(R.string.textSuperDuo));
                break;
            case R.id.btnXYZReader:
                showSnackbar(getResources().getString(R.string.textXYZReader));
                break;
            default:
                break;

        }
    }

    public void showSnackbar(String text)
    {
        Snackbar.make(rootView, "This button will launch my " +text + " app!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
