import java.util.Stack;

public class StackExample {
    public static void main (String[]args) {
        Stack<String> stack = new Stack<>();
        
        //Check if the stack is empty

        System.out.println("Is the stack empty? " + stack.isEmpty());

        //Add items on stack

        stack.push("Minecraft");
        stack.push("GTA");
        stack.push("Delta Force");
        stack.push("Hit Man");

        //Print items in the stack

        System.out.println(" ");
        System.out.println("List the Names of Games in the stack: "+stack);

        //Pop method
        //Remove the topmost item on the stack

        stack.pop();
        System.out.println(" ");
        System.out.println("How many items remain in the stack after pop are: " +stack);

        //Check the object at  the top the stack using peek method 
        //Print out the stack 

        System.out.println(" ");
        System.out.println("The item at the top of the stack is: " + stack.peek());

        //Find an object at the stack using the stack.search method

        System.out.println(" ");
        System.out.println("Position: "+ stack.search("GTA") + " ,Is the index of the object ");

        //Add 100 items in a stack using a for loop

        for (int i = 0; i < 9; i++){
            stack.push(" The Witcher");
        }

        System.out.println("All the Items in the stack are: "+stack);

    }
    
}
