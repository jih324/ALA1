public class Person {
    //Data members
    protected String name;
    protected String address;
    protected String phone;
    protected String email;
    /***
     * Default constructor
     * No parameters
     * Initializes, name, address, phone, and email to the string "none"
     */
    public Person(){
        name = address = phone = email = "none";

    }
    /***
     * Constructor with four parameters
     * @param       name for the name of a person
     * @param       address for the address of a person
     * @param       phone for the phone number of a person
     * @param       email for the email address of a person
     */
    public Person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    /***
     * Getter for the name of a person
     * @param       no parameters
     * @return      the value of the data member name
     */
    public String getName(){
        return name;
    }
    /***
     * Getter for the address of a person
     * @param       no parameters
     * @return      the value of the data member address
     */
    public String getAddress(){
        return address;
    }
    /***
     * Getter for the phone of a person
     * @param       no parameters
     * @return      the value of the data member phone
     */
    public String getPhone(){
        return phone;
    }
    /***
     * Getter for the email of a person
     * @param       no parameters
     * @return      the value of the data member email
     */
    public String getEmail(){
        return email;
    }
    /***
     * Setter for the name of a person
     * @param       name to set the data member name
     * no return value
     */
    public void setName(String name){
        this.name = name;
    }
    /***
     * Setter for the address of a person
     * @param       address to set the data member name
     * no return value
     */
    public void setAddress(String address){
        this.address = address;
    }
    /***
     * Setter for the phone of a person
     * @param       phone to set the data member name
     * no return value
     */
    public void setPhone(String phone){
        this.phone = phone;
    }
    /***
     * Setter for the email of a person
     * @param       email to set the data member name
     * no return value
     */
    public void setEmail(String email){
        this.email = email;
    }
    /***
     * Method to get the Person information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    public String toString(){
        String out;
        out = String.format("Name: %s\nAddress: %s\nPhone: %s\nEmail: %s\n", name, address, phone, email);
        return out;
    }
    /***
	 * Method to compare two objects of type Person
	 * @param       Object to be compared with this object
	 * @return      true if the names of the two Person objects are equal
	 */
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person) obj;
            return (this.name.equals(p.name));
        }
        return false;
    }
}
