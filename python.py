def insertionSort(arr):
    
    n = len(arr)
      
    if n <= 1:
        return 
 
    for i in range(1, n):
        key = arr[i]
        j = i-1
        while j >= 0 and key < arr[j]:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = key

if __name__ == "__main__":
    arr = [2, 4, 1, 8, 6, 9, 7]
    print("Unsorted array")
    print(arr)
    insertionSort(arr)
    print("Sorted array")
    print(arr)