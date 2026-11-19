import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Employee(String n, int a) {
        name = n;
        age = a;
    }
}

public class SerializeDemo {
    static void serialize(Employee e, String file) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(e);
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    static Employee deserialize(String file) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {
            return (Employee) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Employee[] list = {
            new Employee("John", 30),
            new Employee("Sari", 25),
            new Employee("Budi", 41)
        };

        for (int i = 0; i < list.length; i++) {
            String f = "emp" + i + ".ser";
            serialize(list[i], f);
            Employee r = deserialize(f);
            if (r != null)
                System.out.println("Deserialized: " + r.name + ", " + r.age);
        }
    }
}
