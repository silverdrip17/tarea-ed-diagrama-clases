package ejercicio3;

public class Customer {
	public String name;
    public String surname;
    protected int age;
    private boolean single;
    private String country;

    // Constructor público vacío
    public Customer() {
    }

    // Método público toString que devuelve un String
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", single=" + single +
                ", country='" + country + '\'' +
                '}';
    }

    // Método privado llamado doSomething
    private void doSomething() {
        // Código para hacer algo
    }
}
