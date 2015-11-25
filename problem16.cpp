//
//  problem16.cpp
//  Problem16
//
//  Created by Matt Gaikema on 6/9/15.
//  Copyright (c) 2015 Matt Gaikema. All rights reserved.
//

#include "problem16.h"
//#include <math.h>

long digitSum(long long n)
{
    long max = log10(n);
    
    long sum = 0;
    
    for(int i = 0; i <= max; i++)
    {
        sum+= pow(10, -i) * (n % (int)pow(10, i+1) - n % (int)pow(10, i));
    }
    
    return sum;
}