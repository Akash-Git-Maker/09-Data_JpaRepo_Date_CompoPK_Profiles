package com.akashit.entity;

import com.akashit.pk.AccountPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="account_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Account {

	private String holderName;
	private String city;
	private String headOffice;
	private String branch;
	
	@EmbeddedId
	private AccountPK accountPk;
	
}