package com.example.sa_g7_tw2_spring.pattern;

public interface ObservableSubject {
        void notifyObservers();

        void attach(Observer observer);

        void detach(Observer observer);
}
