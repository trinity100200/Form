package ru.sapteh;

import com.sun.source.doctree.SystemPropertyTree;

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {



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

        File dir = new File("C:/Java 42т/1/Reg");
        File spisok = new File("C:/Java 42т/1/Reg/spisok.txt");
        System.out.println(dir.mkdir() ? "success" : "error");
        System.out.println(dir.createNewFile() ? "success" : "error");
        FileWriter fw = new FileWriter(spisok);
        System.out.println(personIsEmpty(person));
        fw.write(personIsEmpty(person));
        fw.close();
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