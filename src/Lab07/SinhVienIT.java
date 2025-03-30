package Lab07;

public class SinhVienIT extends SinhVien {
	private String languge;
	private double score;
	private double HTML;
	
	public SinhVienIT(String language, String name, String id, double score, double HTML, double price, double tax) {
		super(name, id, price, tax);
		this.languge = language;
		this.HTML = HTML;
		this.score = score;
	}
	
	
	

	public double getScore() {
		return score;
	}




	public void setScore(double score) {
		this.score = score;
	}




	public double getHTML() {
		return HTML;
	}




	public void setHTML(double hTML) {
		HTML = hTML;
	}




	public String getLanguge() {
		return languge;
	}



	public void setLanguge(String languge) {
		this.languge = languge;
	}



	public void GetMoney()
	{
		System.out.println("run get money");
	}




	@Override
	double GetScore() {
		// TODO Auto-generated method stub
		return (this.getHTML()+this.getScore()*2)/3;
	}
}




	

