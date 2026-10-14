public class StudentMain{
    public static void main(String[] args) {
        Student s1 = new Student("Bomb", "Ben");
        Student s2 = new Student("Bomb", "Alan");
        Student s3 = new Student("Bow", "Sam");

        
        System.out.println(s1.isSameClub(s2));
        System.out.println(s3.isSameClub(s2));
    }
}