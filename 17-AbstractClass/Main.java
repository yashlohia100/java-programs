abstract class MediaPlayer {

  abstract void play();

  abstract void pause();

  abstract void stop();

  void display() {
    System.out.println("Display method in abstract class");
  }
}

// Must implement all the abstract methods
class Vlc extends MediaPlayer {

  void play() {
    System.out.println("Vlc playing...");
  }

  void pause() {
    System.out.println("Vlc paused...");
  }

  void stop() {
    System.out.println("Vlc stopped...");
  }
}

class Win extends MediaPlayer {

  void play() {
    System.out.println("Win playing...");
  }

  void pause() {
    System.out.println("Win paused...");
  }

  void stop() {
    System.out.println("Win stopped...");
  }
}

public class Main {
  public static void main(String[] args) {
    Vlc v = new Vlc();
    v.play();
    v.pause();
    v.stop();
    System.out.println();

    Win w = new Win();
    w.play();
    w.pause();
    w.stop();
    System.out.println();

    MediaPlayer vv = new Vlc();
    vv.play();
  }
}