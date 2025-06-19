
// 1.write a java programe for else if conditional statement
package company;
public class conditional_statement {

    public static void main(String[] args) {
        int age = 30;
        if (age <= 18) {
            System.out.println("you are college student");
        } else if ((age < 18) && (age > 5))
        {
            System.out.println("You are High School Student");
        } else
        {
            System.out.println("You are Employee");
        }
    }
}
