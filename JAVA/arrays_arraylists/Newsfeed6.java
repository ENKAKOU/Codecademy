package java_english.arrays_arraylists;

import java.util.Arrays;

public class Newsfeed6 {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public Newsfeed6(){

    }

    public String[] getTopics(){
        return topics;
    }

    public int getNumTopics(){
        return topics.length;
    }

    public static void main(String[] args){
        Newsfeed6 sampleFeed = new Newsfeed6();

        System.out.println("The number of topics is "+ sampleFeed.getNumTopics());

    }
}
