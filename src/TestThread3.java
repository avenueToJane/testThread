/**
 * @ProjectName: testProject
 * @Package: PACKAGE_NAME
 * @ClassName: TestThread3
 * @Author: yangsheng
 * @Description:
 * @Date: 创建时间： 2019/5/28 10:22
 * @Version: 1.0
 */
public class TestThread3 {
    public static void main(String args[]) {
        Runner3 r3 = new Runner3();
        r3.start();//调用start()方法启动新开辟的线程
        for (int i = 0; i <= 10; i++) {
            System.out.println("mainMethod：" + i);
        }
    }
}
/*Runner2类从Thread类继承
通过实例化Runner2类的一个对象就可以开辟一个新的线程
调用从Thread类继承来的start()方法就可以启动新开辟的线程*/
class Runner3 extends Thread {
    public void run() {//重写run()方法的实现
        for (int i = 0; i <= 10; i++) {
            System.out.println("Runner3：" + i);
        }
    }
}
