class Freddy {
	public double[] FindHopsAndRests(double Distance,int CountHops, double CountRestTime) {
		double[] Hops = {5,3,1};
		double[] Rests = {1,2,3.5};
		double[] ValuesArray = new double[2];
		
		for(int i=0;i<Hops.length;i++){
			Distance = Distance - Hops[i];
			CountHops++;
			if(Distance <= 0){
				break;
			}else{
				CountRestTime += Rests[i];
			}
		}
		
		if(Distance > 0){
			ValuesArray = FindHopsAndRests(Distance,CountHops,CountRestTime);
		}else{
			ValuesArray[0]+=CountRestTime;
			ValuesArray[1]+=CountHops;
		}
		
		return ValuesArray;
	}
}