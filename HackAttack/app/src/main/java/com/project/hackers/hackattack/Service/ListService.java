package com.project.hackers.hackattack.Service;

import android.graphics.Point;
import android.graphics.PointF;

import com.project.hackers.hackattack.datastructure.Post;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by athatscomp on 1/31/15.
 */
public class ListService
{
    private static ListService serviceInstance;
    private static final Object lock = new Object();

    private ListService() {

    }

    public static ListService getInstance() {
        if(serviceInstance == null){
            synchronized (lock){
                if (serviceInstance == null) {
                    serviceInstance = new ListService();
                }
            }
        }
        return serviceInstance;
    }

    /**
     * This method will be used to get the Popular List
     * if the value is cached, it will be returned immediately or else
     *  an asynchronous process will be started to get the data from a server
     *
     * @param forceRefresh force refresh will invalidate data in cache and start an asynchronous
     *                     process to get the list
     * @return the stored arrayList null if the ArrayList has not been set yet
     */
    public ArrayList<Post> getPopularlist(boolean forceRefresh) {
        //TODO implement the asynchronous process from parse
        //Simple ArrayList to test the front end
        ArrayList<Post> list = new ArrayList<Post>();
        for (int i = 0; i < 5; i++)
        {
            PointF point = new PointF(3.5f + i , 1.0f + i);

            Post post = new Post(point,"url","info",300,new Date());

            list.add(post);
        }
        return list;
    }
}
