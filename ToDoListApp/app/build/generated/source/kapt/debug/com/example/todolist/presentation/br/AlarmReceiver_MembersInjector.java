// Generated by Dagger (https://dagger.dev).
package com.example.todolist.presentation.br;

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
public final class AlarmReceiver_MembersInjector implements MembersInjector<AlarmReceiver> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public AlarmReceiver_MembersInjector(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  public static MembersInjector<AlarmReceiver> create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new AlarmReceiver_MembersInjector(sharedPreferencesProvider);
  }

  @Override
  public void injectMembers(AlarmReceiver instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
  }

  @InjectedFieldSignature("com.example.todolist.presentation.br.AlarmReceiver.sharedPreferences")
  public static void injectSharedPreferences(AlarmReceiver instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }
}
