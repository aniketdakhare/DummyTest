package com.dummytest;

public class MoodAnalysis
{

    public String testMoodAnalysis(String massage)
    {
        if (massage.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
}
