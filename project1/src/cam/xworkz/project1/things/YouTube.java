package cam.xworkz.project1.things;

public class YouTube{
    public String videoTitle;
    public String channelName;
    public int videoID;
    public int views;
    public double rating;

   
    public YouTube() {
    }
    public YouTube(String videoTitle) {
        this.videoTitle = videoTitle;
    }
    public YouTube(String videoTitle, String channelName) {
        this.videoTitle = videoTitle;
        this.channelName = channelName;
    }
    public YouTube(String videoTitle, String channelName, int videoID) {
        this.videoTitle = videoTitle;
        this.channelName = channelName;
        this.videoID = videoID;
    }
    public YouTube(String videoTitle, String channelName, int videoID, int views) {
        this.videoTitle = videoTitle;
        this.channelName = channelName;
        this.videoID = videoID;
        this.views = views;
    }
    public YouTube(String videoTitle, String channelName, int videoID, int views, double rating) {
        this.videoTitle = videoTitle;
        this.channelName = channelName;
        this.videoID = videoID;
        this.views = views;
        this.rating = rating;
    }
    public void displayDetails(){
        System.out.println("Video Title: " + videoTitle);
        System.out.println("Channel Name: " + channelName);
        System.out.println("Video ID: " + videoID);
        System.out.println("Views: " + views);
        System.out.println("Rating: " + rating);
        System.out.println("--------------------------");
    }
}
