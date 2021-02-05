import java.util.ArrayList;

public class Zoo {

  public static void main(String[] args) {
    ArrayList <String> animals = new ArrayList<>();

    for (int i = 0; i < 8; i++) {
      animals.add(i, "animal" + (i + 1));
    }

    for (String list : animals){
      System.out.println(list);
    }
  }
}
