//
//  problem21.cpp
//  Problem21
//
//  Created by Matt Gaikema on 6/7/15.
//  Copyright (c) 2015 Matt Gaikema. All rights reserved.
//

#include "problem21.h"

unsigned int sum_divisors(unsigned int n)
{
    //The sum of the divisors
    unsigned int sum = 0;
   
    //Counter cannot start at 0
    unsigned int i = 1;
    
    while (i < n)
    {
        //If remainder is 0, add i to sum
        if(n % i == 0)
        {
            sum+=i;
        }
       
        i++;//increment i
    }
    
    return sum;
}

unsigned int sum_amicable_pairs(unsigned int low, unsigned int high)
{
    unsigned int a = low,
                 b,
                 sum = 0;
    
    while(a < high)
    {
        b = sum_divisors(a);
        
        if(b > a && sum_divisors(b) == a)
            sum+= b + a;
        
        a++;
    }
    
    return sum;
}
