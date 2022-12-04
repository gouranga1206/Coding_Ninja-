package Assignment;
import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Basic_Salary = sc.nextInt();
        char Grade = sc.next().charAt(0);
        char allow = Character.toUpperCase(Grade);
        double hra= 0.2*Basic_Salary;
        double da= 0.5*Basic_Salary;
        double pf= 0.11*Basic_Salary;
        if(allow=='A')
        { System.out.print(Math.round(Basic_Salary+hra+da+1700-pf));}
        else if(allow=='B'){
            System.out.print(Math.round(Basic_Salary+hra+da+1500-pf));
        }
        else {
            System.out.print(Math.round(Basic_Salary+hra+da+1300-pf));
        }


    }
}
