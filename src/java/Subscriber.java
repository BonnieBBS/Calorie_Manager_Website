/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bonnie
 */
public class Subscriber {
    
    private String firstName;
    private String lastName;
    private String birthday;
    private String email;
    private String tel;
    private String gender;
    
    public Subscriber(String firstName, String lastName, String birthday, String email, String tel, String gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.tel = tel;
        this.gender = gender;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
 
    public String getBirthday()
    {
        return birthday;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public String getTel()
    {
        return tel;
    }
    
}
