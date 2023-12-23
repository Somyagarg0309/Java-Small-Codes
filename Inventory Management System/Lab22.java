//Unique code is of 8 digit where first 3 digits are Inventory item code
//next 3 digit are Sno of that item
//Last 2 digit is department code

import java.io.BufferedReader;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab22 {
    // Library to print menu
    public static Integer deinven(String n[], int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < size; i++) {
            System.out.println(i + " " + n[i]);
        }
        System.out.print("Enter your choice from the above options : ");
        Integer c = sc.nextInt();
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        String department[] = { "department", "CSE", "IT", "ECE", "MECH" };
        System.out.println("----Welcome to Inventory Management System----");
        // Define Arrays
        String initems[] = { "Server", "Desktop Computer", "Laptop", "Printer", "UPS", "Scanner", "Projector" };
        int com = 1; // No of complain track
        String code[] = { "SRV", "DTC", "LPT", "PTR", "UPS", "SCN", "PRJ" };
        // Array to store the each inventory item assigned last time
        int[] last01 = new int[initems.length];
        int[] last02 = new int[initems.length];
        int[] last03 = new int[initems.length];
        int[] last04 = new int[initems.length];
        String wh = "True";
        while (wh == "True") {
            // Main Menu Options
            System.out.println("1. Issue Inventory Items");
            System.out.println("2. Track Inventory Item using Unique code");
            System.out.println("3. Details of Total Inventory issued to Department");
            System.out.println("4. Total Inventory Number Issued Till Now by the University");
            System.out.println("5. Complain Regarding Item");
            System.out.println("6. Exit\n");
            System.out.print("Enter you Choice : ");
            int c = sc.nextInt();
            System.out.println();
            // Inventory Item issue with Unique code Generation
            if (c == 1) {
                System.out.print("Enter Department for which you want to issue :-\n");
                int depart = deinven(department, 5);
                String e = String.format("%02d", depart);
                // Showing items
                for (int i = 0; i < initems.length; i++) {
                    System.out.print("Enter the number of " + initems[i] + " to be issued: ");
                    int numIssued = sc.nextInt();
                    // Generate unique codes and display them
                    if (depart == 1) {
                        for (int j = 0; j < numIssued; j++) {
                            last01[i]++;
                            String f = String.format("%03d", last01[i]);
                            String uniqueCode = code[i] + f + e;
                            System.out.println(
                                    initems[i] + " " + last01[i] + " Assigned to Department " + department[depart] +
                                            "has a Unique code : " + uniqueCode);
                            File myFile = new File("Data22.txt");
                            boolean append = myFile.exists(); // If file exist then it append in that instead of
                                                              // overwriting
                                                              // or creating new one
                            try { // Writing in File named data22.txt
                                FileWriter fileWriter = new FileWriter("Data22.txt", append);
                                fileWriter.write(initems[i] + "     " + last01[i] + "      " + department[depart]
                                        + "         " + uniqueCode + "\n");
                                fileWriter.close();
                            } catch (IOException g) {
                                g.printStackTrace();
                            }
                        }
                    } else if (depart == 2) {
                        for (int j = 0; j < numIssued; j++) {
                            last02[i]++;
                            String f = String.format("%03d", last02[i]);
                            String uniqueCode = code[i] + f + e;
                            System.out.println(
                                    initems[i] + " " + last02[i] + " Assigned to Department " + department[depart] +
                                            "has a Unique code : " + uniqueCode);
                            File myFile = new File("Data22.txt");
                            boolean append = myFile.exists(); // If file exist then it append in that instead of
                                                              // overwriting
                                                              // or creating new one
                            try { // Writing in File named data22.txt
                                FileWriter fileWriter = new FileWriter("Data22.txt", append);
                                fileWriter.write(initems[i] + "     " + last02[i] + "      " + department[depart]
                                        + "         " + uniqueCode + "\n");
                                fileWriter.close();
                            } catch (IOException g) {
                                g.printStackTrace();
                            }

                        }
                    } else if (depart == 3) {
                        for (int j = 0; j < numIssued; j++) {
                            last03[i]++;
                            String f = String.format("%03d", last03[i]);
                            String uniqueCode = code[i] + f + e;
                            System.out.println(
                                    initems[i] + " " + last03[i] + " Assigned to Department " + department[depart] +
                                            "has a Unique code : " + uniqueCode);
                            File myFile = new File("Data22.txt");
                            boolean append = myFile.exists(); // If file exist then it append in that instead of
                                                              // overwriting
                                                              // or creating new one
                            try { // Writing in File named data22.txt
                                FileWriter fileWriter = new FileWriter("Data22.txt", append);
                                fileWriter.write(initems[i] + "     " + last03[i] + "      " + department[depart]
                                        + "         " + uniqueCode + "\n");
                                fileWriter.close();
                            } catch (IOException g) {
                                g.printStackTrace();
                            }
                        }
                    } else if (depart == 4) {
                        for (int j = 0; j < numIssued; j++) {
                            last04[i]++;
                            String f = String.format("%03d", last04[i]);
                            String uniqueCode = code[i] + f + e;
                            System.out.println(
                                    initems[i] + " " + (last04[i]) + " Assigned to Department " + department[depart] +
                                            " has a Unique code : " + uniqueCode);
                            File myFile = new File("Data22.txt");
                            boolean append = myFile.exists(); // If file exist then it append in that instead of
                                                              // overwriting
                                                              // or creating new one
                            try { // Writing in File named data22.txt
                                FileWriter fileWriter = new FileWriter("Data22.txt", append);
                                fileWriter.write(initems[i] + "     " + last04[i] + "      " + department[depart]
                                        + "         " + uniqueCode + "\n");
                                fileWriter.close();
                            } catch (IOException g) {
                                g.printStackTrace();
                            }

                        }
                    }
                    System.out.print("\n");
                }

            } else if (c == 2) {
                System.out.print("Enter Unique Code of Item : ");
                String unique = st.nextLine();
                String fileName = "data22.txt";
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(fileName));
                    String line;
                    boolean enrollmentNumberFound = false;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(unique)) {
                            System.out.println("Unique Number found !");
                            System.out.print(line + "\n");
                            enrollmentNumberFound = true;
                            break; // Stop searching after finding the first occurrence
                        }
                    }

                    if (!enrollmentNumberFound) {
                        System.out.println("Unique Code not found.\n");
                    }

                    reader.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while reading the file.");
                    e.printStackTrace();
                }

            } else if (c == 3) {
                int depart = deinven(department, 5);
                if (depart == 1) {
                    for (int i = 0; i < initems.length; i++) {
                        System.out.println("" + initems[i] + " : " + last01[i] + " Units");
                    }
                } else if (depart == 2) {
                    for (int i = 0; i < initems.length; i++) {
                        System.out.println("" + initems[i] + " : " + last02[i] + " Units");
                    }
                } else if (depart == 3) {
                    for (int i = 0; i < initems.length; i++) {
                        System.out.println("" + initems[i] + " : " + last03[i] + " Units");
                    }
                } else if (depart == 4) {
                    for (int i = 0; i < initems.length; i++) {
                        System.out.println("" + initems[i] + " : " + last04[i] + " Units");
                    }
                } else {
                    System.out.print("Incorrect Option Choosed !!");
                }

            } else if (c == 4) {
                for (int i = 0; i < initems.length; i++) {
                    System.out.println(
                            "Total Number of " + initems[i] + " is : "
                                    + (last01[i] + last02[i] + last03[i] + last04[i]));
                }
            } else if (c == 5) {
                System.out.print("Enter Unique Code of Item : ");
                String unique = st.nextLine();
                System.out.print("Enter Issue you face : ");
                String complain = st.nextLine();
                // Extractibg Department information from unique code
                File myFile = new File("Complain.txt");
                boolean append = myFile.exists(); // If file exist then it append in that instead of overwriting
                                                  // or creating new one
                try { // Writing in File named data.txt
                    FileWriter fileWriter = new FileWriter("Complain.txt", append);
                    fileWriter.write(com + " " + unique + " " + complain + "\n");
                    fileWriter.close();
                    com++;
                } catch (IOException g) {
                    g.printStackTrace();
                }
            } else if (c == 6) {
                System.out.println("Thankyou for using Inventory Management System");
                System.out.println();
                System.exit(0); // Terminating from Program
            } else {
                System.out.println("Enter Correct Choice !!");

            }
        }
        sc.close();
        st.close();
    }
}
