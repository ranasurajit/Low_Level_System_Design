package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_1_News_Notification;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_1_News_Notification.observer.impl.NewsChannel;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_1_News_Notification.subject.impl.NewsAgency;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsChannel cnbcNews = new NewsChannel("CNBC News");
        agency.addObservers(cnbcNews);

        NewsChannel zeeNews = new NewsChannel("ZEE News");
        agency.addObservers(zeeNews);

        NewsChannel aajtakNews = new NewsChannel("Aajtak News");
        agency.addObservers(aajtakNews);

        agency.setNews("Why India called Pakistan shortly after Operation Sindoor strikes? PM Modi explains");
        agency.setNews(
                "India-US trade deal: Donald Trump says not finalized; hints at 20-25% tariff rate two days ahead of reciprocal tariff deadline");

        agency.removeObservers(aajtakNews);

        agency.setNews(
                "Op Sindoor debate: How Tharoor took centre stage in LS; PM hints at Cong leader being 'sidelined'");
    }
}
