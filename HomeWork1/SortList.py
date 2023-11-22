def sort_list_imperative(numbers):
    for i in range(len(numbers)-1):
        for j in range(len(numbers)-i-1):
            if numbers[j] > numbers[j+1]:
                temp = numbers[j]
                numbers[j] = numbers[j+1]
                numbers[j+1] = temp
    return numbers
numbers1 = [2, 55, 7, 0, 43]
print(sort_list_imperative(numbers1))


def sort_list_declar(numbers):
    numbers.sort()
    return numbers
numbers2 = [5, 7, 2, 9]
print(sort_list_declar(numbers2))
