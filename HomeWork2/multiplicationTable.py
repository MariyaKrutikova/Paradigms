# Условие
# На вход подается число n.
# Задача
# Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
# Обоснуйте выбор парадигм.

print("Введите число")
N = int(input())

for j in range (1, N+1):
    for i in range (1, 10):
        print(j,"*", i, "=", j*i)
    print()
