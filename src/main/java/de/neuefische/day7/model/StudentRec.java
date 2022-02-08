package de.neuefische.day7.model;

public record StudentRec(String firstname, String lastname, int id) {

    public StudentRec changeFirstName(String newFirstname) {
        return new StudentRec(newFirstname, lastname, id);
    }
}
