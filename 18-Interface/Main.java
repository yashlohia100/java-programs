interface TeleVision {
  // abstract keyword is optional
  // abstract by default
  // can implement multiple interfaces
  // can not make object of abstract class or interface
  // methods are public by default
  void on();

  void off();

  void volumeUp();

  void volumeDown();
}

class Sony implements TeleVision {
  public void on() {
    System.out.println("Sony on...");
  }

  public void off() {
    System.out.println("Sony off...");
  }

  public void volumeUp() {
    System.out.println("Sony volume up...");
  }

  public void volumeDown() {
    System.out.println("Sony volume down...");
  }
}

class Lg implements TeleVision {
  public void on() {
    System.out.println("Lg on...");
  }

  public void off() {
    System.out.println("Lg off...");
  }

  public void volumeUp() {
    System.out.println("Lg volume up...");
  }

  public void volumeDown() {
    System.out.println("Lg volume down...");
  }
}

public class Main {
  public static void main(String[] args) {
    Sony sony = new Sony();

    sony.on();
    sony.volumeUp();
    sony.off();
    System.out.println();

    Lg lg = new Lg();
    lg.on();
    lg.volumeUp();
    lg.off();
    System.out.println();

    TeleVision sonyTv = new Sony();
    sonyTv.on();
  }
}