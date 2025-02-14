# Prime-number-java-code-
Explanation 
1. User Input:
•	The program uses a Scanner object to read the number entered by the user.
•	It prompts the user with the message "Enter a number: ", then stores the input in the variable number.
2. Prime Check:
•	The isPrime(int n) method is responsible for checking if a number n is prime.
•	Edge Case Handling: 
o	If the input number n is less than or equal to 1 (i.e., n <= 1), it directly returns false because prime numbers are defined as integers greater than 1.
•	Prime Logic: 
o	The program checks whether the number n is divisible by any integer between 2 and Math.sqrt(n) (inclusive).
o	The reason for checking only up to the square root of n is that if n can be factored into two numbers a and b (i.e., n = a * b), at least one of the factors must be less than or equal to the square root of n. This reduces the number of checks significantly and improves performance.
•	If any divisor is found, the method returns false because the number is not prime.
•	If no divisors are found, it returns true, indicating that the number is prime.
3. Output:
•	After the prime check, the result is printed: 
•	If the number is prime, it prints "X is a prime number."
•	If the number is not prime, it prints "X is not a prime number."
4. Closing the Scanner:
•	The scanner.close() is called to release the resources associated with Edge Cases:
1.	Input 1: Since 1 is not a prime number, the output will be: "1 is not a prime number."
2.	Input 0: Since 0 is not prime, the output will be: "0 is not a prime number."
3.	Prime Numbers: For prime numbers like 2, 3, 5, 7, etc., the program will correctly identify them as prime.
