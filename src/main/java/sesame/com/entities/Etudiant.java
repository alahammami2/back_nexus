package sesame.com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Etudiant {
		@Id
		private Long idEtudiant;
		private String nomEtudiant;
		private String prenomEtudiant;
		private Date dateNais;
		
		public Etudiant() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getIdEtudiant() {
			return idEtudiant;
		}
		public void setIdEtudiant(Long idEtudiant) {
			this.idEtudiant = idEtudiant;
		}
		public String getNomEtudiant() {
			return nomEtudiant;
		}
		public void setNomEtudiant(String nomEtudiant) {
			this.nomEtudiant = nomEtudiant;
		}
		public String getPrenomEtudiant() {
			return prenomEtudiant;
		}
		public void setPrenomEtudiant(String prenomEtudiant) {
			this.prenomEtudiant = prenomEtudiant;
		}
		public Date getDateNais() {
			return dateNais;
		}
		public void setDateNais(Date dateNais) {
			this.dateNais = dateNais;
		}
		public Etudiant(Long idEtudiant, String nomEtudiant, String prenomEtudiant, Date dateNais) {
			super();
			this.idEtudiant = idEtudiant;
			this.nomEtudiant = nomEtudiant;
			this.prenomEtudiant = prenomEtudiant;
			this.dateNais = dateNais;
		}

	

}
