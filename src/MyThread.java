
public class MyThread extends Thread {

	@Override
	public void interrupt() {
		super.interrupt();
	}

	@Override
	public boolean isInterrupted() {
		return super.isInterrupted();
	}

	@Override
	public void run() {
		System.out.println("Important job running in my thread");
	}

	@Override
	public synchronized void start() {
		super.start();
	}
}