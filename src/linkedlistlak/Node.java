/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistlak;

/**
 *
 * @author User
 * @param <Patient>
 */
public class Node<Patient>  implements Comparable<Node> {
    //sorry had to add this guy to start programming
    
    public Node<Patient> next;
    public Patient data;
    
    public Node(Patient data){
            
    }
    
    public Node(Node next, Patient data){
        this.next = next;
        this.data = data;
    }

    @Override
    public int compareTo(Node o) {
        
        return 0;
    }
    public Node<Patient> getNext(){
        
        return this.next;
    }
    
    public Patient getData(){
 
        return this.data;
    }
    public void setData(Patient data){
        this.data = data;
        
    }  

    public void setNext(Node<Patient> next) {
        this.next = next;
    }

}
