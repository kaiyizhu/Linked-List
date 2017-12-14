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
    //yup, they should be patient. Ty for making them
    public void add(Patient d){
        Node n = new Node(d);
        this.tail.next = n;
        this.tail = n;     
        
    }
    public void add(Patient d, int i){
       Node n = new Node(d);
       n.next = this.get(i+1);
       this.get(i).next = n;   
       
    }
    public void add(LinkedList l){
        
    }
    
    //Luke
    public void remove(int i){
        //if the index is larger than the last element's index
        if(i > size -1){
            //should probobally throw an exception here
            return;
        //otherwise, if you want to remove the tail
        }else if(i == size-1){
          //set the tail to the second last node
          tail = get(size-2); 
          //set the new tail's next to null (remove one after tail)
          tail.next = null;
        //if the head is to be removed
        }else if(i == 0){
            //assign the head variable to the next node
            head = head.next;
        }else{
            //create a node object to represent the node before the one to be removed
            Node n = get(i-1);
            //set the node at this position's next to the node after the replaced one
            n.next = n.next.next;
        }
        //reduce the size by one
        size--;
    }
    public void remove(Patient d){
        //create a node to represent the head
        Node n = head;
        Object sought = d;
        //for every node in the list
        for(int i=0; i<size;i++){
            //if this node's data equals the sought data
            Patient pat = (Patient)n.getData();
             if(pat.compareTo(sought) == 0){
                //remove it
                remove(i);
                //break the loop
                break;
            }
            //if it was not found, move to the next node
            n = n.next;
        }
    }

   
    
}
