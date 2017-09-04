package com.example.gouree.gridviewwithimageandtext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by omsai on 03/09/2017.
 */

public class ImageAdapter extends BaseAdapter {


    //context object and arraylist of images
    private Context CTX;

    ArrayList<AndroidImg> imgs;



    ImageAdapter(Context CTX, ArrayList<AndroidImg> imgs)
    {
        this.CTX=CTX;
        this.imgs= imgs;
    }

    //returns size
    @Override
    public int getCount()
    {
        return imgs.size();

    }


    //returns image selected
    @Override
    public Object getItem(int position)
    {
        return imgs.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        //create a layout inflater
        LayoutInflater inflater = (LayoutInflater)CTX.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        //if view is null
        if(convertView == null)
        {
            convertView = inflater.inflate(R.layout.model_layout,parent,false);


        }

        //image view and text view objects
        ImageView img = (ImageView) convertView.findViewById(R.id.imageView);

        TextView txt = (TextView)convertView.findViewById(R.id.textView);

        //setting image and text
        img.setImageResource(imgs.get(position).getImg());

        txt.setText(imgs.get(position).getName());


        return convertView;
    }
}
