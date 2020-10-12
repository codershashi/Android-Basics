package com.example.android.quakereport;

public class Earthquake {

    /** Magnitude of the earthquake */
    private String mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Date of earthquake */
    private String mDate;

    /** Time of earthquake */
    private long mTimeInMilliseconds;

    /**
     * Construct a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude(size) of the earthquake
     * @param location is the city location of the earthquake
     * @param date is the date the earthquake happened
     */
    public Earthquake(String magnitude, String location, long timeInMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

//    public Earthquake(double magnitude, String location, long time, String url) {
//        mMagnitude = magnitude;
//        mLocation = location;
//        mDate = date;
//    }

    /**
     * Returns the magnitude of the earthquake
     */
    public String getmMagnitude(){
        return mMagnitude;
    }

    /**
     * Returns the location of the earthquake
     */
    public String getmLocation(){
        return mLocation;
    }

    /**
     * Returns the date of the earthquake
     */
    public String getmDate(){
        return mDate;
    }

    /**
     * Returns the time of the earthquake
     */
    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }
}
