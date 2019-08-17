package database;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Module08 {



        public static void main(String[] args) {
            // TODO code application logic here
            Scanner in = new Scanner(System.in);

            HashMap<String, String> list = new HashMap<>();
            // Add four names with four grades as strings.


            // Getting a Set of Key-value pairs
            Set entrySet = list.entrySet();

            // Obtaining an iterator for the entry set
            Iterator it = entrySet.iterator();

            // Iterate through HashMap entries(Key-Value pairs)
            System.out.println("CURRENT STUDENT GRADE: ");
            while (it.hasNext()) {
                Map.Entry me = (Map.Entry) it.next();
                System.out.println("Student name: " + me.getKey()
                        + " ; "
                        + " Grade: " + me.getValue());
            }
            //Add a new student/grade key/value into the hashmap.
            System.out.println("Would you like to add a student?  Type YES or NO: ");
            String a = in.next();

            if (a.equalsIgnoreCase("yes")) {
                String b = in.nextLine();
                System.out.println("Enter a new name: ");
                String name = in.next();
                System.out.println("Enter a new grade: ");
                String grade = in.next();
                list.put(name, grade);
            } else if (a.equalsIgnoreCase("no")) {
            }

            //Remove a student from the hashmap.
            System.out.println("Would you like to remove a student?  Type YES or NO: ");
            String c = in.next();

            if (c.equalsIgnoreCase("yes")) {
                String d = in.nextLine();
                System.out.println("Remove a student:");
                String name = in.next();
                list.remove(name);
            } else if (c.equalsIgnoreCase("no")) {

            }

            System.out.println("Would you like to change a grade?  Type YES or NO: ");

            String e = in.next();

            if (c.equalsIgnoreCase("yes")) {
                String f = in.nextLine();
                System.out.println("Who is the grade change for? ");
                String name3 = in.next();
                System.out.println("Enter a new grade: ");
                String grade3 = in.next();
                list.put(name3, grade3);
            } else if (a.equalsIgnoreCase("no")) {

            }

            // Obtaining an iterator for the entry set
            Iterator it1 = entrySet.iterator();

            // Iterate through HashMap entries(Key-Value pairs)
            System.out.println("UPDATED STUDENT GRADE: ");
            while (it1.hasNext()) {
                Map.Entry me = (Map.Entry) it1.next();
                System.out.println("Student name: " + me.getKey()
                        + " ; "
                        + " Grade: " + me.getValue());
            }

        }
    }

