package com.example.android.miwok;

public class Word {

    private String miwokTranslation,defaultTranslation;
    private int imageResourceId = HAS_IMAGE_ID;
    private static final int HAS_IMAGE_ID = -1;
    private int audioResourceId;

    public Word(String miwokText,String defaultText,int audioResId){
        miwokTranslation=miwokText;
        defaultTranslation=defaultText;
        audioResourceId=audioResId;
    }

    public Word(String miwokText,String defaultText,int imageResId,int audioResId){
        miwokTranslation=miwokText;
        defaultTranslation=defaultText;
        imageResourceId=imageResId;
        audioResourceId=audioResId;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public boolean hasImageId(){
        return imageResourceId != HAS_IMAGE_ID;
    }

    public int getAudioResourceId(){
        return audioResourceId;
    }
}
