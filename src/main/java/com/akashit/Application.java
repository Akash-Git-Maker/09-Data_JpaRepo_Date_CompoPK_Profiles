package com.akashit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akashit.entity.Account;
import com.akashit.pk.AccountPK;
import com.akashit.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnxt = SpringApplication.run(Application.class, args);
		AccountRepo repo = cnxt.getBean(AccountRepo.class);
		
		  
		  // setting composite key values 
		AccountPK pk = new AccountPK();
		  pk.setAccNum(15454323212l); 
		  pk.setAccType("Savings");
		  
		  // setting entity data
		  Account acc = new Account();
		  acc.setHolderName("Ashok"); 
		  acc.setBranch("Ameerpet");
		  acc.setBranch("Pune");
		  acc.setHeadOffice("Mumbai");
		  acc.setCity("Delhi");
		  acc.setAccountPk(pk);
		  
		  // setting pk obj
		  
		  repo.save(acc); // saving the entity obj
		  
		  System.out.println("Record saved.....");
		  
		  
		 
		AccountPK pk1 = new AccountPK();
		pk1.setAccNum(15454323212l);
		pk1.setAccType("Savings");

		Optional<Account> findById = repo.findById(pk1);
		System.out.println(findById.get());

	}
}
