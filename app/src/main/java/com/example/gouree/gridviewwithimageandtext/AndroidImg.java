package com.example.gouree.gridviewwithimageandtext;

/**
 * Created by omsai on 03/09/2017.
 */

public class AndroidImg {



    //text and image to be displayed
    private String name;
    private int img;



    public AndroidImg(String name,int img)
    {
        this.img=img;
        this.name=name;

    }

    //getters and setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getImg()
    {
        return img;
    }

    public void setImg(int img)
    {
        this.img = img;
    }

}
