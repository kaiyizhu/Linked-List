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
public class Node<I>  implements Comparable<Node> {
    //sorry had to add this guy to start programming
    
    public Node next;
    public Patient data;
    
    public Node(){
            
    }
    
    public Node(Node next, Patient data){
        this.next = next;
        this.data = data;
    }

    @Override
    public int compareTo(Node o) {
        
        return 0;
    }
    public Node getNext(){
        
        return this.next;
    }
    
    public Patient getData(){
 
        return this.data;
    }
    public void setData(Patient data){
        this.data = data;
        
    }  

    public void setNext(Node next) {
        this.next = next;
    }

}
