public class Student extends Person{
    //Data members
    protected int id;
    protected String major;
    /***
     * Default constructor
     * No parameters
     * Initializes, major to the integer 0 and id to the string "none"
     */
    public Student(){
        super();
        id = 0;
        major = "none";
    }
    /***
     * Constructor with six parameters
     * @param       name for the name of a person
     * @param       address for the address of a person
     * @param       phone for the phone number of a person
     * @param       email for the email address of a person
     * @param       id for the ID of a person
     * @param       major for the major of a person
     */
    public Student(String name, String address, String phone, String email, int id, String major){
        super(name, address, phone, email);
        this.id = id;
        this.major = major;
    }
    /***
     * Getter for the ID of a person
     * @param       no parameters
     * @return      the value of the data member id
     */
    public int getID(){
        return id;
    }
    /***
     * Getter for the major of a person
     * @param       no parameters
     * @return      the value of the data member major
     */
    public String getMajor(){
        return major;
    }
    /***
     * Setter for the name of a person
     * @param       ID to set the data member id
     * no return value
     */
    public void setID(int id){
        this.id = id;
    }
    /***
     * Setter for the major of a person
     * @param       major to set the data member major
     * no return value
     */
    public void setMajor(String m){
        this.major = m;
    }
    /***
     * Method to get the Student information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    @Override
    public String toString(){
        String out;
        out = super.toString() + String.format("ID: %s\nMajor: %s\n", id, major);
        return out;
    }
}
