package ru.javawebinar.basejava;

public class Resume {
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String resumeBody;

    public Resume(String name, String lastName, String email, String phoneNumber, String resumeBody) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.resumeBody = resumeBody;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getResumeBody() {
        return resumeBody;
    }

    public void setResumeBody(String resumeBody) {
        this.resumeBody = resumeBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Resume)) return false;

        Resume resume = (Resume) o;

        return (getName() != null ? getName().equals(resume.getName()) : resume.getName() == null)
                && (getLastName() != null ? getLastName().equals(resume.getLastName()) : resume.getLastName() == null)
                && (getEmail() != null ? getEmail().equals(resume.getEmail()) : resume.getEmail() == null)
                && (getPhoneNumber() != null ? getPhoneNumber().equals(resume.getPhoneNumber()) : resume.getPhoneNumber() == null)
                && (getResumeBody() != null ? getResumeBody().equals(resume.getResumeBody()) : resume.getResumeBody() == null);
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getPhoneNumber() != null ? getPhoneNumber().hashCode() : 0);
        result = 31 * result + (getResumeBody() != null ? getResumeBody().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", resumeBody='" + resumeBody + '\'' +
                '}';
    }
}
