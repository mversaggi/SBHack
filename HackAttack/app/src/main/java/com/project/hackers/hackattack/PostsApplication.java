package com.project.hackers.hackattack;

import android.app.Application;

/**
 * Created by athatscomp on 1/31/15.
 */
public class PostsApplication extends Application
{
    PostsApplication app;
    @Override
    public void onCreate()
    {
        this.app = this;
    }

}
