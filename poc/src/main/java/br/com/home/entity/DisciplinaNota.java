package br.com.home.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@XmlRootElement
@Component
@Entity
@Table(name="tb_disciplinas_notas")
public class DisciplinaNota implements Serializable{

	private static final long serialVersionUID = -8219987977637988592L;

	@Id
	@Column(name="cod_disciplina_nota")
	private Long codigoDisNota;
	
	@ManyToOne
	@JoinColumn(name="cod_disciplina")
	private Disciplina disciplina;

	@Column(name="nota")
	private Integer nota;
		
	@ManyToOne
	@JoinColumn(name="cod_aluno")
	private Aluno aluno;

	@Column(name="semestre")
	private String semestre;
	
	
	public Long getCodigoDisNota() {
		return codigoDisNota;
	}

	public void setCodigoDisNota(Long codigoDisNota) {
		this.codigoDisNota = codigoDisNota;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}


	
	
}
