// Generated by Dagger (https://dagger.dev).
package com.example.todolist.presentation.di;

import com.example.todolist.presentation.adapter.CategoryAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SingletonAdapterModule_ProvideCategoryAdapterFactory implements Factory<CategoryAdapter> {
  @Override
  public CategoryAdapter get() {
    return provideCategoryAdapter();
  }

  public static SingletonAdapterModule_ProvideCategoryAdapterFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CategoryAdapter provideCategoryAdapter() {
    return Preconditions.checkNotNullFromProvides(SingletonAdapterModule.INSTANCE.provideCategoryAdapter());
  }

  private static final class InstanceHolder {
    private static final SingletonAdapterModule_ProvideCategoryAdapterFactory INSTANCE = new SingletonAdapterModule_ProvideCategoryAdapterFactory();
  }
}
