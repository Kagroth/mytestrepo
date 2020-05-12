def bubbleSort(arr):
    n = len(arr)

    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]


nums = [1, 6, 4, 2, 9, 5]
print("Przed sortowaniem: {}".format(nums))
bubbleSort(nums)
print("Po sortowaniu: {}".format(nums))
