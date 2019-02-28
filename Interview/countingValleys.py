#!/bin/python3

import math
import os
import random
import re
import sys

# Function Description

# Complete the countingValleys function in the editor below. It must return an integer that denotes the number of valleys Gary traversed.

# countingValleys has the following parameter(s):

# n: the number of steps Gary takes
# s: a string describing his path
# Input Format

# The first line contains an integer , the number of steps in Gary's hike.
# The second line contains a single string , of  characters that describe his path.


def countingValleys(n, s):
    valleyCounter = 0
    seaLevel = 0
    isGoingUp = False
    for char in s:
        if char == 'U':
            seaLevel += 1
            isGoingUp = True
        elif char == 'D':
            seaLevel -= 1
            isGoingUp = False

        if(seaLevel == 0 and isGoingUp is True):
            valleyCounter += 1
            isBelowSeaLevel = False
    return valleyCounter


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    s = input()

    result = countingValleys(n, s)

    fptr.write(str(result) + '\n')

    fptr.close()
