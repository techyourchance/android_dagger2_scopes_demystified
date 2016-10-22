package com.techyourchance.www.dagger2tutorial.dependencyinjection;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Custom user-defined scope
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomScope {
}