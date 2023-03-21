public class School {
    private int studentBody;
    private boolean isPublic;
    public School(int studentBody, boolean isPublic){
        this.studentBody = studentBody;
        this.isPublic = isPublic;
    }
    public void intro(){
        System.out.println("We are a school and we have a student body of " + studentBody);
    }
    public int getStudentBody(){
        return studentBody;
    }
    public boolean getIsPublic(){
        return isPublic;
    }
}
