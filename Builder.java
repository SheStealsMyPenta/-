package builderMode;

public class Builder {
    static class Student {
        String name = null;
        String gender = null;
        int age = -1;
        int rank = -1;

        static class StudentBuilder {
            String name = null;
            String gender = null;
            int age = -1;
            int rank = -1;

            public StudentBuilder setAge(int age) {
                this.age = age;
                return this;
            }

            public StudentBuilder setName(String name) {
                this.name = name;
                return this;
            }

            public StudentBuilder setRank(int rank) {
                this.rank = rank;
                return this;
            }

            public StudentBuilder setGender(String gender) {
                this.gender = gender;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }

        private Student(StudentBuilder builder) {
            this.age = builder.age;
            this.gender = builder.gender;
            this.name = builder.name;
            this.rank = builder.rank;
        }

        @Override
        public String toString() {
            return this.age+"  "+ this.gender+" "+this.rank+"  "+this.name;
        }
    }

    public static void main(String[] args) {
        Student stu = new Student.StudentBuilder().setAge(22).setGender("male").setRank(35).setName("jake").build();
        System.out.println(stu);
    }
}
