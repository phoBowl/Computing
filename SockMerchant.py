#!/bin/python3

import math
import os
import random
import re
import sys

# Function Description

# Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

# sockMerchant has the following parameter(s):

# n: the number of socks in the pile
# ar: the colors of each sock
# Input Format

# The first line contains an integer , the number of socks represented in .
# The second line contains  space-separated integers describing the colors  of the socks in the pile.


def sockMerchant(n, ar):
    dictionary = dict()
    for item in ar:
        if item not in dictionary:
            dictionary[item] = 1
        else:
            dictionary[item] += 1

    numberOfPairs = 0

    for key in dictionary:
        if dictionary[key] >= 2:
            numberOfPairs += math.floor(dictionary[key]/2)
    return numberOfPairs


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)

    fptr.write(str(result) + '\n')

    fptr.close()
