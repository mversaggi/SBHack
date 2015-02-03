package com.project.hackers.hackattack.datastructure;

import android.graphics.Point;
import android.graphics.PointF;

import java.util.Date;

/**
 * Created by athatscomp on 1/31/15.
 */
public class Post
{


    private PointF location;
    private String imageUrl;
    private String info;
    private double popularity;
    private Date timeCaptured;

    public Post(PointF location, String imageUrl, String info, double popularity, Date timeCaptured)
    {
        this.location = location;
        this.imageUrl = imageUrl;
        this.info = info;
        this.popularity = popularity;
        this.timeCaptured = timeCaptured;
    }


    public Date getTimeCaptured()
    {
        return timeCaptured;
    }

    public void setTimeCaptured(Date timeCaptured)
    {
        this.timeCaptured = timeCaptured;
    }

    public PointF getLocation()
    {
        return location;
    }

    public void setLocation(PointF location)
    {
        this.location = location;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getInfo()
    {
        return info;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public double getPopularity()
    {
        return popularity;
    }

    public void setPopularity(double popularity)
    {
        this.popularity = popularity;
    }




}
