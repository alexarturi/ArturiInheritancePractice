public class CollegeSchool extends School{
    private String major;
    public CollegeSchool(int studentBody, boolean isPublic, String major){
        super(studentBody, isPublic);
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
    public void introduce(){
        System.out.println("Hi, I'm a college student and I'm majoring in " + major);
    }
}
