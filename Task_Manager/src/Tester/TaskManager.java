package Tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Status;
import com.app.core.Task;

import utils.DateComparator;
import utils.Functionaity;
import utils.ValidationRule;

public class TaskManager {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, Task> tasklist = new HashMap<>();
			boolean exit = false;

			while (!exit) {
				System.out.println("1. Add New Task  \r\n" + "2. Delete a task  \r\n" + "3. Update task status  \r\n"
						+ "4. Display all pending tasks \r\n" + "5. Display all pending tasks for today \r\n"
						+ "6. Display all tasks sorted by taskDate \r\n" + "7. Display");
				System.out.println("Enter the Choice :");
				try {
					switch (sc.nextInt()) {
					case 1:
			
						System.out.println("Enter :  String taskname, String description, LocalDate taskdate,");
						Task Input = ValidationRule.vallidateInput(sc.next(), sc.next(), sc.next());
						tasklist.put(Input.getTaskId(), Input);
						break;

					case 2:
						System.out.println("Enter the ID:");
						int id = sc.nextInt();
						Functionaity.deletetask(id,tasklist);	
						break;

					case 3:

						System.out.println("Enter the ID:");
						int id1 = sc.nextInt();
						System.out.println("Enter your status");
						String s1 = sc.next().toUpperCase();
						Functionaity.UpdateTaskStatus(id1,s1,tasklist);
					

						break;

					case 4:
						Functionaity.DisplayPendingTask(tasklist);
					
						break;

					case 5:
						Functionaity.Displaypendingtaskstoday(tasklist);
						
						break;

					case 6:
						Functionaity.sortedByDate(tasklist);
					
						break;
					case 7:
						Functionaity.DisplayAll(tasklist);
						
						break;

					}
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}
		}
	}
}