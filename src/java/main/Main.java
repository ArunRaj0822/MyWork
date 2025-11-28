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
        for(Student s:students){
            System.out.println(s);
        }
    }
}
