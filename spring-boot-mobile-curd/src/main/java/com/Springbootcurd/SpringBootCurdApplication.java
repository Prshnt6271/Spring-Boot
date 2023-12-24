package com.Springbootcurd;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Springbootcurd.MobEntity.Mobile;
import com.Springbootcurd.MobRepo.MobRepos;


@SpringBootApplication
public class SpringBootCurdApplication implements CommandLineRunner {
	
@Autowired
MobRepos obj;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCurdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// insert in the table
		Mobile ob=new Mobile(1,"iphone","apple",4,128,"ios","a13",124322,55000.0,12);
		Mobile ob1=new Mobile(2,"Oppo","oop",8,128,"ios","snapdragon",43567,1500.0,5);
		Mobile ob2=new Mobile(3,"vivo","viv",12,128,"ios","dimencity",73836,14900.0,8);
		Mobile ob3=new Mobile(4,"onePlus","one",16,128,"ios","octacore",63782,3488.0,14);
		Mobile ob4=new Mobile(5,"Asus","as",15,128,"ios","dualcore",735238,53477.0,18);
		Mobile ob5=new Mobile(6,"lephone","le",3,4,"android","dualcore",43432,4572.0,12);
		
		
//		obj.save(ob);
		 
		Optional<Mobile> existingMobile = obj.findById(ob5.getId());
		if (existingMobile.isEmpty()) {
		    obj.save(ob5);
		}

		// Find by ID
		Optional<Mobile> mobileOptional = obj.findById(1);
		if (mobileOptional.isPresent()) {
		    Mobile retrievedMobile = mobileOptional.get();
		    System.out.println("Retrieved Mobile: " + retrievedMobile);
		} else {
		    System.out.println("Mobile not found!");
		}

		// Find all
		Iterable<Mobile> allMobiles = obj.findAll();
		System.out.println("All Mobiles: " + allMobiles); // it show in a single line all the data 
		
		// use this one for line by line
		for (Mobile mobile : allMobiles) {
		    System.out.println(mobile);
		}  
		
		// for delete 

		int mobileIdToDelete = 6;
		if (obj.existsById(mobileIdToDelete)) {
		    obj.deleteById(mobileIdToDelete);
		    System.out.println("Mobile with ID " + mobileIdToDelete + " deleted successfully");
		} else {
		    System.out.println("Mobile not found!");
		}
		
	}
}
