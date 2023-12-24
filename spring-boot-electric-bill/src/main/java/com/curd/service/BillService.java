package com.curd.service;


import com.curd.Entity.Bill;

import java.util.List;


public interface BillService {
    List<Bill> getAllBills();

    Bill getBillById(int id);

    Bill saveBill(Bill bill);

    void deleteBill(int id);

    Bill updateBill(Bill bill);
}
