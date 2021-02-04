/*
    Queue class to add, remove, and deliver
    pizzas of the Pizza type. Originally,
    I had planned on separating the enqueue,
    dequeue, and deliver methods. However, I
    decided to try and follow the instructions
    for the assignment closely and opted to
    not refactor the code in such a way.
 */

public class Queue
{
    public Queue(Pizza first, Pizza last)
    {
        this.first = first;
        this.last = last;
    }

    public void enqueue(Pizza insertPizza)
    {
        if(first == null) { first = insertPizza; } // Tried to keep one line functions
        else { last.next = insertPizza; }           // and also keep formatting consistent

        last = insertPizza;
    }

    public Pizza dequeue()
    {
        // Create object for comparison
        Pizza pizzaToDeliver = null;

        if(first != null)
        {
            pizzaToDeliver = first;
            first = first.next; // How am I supposed to document Java code lol
        }
        if(first == null) { last = null; }

        return pizzaToDeliver;

    }

    public void deliver()
    {
        Pizza deliveryPizza = dequeue();
        if(deliveryPizza == null)
        {
            System.out.println("No deliveries pending\n");
            return;
        }
        System.out.println("Deliver a pizza with " +
                        deliveryPizza.chosen_ingredients + " to " +
                        deliveryPizza.provided_address + "\n");
    }

    public Pizza first; // We declare things at the bottom in Java apparently?
    public Pizza last;
}
