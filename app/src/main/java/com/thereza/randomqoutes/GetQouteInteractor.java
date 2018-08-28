package com.thereza.randomqoutes;

public interface GetQouteInteractor {

    interface OnFinishedListener{

        void onFinished(String s);
    }

    void getNextQoute(OnFinishedListener onFinishedListener);
}
