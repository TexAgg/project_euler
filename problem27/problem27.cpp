//
//  problem27.cpp
//  Problem27
//
//  Created by Matt Gaikema on 6/30/15.
//  Copyright (c) 2015 Matt Gaikema. All rights reserved.
//

#include "problem27.h"

int quadratic(int a,int b, int c, int n)
{
    int p = a * pow(n, 2) + b*n + c;
    
    return p;
}

int consecutive_length(int a, int b)
{
    int i = 0;
    
    do
     {
         quadratic(1, a, b, i);
         
         i++;
     }
    while(isPrime(quadratic(1, a, b, i)));
    
    return i;
}
