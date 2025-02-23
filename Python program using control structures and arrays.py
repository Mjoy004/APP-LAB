def find_max(arr):
    max_val = arr[0]
    for num in arr:
        if num > max_val:
            max_val = num
    return max_val

def find_min(arr):
    min_val = arr[0]
    for num in arr:
        if num < min_val:
            min_val = num
    return min_val

def main():
    numbers = [int(x) for x in input("Enter numbers separated by space: ").split()]
    
    print("Maximum value:", find_max(numbers))
    print("Minimum value:", find_min(numbers))
    
    even_numbers = [num for num in numbers if num % 2 == 0]
    print("Even numbers:", even_numbers)
    
    odd_numbers = [num for num in numbers if num % 2 != 0]
    print("Odd numbers:", odd_numbers)

if __name__ == "__main__":
    main()
