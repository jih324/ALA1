public class Employee extends Person {
    //Data members
    protected int id;
    protected String position;
    protected double salary;
    /***
     * Default constructor
     * No parameters
     * Initializes, id to the integer 0, position to the string "none", and salary to the double 0.0
     */
    public Employee(){
        super();
        id = 0;
        position = "none";
        salary = 0.0;
    }
    /***
     * Constructor with six parameters
     * @param       name for the name of a person
     * @param       address for the address of a person
     * @param       phone for the phone number of a person
     * @param       email for the email address of a person
     * @param       id for the ID of a person
     * @param       position for the major of a person
     * @param       salary for the salary of a person
     */
    public Employee(String name, String address, String phone, String email, int id, String position, double salary){
        super(name, address, phone, email);
        this.id = id;
        this.position = position;
        this.salary = salary;
    }
    /***
     * Getter for the id of a person
     * @param       no parameters
     * @return      the value of the data member id
     */
    public int getID(){
        return id;
    }
    /***
     * Getter for the position of a person
     * @param       no parameters
     * @return      the value of the data member position
     */
    public String getPosition(){
        return position;
    }
    /***
     * Getter for the salary of a person
     * @param       no parameters
     * @return      the value of the data member salary
     */
    public double getSalary(){
        return salary;
    }
    /***
     * Setter for the id of a person
     * @param       id to set the data member id
     * no return value
     */
    public void setID(int id){
        this.id = id;
    }
    /***
     * Setter for the position of a person
     * @param       position to set the data member position
     * no return value
     */
    public void setPosition(String p){
        this.position = p;
    }
    /***
     * Setter for the salary of a person
     * @param       salary to set the data member salary
     * no return value
     */
    public void setSalary(double s){
        this.salary = s;
    }
    /***
     * Method to get the Employee information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    @Override
    public String toString(){
        String out;
        out = super.toString() + String.format("ID: %s\nPosition: %s\nSalary: $%s\n", id, position, salary);
        return out;
    }
}
