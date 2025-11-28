package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n");
        int n=sc.nextInt();
        Student[] students=new Student[n];
        System.out.println("name,salary");
        for(int i=0;i<n;i++){
            String name=sc.next();
            double salary=sc.nextDouble();
            students[i]=new Student(name,salary);
        }
        double avg=0;
        double sum=0;
        double max=students[0].salary;
        for(Student s:students){
            sum+=s.salary;
            if(s.salary>max){
                max=s.salary;
            }
            System.out.println(s);
        }
        avg=sum/n;
        System.out.println(max);
        System.out.println("avg salary:"+avg);
    }
}
