package com.thereza.randomqoutes;

public class MainPresenterImpl implements MainPresenter, GetQouteInteractor.OnFinishedListener {

    private MainView mainView;
    private GetQouteInteractor getQouteInteractor;

    public MainPresenterImpl(MainView mainView, GetQouteInteractor getQouteInteractor) {
        this.mainView = mainView;
        this.getQouteInteractor = getQouteInteractor;
    }

    @Override
    public void onFinished(String s) {

        if (mainView != null) {
            mainView.setQuote(s);
            mainView.hideProgress();
        }
    }

    @Override
    public void onButtonClick() {

        if (mainView != null) {
            mainView.showProgress();
        }

        getQouteInteractor.getNextQoute(this);
    }

    @Override
    public void onDestroy() {

        mainView = null;
    }
}
