import java.util.*;

class GradeCalculator{

	public static void main (String[] args){
	
	String name;
	int sub1,sub2,sub3,sub4,sub5;
	int totalMarks;
	float avgPercentage;
	Scanner sc =new Scanner(System.in);
	System.out.println("**************Welcome**************");
	System.out.println("***Student Grade Calcutor***\n\n");
	System.out.println("Enter Name of Student:");
	name=sc.nextLine();
	System.out.println("Enter Marks Obtained by Student ");
	
	System.out.println("C(out of 100)     : ");
	sub1=sc.nextInt();
	System.out.println("C++(out of 100)   : ");
	sub2=sc.nextInt();
	System.out.println("JAVA(out of 100)  : ");
	sub3=sc.nextInt();
	System.out.println("Python(out of 100): ");
	sub4=sc.nextInt();
	System.out.println("DBMS(out of 100)  : ");
	sub5=sc.nextInt();
	if(sub1<40 || sub2<40 || sub3<40 || sub4<40 || sub5<40)
	{
		if(sub1<40)
		{
			System.out.println("Fail in C");
     		
		}
 		if(sub2<40)
		{
			System.out.println("Fail in C++");
     		
		}
 		if(sub3<40)
		{
			System.out.println("Fail in Java");
     		
		}
 		if(sub4<40)
		{
			System.out.println("Fail in Python");
     		
		}
		if(sub5<40)
		{
			System.out.println("Fail in DBMS");
     		
		}

	}
	else
	{
		totalMarks=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total Marks (out of 500)= "+totalMarks+"/500");
		avgPercentage=totalMarks/5;
		System.out.println("Percentage = "+avgPercentage);
	
		
		if(avgPercentage>=90)
		{
			System.out.println("Grade = Merit");
		}
		else if(avgPercentage>=75 && avgPercentage<90)
		{
			System.out.println("Grade = First Class with Distinction ");
		}
		else if(avgPercentage>=60 && avgPercentage<75)
		{
			System.out.println("Grade = First Class ");
		}
		else if(avgPercentage>=40 && avgPercentage<60)
		{
			System.out.println("Grade = Pass ");
		}
		else
		{
			System.out.println("Grade = Fail ");
		}
	
		System.out.println("*****Thank You*****");
	
	}
}

}