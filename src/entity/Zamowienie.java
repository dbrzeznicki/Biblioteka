package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import dao.Domain;
import lombok.Data;

@Data
@Entity
public class Zamowienie implements Domain {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	private String tytul; 
	private String wydanie;
	private Integer ilosc;
	private String opis;
	private String status;
	 
	@ManyToOne
	private Biblioteka biblioteka; 
}