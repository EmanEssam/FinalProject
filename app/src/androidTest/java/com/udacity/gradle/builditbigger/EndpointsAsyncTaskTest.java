package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.text.TextUtils;
import android.util.Pair;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

//@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {


    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAsyncTaskJoke() throws Exception {

        EndpointsAsyncTask task = new EndpointsAsyncTask();
//
        task.execute(new Pair<Context, String>(activityActivityTestRule.getActivity(), "Manfred"));
        String result = task.get();

        assertFalse(TextUtils.isEmpty(result));
    }

}
