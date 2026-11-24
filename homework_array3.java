class UniversityMember {
    int memberId;

    UniversityMember(int memberId) {
        this.memberId = memberId;
    }

    void checkIn() {
        System.out.println("Member checked in");
    }
}

class Staff extends UniversityMember {
    String department;

    Staff(int memberId, String department) {
        super(memberId);
        this.department = department;
    }

    void attendMeeting() {
        System.out.println("Staff attending meeting");
    }
}

class Professor extends Staff {
    String subject;

    Professor(int memberId, String department, String subject) {
        super(memberId, department);
        this.subject = subject;
    }

    void conductLecture() {
        System.out.println("Professor conducting lecture in " + subject);
    }
}

class AdminOfficer extends Staff {
    String officeRoom;

    AdminOfficer(int memberId, String department, String officeRoom) {
        super(memberId, department);
        this.officeRoom = officeRoom;
    }

    void processFiles() {
        System.out.println("Admin officer processing files in " + officeRoom);
    }
}

public class homework_array3 {
    public static void main(String[] args) {
        Professor professor = new Professor(101, "Computer Science", "Java");
        AdminOfficer adminOfficer = new AdminOfficer(202, "Administration", "A-12");

        professor.checkIn();
        professor.attendMeeting();
        professor.conductLecture();

        adminOfficer.checkIn();
        adminOfficer.attendMeeting();
        adminOfficer.processFiles();
    }
}