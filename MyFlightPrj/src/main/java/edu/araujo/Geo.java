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
	// Método estático para calcular a distância entre dois pontos Geo
	public static double distancia(Geo g1, Geo g2) {
		final double R = 6371.0; // raio da Terra em km
		double lat1 = Math.toRadians(g1.getLatitude());
		double lat2 = Math.toRadians(g2.getLatitude());
		double dLat = Math.toRadians(g2.getLatitude() - g1.getLatitude());
		double dLon = Math.toRadians(g2.getLongitude() - g1.getLongitude());

		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
				+ Math.cos(lat1) * Math.cos(lat2)
				* Math.sin(dLon / 2) * Math.sin(dLon / 2);
		double c = 2 * Math.asin(Math.sqrt(a));
		return R * c;
	}

	// Método de instância para calcular a distância até outro ponto Geo
	public double distancia(Geo outro) {
		return distancia(this, outro);
	}
}
