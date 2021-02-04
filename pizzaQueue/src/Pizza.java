/*
   This is assignment #1 for Dr. King's OOP
   class, spring 2021. The instructions will be
   contained in the readme.txt file
   Pizza class to initialize and update information
   regarding the customer's order info, and a main
   to drive the program
*/
public class Pizza
{

    // If both ingredients and address are given
    // Initially wanted to write multiple constructors
    // in order to take in only ingredients, or only address,
    // maybe even a case with neither ingredients nor address
    // initially given. I decided to follow the assignment
    // instructions instead of refactoring the code this way.
    public Pizza(String ingredients, String address)
    {
        this.chosen_ingredients = ingredients;
        this.provided_address = address;
    }


    public static void main(String[] args)
    {
        Pizza first = null;
        Pizza last = null;

        Queue queueContents = new Queue(first, last);
        queueContents.enqueue(new Pizza("pepperoni", "1234 Bobcat Trail"));
        queueContents.enqueue(new Pizza("sausage", "2345 University Drive"));
        queueContents.deliver();
        queueContents.enqueue(new Pizza("extra cheese", "3456 Rickster Road"));
        queueContents.enqueue(new Pizza("everything", "4567 King Court"));
        queueContents.enqueue(new Pizza("coffee beans", "5678 Java Circle"));
        queueContents.deliver();
        queueContents.deliver();
        queueContents.deliver();
        queueContents.deliver();
        queueContents.deliver();

    }

    public String provided_address;
    public String chosen_ingredients;
    public Pizza next;
}
