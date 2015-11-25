//
//  problem20.cpp
//  Problem20
//
//  Created by Matt Gaikema on 6/9/15.
//  Copyright (c) 2015 Matt Gaikema. All rights reserved.
//

#include "problem20.h"

signed short numStatus(int n)
{
    int c = sum_divisors(n);
    signed short status;
    
    if (n > c)
        status = -1;
    else if(n==c)
        status = 0;
    else //if(n < c)
        status = 1;
    
    return status;
}

bool isAbundant(int n)
{
    bool fool = false;;
    
    if (numStatus(n)==1)
        fool = true;
    
    return fool;
}

std::vector<int> abundants_below(int n)
{
    //int count = 0;
    //int limit = n;
    
    std::vector<int> surplus;
    
    for (int i = 1; i < n; i++)
    {
        if(isAbundant(i))
        {
           surplus.push_back(i);
            
            //count++;
        }
    }
    
    return surplus;
}

bool sumable(int n)
{
    bool ean = false;
    int a = 0;
    std::vector<int> huerta = abundants_below(n);
    
    while(!ean && a<huerta.size())
    {
        for(int i = 0; i < huerta.size(); i++)
        {
            if(n == huerta[i] + huerta[a])
                ean = true;
        }
        a++;
    }
    
    return ean;
}
