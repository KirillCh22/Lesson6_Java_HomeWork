package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    // МЕТОД ПО ДОБАВЛЕНИЮ НОВГО КОНТАКТА В HASH ИЛИ ДОБАВЛЕНИЮ ТЕЛЕФОНА К УЖЕ ИМЕЮЩЕМУСЯ
    public void AddContact(String name, Integer phoneNum) {
        ArrayList<Integer> arrayList = phoneBook.get(name);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            phoneBook.put(name, arrayList);
        }
        arrayList.add(phoneNum);
    }


    // МЕТОД ПО ПОИСКУ НОМЕРОВ ТЕЛЕФОНОВ ПО ИМЕНИ
    public ArrayList<Integer> FindNumber(String name) {
        ArrayList<Integer> arrayList = phoneBook.get(name);
        if(arrayList == null) {
            arrayList = new ArrayList<>();
            System.out.println("По данному имени нет номеров");
        }

        return arrayList;
    }

    public void RemoveContact(String name) {
        ArrayList<Integer> arrayList = phoneBook.get(name);
        if (arrayList == null) {
            System.out.println("Нет телефонов для удаления");
        }
        else {
            phoneBook.remove(name);
            System.out.println("Телефон по имени " + name + " удален из базы данных");
        }

    }


    // МЕТОД ПО ВЫВОДУ ТЕЛЕФОННОГО СПРАВОЧНИКА
    public static HashMap<String, ArrayList<Integer>> showPhoneBook() {
        return phoneBook;
    }

}
