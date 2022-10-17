// Program To find a number is good or bad ;

import java.util.*;
/*
Class name :    GoodNumber
Description:    It Checks the Number is Good or Bad. The class contains two functions.
*/
class GoodNumber
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name :     IsGoodNumber
//  Description :       It checks the given number is divisible by 7  and it does not contain 7 as a digit in that number
//  Input Arguments :   Integer
//  Return :            Boolean
//  Author :            Payal Balasaheb Nimse
//  Date :              17/10/2022
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean IsGoodNumber(int Num)
    {
        boolean Check = false;
        if (Num%7==0 && IsDigit(Num)!= true)
        {
           Check=true;
        }
        return Check;
    }
    
/////////////////////////////////////////////////////////////////////////
//
//  Function Name :     IsDigit
//  Description :       It checks that given number contain 7 as a digit
//  Input Arguments :   Integer
//  Return :            Boolean
//  Author :            Payal Balasaheb Nimse
//  Date :              17/10/2022
//
////////////////////////////////////////////////////////////////////////

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

class Number // This is a main class
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
