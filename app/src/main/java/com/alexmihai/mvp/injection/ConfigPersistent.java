package com.alexmihai.mvp.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * A scoping annotation to permit dependencies conform to the life of the {@link
 * com.alexmihai.mvp.injection.component.ConfigPersistentComponent ConfigPersistentComponent}
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigPersistent {
}
