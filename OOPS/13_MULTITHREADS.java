// MULTI THREADS : before jumping into this topic : look at 13_RUNNABLE.java file





class ThreadClass extends Thread{
    private String threadName;

    public ThreadClass(String threadName)
    {
        this.threadName = threadName;
    }

    public void run()
    {
        for(int i = 0;i < 5;i++)
        {
            System.out.println(threadName + " " + i);

        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass t1 = new ThreadClass("Thread1");
        ThreadClass t2 = new ThreadClass("Thread2");
        
        t1.start();
        t2.start();

        System.out.println(t1.isAlive()); // checks if the Thread is alive or not 

        t1.join();      // will make thread 2 wait untill t2 is executed 
        // t2.join();      // will make thread 1 wait untill t2 is executed 
        System.out.println("Main Thread");

        System.out.println(t1.isAlive());


    }
}




// Flow Control:
// Two threads are created: t1 and t2, which are instances of the ThreadClass.

// t1.start() and t2.start():

// Both threads (t1 and t2) are started, meaning their run() methods will execute concurrently.
// Each thread prints its threadName followed by an index (from 0 to 4), for five iterations.
// t1.isAlive():

// Right after starting the threads, the main thread checks if t1 is still alive. Since t1 has just started and hasn't finished, isAlive() should return true.
// t1.join():

// The main thread will now wait for t1 to complete. This means the main thread will pause and not execute further until t1 finishes.
// Main Thread Output:

// After t1 has completed (due to join()), the main thread resumes and prints "Main Thread".
// Second t1.isAlive() Check:

// After the main thread resumes from the join(), it checks if t1 is still alive. Since t1 has finished its work, isAlive() will return false.


// EXPECTED OUTPUT : 
// Thread1 0
// Thread2 0
// Thread1 1
// Thread2 1
// Thread1 2
// Thread2 2
// Thread1 3
// Thread2 3
// Thread1 4
// Thread2 4
// true
// Main Thread
// false








// INBUILT FUNCTIONS : 

// Thread.start():
// This starts a new thread and internally calls the run() method defined in the class.
// This method does not directly execute run(), but rather creates a new thread and schedules it for running.

// Thread.run():
// This is the method where the actual thread logic resides. It gets executed when the thread starts.

// Thread.isAlive():
// This method checks if the thread is still running (returns true) or has finished its execution (returns false).

// Thread.join():
// This makes the current thread (in this case, the main thread) wait until the thread on which join() is called (like t1.join()) finishes its execution.
// After the thread t1 finishes, the main thread resumes execution.