package java_english.arrays_arraylists;

import java.util.Arrays;

public class Newsfeed7 {

    String[] topics;

    public Newsfeed7(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args) {
        Newsfeed7 feed;
        if (args[0].equals("Human")) {

            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new Newsfeed7(humanTopics);

        } else if (args[0].equals("Robot")) {

            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new Newsfeed7(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new Newsfeed7(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));

    }
}
