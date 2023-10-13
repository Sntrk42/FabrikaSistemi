public class Employee {
    String name;
    String surname;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, String surname, double salary, int workHours, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax(){
        if(salary <= 1000){
          return 0;
        }else return salary * 0.03;
    }

    public double bonus(){
        if (workHours > 40){
            int extraHours = workHours - 40;
            return extraHours * 30;
        }else return 0;
    }

    public double raiseSalary(){
        int currentYear = 2021;
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10){
            return salary * 105/100;
        } else if (yearsWorked > 9 && yearsWorked < 20) {
            return salary * 110 / 100;
        }
        else return salary * 115 / 100;
    }

    public double calculateSalary(){
        return salary - tax() + bonus() + raiseSalary();
    }

    public String toString(){
        return "Adı: " + name + "\nSurname: " + surname + "\nMaaşı: " + salary + "\nÇalışma saati: " + workHours +
                "\nBaşlangıç yılı: " + hireYear + "\nVergi: " + tax() + "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + raiseSalary() + "\nVergile ve bonuslar ile birlikte maaş: "
                + (salary - tax() + bonus()) + "\nToplam maaş: " + calculateSalary();
    }
}

