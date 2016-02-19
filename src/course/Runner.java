package course;

/**
 * Created by Иришка on 19.02.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Manager manager = new Manager("Manager", "Mahoni", "3091314675");
        Instructor instructor = new Instructor("Instructor", "Bogdan", "5216974533");
        Instructor instructor1 = new Instructor("Instructor", "Bogdan", "5216974533");
        FirmAccount.getInstructorList().add(instructor);
//        FirmAccount.getInstructorList().add(instructor1);

        for (Instructor ins : FirmAccount.getInstructorList()) {
            System.out.println(ins);
        }
        System.out.println();
//
        Director.getDirector().createGroup("5216974533", "PreIntermediate"); //index 0

        manager.addStudent("Andry", "Kameron", "2165459684");
        manager.addStudent("Ivan", "Poplavski", "2546321568");
        manager.addStudent("Olga", "Negdan", "6245369875");
        manager.addStudent("Nastya", "Petrosyan", "7569832454");
        manager.addStudent("Nastya", "Petrosyan", "7569832454");

        manager.getPayment("2165459684", 1200);
        manager.getPayment("2546321568", 1200);
        manager.getPayment("6245369875", 1200);
        manager.getPayment("7569832454", 1200);

        for (Student student : FirmAccount.getStudentList()) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Balance Firm:" + FirmAccount.getBalance());

        //add to Group
        manager.addStudentToGroup("2165459684",0);
        manager.addStudentToGroup("2546321568",0);

        System.out.println();
        System.out.println("List student by Group: " + 0);
        for (Student student : FirmAccount.getGroupList().get(0).getStudentList()) {
            System.out.println(student);
        }
        System.out.println();
//print student with new balance
        System.out.println("print student with new balance");
        for (Student student : FirmAccount.getStudentList()) {
            System.out.println(student);
        }


        for (int i = 0; i< 12; i++){
            instructor.conductSession(0);  //number of group
        }


        for (int i = 0; i< 12; i++){
            instructor.conductSession(0);  //number of group
        }


        System.out.println();
        for (Student student : FirmAccount.getGroupList().get(0).getStudentList()) {
            System.out.println(student);
        }
    }
}
