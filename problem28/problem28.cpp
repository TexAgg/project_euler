//
//  problem28.cpp
//  Problem 28
//
//  Created by Matt Gaikema on 6/30/15.
//  Copyright (c) 2015 Matt Gaikema. All rights reserved.
//

#include "problem28.h"

int corner_sum(int n)
{
    if (n==0)
        return 1;
    else
        return 4*(2*n+1)*(2*n+1) - 12*n + corner_sum(n-1);
}
