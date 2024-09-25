// GENRIC : this will be discussed in DSA : we are going to prepare this topic on thursday 



// 1. Generic Interface
interface GenericInterface<T> {
    T performAction(T input);  // A method that works with a generic type T
}

// 2. Generic Class
class GenericClass<T> {
    private T data;

    // 3. Generic Constructor
    public GenericClass(T data) {
        this.data = data;
    }

    // Generic Getter
    public T getData() {
        return data;
    }

    // Generic Setter
    public void setData(T data) {
        this.data = data;
    }

    // 4. Generic Method
    public <U> void printData(U item) {
        System.out.println("Printing item of type: " + item.getClass().getName());
        System.out.println("Value: " + item);
    }
}

// 5. Implementing the Generic Interface
class ActionClass implements GenericInterface<String> {
    @Override
    public String performAction(String input) {
        return "Processed: " + input;
    }
}

public class Main {
    public static void main(String[] args) {
        // 6. Using the Generic Class with Integer
        GenericClass<Integer> intObject = new GenericClass<>(100);
        System.out.println("Integer data: " + intObject.getData());

        // Using the Generic Method with String
        intObject.printData("Hello Generics!");

        // Using the Generic Method with a Double
        intObject.printData(25.67);

        // 7. Using the Generic Class with String
        GenericClass<String> stringObject = new GenericClass<>("Generic Example");
        System.out.println("String data: " + stringObject.getData());

        // 8. Using the Generic Interface Implementation
        ActionClass action = new ActionClass();
        System.out.println(action.performAction("Hello"));

        // Changing data in the generic class
        stringObject.setData("New Data");
        System.out.println("Updated String data: " + stringObject.getData());
    }
}
