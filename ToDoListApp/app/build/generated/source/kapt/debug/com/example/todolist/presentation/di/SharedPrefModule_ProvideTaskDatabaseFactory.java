// Generated by Dagger (https://dagger.dev).
package com.example.todolist.presentation.di;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedPrefModule_ProvideTaskDatabaseFactory implements Factory<SharedPreferences> {
  private final Provider<Application> appProvider;

  public SharedPrefModule_ProvideTaskDatabaseFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideTaskDatabase(appProvider.get());
  }

  public static SharedPrefModule_ProvideTaskDatabaseFactory create(
      Provider<Application> appProvider) {
    return new SharedPrefModule_ProvideTaskDatabaseFactory(appProvider);
  }

  public static SharedPreferences provideTaskDatabase(Application app) {
    return Preconditions.checkNotNullFromProvides(SharedPrefModule.INSTANCE.provideTaskDatabase(app));
  }
}
