package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double totalVAlue;
	
	List<Installments> installments = new ArrayList<Installments>();
	
	public Contract () {}

	public Contract(Integer number, Date date, Double totalVAlue) {
		super();
		this.number = number;
		this.date = date;
		this.totalVAlue = totalVAlue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalVAlue() {
		return totalVAlue;
	}

	public void setTotalVAlue(Double totalVAlue) {
		this.totalVAlue = totalVAlue;
	}

	public List<Installments> getInstallments() {
		return installments;
	}

}
