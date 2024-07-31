package com.akashit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akashit.entity.Account;
import com.akashit.pk.AccountPK;

public interface AccountRepo 
				extends JpaRepository<Account, AccountPK>{
	
}
