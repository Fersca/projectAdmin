package projectadmin

class Developer {

	String name
	String mail
	String password
	Role role
	
	static hasMany = [tasks:Task]
 	
    static constraints = {
    }
	
	String toString() {
		return name
	}
}
