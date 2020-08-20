package entities;

public class Corse {

	private Integer cod;

	public Corse(Integer cod) {
		this.cod = cod;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod == null) ? 0 : cod.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corse other = (Corse) obj;
		if (cod == null) {
			if (other.cod != null)
				return false;
		} else if (!cod.equals(other.cod))
			return false;
		return true;
	}
	
	
	
}
