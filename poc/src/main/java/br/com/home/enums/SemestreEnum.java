package br.com.home.enums;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

/**
 * Enum que controla os semestres
 * @author jpjava
 *
 */
@XmlRootElement
public enum SemestreEnum implements Serializable{
	
	SEM1("1º Semestre"),
	SEM2("2º Semestre");
	
	private SemestreEnum(String descricao){
		this.descricao = descricao;
	}
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
