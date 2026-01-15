package inheritence;

public class Application {
    String appName;
    String developer;
    double sizeMB;
    public void printApp() {
        System.out.println("App Name   : " + appName);
        System.out.println("Developer  : " + developer);
        System.out.println("Size (MB)  : " + sizeMB);
    }
    public static void main(String[] args) {
        Instagram i = new Instagram(
                "Instagram",
                "Meta",
                120.5,
                true,
                5.0,
                2000000
        );
        i.printAll();
    }
}
class Instagram extends Application {
    boolean reelsAvailable;
    double rating;
    int downloads;
    Instagram(String appName, String developer, double sizeMB,
              boolean reelsAvailable, double rating, int downloads) {
        this.appName = appName;
        this.developer = developer;
        this.sizeMB = sizeMB;
        this.reelsAvailable = reelsAvailable;
        this.rating = rating;
        this.downloads = downloads;
    }
    public void printAll() {
        printApp();
        System.out.println("Reels      : " + reelsAvailable);
        System.out.println("Rating     : " + rating);
        System.out.println("Downloads  : " + downloads);
    }
}
