package com.example.interview.Notes;

public class N6builderExample {
    private N6builderExample(String one, int two, boolean three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }
    private String one;
    private int two;
    private boolean three;
    public static builderExampleBuilder builder(){
        return new builderExampleBuilder();
    }


    public static class builderExampleBuilder {
        public N6builderExample build(){
            N6builderExample b = new N6builderExample(one, two, three);
            return b;
        }
        public builderExampleBuilder setOne(String one) {
            this.one = one;
            return this;
        }
        public builderExampleBuilder setTwo(int two) {
            this.two = two;
            return this;
        }
        public builderExampleBuilder setThree(boolean three) {
            this.three = three;
            return this;
        }

        private String one;
        private int two;
        private boolean three;

    }
}
