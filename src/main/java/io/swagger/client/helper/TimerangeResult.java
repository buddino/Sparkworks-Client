package io.swagger.client.helper;

import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TimerangeResult {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

    @SerializedName("timestamp")
    private Long timestamp;

    @SerializedName("reading")
    private Double reading;

    public TimerangeResult(Long timestamp, Double reading) {
        this.timestamp = timestamp;
        this.reading = reading;
    }

    public String getFormattedTimestamp() {
        return sdf.format(new Date(timestamp));
    }

    public static void setSdf(SimpleDateFormat sdf) {
        TimerangeResult.sdf = sdf;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Double getReading() {
        return reading;
    }

    public void setReading(Double reading) {
        this.reading = reading;
    }
}
