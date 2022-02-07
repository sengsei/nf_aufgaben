package de.neuefische.day6.model;

public class Student {
    private String firstname;
    private String lastname;
    private String matNr;
    private boolean enrolled;

    public Student(){

    }

    public Student(String firstname, String lastname, String matNr, boolean enrolled) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.matNr = matNr;
        this.enrolled = enrolled;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMatNr() {
        return matNr;
    }

    public void setMatNr(String matNr) {
        this.matNr = matNr;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", matNr='" + matNr + '\'' +
                ", enrolled=" + enrolled +
                '}';
    }
}
