package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_1_News_Notification.subject;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_1_News_Notification.observer.Observer;

public interface Subject {
    public void addObservers(Observer observer);

    public void removeObservers(Observer observer);

    public void notifyObservers();
}
