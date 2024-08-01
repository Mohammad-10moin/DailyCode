public class Number_of_Senior_Citizens_2678 {
//    easy
    public static void main(String[] args) {
        String[]details={"7868190130M7522","5303914400F9211","9273338290F4010"};
        int count=0;
        for (String detail : details) {
//        for (int i=0;i<details.length ;i++ ){
//            if(Integer.valueOf(details[i].substring(11,13))>60){
            if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                count++;
            }

        }
        System.out.println(count);
    }
}
