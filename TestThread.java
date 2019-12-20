package assignments;

/*
class MyTask {
    void executeTask() {
        for (int doc = 0; doc <= 10; doc++) {
            System.out.println("printing document #" + doc + "Printer2");
        }
    }
*/
class MyTask extends Thread {
    @Override
    public void run() {
        for (int doc = 0; doc <= 10; doc++) {
            System.out.println("printing document #" + doc + "Printer2");
        }
    }


    public static class TestThread {

        //main method represents main thread
        public static void main(String args[]) {
            //whatever we write here will be executed by main thread
            //thread always execute the job in sequence
            //job1
            System.out.println("-------Application started--------");
            //job2
            MyTask task = new MyTask();
            //task.executeTask();
            task.start();//start intenally execute run method
            //till job2 not completed below jobs will be waiting
            //incase job2 is long running application
            //in such use case OS/JVM will give a messgae that app is not responding
            //some sluggish behaviour in app can be observed or app is hanged
            //Now main and myTask thread executing parally
            //job3
            //some code to print the documets
            for (int doc = 0; doc <= 10; doc++) {
                System.out.println("printing document #" + doc + "Printer1");
            }
            //job3
            System.out.println("---------Application Finished---------");
        }

    }
}

