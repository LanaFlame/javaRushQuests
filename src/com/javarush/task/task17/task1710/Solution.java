package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {
        Date birthdayDate;
        Date birthdayDate2;

        if (args[0].equals("-c")) {
            birthdayDate = simpleDateFormat.parse(args[3]);

            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], birthdayDate));
            } else if (args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1], birthdayDate));
            }
            System.out.println(allPeople.size()-1);
        } else if (args[0].equals("-r")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            System.out.println(person.getName() + " " + (person.getSex().toString().equals("MALE") ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));
        } else if (args[0].equals("-u")) {
            birthdayDate = simpleDateFormat.parse(args[4]);
            int id = Integer.parseInt(args[1]);
            Sex sex = null;
            if (args[3].equals("м")) {
                sex = Sex.MALE;
            } else if (args[3].equals("ж")) {
                sex = Sex.FEMALE;
            }
            Person person = allPeople.get(id);
            person.setName(args[2]);
            person.setSex(sex);
            person.setBirthDate(birthdayDate);
        } else if (args[0].equals("-d")) {
            int id = Integer.parseInt(args[1]);
            Person person = allPeople.get(id);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }
}
