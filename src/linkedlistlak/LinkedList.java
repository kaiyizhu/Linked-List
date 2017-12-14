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
public class LinkedList
{

    //refers to the node at the first link of the LinkedList
    private Node head;
    //refers to the node at the last link of the LinkedList
    private Node tail;
    //The number of elements in the linkedList 
    //same as with arrays, should be equal to the final index +1
    private int size;

    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }
            //Kaiyi
    //not sure if this guy should return a Patient or Node
    public Node get(int i)
    {
        Node n = head;
        //Patient temp = (Patient) n.getData();
        for (int j = 0; j < i; j++)
        {
            n = n.getNext();
        }
        //if it was not found, move to the next node
       return n;
    }

public int getSize(int add)
    {
        return size;
    }

    public String toString(Node n){
        return n.toString();
    } 
    
            //Asher
   
    /**
     * Adds in data to the end of a list.
     * Creates a node and stores inputted
     * data, places node at end of list
     * @param d     Patient data
     */
    public void add(Patient d){
        Node n = new Node(d);
        this.tail.setNext(n);
        this.tail = n;     
        
    }
    /**
     * Adds in data to specified spot.
     * Creates a node and stores inputted
     * data, places node at specified spot
     * @param d     Patient data
     * @param i     index to insert
     */
    public void add(Patient d, int i){
       Node n = new Node(d);
       n.setNext(this.get(i+1));
       this.get(i).setNext(n);   
       
    }
    
    
    //Luke
    public void remove(int i)
    {
        //if the index is larger than the last element's index
        if (i > size - 1)
        {
            //should probobally throw an exception here
            return;
        //otherwise, if you want to remove the tail
        }else if(i == size-1){
          //set the tail to the second last node
          tail = get(size-2); 
          //set the new tail's next to null (remove one after tail)
          tail.setNext(null);
        //if the head is to be removed
        }else if(i == 0){
            //assign the head variable to the next node
            head = head.getNext();
        }else{
            //create a node object to represent the node before the one to be removed
            Node n = get(i - 1);
            //set the node at this position's next to the node after the replaced one
            n.setNext(n.getNext().getNext());
        }
        //reduce the size by one
        size--;
    }

    public void remove(Patient d)
    {
        //create a node to represent the head
        Node n = head;
        Object sought = d;
        //for every node in the list
        for (int i = 0; i < size; i++)
        {
            //if this node's data equals the sought data
            Patient pat = (Patient) n.getData();
            if (pat.compareTo(sought) == 0)
            {
                //remove it
                remove(i);
                //break the loop
                break;
            }
            //if it was not found, move to the next node
            n = n.getNext();
            
        }
    }

}
