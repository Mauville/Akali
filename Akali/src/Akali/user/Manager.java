package user;

public class Manager extends AbstractUser{
	private void deleteUser() {//deletes it from the abstract classes
        //TODO don't know how to delete a user object
        //TODO send to logic.UserLogic with the parameters deleteUser(String name);
	}
	private void addTranslator(){
		Translator t = new Translator();
		t.setPassword("");
		t.setUsername(""/*input*/);
	}
	private void addConsultant(){
		Consultant c = new Consultant();
		c.setPassword("");
		c.setUsername(""/*input*/);
	}
	private void addInfoManager(){
		InfoManager im = new InfoManager();
		im.setPassword("");
		im.setUsername(""/*input*/);
	}
	private void addManager() {
		Manager m = new Manager();
		m.setPassword("");
		m.setUsername(""/*input*/);
	}
	public static String getPrivilege(){
		return "MANAGER";
	}
}
//NOTE I didnt put a password because the user will be able to modify his/her password.... 
