package com.nixsolution.usermanagment;

import java.util.Calendar;
import java.util.Date;

import com.nixsolution.usermanagment.User;

import junit.framework.TestCase; 

public class UserTest extends TestCase { 

private User user;
private Date dateOfBirth;


protected void setUp() throws Exception { 
super.setUp(); 
user = new User(); 
Calendar calendar = Calendar.getInstance();
calendar.set(1997, Calendar.MARCH, 9);
dateOfBirth = calendar.getTime();
} 


public void testGetFullName() { 
user.setFirstName("�������"); 
user.setLastname("�����"); 
assertEquals("�����, �������", user.getFullName()); 
} 
public void testGetAge() {
    user.setDateOfBirth(dateOfBirth);
    assertEquals(2016 - 1997, user.getAge());
}


}
