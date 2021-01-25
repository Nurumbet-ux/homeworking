package com.example.homeworking;

import android.os.Parcel;
import android.os.Parcelable;

public class Info implements Parcelable {

    private String name;

    public Info(String name) {
        this.name = name;
    }
    protected Info(Parcel in) {
        name = in.readString();

    }

    public static final Creator<Info> CREATOR = new Creator<Info>() {
        @Override
        public Info createFromParcel(Parcel in) {
            return new Info(in);
        }

        @Override
        public Info[] newArray(int size) {
            return new Info[size];
        }
    };

    public String getName()
    {
        return name;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
