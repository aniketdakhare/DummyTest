package com.dummytest;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void testAnalyseMood()
    {
        MoodAnalysis moodAnalysis = new MoodAnalysis();
        String mood = moodAnalysis.testMoodAnalysis("This is Sad mood");
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void testHappyMood()
    {
        MoodAnalysis moodAnalysis = new MoodAnalysis();
        String mood = moodAnalysis.testMoodAnalysis("This is Happy massage");
        Assert.assertEquals("Happy",mood);

    }
}
