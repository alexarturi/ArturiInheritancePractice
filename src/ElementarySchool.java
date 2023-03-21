public class ElementarySchool extends School {
    private int playTimeLength;
    public ElementarySchool(int studentBody, boolean isPublic, int playTimeLength){
        super(studentBody, isPublic);
        this.playTimeLength = playTimeLength;
    }
    public void play(){
        System.out.println("Yay! We can play for " + playTimeLength + " minutes!");
    }
    public int getPlayTimeLength(){
        return playTimeLength;
    }
}
