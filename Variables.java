public class Variables {
    public static void main(String[] args) {
        System.out.println("Works");
        /*
        Variables -containers that hold data
        Syntax- type variableName = value;
        type:
            Numerical:
                byte -1 byte = -127--+127
                short-2 bytes=32767
                int - 4 bytes =2b
                long- 8 bytes=
                float - 4 bytes = 6-7 decimal
                double - 8 bytes =15-17 decimal

            boolean - true/ false
            char  - 'A'
            String-"James"

        */

            byte by=127;
            short sh =2000;
            int age=49; //2.1b
            long fileSize=483767839484L;

            float price=45.67f;
            double avg= 34532.6363;
            boolean isStudent=true;
            char grade='B';
            String name="James";
// automatic conversion from byte to an int
// age=by;
// by=age;

            System.out.println(name+" has a mean grade of "+grade+"  and is "+age+" years old"+isStudent);



//casting - user enforces
// targetDataType varName = (targetDataType) otherDataType;

        System.out.println(age);
        byte newByte=(byte)age;
        System.out.println(newByte);
        final String num="67t ";
        double numD=34983.5;
        int num1 =(int)numD;
        int num2=4;
        double num3=(double)num2;
        final float pi=3.14f;
        System.out.println(pi);
    }
}
