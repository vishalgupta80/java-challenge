package Challenge;

public class isLeapYear {
    public static void main(String[] args){
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(2, 2018));

    }
    public static boolean isLeapYear(int year){
        if (year<1 || year >9999){
            return false;

        }else {
            if ((year %4== 0) && year % 100 != 0 || year % 400 == 0){
                return true;
            }else {
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int  year){
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }else {
            switch (month){
                case 1:
                    return 31;
                case 2:
                   // boolean isleapYear = isLeapYear(year);
                    if (isLeapYear(year) == true){
                        return 29;
                    }else {
                        return 28;
                    }
                case 3:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 5: case 7: case 8: case 10: case 12:
                    return 31;
                default:
                    return -1;

            }
        }
    }
}
