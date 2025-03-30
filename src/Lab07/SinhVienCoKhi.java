package Lab07;

public class SinhVienCoKhi extends SinhVien {
	private String skill;
	private double scoreCNC;
	private double scorePLC;
	
	public SinhVienCoKhi(String skill, String name, String id, double scoreCNC, double scorePLC, double price, double tax) {
		super(name, id, price, tax);
		this.skill = skill;
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;

	}
	
	

	public double getScoreCNC() {
		return scoreCNC;
	}



	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}



	public double getScorePLC() {
		return scorePLC;
	}



	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}



	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	double GetScore() {
		// TODO Auto-generated method stub
		return (this.getScoreCNC()+this.getScorePLC())/2;
	}
	
	
	
	
	
	
}
