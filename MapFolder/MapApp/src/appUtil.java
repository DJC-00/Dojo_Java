import java.util.HashMap;
import java.util.Set;
public class appUtil {
    HashMap<String, String> trackList = new HashMap<String, String>();

    public void addTrackAndLyrics(String trackName, String lyrics) {
        trackList.put(trackName, lyrics);
    }

    public void addMultiple(){
        String run = "1";
        while(run.equals("1")){
            System.out.println("Enter the track name. (Enter 0 to quit)");
            String trackName = System.console().readLine();
            if (trackName.equals("0")){
                run = "0";
                break;
            }
            System.out.println("Enter the lyrics for " + trackName + " (Enter 0 to cancel)");
            String trackLyrics = System.console().readLine();
            if (!trackLyrics.equals("0")){
                addTrackAndLyrics(trackName, trackLyrics);
            }
            else{
                System.out.println("Track Removed.\n\n");
            }
        }
    }

    public void printSingleTrack(String trackName){
        String keyValue = trackList.get(trackName);
        System.out.println("Track: " + trackName + "\nLyrics: " + keyValue);
    }

    public void printTrackList() {
        Set<String> keys = trackList.keySet();
        for(String title : keys)
            System.out.println("Track Name: " + title + "\nLyrics: " + trackList.get(title));
    }
}

