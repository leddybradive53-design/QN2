/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
class VUCourses {import java.util.Scanner;

public class VUCourses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variable declaration
        String moduleCode;
        String courseName = "";
        int tuition = 0;

        // Prompt user
        System.out.print("Enter Module Code: ");

        moduleCode = input.nextLine().toUpperCase();

        // Decision structure
        switch (moduleCode) {

            case "BSF":
                courseName = "BSc Software Engineering";
                tuition = 900000;
                break;

            case "BIT":
                courseName = "BSc Information Technology";
                tuition = 750000;
                break;

            case "BCS":
                courseName = "BSc Computer Science";
                tuition = 800000;
                break;

            case "BCE":
                courseName = "BSc Computer Engineering";
                tuition = 950000;
                break;

            default:
                System.out.println("Wrong Module Code details");
                return;
        }

        // Output
        System.out.println("Course : " + courseName);
        System.out.println("Tuition : " + tuition);
    }
}
    
}
