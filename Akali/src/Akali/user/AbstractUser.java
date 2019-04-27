package Akali.user;

public abstract class AbstractUser {
    private String username, password;

    private void editAcc(String username, String password) {// method called in the GUI to set password and username...(and save it in a file9
        this.setUsername(username);
        this.setPassword(password);

    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

