
public class RegisteredUser {
	private String username;
	private String password;
	private String email;
	private String alias;
	
	
	public String getAlias(){
		return alias;
	}
	
	public String getUsername(){
		return username;
	}
	public String getEmail(){
		return email;
	}
	public String getPassword(){
		return password;
	}
	
	public RegisteredUser (){
		
	}
	
	public void setUsername(String name){
		username = name ;
	}
	
	public void setAlias (String name){
		alias = name; 
	}
	
	public void setEmail (String name){
		email = name;
	}
	public void setPassword (String pass){
		password = pass;
	}
	
	public void CreateUser (String user, String pass, String alias, String email){
		setUsername(user);
		setPassword(pass);
		setEmail(email);
		setAlias(alias);
		//User created add to database below
		
	}
	
}
