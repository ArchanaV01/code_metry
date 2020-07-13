// # Write the function isrectangular(int[][] arr) that takes a possibly-2d 
// # array arr and returns True  if it is rectangular, so each row has
// #  the same number of elements. Return False otherwise.

class isrectangular {
	public boolean fun_isrectangular(int[][] arr){
		int s = arr[0].length;
		for(int i = 0; i < arr.length; i++){
			if( s != arr[i].length){
				return false;
			}
		}return true;
	}
}