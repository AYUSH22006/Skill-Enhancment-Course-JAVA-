class Method_Overloading{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
}

void main() {
    Method_Overloading a = new Method_Overloading();
    a.add(6,5);
    a.add(5,6,7);
    a.add(0.1,0.2);
}