package labs_examples.enumerations.labs;

public class NewHireController {
    public static void main(String[] args) {
        Teacher teacherOne = new Teacher("Mary", Salaries.NoExperience.getSalary(), Salaries.NoExperience.getYearsExperience());
        System.out.println(teacherOne.toString());

        Teacher teacherTwo = new Teacher("Mark", Salaries.TwoYears.getSalary(), Salaries.TwoYears.getYearsExperience());
        System.out.println(teacherTwo.toString());

        Teacher teacherThree = new Teacher("Marissa", Salaries.ThreeYears.getSalary(), Salaries.ThreeYears.getYearsExperience());
        System.out.println(teacherThree.toString());

        Teacher teacherFour = new Teacher("Michael", Salaries.FourYears.getSalary(), Salaries.FourYears.getYearsExperience());
        System.out.println(teacherFour.toString());

        Teacher teacherFive = new Teacher("Marge", Salaries.FiveYears.getSalary(), Salaries.FiveYears.getYearsExperience());
        System.out.println(teacherFive.toString());
    }
}
