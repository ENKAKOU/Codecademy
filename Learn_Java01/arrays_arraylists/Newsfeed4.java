package java_english.arrays_arraylists;

import java.util.Arrays;

public class Newsfeed4 {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public Newsfeed4(){

    }

    public String[] getTopics(){
        return topics;
    }

    public String getTopTopic(){
        int maxViews = views[0];
        int topTopicIndex = 0;

        for (int i = 1; i < views.length; i++) {
            if (views[i] > maxViews) {
                maxViews = views[i];
                topTopicIndex = i;
            }
        }

        return topics[topTopicIndex];
    }

    public void viewTopic(int topicIndex){

    }

    public static void main(String[] args){
        Newsfeed4 sampleFeed = new Newsfeed4();

        System.out.println("The top topic is "+ sampleFeed.getTopTopic());

        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);

        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
    }
}
