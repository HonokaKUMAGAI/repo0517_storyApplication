package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "birthyear")
	private int birthyear;
	
	@Column(name = "address")
	private String address;

	@Column(name = "fastname")
	private String fastname;

	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "favfood")
	private String favfood;
	@Column(name = "favthing")
	private String favthing;
	@Column(name = "hobby")
	private String hobby;
	
//	public User (String _nickname, int _age, String _address, String _favfood, String hobby) {
//		this.nickname = _nickname;
//		this.age = _age;
//		this.address = _address;
//		this.favfood = _favfood;
//		this.hobby = hobby;
//	}
	
	public User (String _name, int _age, String _address) {
		this.name = _name;
		this.age = _age;
		this.address = _address;
	}
	
	public User (String _name) {
		this.name = _name;
	}
	
	public User (String _fastname,String _lastname, int _age, String _address) {
		this.fastname = _fastname;
		this.lastname = _lastname;
		this.age = _age;
		this.address = _address;
	}

}