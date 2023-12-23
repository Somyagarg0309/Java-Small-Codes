
//Here we generated Enrollment Number in 11 digit where 
//initial 3 digit are unique code, next 2 is course code , next 2 are department code
//and last 4 are the year of admittance of Students in the University

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab21 {
    // Library to print menu
    public static Integer coursedepartment(String n[], int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < size; i++) {
            System.out.println(i + " " + n[i]);
        }
        System.out.print("Enter your choice from the above options : ");
        Integer c = sc.nextInt();
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        int s = 1;
        // Making Arrays
        String course[] = new String[100];
        course[0] = "Course";
        course[1] = "Btech";
        course[2] = "Mtech";
        course[3] = "Phd";
        int cosize = 4;
        String department[] = new String[100];
        department[0] = "department";
        department[1] = "CSE";
        department[2] = "IT";
        department[3] = "ECE";
        department[4] = "MECH";
        int desize = 5;
        String Student[] = new String[999];
        System.out.println("-----Welcome to Enrollment Number Generator System-----\n");
        String wh = "True";
        while (wh == "True") {
            // Main Menu Options
            System.out.println("1. Generate Enrollment Number of Students");
            System.out.println("2. Add Course");
            System.out.println("3. Add department");
            System.out.println("4. Search Student Details by using Enrollment number");
            System.out.println("5. Exit\n");
            System.out.print("Enter you Choice : ");
            int c = sc.nextInt();
            // Generating Enrollment Number
            if (c == 1) {
                System.out.print(
                        "Enter Number of students for which you want to generate Enrollment Number {Should be in range [1,999]} : ");
                int numofstu = sc.nextInt();
                System.out.print("Enter the year of admission of students i.e like 2022 : ");
                Integer y = sc.nextInt();
                String year = y.toString();
                if (numofstu <= 999 && numofstu > 0) {
                    for (int i = 1; i <= numofstu; i++) {
                        System.out.print("Enter Student" + i + " Name :");
                        String yo = st.nextLine();
                        Student[i] = yo;
                        int co = coursedepartment(course, cosize); // Calling Function
                        String e = String.format("%02d", co);
                        int de = coursedepartment(department, desize); // Calling Function
                        String f = String.format("%02d", de);
                        String uni = String.format("%03d", i);
                        String EN = uni + e + f + year; // Generation of Enrollment Number
                        System.out.println("\nEnrollment Number of " + Student[i] + " of Course " +
                                course[co] + " and Department"
                                + department[de] + " is :" + EN + "\n");
                        File myFile = new File("Data.txt");
                        boolean append = myFile.exists(); // If file exist then it append in that instead of overwriting
                                                          // or creating new one
                        try { // Writing in File named data.txt
                            FileWriter fileWriter = new FileWriter("Data.txt", append);
                            fileWriter.write(" " +
                                    s + "    " + yo + "        " + course[co] + "        " + department[de]
                                    + "               " + EN + "\n");
                            fileWriter.close();
                            s++;
                        } catch (IOException g) {
                            g.printStackTrace();
                        }
                    }

                } else {
                    System.out.println("Enter the Number of Students between the range [1,999]");
                }
                // Add new Course
            } else if (c == 2) {
                System.out.println("Available courses are : ");
                for (int i = 1; i < cosize; i++) {
                    System.out.println(i + " " + course[i]);
                }
                System.out.println("Add Name of Course you want to add : ");
                String re = st.nextLine();
                if (course.length < cosize) {
                    System.out.print("Cannot have more than 100 courses");
                } else {
                    course[cosize] = re;
                    cosize++;
                    System.out.println("Couse Added Successfully !!");

                }
                // Add new Department
            } else if (c == 3) {
                System.out.println("Available departments are : ");
                for (int i = 1; i < desize; i++) {
                    System.out.println(i + " " + department[i]);
                }
                System.out.println("Add Name of Course you want to add : ");
                String re = st.nextLine();
                if (department.length < desize) {
                    System.out.print("Cannot have more than 100 departments");
                } else {
                    department[desize] = re;
                    desize++;
                    System.out.println("Department Added Successfully !!");
                }
                // Searching for Student nased on Enrollment Number
            } else if (c == 4) {
                String fileName = "data.txt";
                System.out.print("Enter Enrollment Number of Stus]dent whose you want to get details : ");
                String searchEnrollmentNumber = st.nextLine();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(fileName));
                    String line;
                    boolean enrollmentNumberFound = false;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(searchEnrollmentNumber)) {
                            System.out.println("Enrollment Number found !");
                            System.out.print(line + "\n");
                            enrollmentNumberFound = true;
                            break; // Stop searching after finding the first occurrence
                        }
                    }

                    if (!enrollmentNumberFound) {
                        System.out.println("Enrollment Number not found.\n");
                    }

                    reader.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while reading the file.");
                    e.printStackTrace();
                }

            } else if (c == 5) {
                System.out.println("Thankyou for using Enrollment Generator System/n");
                System.exit(0); // Terminating from Program
            } else {
                System.out.print("Enter Correct Choice !!\n");
            }

        }
        sc.close();
        st.close();
    }
}