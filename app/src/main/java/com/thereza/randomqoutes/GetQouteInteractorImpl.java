package com.thereza.randomqoutes;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GetQouteInteractorImpl implements GetQouteInteractor{

    private List<String> arrayList = Arrays.asList(
            "Be yourself. everyone else is already taken.",
            "A room without books is like a body without a soul.",
            "You only live once, but if you do it right, once is enough.",
            "Be the change that you wish to see in the world.",
            "If you tell the truth, you don't have to remember anything."
    );


    @Override
    public void getNextQoute(final OnFinishedListener onFinishedListener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onFinishedListener.onFinished(getRandomString());
            }
        }, 1200);


    }

    private String getRandomString(){

        Random rand = new Random();

        int index = rand.nextInt(arrayList.size());

        return arrayList.get(index);
    }
}
