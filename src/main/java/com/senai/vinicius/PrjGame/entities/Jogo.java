package com.senai.vinicius.PrjGame.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String plataform;
	
	//crie os métodos getts e setts
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long Id) {
		this.id = Id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public  String getPlataform() {
		return plataform;
	}
	
	public void setPlataform(String plataform) {
		this.plataform = plataform; 
	}
}
