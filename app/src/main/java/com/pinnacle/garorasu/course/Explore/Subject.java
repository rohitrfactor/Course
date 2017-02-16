package com.pinnacle.garorasu.course.Explore;

import android.graphics.Color;

/**
 * Created by garorasu on 16/2/17.
 */

public class Subject {
    private String title;
    private String imgUrl;
    private String brief;
    private String color;

    public Subject(String title,String imgUrl,String brief,String color){
        this.title = title;
        this.imgUrl = imgUrl;
        this.brief = brief;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public String getBrief() {
        return brief;
    }

    public String getImgUrl() {
        return imgUrl;
    }
    public String getColor() {return  color;}
}
