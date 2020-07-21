"""Implement quick sort in Python.
Input a list.
Output a sorted list."""


def partition(arr, low, high):
    i = low-1
    pivot = arr[high]

    for j in range(low, high):
        if arr[j] <= pivot:
            i = i+1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i+1], arr[high] = arr[high], arr[i+1]
    return (i+1)


def quickSortHelper(array, lo, hi):
    if lo < hi:
        pi = partition(arr, low, high)
    quickSort(arr, low, pi-1)
    quickSort(arr, pi+1, high)


def quicksort(array):
    # Your code goes here
    return quickSortHelper(array, 0, len(array) - 1)
