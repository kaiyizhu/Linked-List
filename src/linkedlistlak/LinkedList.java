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
    private Node head;
    private Node tail;
    private int size;
    
    
    public void remove(int i){
        if(i > size){
            //should probobally throw an exception here
            return;
        }
        //if the head is to be removed
        if(i == 0){
            //assign the head variable to the next node
            head = head.next;
        }
        //create a node objext to represent the node before the one to be removed
        Node n = head;
        //for a number of times equal to the index
        for(int p = 0; p<i; p++){
            //set n to the next in the chain
            n = n.next;
        }
        //set the node at this position to the next node
        n = n.next;
    }
}
