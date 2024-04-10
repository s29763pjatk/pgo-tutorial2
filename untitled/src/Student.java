public class Student {
    public String fname;
    public String lname;
    public int indexNuber;
    public String email;
    public String address;
    public int[] grades;

    public Student(String fname, String lname, int indexNuber, String email, String address, int[] grades) {
        this.fname = fname;
        this.lname = lname;
        this.indexNuber = indexNuber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }
    public int caclulateAverage(int[] grades){

        if (grades.length == 0){
            throw new IllegalArgumentException("this student has no grades");
        }
        if (grades.length == 20){
            throw new IllegalArgumentException("max 20 grades allowed");
        }
        int sum = 0;
        for (int i : grades){
            sum += i;
        }
        return sum / grades.length;
    }

    
}
