package projectadmin

class Team {

	String name
	String description
	Developer leader
	static hasMany = [developers:Developer, projects:Project]
	
    static constraints = {
    }
	
	String toString() {
		return name
	}

}
