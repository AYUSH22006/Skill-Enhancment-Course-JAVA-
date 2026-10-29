
int factorial(int n) {
    if (n==0) return 1; // termination criteria
    return n * factorial(n-1);
}

void main() {
    IO.println(factorial(5));
}

