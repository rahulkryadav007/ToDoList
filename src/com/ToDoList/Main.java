package com.ToDoList;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		//Creating Instance of The ToDOListApp Class
		 ToDoListApp tdla = new ToDoListApp();
         Scanner sc  = new Scanner(System.in);
		 System.out.println("To-Do List App.");
		 int choice  =0;
		 String task;
		 while(choice!=4) 
		 {
			System.out.println("1. Add New Task");
			System.out.println("2. Display Tasks");
			System.out.println("3. Delete Task");
			System.out.println("4. Exit Application");
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			    case 1 ->{
			    	tdla.AddTask();
			    	break;
			    }
			    
			    case 2 ->{
			    	System.out.println("Task You Have Made :");
			        tdla.DisplayList();
			        break;
			    }
			    case 3 ->{
			    	System.out.println("Enter The Task Index To Remove : ");
			    	int index = sc.nextInt();
			    	tdla.RemoveTask(index);
			    	break;
			    }
			    case 4->{
			    	System.out.println("Thanks For Using To Do List App.");
			    	break;
			    }
			    default->{
			    	System.out.println("Enter The Correct Choice.");
			    }
			}
		 }
		
	}

}
