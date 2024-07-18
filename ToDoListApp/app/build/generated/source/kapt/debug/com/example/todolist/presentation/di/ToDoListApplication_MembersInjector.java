// Generated by Dagger (https://dagger.dev).
package com.example.todolist.presentation.di;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ToDoListApplication_MembersInjector implements MembersInjector<ToDoListApplication> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public ToDoListApplication_MembersInjector(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  public static MembersInjector<ToDoListApplication> create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new ToDoListApplication_MembersInjector(sharedPreferencesProvider);
  }

  @Override
  public void injectMembers(ToDoListApplication instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
  }

  @InjectedFieldSignature("com.example.todolist.presentation.di.ToDoListApplication.sharedPreferences")
  public static void injectSharedPreferences(ToDoListApplication instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }
}
