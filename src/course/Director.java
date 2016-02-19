package course;

public class Director extends Employee implements InterfaceDirector {
    private static Director director = new Director();

    private Director() {
        super();

    }

    public static Director getDirector() {

        return director;

    }


//    private Director(String name, String surname, String id) {
//        super(name, surname, id);
//    }

//    public Director getDirector(){
//        if director
//    }


//    public Manager hireManager(String name, String surname, String id) {
//        Manager manager = new Manager();
////        manager.
//        return manager;
//    }
//
//
//    public Instructor hireInstructor(String name, String surname) {
//        return null;
//    }
    /**

     *
     * @param   idInstructor   a value.
     * @param   levelGroup   a value.
     * @return  TEST
     *
     */
    public void createGroup(String idInstructor, String levelGroup) {
        Group groupForAdd = new Group();
        Instructor instructor = Utils.instructortById(idInstructor);
        FirmAccount.getGroupList().add(groupForAdd);
        instructor.getGroupList().add(groupForAdd);
        groupForAdd.setInstructor(instructor);
        groupForAdd.setLevelGroup(levelGroup);
        groupForAdd.setBalanceLessons(Level.getNumberOfLessons());
    }

//    @Override
//    long earnings() {
//        long earnings = FirmAccount.getBalance()/2;
//        return earnings;
//    }


//    @Override
//    long earnings() {
//        return 0;
//    }
}
