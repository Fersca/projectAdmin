package projectadmin

class Project {

	String name
	String description
	Team team
	static hasMany = [tasks:Task]
	
    static constraints = {
    }
	
	String toString() {
		return name
	}
	
}
