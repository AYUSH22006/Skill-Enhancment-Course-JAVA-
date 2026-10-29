
void printNum(int n) {
    if (n==0) return;
    IO.println(n);
    printNum(n-1);
}

void main() {
    printNum(5);
}

