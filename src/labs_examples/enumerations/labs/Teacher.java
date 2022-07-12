package labs_examples.enumerations.labs;

public class Teacher {
    private String teacherName;
    private int teacherSalary;
    private int teacherYearsExperience;

    public Teacher(String teacherName, int teacherSalary, int teacherYearsExperience){
        this.teacherName = teacherName;
        this.teacherSalary = teacherSalary;
        this.teacherYearsExperience = teacherYearsExperience;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(int teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public int getTeacherYearsExperience() {
        return teacherYearsExperience;
    }

    public void setTeacherYearsExperience(int teacherYearsExperience) {
        this.teacherYearsExperience = teacherYearsExperience;
    }

    @Override
    public String toString(){
        return "The salary for " + getTeacherName() + " is $" + getTeacherSalary() + ", and "  + getTeacherName() + "'s number of years teaching is "
                + getTeacherYearsExperience();
    }
}
