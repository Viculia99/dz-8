import java.util.ArrayList;

public class Group {
    private Student chief;
    private ArrayList<Student> listOfStudents;
    private ArrayList<String> listOfTasks;

    public Group (Student chief){
        this.chief = chief;
        this.listOfStudents =  new ArrayList<Student>();
        this.listOfTasks = new ArrayList<String>();
    }

    public void addNewStudent (Student student){
        listOfStudents.add(student);
    }
    public void removeStudent(Student student){
        listOfStudents.remove(student);
    }
    public void renameStudent(Student student, String newName, String newSurname){
        student.setName(newName);
        student.setSurname(newSurname);
    }
    public void setChief(Student chief){
        this.chief = chief;
    }
    public void addNewTask(String task){
        this.listOfTasks.add(task);
    }
    public void printChief (){
        System.out.println("The chief of group is:" + chief.getName() + " " + chief.getSurname());
    }
    public void printListOfStudents(){
        System.out.println("The list of students in the group is:");
        for (Student student: this.listOfStudents){
            System.out.println("*" + student.getName() + " " + student.getSurname());
        }
    }
    public void printListOfTasks(){
        System.out.println("The list of tasks is:");
        for (String task: listOfTasks){
            System.out.println("*" + task);
        }
    }

}
