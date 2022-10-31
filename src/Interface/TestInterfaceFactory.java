package Interface;

public class TestInterfaceFactory {
    public  TestInterfaceFactory (){
        this.test();
    }
    public  void test() {
        workFactory studentWork = new studentWorkFactory();
        workFactory teacherWork = new teacherWorkFactory();
    }

}
interface  workFactory{
    public  abstract work getWork();
}
interface  work{
    public  abstract  void work();
}
class  studentWork implements  work{
    public  studentWork (){
        this.work();
    }

    @Override
    public void work() {
        System.out.println("学生交作业！");
    }
}
class teachWork implements  work{
    public  teachWork (){
        this.work();
    }
    @Override
    public void work() {
        System.out.println("老师批改作业!");
    }
}

class studentWorkFactory implements  workFactory{
    public  studentWorkFactory (){
        this.getWork();
    }

    @Override
    public work getWork() {
        return new studentWork();
    }
}

class  teacherWorkFactory implements  workFactory{
    public  teacherWorkFactory (){
        this.getWork();
    }
    @Override
    public work getWork() {
        return new teachWork();
    }
}
