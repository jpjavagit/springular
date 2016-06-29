package br.com.home.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@XmlRootElement
@Component
@Entity
@Table(name="tb_disciplina")
public class Disciplina implements Serializable{

	private static final long serialVersionUID = 4939783522681336230L;

	@Id
	@Column(name="cod_disciplina")
	private Long codigoDisciplina;
	
	@Column(name="nome_disciplina")
	private String nomeDisciplina;



	public Long getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(Long codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	
	
}
