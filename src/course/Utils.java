package course;

import java.util.List;

public final class Utils {
    private Utils() {
    }

    public static boolean checkIsPerson(String id, List<? extends Person> personList) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return true;
            }

        }
        return false;
    }

    public static Student studentById(String id) {
        for (Student student : FirmAccount.getStudentList()) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }


    public static Person personById(String id, List<? extends Person> personList) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

//    public static Instructor instructortById(String id){
//        for (Instructor instructor : FirmAccount.getInstructorList()) {
//            if(instructor.getId().equals(id)){
//                return instructor;
//            }
//        }
//        return null;
//    }

    public static Instructor instructortById(String id) {

        int i = 0;
        while (!FirmAccount.getInstructorList().get(i).getId().equals(id)) {
            i++;
        }
        return FirmAccount.getInstructorList().get(i);
    }

    public static Group groupById(int id) {
        int i = 0;
        while (!(FirmAccount.getGroupList().get(i).getIdGroup() == id)) {
            i++;
        }
        return FirmAccount.getGroupList().get(i);
    }

    public static int costGroup(int idGroup) {
        Group group = Utils.groupById(idGroup);
        return group.getLevelGroup().getCostOneLesson() * group.getLevelGroup().getNumberOfLessons();
    }

    public static Level setLevel(int idGroup){
        return Level.values()[FirmAccount.getGroupList().get(idGroup).getLevelGroup().ordinal()];
    }

}

