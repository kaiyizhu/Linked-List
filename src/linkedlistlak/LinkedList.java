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
public class LinkedList {
    //refers to the node at the first link of the LinkedList
    private Node head;
    //refers to the node at the last link of the LinkedList
    private Node tail;
    //The number of elements in the linkedList 
    //same as with arrays, should be equal to the final index +1
    private int size;
    
            //Kaiyi
    //not sure if this guy should return a Patient or Node
    public Node get(int i){
        return null;
    }
    public int getSize(){
        return 0;
    }
    public String toString(){
        return null;
    } 
    
            //Asher
    //I'm not sure if these parameters should be Patient or Node
    public void add(Patient d){
        
    }
    public void add(Patient d, int i){
        
    }
    
    //Luke
    public void remove(int i){
        if(i > size -1){
            //should probobally throw an exception here
            return;
        }else if(i == size-1){
          //set the tail to the second last node
          tail = get(size-2); 
          //set the tail's next to null (remove one after tail)
          tail.next = null;
        //if the head is to be removed
        }else if(i == 0){
            //assign the head variable to the next node
            head = head.next;
        }else{
            //create a node object to represent the node before the one to be removed
            Node n = get(i-1);
            //set the node at this position to the next node
            n.next = n.next.next;
        }
        size--;
    }
    public void remove(Patient d){
        Node n = head;
        for(int i=0; i<size;i++){
        //     if(n.data.equals(d)){
        //        remove(i);
        //    }
        }
    }

}
