package interface_demo;

interface MusicPlayer {
    void play();
    void pause();
    void stop();
}

class SpotifyPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Spotify: Playing Dhurandhar. ");
    }

    @Override
    public void pause() {
        System.out.println("Spotify: Music paused. ");
    }

    @Override
    public void stop() {
        System.out.println("Spotify: Music stopped. ️");
    }
}

class YouTubeMusicPlayer implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("YouTube Music: Playing trending song. ");
    }

    @Override
    public void pause() {
        System.out.println("YouTube Music: Video paused. ️");
    }

    @Override
    public void stop() {
        System.out.println("YouTube Music: Playback stopped. ");
    }
}

public class Music {
    public static void main(String[] args) {

        MusicPlayer player = new SpotifyPlayer();
        player.play();
        player.pause();
        player.stop();

        System.out.println("-----------------------");

        player = new YouTubeMusicPlayer();
        player.play();
        player.pause();
        player.stop();
    }
}
