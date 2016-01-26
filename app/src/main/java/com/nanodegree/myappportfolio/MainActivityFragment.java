package com.nanodegree.myappportfolio;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ViewGroup rootView;
    @OnClick({R.id.btnBuildItBigger,
            R.id.btnCapstone,
            R.id.btnSpotifyStreamer,
            R.id.btnSuperDuo,
            R.id.btnXYZReader})
    public void btnClick(Button button)
    {
        showSnackbar(button.getText().toString());
    }
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        rootView  = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this,rootView);
        return rootView;
    }

    public void showSnackbar(String text)
    {
        Snackbar.make(rootView,getResources().getString(R.string.text_snackbar_prefix).concat(text).concat(getResources().getString(R.string.text_scnackbar_suffix)), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
