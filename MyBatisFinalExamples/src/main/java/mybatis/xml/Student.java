package mybatis.xml;

/**
 * mysql>
 * <p>
 * DROP TABLE IF EXISTS details.student;
 * <p>
 * CREATE TABLE  details.student(
 * ID int(10) NOT NULL AUTO_INCREMENT,
 * NAME varchar(100) NOT NULL,
 * BRANCH varchar(255) NOT NULL,
 * PERCENTAGE int(3) NOT NULL,
 * PHONE int(10) NOT NULL,
 * EMAIL varchar(255) NOT NULL,
 * PRIMARY KEY ( ID )
 * );
 */

public class Student {
    private int id;
    private String name;
    private String branch;
    private int percentage;
    private int phone;
    private String email;

    public Student(String name, String branch, int percentage, int phone, String email) {
        super();
        this.name = name;
        this.branch = branch;
        this.percentage = percentage;
        this.phone = phone;
        this.email = email;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}