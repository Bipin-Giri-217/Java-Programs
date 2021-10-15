import java.io.*;
import java.util.*;

class vectors {
    public static void main(String args[]) {
        int choice = 0;
        Vector<String> v = new Vector<String>();
        String student;
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        try {
            do {
                System.out.println("\n\n******* Menu *******");
                System.out.println("Select your choice:");
                System.out.println("1 - Add Student name");
                System.out.println("2 - Display Student names");
                System.out.println("3 - Exit");
                choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter student name:");
                        student = br.readLine();
                        if (v.contains(student))
                            System.out.println("Student  name already exists");
                        else {
                            v.add(student);
                            System.out.println("Student name added Successfully !!!");
                        }
                        break;

                    case 2:
                        if (v.isEmpty())
                            System.out.println("Student list is empty , Nothing to display ");
                        else {
                            System.out.println("Students list :");
                            // for (int i=0;i<v.size();i++){
                            // System.out.println((i+1)+". " + v.get(i));
                            // }
                            for (Object i : v) {
                                System.out.println(i);
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Successful exit !!!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("INVALID INPUT ENTERED !!!");
                }

            } while (choice != 3);
        } catch (Exception e) {
            System.out.println("Exception caught:" + e);
        }
    }
}
// *** for removing student from list by using name ***  code saved at : https://onlinegdb.com/OcOfARrHC
// case 2:
// if (v.isEmpty())
// System.out.println("Students name list is empty nothing to remove");
// else {
// System.out.println("Enter Student name:");
// student = br.readLine();
// String remove = student;
// if (v.contains(student)) {
// v.removeElement(student);
// System.out.println(remove + " is removed Successfully !!!");
// } else
// System.out.println("Student name does not exist");
// }
// break;