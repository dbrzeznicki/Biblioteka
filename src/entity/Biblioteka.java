package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import dao.Domain;
import lombok.Data;

@Entity
@Data 
public class Biblioteka implements Domain {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	 
	private String nazwa;
	private String adres;
	private String numerTel;
	
	@Column(length = 1337)
	private String urlDoMapyGoogle;
}