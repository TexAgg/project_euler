//
//  problem19.cpp
//  Problem19
//
//  Created by Matt Gaikema on 6/9/15.
//  Copyright (c) 2015 Matt Gaikema. All rights reserved.
//

#include "problem19.h"

int daysOfMonth(int month, int year)
{
    int days;
    
    //January
    if (month == 1)
        days = 31;
   //February
    else if(month == 2)
    {
        //Leap year
        if (year % 4 ==0)
            days = 29;
        //Normal year
        else
            days = 28;
    }
    //March
    else if(month == 3)
        days = 31;
    //April
    else if(month == 4)
        days = 30;
    //May
    else if(month == 5)
        days = 31;
    //June
    else if(month == 6)
        days = 30;
    //July
    else if(month == 7)
        days = 31;
    //August
    else if(month == 8)
        days = 31;
    //September
    else if(month == 9)
        days = 30;
    //October
    else if(month == 10)
        days = 31;
    //November
    else if(month == 11)
        days = 30;
    //December
    else
        days = 31;
    
    return days;
    
}
