package com.alexmihai.mvp.runner;

import android.app.Application;
import android.content.Context;

import com.alexmihai.mvp.MvpStarterApplication;

import io.appflate.restmock.android.RESTMockTestRunner;

public class TestRunner extends RESTMockTestRunner {

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, MvpStarterApplication.class.getName(), context);
    }
}
