package com.samoye.samrock;

public class Music {
    private String mTitle;
    private String mText;

    public Music(String text, String title) {
        mTitle = title;
        mText = text;
    }


    public String getText() {
        return mText;
    }

    public String getTitle() {
        return mTitle;
    }
}

