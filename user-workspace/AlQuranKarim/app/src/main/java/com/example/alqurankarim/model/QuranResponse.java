package com.example.alqurankarim.model;

import com.google.gson.annotations.SerializedName;

public class QuranResponse {
    @SerializedName("text")
    private String text;

    @SerializedName("translation")
    private String translation;

    public String getText() {
        return text;
    }

    public String getTranslation() {
        return translation;
    }
}
