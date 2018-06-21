package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import dao.Domain;
import lombok.Data;

@Data
@Entity
public class Czytelnik implements Domain {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
 
	private String imie;
	private String nazwisko;
	private String pesel;
	private String email;
	private String adres;
	private Integer kara;

	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "uzytkownik")
	private Uzytkownik uzytkownik;
	
}