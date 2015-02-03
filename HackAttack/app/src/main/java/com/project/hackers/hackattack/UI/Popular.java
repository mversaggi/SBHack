package com.project.hackers.hackattack.UI;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.project.hackers.hackattack.R;
import com.project.hackers.hackattack.datastructure.Post;
import com.project.hackers.hackattack.Service.ListService;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * interface
 * to handle interaction events.
 * Use the {@link Popular#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Popular extends Fragment
{

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment Popular.
     */
    public static Popular newInstance()
    {
        Popular fragment = new Popular();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public Popular()
    {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
        {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular, container, false);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
    }

    public void onActivityCreated(Bundle bundle){
        super.onActivityCreated(bundle);

        ListView list = (ListView)getActivity().findViewById(R.id.postList);
        list.setAdapter(new PostAdapter());

    }

    private class PostAdapter extends ArrayAdapter<Post>
    {
        /**
         *only instantiate this class once the list is ready
         */
        public PostAdapter() {
            super(getActivity(),R.layout.list_item_layout, ListService.getInstance().getPopularlist(false));

        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if (view == null){
                LayoutInflater inflater = (LayoutInflater) getActivity()
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.list_item_layout, parent, false
                );
                TextView tv = (TextView)view.findViewById(R.id.info_text);
                tv.setText(getItem(position).getInfo());
            }
            return view;
        }
    }

}
