// Write a java program to find the area and volume of the square. Formulas are Area = 4*PI*R*R Volume = 4/3*PI*R*R*R.

class areaandvolume {
    public static void main(String[] args) {
        double area, volume;
        int r=15;
        double PI;
        PI=3.14;
        area = 4*PI*r*r;
        System.out.println("Area Of A Square is "+area);
        volume = 4/3*PI*r*r*r;
        System.out.println("Volume Of A Square is "+volume);
    }
}