import java.util.*;
class PercentageAndPerformanceAnalyzer
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of students");
        int n=sc.nextInt();
        int marks[]=new int[5];
        int roll,totalmarks,weaksubject,min;
        double percentage;
        char grades;
        String name,result;
        String subject[] = {"English", "Maths", "Physics", "Chemistry", "Computer"};

        for(int i=0;i<=n-1;i++)
        {
            totalmarks=0;
             System.out.println("Enter the name of the student");
                name=sc.next();
                System.out.println("Enter the roll no. of the student");
                roll=sc.nextInt();
                for(int j=0;j<=4;j++)
            {
                System.out.println("Enter the marks in  "+subject[j]);
                marks[j]=sc.nextInt();
                totalmarks=totalmarks+marks[j];
                 
            }
            min=marks[0];weaksubject=0;
            for(int j=1;j<=4;j++)
                if (min>marks[j])
                {
                    min=marks[j];
                    weaksubject=j;
                     }
            System.out.println("students name:  "  +name);
            System.out.println("students roll no. is: " +roll);
            percentage= (totalmarks/500.0)*100;
            System.out.println("student's percentage: "+ percentage);
            if(percentage>=90)
            {
                System.out.println("Grade-A");}
                else if(percentage>=75&&percentage<90)
                System.out.println("Grade-B");
                else if(percentage>=60&&percentage<75)
                System.out.println("Grade-C");
                else if(percentage>=40&&percentage<60)
                System.out.println("Grade-D");
                else
                System.out.println("Grade-F");
               if(percentage>=40)
               System.out.println("PASS");
               else
               System.out.println("FAIL");
                System.out.println("the weakest subject is "+subject[weaksubject]+" with lowest marks- "+min);
            }  
        }
    }
