package com.javarush.task.task21.task2109;

import java.util.Objects;

/*
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof A)) return false;
            A a = (A) o;
            return i == a.i &&
                    j == a.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof B)) return false;
            if (!super.equals(o)) return false;
            B b = (B) o;
            return Objects.equals(name, b.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), name);
        }

        @Override
        public Object clone() {

            CloneNotSupportedException e1 = new CloneNotSupportedException();
            e1.printStackTrace();
            return e1;
        }

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B  implements Cloneable{
        public C(int i, int j, String name) {
            super(i, j, name);
        }
    }

    public static void main(String[] args) {

        B b1 = new B(8, 9, "ttt");
        B b2 = null;
        //b2 = b1.clone();



    }
}
