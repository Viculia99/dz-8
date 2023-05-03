public class Main {
    public static void main(String[] args) {
    Student student1 = new Student(1, "Victoria", "Rymchuk");
    Student student2 = new Student(2, "Anna", "Bila");
    Student student3 = new Student(3, "Bohdan", "Chumak");
    Student student4 = new Student(4, "Pavlo", "Holub");
    Student student5 = new Student(5, "Daria", "Lymar");

    Group group = new Group(student1);
    group.printChief();

    group.addNewStudent(student1);
    group.addNewStudent(student2);
    group.addNewStudent(student3);
    group.addNewStudent(student4);
    group.addNewStudent(student5);
    group.printListOfStudents();

    group.setChief(student4);
    group.printChief();

    group.removeStudent(student2);
    group.printListOfStudents();

    group.renameStudent(student5, "Maryna", "Bond");
    group.printListOfStudents();

    group.addNewTask("Watch the lesson about incapsulation");
    group.addNewTask("Do homework for lesson about incapsulation");
    group.addNewTask("Create pull request for your homework");
    group.addNewTask("Move to the next lesson");
    group.printListOfTasks();
    }
}