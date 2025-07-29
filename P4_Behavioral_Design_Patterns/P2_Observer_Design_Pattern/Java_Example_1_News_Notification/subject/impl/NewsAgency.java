package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_1_News_Notification.subject.impl;

import java.util.HashSet;
import java.util.Set;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_1_News_Notification.observer.Observer;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_1_News_Notification.subject.Subject;

public class NewsAgency implements Subject {
    private String news;
    private Set<Observer> set = new HashSet<Observer>();

    public void setNews(String news) {
        this.news = news;
        this.notifyObservers();
    }

    @Override
    public void addObservers(Observer observer) {
        set.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        set.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : set) {
            obs.notify(news);
        }
    }
}
