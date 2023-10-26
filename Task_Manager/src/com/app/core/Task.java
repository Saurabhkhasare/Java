package com.app.core;

import java.time.LocalDate;

/*You can create a class Task with fields like taskId, taskName, description, taskDate, status, active. 
taskId should be unique and generated automatically.
status should be either PENDING, IN PROGRESS or COMPLETED.
active should be either true or false. Deleted task will have active=false 
Newly added task should have default status as PENDING and active=true

You can use suitable data structure to store data in memory.

Following functionalities are expected -

a. Add New Task                       
b. Delete a task                         
c. Update task status               
d. Display all pending tasks     
e. Display all pending tasks for today           
f.  Display all tasks sorted by taskDate */
public class Task {

	private static int idGenerator=1;
	private int taskId;
	private String taskname;
	private String description;
	private LocalDate taskdate;
	private Status status;
	private boolean active;
	
	
	public Task(String taskname, String description, LocalDate taskdate, Status status) {
		super();
		this.taskId = idGenerator++;
		this.taskname = taskname;
		this.description = description;
		this.taskdate = taskdate;
		this.status = status;
		this.active = true;
	}


	public static int getIdGenerator() {
		return idGenerator;
	}


//	public static void setIdGenerator(int idGenerator) {
//		Task.idGenerator = idGenerator;
//	}


	public int getTaskId() {
		return taskId;
	}


	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}


	public String getTaskname() {
		return taskname;
	}


	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getTaskdate() {
		return taskdate;
	}


	public void setTaskdate(LocalDate taskdate) {
		this.taskdate = taskdate;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskname=" + taskname + ", description=" + description + ", taskdate="
				+ taskdate + ", status=" + status + ", active=" + active + "]";
	}
	
	
}
