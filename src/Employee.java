class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + " earns " + String.format("%.2f", salary) + " tenge";
    }

    public String getPosition() {
        return position;
    }

    public double getPaymentAmount() {
        return salary;
    }
}
