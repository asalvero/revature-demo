package com.company.Day4;

class UserAlreadyLoggedInException extends Exception{

}


class Authntication{
    private boolean isLoggedIn = false;

    public void login(String email, String password) throws UserAlreadyLoggedInException {
        if(!isLoggedIn) {
            if (email.equals("admin") && password.equals("123")) {
                isLoggedIn = true;
                System.out.println("Login successful");
            } else {
                System.out.println("Login failed");
            }
        }else{
            throw new UserAlreadyLoggedInException();
        }
    }
}

public class Demo5 {
    public static void main(String[] args) throws UserAlreadyLoggedInException {
        Authntication  auth = new Authntication();
        //auth.login("admin", "123");
        //auth.login("admin", "123");

        try{
            auth.login("admin", "123");
        }catch(UserAlreadyLoggedInException ex){
            ex.printStackTrace();
        }
        try{
            auth.login("admin", "123");
        }catch(UserAlreadyLoggedInException ex){
            ex.printStackTrace();
        }
    }
}
