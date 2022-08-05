public class employeewageuc6 {
    public static void main(String[] arg) {
        int WAGE_PER_HOUR= 20;
        int WORKING_DAY_PER_MONTH = 1;
        int WORKING_HOUR_PER_DAY = 8;
        while (WORKING_DAY_PER_MONTH <= 20) {
            int MONTHLYSALARY = WAGE_PER_HOUR * WORKING_DAY_PER_MONTH * WORKING_HOUR_PER_DAY;
            MONTHLYSALARY+=MONTHLYSALARY;
            WORKING_DAY_PER_MONTH++;
            System.out.println("MONTHLYSALARY" + MONTHLYSALARY);
        }
    }

}

