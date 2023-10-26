package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import com.app.core.Status;
import com.app.core.Task;

public class ValidationRule {
	
	public static Status validateStatus(String status) throws IllegalArgumentException
	{
		return Status.valueOf(status.toUpperCase());
	}

	
	public static Task vallidateInput(String taskname, String description, String date) throws DateTimeParseException {
		LocalDate date1 = LocalDate.parse(date);
		Status s =Status.PENDING;
		
		return new Task(taskname,description,date1,s);		
	}



	}
