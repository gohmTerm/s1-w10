public class Student{
    
    private String myClub;
    private String myName;


    public Student(String Club, String Name){
        myClub = Club;
        myName = Name;

    }

    private String getClub(){
        return myClub;
    }

    public String getName(){
        return myName;
    }

    public boolean isSameClub(Student stud){
        return this.myClub.equals(stud.myClub);
    }
}