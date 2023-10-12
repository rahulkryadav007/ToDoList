package com.ToDoList;

import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListApp {

	
		//Declaring Arraylist with Private Access Specifier
	      private ArrayList<String> todolist = new ArrayList<>();
		// method to add New Task
		public void AddTask()
			{
				String Task;
			    Scanner sc = new Scanner(System.in);
					
				System.out.println("Enter New Task : ");
				Task = sc.nextLine();
				todolist.add(Task);
			}
				
				//Method To display All Task
		 public void DisplayList()
			{
				int task=0;
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
				for(String i:todolist) // for each loop
				{
					task++;
					System.out.println("Task  "+task+" : " +i);
				}
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
				}
			//Method to remove Task
				public void RemoveTask(int TaskIndex)
				{
					todolist.remove(TaskIndex);
				}
	
	
	}

 
