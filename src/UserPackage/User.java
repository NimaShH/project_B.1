package UserPackage;

import TaskPackage.Task;

import java.util.Scanner;

public class User {
    private String username;
    private String password;
    public String first_name;
    public String last_name;
    public String email;
    public int  streak;
    public Task createTask(){
        System.out.println("enter Task name: ");
        Scanner input = new Scanner(System.in);
        String task_name = input.next();
        Task t = new Task(task_name);
        return (t);
    }
    public String getFullName(){
        return (first_name + last_name);
    }
    public void setUsername(String username2){
        username = username2;
    }
    public void setPassword(String password2){
        password = password2;
    }
    public String getPassword(){
        return (password);
    }
    public String getUsername(){
        return (username);
    }
    public User(String username,String password,String first_name,String last_name,String email){
        setUsername(username);
        setPassword(password);
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        streak= 0;
    }
}
