package homework_worker;

//4、定义一个Worker类（属性 姓名name 年龄age 工资salary）
//    创建几个Worker对象，存入TreeSet集合，要求：按照薪资从大到小排序，如果薪资相同，按照年龄从小到大；如果也相同，按照姓名字典顺序排序。
public class Worker implements Comparable<Worker> {
        private String name;
        private int age;
        private int salary;

        public Worker() {
        }

        public Worker(String name, int age, int salary) {
                this.name = name;
                this.age = age;
                this.salary = salary;
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

        public int getSalary() {
                return salary;
        }

        public void setSalary(int salary) {
                this.salary = salary;
        }

        @Override
        public String toString() {
                return "Worker{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", salary=" + salary +
                        '}';
        }

        @Override
        public int compareTo(Worker o) {
                if (this.salary != o.salary) {
                        return this.salary - o.salary;
                } else if (this.age != o.age) {
                        return this.age - o.age;
                } else {
                        return this.name.compareTo(o.name);
                }
        }
}
