package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    /**
     * Constructs a new {@link EarthquakeAdapter}.
     *
     * @param context of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    /**
     * Returns a list view item that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Check if there is an existing list item view (called convertView) that we can reuse,
        //otherwise if convertView is null ,then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        //Find the earthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        //Find the textView with the view ID magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        //Display the magnitude of current earthquake in that textView
        magnitudeView.setText(currentEarthquake.getmMagnitude());

        //Find the textView with the view ID location
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        //Display the location of current earthquake in that textView
        locationView.setText(currentEarthquake.getmLocation());

        // Create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        //Find the textView with the view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        //Format the date string (i.e. "March 3, 1984")
        String formattedDate = formatDate(dateObject);

        //Display the date of current earthquake in that textView
        dateView.setText(formattedDate);

        //Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);

        //Format the time string (i.e. "4:30 PM")
        String formattedTime = formatTime(dateObject);

        //Display the time of the current earthquake in that textView
        timeView.setText(formattedTime);
        
        // return the list item view that is now showing the appropriate data
        return listItemView;
    }


    /**
     *Return the formatted date string (i.e. "Mar 3, 1984") from  a Date object
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
    /**
     *Return the formatted date string (i.e. "4:30 PM") from  a Date object
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat(("h:mm a"));
        return timeFormat.format(dateObject);
    }

}
