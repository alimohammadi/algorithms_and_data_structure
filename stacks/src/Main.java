public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);


        stack.push(new Employee("Jane", "Jones",123));
        stack.push(new Employee("Jane2", "Jones2",123));
        stack.push(new Employee("Jane3", "Jones3",123));
        stack.push(new Employee("Jane4", "Jones4",123));
        stack.push(new Employee("Jan5", "Jones5",123));
        stack.push(new Employee("Jan6", "Jones6",123));

//        stack.printStack();
        System.out.println(stack.peek());
        System.out.println("Popped: " + stack.pop());
    }
}