package com.alexmihai.mvp.injection.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.alexmihai.mvp.injection.ApplicationContext;

import dagger.Module;
import dagger.Provides;

import static com.alexmihai.mvp.Constants.PREF_FILE_NAME;

@Module(includes = {ApiModule.class})
public class AppModule {
    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return application;
    }

    @Provides
    @ApplicationContext
    SharedPreferences provideSharedPreference(@ApplicationContext Context context) {
        return context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
    }
}
