package ru.sapteh;

import com.sun.source.doctree.SystemPropertyTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {

//        Person name = new Person("Kira", 19,2001);
//        Person name1 = new Person("Alex", 19,2001);
//        Person name2 = new Person("Trinity", 20, 2000);

//        System.out.println(name.toString() + "\n" + name1.toString() + "\n" + name2.toString());

        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = reader.readLine();
        System.out.println("Введите возраст: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Введите дату рождения: ");
        int date = Integer.parseInt(reader.readLine());
        Person person = new Person(name, age, date);
        System.out.println(person.toString());
        System.out.println(personIsEmpty(person));
    }

    public static String personIsEmpty(Person a) {
        String err = "";
        if (a.getName().isEmpty()) err += "Имя не заполнено \n";
        if (a.getAge() == 0) err += "Возраст не заполнен \n";
        if (a.getDate() == 0) err += "Дата рождения не заполнена \n";
        if (!err.isEmpty()) return err;

        return "Объект " + a.getClass() + " инициализирован \n" + a.toString();
    }
}