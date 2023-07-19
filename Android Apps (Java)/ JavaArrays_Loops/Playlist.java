import java.util.ArrayList;
import java.util.Random;

public class Playlist {

    ArrayList<String> mediaPlaylist;

    public Playlist() {
        mediaPlaylist = new ArrayList<String>();
    }

    public void addTitle(String title) {
        mediaPlaylist.add(title);
    }

    public int getSize() {
        return mediaPlaylist.size();
    }

    public void deleteTitle(String title) {
        mediaPlaylist.remove(title);
    }

    public void deleteTitle(int index) {
        mediaPlaylist.remove(index);
        System.out.println(mediaPlaylist);
    }

    public void swapTitles(String titleA, String titleB) {
        int indexA = mediaPlaylist.indexOf(titleA);
        int indexB = mediaPlaylist.indexOf(titleB);
        String tempA = mediaPlaylist.get(indexA);
        String tempB = mediaPlaylist.get(indexB);
        mediaPlaylist.set(indexA, tempB);
        mediaPlaylist.set(indexB, tempA);
        System.out.println(mediaPlaylist);
    }

    public void shuffleTitles() {
        ArrayList<String> temp = new ArrayList<String>();
        while (!mediaPlaylist.isEmpty()) {
            Random randomGenerator = new Random();
            int index = randomGenerator.nextInt(mediaPlaylist.size());
            temp.add(mediaPlaylist.get(index));
            mediaPlaylist.remove(index);
        }
        mediaPlaylist = temp;
        System.out.println(mediaPlaylist);
    }

    public static void main(String[] args) {
        // Create empty ArrayLists.
        Playlist dessertIslandPlaylist = new Playlist();
        Playlist holidayMoviePlaylist = new Playlist();

        // Populate with songs.
        dessertIslandPlaylist.addTitle("Uptown Girl");
        dessertIslandPlaylist.addTitle("Ace of Spades");
        dessertIslandPlaylist.addTitle("Aces High");
        dessertIslandPlaylist.addTitle("Barracuda");
        dessertIslandPlaylist.addTitle("The Ripper");
        dessertIslandPlaylist.addTitle("Billy Jean");
        dessertIslandPlaylist.addTitle("9 to 5");

        System.out.println(dessertIslandPlaylist.mediaPlaylist);
        System.out.println(dessertIslandPlaylist.getSize());

        // Populate with films.
        holidayMoviePlaylist.addTitle("Home Alone");
        holidayMoviePlaylist.addTitle("Rambo");
        holidayMoviePlaylist.addTitle("Ghost Busters");
        holidayMoviePlaylist.addTitle("The Goonies");
        holidayMoviePlaylist.addTitle("Die Hard");
        holidayMoviePlaylist.addTitle("The Magnificent Seven");
        holidayMoviePlaylist.addTitle("Shrek");

        System.out.println(holidayMoviePlaylist.mediaPlaylist);
        System.out.println(holidayMoviePlaylist.getSize());

        // Remove two titles from each playlist.
        dessertIslandPlaylist.deleteTitle(6);
        dessertIslandPlaylist.deleteTitle("The Ripper");
        System.out.println(dessertIslandPlaylist.mediaPlaylist);
        System.out.println(dessertIslandPlaylist.getSize());

        holidayMoviePlaylist.deleteTitle(1);
        holidayMoviePlaylist.deleteTitle("Shrek");
        System.out.println(holidayMoviePlaylist.mediaPlaylist);
        System.out.println(holidayMoviePlaylist.getSize());

        // Change the order. Swap two titles in each playlist.
        dessertIslandPlaylist.swapTitles("Uptown Girl", "Aces High");
        holidayMoviePlaylist.swapTitles("The Magnificent Seven", "Home Alone");

        // Shuffle titles in each playlist.
        dessertIslandPlaylist.shuffleTitles();
        holidayMoviePlaylist.shuffleTitles();
    }
}



