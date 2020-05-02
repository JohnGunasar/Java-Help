	public static double[][] joinMatrices(double[][] m1, double[][] m2) {
		double[][] result = new double[m1.length][m1[0].length + m2[0].length];
		for(int i = 0;i<m1.length;i++) {
			double[] currentVector = ArrayUtils.addAll(m1[i], m2[i]);
			result[i] = currentVector;
		}
		return result;
	}
	
	public static double[][] joinMatrices(ArrayList<double[][]> matrices) {
		ArrayList<double[][]> currentMatrices = new ArrayList<>();
		for(int i = 0;i<matrices.size();i += 2) {
			double[][] m1 = matrices.get(i);
			double[][] m2 = matrices.get(i+1);
			currentMatrices.add(joinMatrices(m1,m2));
		}
				
		if(currentMatrices.size() != 1) {
			joinMatrices(currentMatrices);
		} 
		return currentMatrices.get(0);
	}
