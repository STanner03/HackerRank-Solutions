#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'nearlySimilarRectangles' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts 2D_LONG_INTEGER_ARRAY sides as parameter.
#

def nearlySimilarRectangles(sides):
    # Write your code here
    i = 0
    count = 0
    sides_copy = sides.copy
    for sqr1 in sides:
        sides_copy.remove(i)
        for sqr2 in sides_copy:
            if sqr1[0]/sqr2[0] == sqr1[1]/sqr2[1]:
                count += 1;
        i += 1;
    return count;



if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    sides_rows = int(input().strip())
    sides_columns = int(input().strip())

    sides = []

    for _ in range(sides_rows):
        sides.append(list(map(int, input().rstrip().split())))

    result = nearlySimilarRectangles(sides)

    fptr.write(str(result) + '\n')

    fptr.close()
