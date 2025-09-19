package edu.araujo;


public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
		@Override
		public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append("Latitude: ").append(latitude)
					.append(", Longitude: ").append(longitude);
				return sb.toString();
		}
}
