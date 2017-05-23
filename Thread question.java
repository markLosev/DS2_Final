
public class TestStuff {

    static ArrayList<Integer> intList = new ArrayList();

    public static void main(String[] args) {
        MyThread[] threadList = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            MyThread mt = new MyThread((i + 1) * 10);
            mt.setName("Thread" + i);
            threadList[i] = mt;
            mt.start();
        }

        for (MyThread t : threadList) {
            try {
                t.join();
// wait for each thread to die (complete)
// before continuing
            } catch (InterruptedException ex) {
                Logger.getLogger(TestStuff.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }

}

class MyThread extends Thread {

    int[] intarray = new int[10];
    int range;

    public MyThread(int numberRange) {
        initArray();
        Range = numberRange;
    }

    @Override
    public void run() {

        synchronized ("newKey") {
            System.out.println(this.getName());
            for (int i = 0; i < intarray.length; i++) {
                System.out.println("adding to the threads list: " + intarray[i]);
                TestStuff.intList.add(intarray[i]);
            }
        }

    }

    private void initArray() {
        Random rndm = new Random();
        for (int i = this.range; i < intarray.length; i++) {
            intarray[i] = rndm.nextInt(10);
        }
    }
}
