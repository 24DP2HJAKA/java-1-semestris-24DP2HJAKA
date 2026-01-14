package rvt;

import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
      
        ArrayList<String> strings = new ArrayList<>();

       strings.add("First");
       strings.add("Second");
       strings.add("Third");

       System.out.println(strings);

       removeLast(strings);

       System.out.println(strings);

       if (!strings.isEmpty()) {
        strings.remove(strings.size() - 1);

       }

    }

    public static void ListSize (String []args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break; // beidz lasīt, ja rinda tukša
            }

            list.add(input); // pievieno sarakstam
         }

         // Izdrukā visus vārdus 
         for (String name : list) {
            System.out.println(name);
         }

         System.out.println("In total: " + list.size());
    }

    public static void onlyTheseNumbers (String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        //Read the numbers from user until -1
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        //Ask for the range
        System.out.println("From where? ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int end = Integer.valueOf(scanner.nextLine());

        //Print numbers in the given range (inclusive)
        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    }
    
    public static void onTheList (String[]args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        // Read inputs until an empty line is entered
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }

        //Ask for the name to search
        System.out.println("Serach for? ");
        String search = scanner.nextLine();

        //Check if the name is in the list
        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }
    public static void removeLast(ArrayList<String> strings) {
        
        }
    }