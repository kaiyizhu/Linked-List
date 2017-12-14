/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistlak;

/**
 *A node for Patient data.
 * A node that stores Patient data.
 * @author User
 * @param <Patient>     a patient
 */
public class Node<Patient>  implements Comparable<Node> {
   
    private Node<Patient> next; //refers to the next node in a list
    private Patient data;// the patients data
    
    /**
     * A Constructor for node.
     * A constructor for node that takes in a single param, 
     * the patient data.
     * @param data      the Patient data
     */
    public Node(Patient data){
          this.data = data;  
    }
    /**
     * A Constructor for node.
     * A Constructor for node that takes in two params,
     * the patient data and a node that holds patients
     * @param next      the next node in a list
     * @param data      the patient data
     */
    public Node(Node<Patient> next, Patient data){
        this.next = next;
        this.data = data;
    }
    /**
     * A method used to compare nodes.
     * A method used to compare nodes and
     * takes a node as a param.
     * Returns 0 if equal, -1 if less than, or 1 if greater than
     * the argument.
     * @param o     the node to compare to
     * @return      a positive, negative, or 0 
     */
    @Override
    public int compareTo(Node o) { // NOT FINISHED
        
        return 0;
    }
    /**
     * gets next.
     * Returns the next variable
     * @return      next node
     */
    public Node<Patient> getNext(){
        
        return this.next;
    }
    /**
     * gets data.
     * Returns the data variable
     * @return      patient data
     */
    public Patient getData(){
 
        return this.data;
    }
    /**
     * Sets data in node.
     * Sets the data in a node using inputted
     * param.
     * @param data      the data to set
     */
    public void setData(Patient data){
        this.data = data;
        
    }  
    /**
     * Sets next in node.
     * Sets the next var in a node using inputted
     * param.
     * @param next      the next to set
     */
    public void setNext(Node<Patient> next) {
        this.next = next;
    }
   

}
