package projects;

import projects.dao.DbConnection;

//built in the main package
//call the connection to the server

public class ProjectsApp {

	public static void main(String[] args) {
		DbConnection.getConnection();

	}

}
