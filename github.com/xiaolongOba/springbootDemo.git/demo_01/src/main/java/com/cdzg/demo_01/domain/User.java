package com.cdzg.demo_01.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {

	private static final long serialVersionUID = -2354690630042501819L;
	@Id
	@GeneratedValue
	private Long id ;
	@Column
	private String userName ;
	@Column
	private String password ;
	@Column
	private String email ;
	@Column
	private String nickName;
	@Column
	private String regTime ;
	
	
}
