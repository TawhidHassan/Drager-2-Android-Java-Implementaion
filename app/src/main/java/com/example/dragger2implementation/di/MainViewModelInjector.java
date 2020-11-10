package com.example.dragger2implementation.di;

import com.example.dragger2implementation.MainActivity;
import com.example.dragger2implementation.basics.MainViewModel;

import dagger.Component;

@Component
public interface MainViewModelInjector {


    MainViewModel getMainViewModel();


    void injectField(MainActivity mainActivity);

}
