//
//  problem14.cpp
//  Problem14
//
//  Created by Matt Gaikema on 6/7/15.
//  Copyright (c) 2015 Matt Gaikema. All rights reserved.
//

#include "problem14.h"

std::vector<int> collatz(int n)
{
    std::vector<int> chain;
    
    chain.push_back(n);
    
    do {
        if (n%2==0)
            n=n/2;
        else
            n = 3*n + 1;
        
        chain.push_back(n);
    } while (n!=1);
    
    return chain;
}

int collatzCount(long n)
{
    int count = 1;
    
    while (n>1)
    {
        if (n%2==0)
            n=n/2;
        else //if(n%2!=0)
            n = 3*n+1;
        
        count++;
    }
    
    return count;
}

bool belongs(int n, std::vector<int> list)
{
    bool flag = false;
    int i = 0;
    
    while(i < list.size() && !flag)
    {
        if (list[i] == n)
        {
            flag = true;
        }
        i++;
    }
    
    return flag;
}

int get_max_place(std::vector<int> list)
{
    int max = list[0];
    int place = 0;
    
    for (int i = 1; i < list.size(); i++)
    {
        if (list[i] >= max)
        {
            max = list[i];
            place = i;
        }
    }
    
    return place + 1;
}