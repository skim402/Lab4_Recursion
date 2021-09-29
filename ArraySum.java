
public class ArraySum {

	public ArraySum() {
	}//end constructor
	
	/** Gets sum of the elements in the integer array.
	 * @param array an integer array.
	 * @param index the index we want to get the sum to.
	 * @return sum of the elements in the integer array. */
	public int sumOfArray(Integer[] array, int index) {
		return (index == 0)? array[0] : array[index] + sumOfArray(array,--index);
	}//end sumOfArray
}
