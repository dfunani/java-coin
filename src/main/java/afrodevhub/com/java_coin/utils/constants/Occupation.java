package afrodevhub.com.java_coin.utils.constants;

public enum Occupation {

    SOFTWARE_ENGINEER("Software Engineer"),
    HARDWARE_ENGINEER("Hardware Engineer"),
    ELECTRICAL_ENGINEER("Electrical Engineer"),
    MECHANICAL_ENGINEER("Mechanical Engineer"),
    CIVIL_ENGINEER("Civil engineer"),
    BIOMEDICAL_ENGINEER("Biomedical Engineer"),
    DOCTOR("Doctor"),
    NURSE("Nurse"),
    TEACHER("Teacher"),
    PROFESSOR("Professor"),
    ARTIST("Artist"),
    MUSICIAN("Musician"),
    WRITER("Writer"),
    ACCOUNTANT("Accountant"),
    LAWYER("Lawyer"),
    POLICE_OFFICER("Police Officer"),
    FIREFIGHTER("Firefighter"),
    CHEF("Chef"),
    ARCHITECT("Architect"),
    SCIENTIST("Scientist"),
    STUDENT("Student"),
    RETIREE("Retiree"),
    ENTREPRENEUR("Entrepreneur"),
    ATHLETE("Athlete"),
    JOURNALIST("Journalist"),
    DESIGNER("Designer"),
    PHARMACIST("Pharmacist"),
    SOCIAL_WORKER("Social Worker"),
    OTHER("Other");

    private final String occupation;

    Occupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return this.occupation;
    }
}
