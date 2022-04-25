package farmacia.People;

import Enums.ESpeciality;

import java.util.Objects;

public class Farmaceutico extends Empleado implements Runnable {

        private ESpeciality speciality;


        public Farmaceutico() {
        }

        public Farmaceutico(long id, String firstName, String lastName,ESpeciality speciality) {
            super(id, firstName, lastName);

            this.speciality = speciality;
        }

        public ESpeciality getSpeciality() {
        return speciality;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Farmaceutico doctor)) return false;
        return getSpeciality() == doctor.getSpeciality();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeciality());
    }

    @Override
    public String toString() {
        return "\nFarmaceutico Information:" +
                super.toString() +
                "\nSpeciality: " + speciality.getSpecialty() + "\n";
    }

    @Override
    public void run() {
        System.out.println("Farmaceutico " + super.getFirstName() + " " + super.getLastName() + " esta en turno.");
    }

        }



