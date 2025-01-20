public class VolumeOfEarth{
	public static void main(String args[]){
		int radiusInKm = 6378;
		double radiusInMiles = radiusInKm*0.6;
	    double volumeOfEarthInKm = (4/3)*Math.PI*(Math.pow(radiusInKm,3));
		double volumeOfEarthInMiles = (4/3)*Math.PI*(Math.pow(radiusInMiles,3));
		
		
		System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKm + " and cubic miles is " + volumeOfEarthInMiles);
		
	}}		