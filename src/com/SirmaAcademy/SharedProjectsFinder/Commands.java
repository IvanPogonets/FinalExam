package com.SirmaAcademy.SharedProjectsFinder;

public class Commands {
    private Service service;

    public static void displayOptions() {
        System.out.println("1. Read File");
        System.out.println("2. Show longest period working pair");
        System.out.println("3. Add working time");
//        System.out.println("4. Delete employee");
//        System.out.println("5. ");
//        System.out.println("6. ");
//        System.out.println("7. ");
        System.out.println("8. Save result to csv");
        System.out.println("9. Save all data and exit");
    }

    public void executeCommand (String command) {
            switch (command) {
                case "1":
                    service.readFile();
                    break;
//                case "2":
//                    service.;
//                    break;
//                case "3":
//                    service.();
//                    break;
//                case "4":
//                    service.();
//                    break;
//                case "5":
//                    service.();
//                    break;
//                case "6":
//                    service.();
//                    break;
//                case "7":
//                    service.();
//                    break;
//                case "8":
//                    service.Save();
//                    break;
//                case "9":
//                    break;
                default:
                    System.out.println("Wrong command. Please enter command from list");
            }
    }
}
