package models;

/**
 * Created by Alter on 2015-11-28.
 * A class to store latitude and longitude values as doubles.
 */
public class LatLng {

    private float latitude;
    private float longitude;

    public LatLng(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

}
