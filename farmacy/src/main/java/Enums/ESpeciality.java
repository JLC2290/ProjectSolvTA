package Enums;

public enum ESpeciality {

    PER_FAC ("Personal Facultativo"),
    PER_TEC ("Personal Tecnico"),
    PER_AUX("Personal Auxiliar");

    private final String specialtyName;

    ESpeciality(String specialty) { this.specialtyName = specialty;}

    public String getSpecialty() {
        return specialtyName;
    }
}