import java.util.ArrayList;

public class StudentGroup {

    public String groupName;
    public ArrayList<Student> studentList;


    public StudentGroup(String groupName, ArrayList<Student> studentList) {
        this.groupName = groupName;
        this.studentList = studentList;
    }

    public void addStudent(Student student){

        if (this.studentList.size() >= 15){
            throw new IllegalStateException("group is full");
        }

        if (studentList.contains(student)){
            throw new IllegalStateException(("student already exists!"));
        }



    }
}
