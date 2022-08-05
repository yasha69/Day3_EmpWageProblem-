public class employeewageuc2 {
    public static void main(String[] arg) {
        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME){
            int TOTAL_SALARY = (WAGE_PER_HOUR * FULL_DAY_HOUR);
            System.out.println("TOTAL_SALARY" +TOTAL_SALARY);

        }
        else{
            System.out.println("Salary is 0");
        }

    }

}
