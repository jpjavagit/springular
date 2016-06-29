package br.com.home.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@XmlRootElement
@Component
@Entity
@Table(name="tb_solicitar_servico")
@SequenceGenerator(name="seq_solicitar_servico", sequenceName="codigo_solicitar_servico_seq")
public class SolicitarServico implements Serializable{

	private static final long serialVersionUID = 2777531521384062460L;
	
	@Id
	@GeneratedValue(generator="seq_solicitar_servico", strategy=GenerationType.AUTO)
	@Column(name="cod_solicitar_servico")
	private Long codigo;
	
	@JoinColumn(name="cod_solicitacao")
	@ManyToOne
	private Servico servico;
	
	@JoinColumn(name="codigo_aluno")
	@ManyToOne
	private Aluno aluno;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_solicitacao")
	private Date dataSolicitacao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	
	
	
}
