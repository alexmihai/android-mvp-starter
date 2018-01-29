package com.alexmihai.mvp.injection.component;

import android.app.Application;
import android.content.Context;

import com.alexmihai.mvp.data.DataManager;
import com.alexmihai.mvp.injection.ApplicationContext;
import com.alexmihai.mvp.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    @ApplicationContext
    Context context();

    Application application();

    DataManager apiManager();
}
