package farmacia.People;


import Enums.EGender;

import java.time.LocalDate;

public abstract class Persona {

    private long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Enums.EGender EGender;
    private String telephone;



    protected Persona() {
    }


    protected Persona(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Enums.EGender getGender() {
        return EGender;
    }

    public void setGender(EGender EGender) {
        this.EGender = EGender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return
                "\nID: " + id +
                        "\nFirst name: " + firstName  +
                        "\nLast name: " + lastName;
    }
}

