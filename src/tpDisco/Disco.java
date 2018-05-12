package tpDisco;

public class Disco {
	private Double radioInterior;
	private Double radioExterior;
	
	public Disco(Double radioInterior, Double radioExterior){
		if(radioInterior < radioExterior){
	this.radioInterior = radioInterior;
	this.radioExterior = radioExterior;
		}
		else{
			this.radioInterior = 0.0;
			this.radioExterior = 0.0;
		}
	}
	
	public Boolean cambiarRadioInterior(Double nuevoRadioInterior){
		if(nuevoRadioInterior < radioExterior){
			radioInterior  = nuevoRadioInterior;
			return true;
		}
		else{
			return false;
		}
	}
	
	public Boolean cambiarRadioExterior(Double nuevoRadioExterior){
		if(nuevoRadioExterior > radioInterior){
			radioExterior = nuevoRadioExterior;
			return true;
		}
		else{
			return false;
		}
	}
	
	public Double perimetroInterior(){
		return 2*Math.PI*radioInterior;
	}
	
	public Double perimetroExterior(){
		return 2*Math.PI*radioExterior;
	}
	
	public Double calcularSuperficie(){
		Double areaTotal = Math.PI*radioExterior*radioExterior;
		Double areaInterior = Math.PI*radioInterior*radioInterior;
		return areaTotal - areaInterior;
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	
	
}
