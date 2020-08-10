package testc.multithread.temp;

public class Main {

    public static void main(String[] args) {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(8);
        equilateralTriangle.calculate();
        equilateralTriangle.information(); // Периметр треугольника : 27.712812921102035 //  Площадь треугольника : 24

        TrianglePrisme trianglePrisme = new TrianglePrisme(10, 8);
        trianglePrisme.calculate();
        trianglePrisme.information(); // Объем призмы : 346.4101615137754


    }

    public static class EquilateralTriangle {

        int length;
        int perimeter;
        double area;

        public void calculate() {
            perimeter = 3 * length;
            area = (Math.sqrt(3) / 4) * length * length;
        }

        public void information() {
            System.out.println(" Периметр треугольника : " + area);
            System.out.println(" Площадь треугольника : " + perimeter);
        }

        public EquilateralTriangle(int length) {
            this.length = length;
        }


    }

    public static class TrianglePrisme extends EquilateralTriangle {

        private int H;
        private double volume;

        @Override
        public void calculate() {
            volume = H * (Math.sqrt(3) / 4) * length * length;
        }

        @Override
        public void information() {
            System.out.println(" Объем призмы : " + volume);
        }

        public TrianglePrisme(int length, int H) {
            super(length);
            this.H = H;
        }


    }


}
