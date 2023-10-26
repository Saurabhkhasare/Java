package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

import com.app.core.Status;
import com.app.core.Task;

import custome_exception.TaskException;

public class Functionaity {

	public static void deletetask(int id, Map<Integer, Task> tasklist) throws TaskException {
		if (tasklist.containsKey(id)) {
			Task task = tasklist.get(id);
			task.setActive(false);
			System.out.println("Task Deleted...");
		} else {
			throw new TaskException("INVALID ID");
		}

	}

	public static void UpdateTaskStatus(int id1, String s1, Map<Integer, Task> tasklist) throws TaskException {

		if (tasklist.containsKey(id1)) {
			Task task = tasklist.get(id1);

			if (s1.equals("PENDING") && task.getStatus() == Status.PENDING) {
				task.setStatus(Status.INPROGRESS);
			} else if (s1.equals("INPROGRESS") && task.getStatus() == Status.INPROGRESS) {
				task.setStatus(Status.COMPLETED);
			} else {
//				System.out.println("The task is not in a state that can be updated.");
				throw new TaskException(" INVALID TASK STATUS");
			}
			System.out.println("Status updated...");
		} else {
			throw new TaskException(" INVALID ID");
		}
	}

	public static void DisplayPendingTask(Map<Integer, Task> tasklist) {
		for (Task task : tasklist.values()) {
			if (task.getStatus() == Status.PENDING) {
				System.out.println(task);
			}
		}

	}

	public static void Displaypendingtaskstoday(Map<Integer, Task> tasklist) {
		LocalDate date = LocalDate.now();
		for (Task task : tasklist.values()) {
			if (task.getStatus() == Status.PENDING) {
				if (task.getTaskdate().equals(date)) {
					System.out.println(task);
				}

			}
		}

	}

	public static void sortedByDate(Map<Integer, Task> tasklist) {
		List<Task> l1 = new ArrayList<>(tasklist.values());
		Collections.sort(l1, new DateComparator());
		for (Task task : l1) {
			System.out.println(task);

		}

	}

	public static void DisplayAll(Map<Integer, Task> tasklist) {
		for (Task t : tasklist.values()) {
			System.out.println(t);

		}

	}

}
