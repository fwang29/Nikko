package com.example.fengling.nikko;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63"
        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray)
        );

        mForecastAdapter =
                new ArrayAdapter<String>(
                        // the current context
                        getActivity(),
                        // ID of the list item layout
                        R.layout.list_item_forcast,
                        // ID of the textview to populate
                        R.id.list_item_forecast_textview,
                        // forcast data
                        weekForecast);

        ListView listview = (ListView) rootView.findViewById(R.id.listview_forecast);

        listview.setAdapter(mForecastAdapter);

        return rootView;
    }
}
