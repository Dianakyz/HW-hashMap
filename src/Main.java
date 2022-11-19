import phoneBook.FullName;
import phoneBook.PhoneBook;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(new FullName("Дмитрий", "Володин"), "+79268887755");
        phoneBook.addPhone(new FullName("Демид", "Золотовский"), "+79095236958");
        phoneBook.addPhone(new FullName("Валентина", "Иванова"), "+79720033066");
        phoneBook.addPhone(new FullName("Диана", "Кузьмина"), "+79054235698");
        phoneBook.addPhone(new FullName("Софья", "Валикова"), "+79066065452");
        phoneBook.addPhone(new FullName("Ольга", "Романова"), "+79990027117");
        phoneBook.addPhone(new FullName("Евгений", "Позов"), "+79012033026336");
        phoneBook.addPhone(new FullName("Дмитрий", "Рогозин"), "+79044095445");
        phoneBook.addPhone(new FullName("Полина", "Криулина"), "+79110110961");
        phoneBook.addPhone(new FullName("Ирина", "Черникова"), "+79333066030");
        phoneBook.addPhone(new FullName("Раиса", "Барышева"), "+78505802030");
        phoneBook.addPhone(new FullName("Павел", "Федоров"), "+79268522558");
        phoneBook.addPhone(new FullName("Анастасия", "Дубровская"), "+79022066363");
        phoneBook.addPhone(new FullName("Юлия", "Седова"), "+79054100147");
        phoneBook.addPhone(new FullName("Александр", "Овчинников"), "+79996663311");
        phoneBook.addPhone(new FullName("Ольга", "Крылова"), "+79997078888");
        phoneBook.addPhone(new FullName("Оксана", "Письменная"), "+79033022233");
        phoneBook.addPhone(new FullName("Лев", "Зотов"), "+79098522536");
        phoneBook.addPhone(new FullName("Давид", "Якунин"), "+79638544226");
        phoneBook.addPhone(new FullName("Эмин", "Дашкин"), "+79812566556");

        for (Map.Entry<FullName, String> entry : phoneBook.getEntries()) {
            System.out.printf("%s. Телефон: %s%n", entry.getKey(), entry.getValue());
        }

        //Tusk 2.2
        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(5, "test5");
        orderedMap.put(3, "test3");
        orderedMap.put(4, "test4");
        orderedMap.put(1, "test1");
        orderedMap.put(7, "test7");
        orderedMap.put(2, "test2");
        orderedMap.put(6, "test6");
        orderedMap.put(9, "test9");
        orderedMap.put(8, "test8");
        orderedMap.put(10, "test10");

        for (Map.Entry<Integer,String> entry: orderedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}