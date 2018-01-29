package com.alexmihai.mvp.features.detail;

import com.alexmihai.mvp.data.model.response.Pokemon;
import com.alexmihai.mvp.data.model.response.Statistic;
import com.alexmihai.mvp.features.base.MvpView;

public interface DetailMvpView extends MvpView {

    void showPokemon(Pokemon pokemon);

    void showStat(Statistic statistic);

    void showProgress(boolean show);

    void showError(Throwable error);
}
