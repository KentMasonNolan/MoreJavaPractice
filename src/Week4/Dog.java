package Week4;

public class Dog {
        private String name;
        private int age;
        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public int inPersonYears(){
            int humanYears = this.age * 7;
            return humanYears;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String toString() {
            return "Name:" + " " + this.name + "," + " " + "Age:" + " " + this.age;
        }
    }