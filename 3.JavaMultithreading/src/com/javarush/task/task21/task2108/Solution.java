package com.javarush.task.task21.task2108;

import java.util.Objects;

/*
Клонирование растений
*/
public class Solution {
    public static void main(String[] args) throws CloneNotSupportedException {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        clone = tree.clone();

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);

    }

    public static class Plant{
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Plant)) return false;
            Plant plant = (Plant) o;
            return (Objects.equals(name, plant.name));
        }

        @Override
        public int hashCode() {
            return 31 + Objects.hash(name);
        }

        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable{
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        @Override
        protected Tree clone(){

            String[] arr = new String[branches.length];
            for (int i=0;i<branches.length;i++) {
                arr[i] = branches[i];
            }

            Tree tr = new Tree(getName(), arr);

            return tr;

        }

        public String[] getBranches() {
            return branches;
        }
    }
}
