
#Compute and return the square root of x, using binary search approch 

def sqrtUsingBinarySearch(x):
    left = 1
    right = x

    while(left <= right):
        mid = left + int((right-left)/2)

        if(mid * mid == x):
            return mid
        if(mid * mid<x):
            left = mid+1
        else:
            right = mid-1

    return right

number = 12080
result = sqrtUsingBinarySearch(number)
