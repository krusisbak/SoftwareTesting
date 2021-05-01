package homework.datatypes;

public class AssignmentOperators {
    public static void main (String[] args){
        int a = 50;
        int b = 70;
        int c;
        System.out.println(c=a);
        System.out.println(b+=a);
        System.out.println (b-=a);
        System.out.println(b*=a);

        //b/a answer is not showing right
        System.out.println(b/=a);

        //answer is not right
        System.out.println(b%=a);

        //not sure is right answer or not?
        System.out.println(b^=a);

    }
}
