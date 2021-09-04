public class Faculty extends Employee {
    //Data members
    protected String rank;
    /***
     * Default constructor
     * No parameters
     * Initializes, rank to the string "none"
     */
    public Faculty(){
        super();
        rank = "none";
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
     * @param       rank for the rank of a person
     */
    public Faculty(String name, String address, String phone, String email, int id, String position, double salary, String rank){
        super(name, address, phone, email, id, position, salary);
        this.rank = rank;
    }
    /***
     * Getter for the rank of a person
     * @param       no parameters
     * @return      the value of the data member rank
     */
    public String getRank(){
        return rank;
    }
    /***
     * Setter for the name of a person
     * @param       rank to set the data member rank
     * no return value
     */
    public void setRank(String rank){
        this.rank = rank;
    }
    /***
     * Method to get the Faculty information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    @Override
    public String toString(){
        String out;
        out = super.toString() + String.format("ID: %s\nRank: %s\n", id, rank);
        return out;
    }
}
