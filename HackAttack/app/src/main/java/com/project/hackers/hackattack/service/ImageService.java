package com.project.hackers.hackattack.service;

/**
 * Created by athatscomp on 1/31/15.
 */
public class ImageService
{
    private static ImageService serviceInstance;
    private static final Object lock = new Object();
    private ImageService(){

    }

    public static ImageService getServiceInstance()
    {
        if(serviceInstance == null)
        {
            synchronized (lock)
            {
                if (serviceInstance == null)
                {
                    serviceInstance = new ImageService();
                }
            }
        }
        return serviceInstance;
    }

    public void getImage(){

    }
    public void createGif(){

    }
    public void postImage(){

    }
}
