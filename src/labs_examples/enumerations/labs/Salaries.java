package labs_examples.enumerations.labs;

public enum Salaries {
    NoExperience(40_000, 0),
    OneYear(42_000, 1),
    TwoYears(43_000, 2),
    ThreeYears(44_000, 3),
    FourYears(47_000, 4),
    FiveYears(55_000, 5);

    private int salary;
    private int yearsExperience;
    Salaries(int salary, int yearsExperience){
        this.salary = salary;
        this.yearsExperience = yearsExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public static final double retirementPercentage = 0.05;

    public static final double federalIncomeTax = 0.25;
    double takeHomeSalary(){
        double firstDeduction = salary - (salary * retirementPercentage);
        //take home salary will be the salary minus the retirement times the salary minus that new salary times the
        // income tax, and then add 2% times years exp to original salary as bonus for retainment
        return firstDeduction - (firstDeduction * federalIncomeTax) + (0.02 * yearsExperience * salary);
    }
}
