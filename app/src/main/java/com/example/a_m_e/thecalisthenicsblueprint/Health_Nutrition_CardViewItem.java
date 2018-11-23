package com.example.a_m_e.thecalisthenicsblueprint;

public class Health_Nutrition_CardViewItem {
    public int mImageResource_nutrition;
    public String mText1_nutrition;
    public String mText2_nutrition;
    public String mButton_nutrition;

    public Health_Nutrition_CardViewItem(int imageResource, String text1, String text2, String text4) {
        mImageResource_nutrition = imageResource;
        mText1_nutrition = text1;
        mText2_nutrition = text2;
        mButton_nutrition = text4;
    }

    public int getImageResource() {
        return mImageResource_nutrition;
    }

    public String getText1() {
        return mText1_nutrition;
    }

    public String getText2 () {
        return mText2_nutrition;
    }

    public String getText4 () {
        return mButton_nutrition;
    }
}
