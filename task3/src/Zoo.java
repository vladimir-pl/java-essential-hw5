import java.util.ArrayList;

public class Zoo {

  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<>();

    for (int i = 0; i < 8; i++) {
      animals.add(i, "animal" + (i + 1));
    }

    System.out.println("Количество элементов в списке: " + animals.size());

    animals.remove(2);
    animals.remove(3);
    animals.remove(4);

    System.out.println("Количество элементов в списке: " + animals.size());

    for (String list : animals){
      System.out.println(list);
    }
  }
}
