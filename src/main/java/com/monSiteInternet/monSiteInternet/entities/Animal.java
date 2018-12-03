package com.monSiteInternet.monSiteInternet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String race;
	private int age;
	private int nbPattes;

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name, String race, int nbPattes, int age) {
        this.name = name;
        this.race = race;
        this.nbPattes = nbPattes;
        this.age = age;
    }
	
	public Animal(String name, String race) {
        this.name = name;
        this.race = race;
        this.nbPattes = 0;
        this.age = 0;
    }
	
	@Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + 
                ", race=" + race + ", age=" + age + ", nombres de pattes=" + nbPattes + "]";
    }
	
	public Long getId() {
        return id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNbPattes() {
		return nbPattes;
	}

	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}
	
	

}
