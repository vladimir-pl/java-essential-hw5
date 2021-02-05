import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10 ; i++) {
      list.add(i + 1);
    }

    ListIterator<Integer> iterator = list.listIterator();

    while (iterator.hasNext()){
      list.set(iterator.nextIndex(), iterator.nextIndex() + 2);
      System.out.println(iterator.next());
    }
  }
}
