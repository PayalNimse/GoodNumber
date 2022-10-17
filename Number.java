import java.util.*;

class GoodNumber
{

    public boolean IsGoodNumber(int Num)
    {
        boolean Check = false;
        if (Num%7==0 && IsDigit(Num)!= true)
        {
           Check=true;
        }
        return Check;
    }
    

    public boolean IsDigit(int Num)
    {
        boolean flag = false;
        int iDigit =0;
        while (Num>0)
        {
            iDigit = Num%10;
            if(iDigit==7)
                flag=true;
            Num = Num/10; 
        }
        return flag;
    }
}

class Number
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int Num=0;
        boolean flag=false;
        Num = sobj.nextInt();
        GoodNumber mobj = new GoodNumber();
        flag = mobj.IsGoodNumber(Num);
        System.out.println(flag);
    }
}