package farmacia;

public abstract class persona {

    private String Name;
    private int Age;


    //Constructor

    persona(){

    }

    persona( String Name, int Age){

        this.setName(Name);
        this.setAge(Age);


    }

    //Setters


    public void setAge(int age) {
        this.Age = age;
    }



   public void setName(String Name){
        this.Name = Name;
   }



    // Getters



    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }


    // Method

    @Override
    public String toString() {
        return "Persona[ " + " Name='"+ this.getName() +", Age='"+ this.getAge() + '}';
    }

}

