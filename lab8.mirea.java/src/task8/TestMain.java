package task8;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        WaitList<Integer> lst1 = new BoundedWaitList<Integer>(5);
        lst1.add(1);
        lst1.add(3);
        lst1.add(4);
        lst1.add(8);
        System.out.println("Правильный писок: " + lst1.content);

        WaitList<Integer> lst2 = new BoundedWaitList<Integer>(3);
        lst2.add(10);
        lst2.add(42);
        lst2.add(63);
        lst2.add(43);
        System.out.println("Неправильный список: " + lst2.content + " - # недостаточный размер для всех элементов");

        WaitList<Integer> lst3 = new UnfairWaitList<>();
        lst3.add(1);
        lst3.add(2);
        lst3.add(3);
        lst3.add(4);
        System.out.println("Список без удаления элементов: " + lst3.content);
        lst3.content.remove(2);
        lst3.content.remove(3);
        System.out.println("Список с удалением элементов: " + lst3.content);

        WaitList<Integer> lst4 = new WaitList<Integer>();
        lst4.content.add(1);
        lst4.content.add(22);
        lst4.content.add(333);
        lst4.content.add(4444);
        System.out.println("Список: " + lst4.content);
        lst4.content.remove(333);
        System.out.println("Список после удаления элементов: " + lst4.content);
        System.out.println("Список содержит элемент 4444: " + lst4.content.contains(4444));
        System.out.println("Список содержит элемент 333: " + lst4.content.contains(333));

        List<Integer> lst5 = new ArrayList<Integer>();
        lst5.add(1);
        lst5.add(3);
        lst5.add(5);
        lst5.add(7);
        System.out.println("Список lst4 содержит весь lst5: " + lst4.content.containsAll(lst5));
        System.out.println("Список пустой: " + lst4.content.isEmpty());
    }
}
