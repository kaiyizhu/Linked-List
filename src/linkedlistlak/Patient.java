/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistlak;

/**
 *
 * @author User
 */


public class Patient implements Comparable{
    
    private String firstName;
    private String lastName;
    private int priority;
    private Patient next;
    
    public void Patient(){
  
    }
    
    public void Patient(String firstName, String lastName, int priority){
        this.firstName = firstName;
        this.lastName = lastName;
        this.priority = priority;
    }
    
    public String toString(Node n){
        return null;
        
    }

    @Override
    public int compareTo(Object o)
    {
        return 0;
    }
    
}
