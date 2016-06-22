package workshop01;

public class CircurlarBuffer {

	private String[] buffer = new String[5];
	private int writePoint;
	private int readPointer;

	public void add(String input) {
		this.buffer[this.writePoint++] = input;
	}

	public String read() {
		if( writePoint == 0 ) {
			throw new BufferEmptyException();
		}
		return this.buffer[this.readPointer++];
	}

	public boolean isFull() {
		return writePoint == buffer.length;
	}

	

}
