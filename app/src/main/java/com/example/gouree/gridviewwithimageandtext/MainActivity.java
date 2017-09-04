package com.example.gouree.gridviewwithimageandtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grid;

    //names that appear on the text view
    String[] name=
            {"Gingerbread","HoneyComb","IceCream","Jellybean","KitKat","Lollipop"};


    //images that are to be displayed -->stored in drawable folder
    int[] img_id =
            {
                    R.drawable.z1,
                    R.drawable.z2,
                    R.drawable.z3,
                    R.drawable.z4,
                    R.drawable.z5,
                    R.drawable.z6,

            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //grid object
        grid = (GridView) findViewById(R.id.gridview);

        //adapters
        ImageAdapter adapter = new ImageAdapter(this, getImgs());

        grid.setAdapter(adapter);


        //Events

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "clicked -->" +name[position], Toast.LENGTH_SHORT).show();
            }
        });

    }


    //adding the text and images to the grid
    private ArrayList<AndroidImg> getImgs()
    {
        ArrayList<AndroidImg> imgs = new ArrayList<AndroidImg>();

        imgs.add(new AndroidImg(name[0],img_id[0]));

        imgs.add(new AndroidImg(name[1],img_id[1]));

        imgs.add(new AndroidImg(name[2],img_id[2]));

        imgs.add(new AndroidImg(name[3],img_id[3]));

        imgs.add(new AndroidImg(name[4],img_id[4]));

        imgs.add(new AndroidImg(name[5],img_id[5]));

        return imgs;
    }
}
