package twitter;

public class tester {

	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		User testp=new User();
		testp.CreateUser("marcelo","maldonado","@marcelo","marcelo1128@hotmail.com");
		testp.setFollowers(1099);
		testp.setTweetc(10);
		testp.setFollowing(10);
		password test=new password();
		//notifications test3=new notifications();
		
		home test2=new home();
		test2.loginUser(testp);
		
		
	}

}
