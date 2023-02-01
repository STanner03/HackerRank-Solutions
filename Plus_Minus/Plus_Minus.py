#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Write your code here
    gt = 0
    et = 0
    lt = 0
    count = 0
    for a in arr:
        count += 1
        if a > 0:
            gt += 1;
        elif a < 0:
            lt += 1;
        else:
            et += 1;
    answer = gt / count;
    answer2 = lt / count;
    answer3 = et / count;
    # lt / count, 
    # et / count;
    print(round(answer, 6))
    print(round(answer2, 6))
    print(round(answer3, 6))


if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
