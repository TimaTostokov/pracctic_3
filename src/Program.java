import java.util.*;

public class Program {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        Iterator<String> iter = states.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("---------------------------");

        ArrayList<String> united = new ArrayList<String>();
        united.add("Germany");
        united.add("France");
        united.add("Italy");
        united.add("Spain");

        ListIterator<String> listIter = united.listIterator();

        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }
        // сейчас текущий элемент - Испания
        // изменим значение этого элемента
        listIter.set("Португалия");
        // пройдемся по элементам в обратном порядке
        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
        }
    }

}


