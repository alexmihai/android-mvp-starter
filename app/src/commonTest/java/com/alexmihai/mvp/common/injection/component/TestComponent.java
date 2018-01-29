package com.alexmihai.mvp.common.injection.component;

import com.alexmihai.mvp.common.injection.module.ApplicationTestModule;
import com.alexmihai.mvp.injection.component.AppComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends AppComponent {
}
