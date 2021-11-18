public class HomeWork3
{
    public static void main(String[] args)
    {
        System.out.println("Company Salary Report");
        int opt=2;
        switch (opt)
        {
            case 1:
                String name1 = "Yasir Hussain TS";
                System.out.println("Name :"+name1);
                System.out.println("Java Developer");

                int basicsalary1= 25000;
                System.out.println(basicsalary1);
                int year1=5;
                String a= "HRA";
                String b= "DA";

                if(year1>5)
                {
                    System.out.println("HRA AND DA Raise upto 20% and 15%");
                }
                else if (year1<5)
                {
                    System.out.println("HRA AND DA Down to 15% and 10% ");
                }
                break;

            case 2:
            {
                String name2 = "Mohammad Rakeeb";
                System.out.println("Name :"+name2);
                System.out.println("CITY COMMISSIONER");

                int basicsalary2= 25000;
                System.out.println(basicsalary2);
                int year2=10;
                String c= "HRA";
                String d= "DA";

                if(year2>10)
                {
                    System.out.println("HRA AND DA Raise up to 10% and 5%");
                }
                else if (year2<10)
                {
                    System.out.println("HRA AND DA Down to 5% and 5% ");
                }
                break;
            }




        }


    }
}
