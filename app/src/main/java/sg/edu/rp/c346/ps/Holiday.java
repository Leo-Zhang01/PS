package sg.edu.rp.c346.ps;

import android.graphics.drawable.Drawable;


public class Holiday {
    private String name,date;
    private Drawable pic;


    public Holiday(String name, String date, Drawable pic) {
        this.name = name;
        this.date = date;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Drawable getPic() {
        return pic;
    }

    public void setPic(Drawable pic) {
        this.pic = pic;
    }



}
