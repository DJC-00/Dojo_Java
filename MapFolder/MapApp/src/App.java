public class App {
    public static void main(String[] args) throws Exception {

        appUtil appUtil = new appUtil();
        appUtil.addTrackAndLyrics("Songongong", "we you we you are a songongong");
        appUtil.addTrackAndLyrics("We the Monitors", "MONTOR MONITOR MOOOOOONIIIIIITOOOOOR");
        appUtil.addTrackAndLyrics("I'm not actually alive.", "I'm dead");
        appUtil.addTrackAndLyrics("HashMap", "Unordered Data, pure chaos!");
        // appUtil.addMultiple();
        System.out.println("(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)\n");
        appUtil.printSingleTrack("Songongong");
        System.out.println("\n(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)(^)\n");
        appUtil.printTrackList();
        
    }
}
