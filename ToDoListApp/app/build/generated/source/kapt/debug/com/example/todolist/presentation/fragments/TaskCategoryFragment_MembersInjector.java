// Generated by Dagger (https://dagger.dev).
package com.example.todolist.presentation.fragments;

import com.example.todolist.presentation.adapter.TasksAdapter;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Named;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TaskCategoryFragment_MembersInjector implements MembersInjector<TaskCategoryFragment> {
  private final Provider<TasksAdapter> adapterProvider;

  public TaskCategoryFragment_MembersInjector(Provider<TasksAdapter> adapterProvider) {
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<TaskCategoryFragment> create(
      Provider<TasksAdapter> adapterProvider) {
    return new TaskCategoryFragment_MembersInjector(adapterProvider);
  }

  @Override
  public void injectMembers(TaskCategoryFragment instance) {
    injectAdapter(instance, adapterProvider.get());
  }

  @InjectedFieldSignature("com.example.todolist.presentation.fragments.TaskCategoryFragment.adapter")
  @Named("task_category_fragment")
  public static void injectAdapter(TaskCategoryFragment instance, TasksAdapter adapter) {
    instance.adapter = adapter;
  }
}
