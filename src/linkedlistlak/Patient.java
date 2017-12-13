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
public class Patient implements Comparable
{

    private String firstName;
    private String lastName;
    private int priority;

    public void Patient()
    {

    }

    public void Patient(String firstName, String lastName, int priority)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.priority = priority;
    }

    public String toString(Node n)
    {
        return null;

    }

    @Override
    public int compareTo(Object o)
    {
        Patient p = (Patient) o;
        if (priority > p.getPriority())
        {
            return priority;///////////////something
        } else if (priority < p.getPriority())
        {
            return p.getPriority();/////////something
        } else
        {
            if (p.getLastName().compareTo(lastName) > 0)
            {
                ///return something
            } else if (p.getLastName().compareTo(lastName) < 0)
            {
                ///return something
            } else
            {
                if (p.getFirstName().compareTo(firstName) > 0)
                {
                    ///return something
                } else if (p.getFirstName().compareTo(firstName) < 0)
                {
                    ///return something
                } else
                {
                    ///return same;
                }
            }
        }
        return 0;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

}
