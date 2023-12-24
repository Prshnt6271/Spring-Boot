package com.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.Entity.Bill;
import com.curd.Repos.UserRepo;
@Service

public class ServiceImpli implements BillService {

	 @Autowired
	    private UserRepo repo;

	    @Override
	    public List<Bill> getAllBills() {
	        return repo.findAll();
	    }

	    @Override
	    public Bill getBillById(int id) {
	        return repo.findById(id).orElse(null);
	    }

	    @Override
	    public Bill saveBill(Bill bill) {
	    	
	    	
	        int presentReading = bill.getPr();
	        int previousReading = bill.getCr();

	        // Validate readings
	        if (presentReading < previousReading) {
	            // Handle the error, throw an exception, or set a default value
	            throw new IllegalArgumentException("Present reading cannot be less than previous reading");
	        }
	        int unitsConsumed = presentReading - previousReading;
	        double serviceCharge = bill.getSc();

	        int rate;

	        if (unitsConsumed < 300) {
	            rate =  2;
	        } else if (unitsConsumed < 500) {
	            rate = 3;
	        } else {
	            rate = 4;
	        }
	        double billAmount = (rate * unitsConsumed)+serviceCharge;

	        bill.setTotal_bill(billAmount);
	        bill.setUnits(rate); 
	        return repo.save(bill);
	    }

	    @Override
	    public void deleteBill(int id) {
	        repo.deleteById(id);
	    }

	    @Override
	    public Bill updateBill(Bill bill) {
	    	
	        int presentReading = bill.getPr();
	        int previousReading = bill.getCr();

	        // Validate readings
	        if (presentReading < previousReading) {
	            // Handle the error, throw an exception, or set a default value
	            throw new IllegalArgumentException("Present reading cannot be less than previous reading");
	        }
	        int unitsConsumed = presentReading - previousReading;
	        double serviceCharge = bill.getSc();

	        int rate;

	        if (unitsConsumed < 300) {
	            rate =  2;
	        } else if (unitsConsumed < 500) {
	            rate = 3;
	        } else {
	            rate = 4;
	        }
	        double billAmount = (rate * unitsConsumed)+serviceCharge;

	        bill.setTotal_bill(billAmount);
	        bill.setUnits(rate); 
	        
	        return repo.save(bill);
	    }

}
