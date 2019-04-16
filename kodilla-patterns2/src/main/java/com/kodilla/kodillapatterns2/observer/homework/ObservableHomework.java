package com.kodilla.kodillapatterns2.observer.homework;

public interface ObservableHomework {

    void registerObserver(HomeworkObserver homeworkObserver);
    void notifyObserverHomework();
}
