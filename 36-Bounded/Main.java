// Any type from Number family (Integer, Float, Double)
class Box<T extends Number> {
  private T content;

  T getContent() {
    return content;
  }

  void setContent(T content) {
    this.content = content;
  }
}

public class Main {
  public static void main(String[] args) {
    Box<Integer> integerBox = new Box<>();
    integerBox.setContent(21);
    System.out.println(integerBox.getContent());

    Box<String> stringBox = new Box<>();
    stringBox.setContent("Hello");
    System.out.println(stringBox.getContent());
  }
}