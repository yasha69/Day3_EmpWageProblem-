public class employeewageuc5 {
    public static void main(String[] arg) {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int PART_TIME_HOUR = 4;
        int WORKING_DAY_PER_MONTH =20;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == IS_FULL_TIME){
            int TOTAL_SALARY = (WAGE_PER_HOUR * FULL_DAY_HOUR * WORKING_DAY_PER_MONTH);
            System.out.println("TOTAL_SALARY" +TOTAL_SALARY);
        }
        else if (empcheck == IS_PART_TIME){
            int PART_TIME_SALARY = (WAGE_PER_HOUR * PART_TIME_HOUR * WORKING_DAY_PER_MONTH);
            System.out.println("PART_TIME_SALARY" +PART_TIME_SALARY);
        }
    }
}
