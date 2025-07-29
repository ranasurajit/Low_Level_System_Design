package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_1_News_Notification.observer.impl;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_1_News_Notification.observer.Observer;

public class NewsChannel implements Observer {
    private String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void notify(String news) {
        System.out.println("[" + channelName + " - Breaking News] : " + news);
    }
}
