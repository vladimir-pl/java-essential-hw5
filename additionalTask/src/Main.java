import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList <String> teachers = new ArrayList<>();
    teachers.add("teacher1");
    teachers.add("teacher2");
    teachers.add("teacher3");
    teachers.add("teacher4");
    teachers.add("teacher5");

    System.out.println("Лучший учитель: " + teachers.indexOf("teacher3"));
    System.out.println("Худший учитель: " + teachers.indexOf("teacher4"));

    for (String array : teachers){
      System.out.println(array);
    }
  }
}
