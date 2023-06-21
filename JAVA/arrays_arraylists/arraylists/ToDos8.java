package java_english.arrays_arraylists.arraylists;

import java.util.ArrayList;

class ToDos8 {

    public static void main(String[] args) {

        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("listen to Dr. Watson for amusement");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        sherlocksToDos.remove("visit the crime scene");

        int solved = sherlocksToDos.indexOf("solve the case");

        System.out.println(solved);

    }
}