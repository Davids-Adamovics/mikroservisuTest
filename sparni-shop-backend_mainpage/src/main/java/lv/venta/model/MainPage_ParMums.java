package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "MainPage_ParMums")
@Entity
public class MainPage_ParMums {

	@Id
	@Column (name = "ID_MainPage_ParMums")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(value = AccessLevel.NONE)
	private int ID_MainPage_ParMums;

	@ManyToOne
	@JoinColumn(name = "ID_MainPage_BiedribaDarbojas", referencedColumnName =
	"idmpbd")
	private MainPage_BiedribaDarbojas mainPageBiedribasDarbojas;

	@ManyToOne
	@JoinColumn(name = "ID_Kontakti", referencedColumnName = "idk")
	private Kontakti kontakti; 
}