class Student_MO{
    public void avg(double  a, double b){
        System.out.println((a+b)/2);
    }
    public void avg(double a, double b, double c){
        System.out.println((a+b+c)/3);
    }
} 
void main() {
    Student_MO a = new Student_MO();
    a.avg(6.0,5.0);
    a.avg(5,6,7);
}