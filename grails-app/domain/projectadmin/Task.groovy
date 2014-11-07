package projectadmin

class Task {

	String title
	String description
	Developer developer
	Project project
	TaskType type
	TaskStatus status
	
    static constraints = {
    }
	
	String toString() {
		return title
	}

}
