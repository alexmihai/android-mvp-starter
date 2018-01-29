package com.alexmihai.mvp.injection.component;

import com.alexmihai.mvp.injection.PerFragment;
import com.alexmihai.mvp.injection.module.FragmentModule;

import dagger.Subcomponent;

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {
}
