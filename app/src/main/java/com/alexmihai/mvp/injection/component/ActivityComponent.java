package com.alexmihai.mvp.injection.component;

import com.alexmihai.mvp.features.detail.DetailActivity;
import com.alexmihai.mvp.features.main.MainActivity;
import com.alexmihai.mvp.injection.PerActivity;
import com.alexmihai.mvp.injection.module.ActivityModule;

import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(DetailActivity detailActivity);
}
