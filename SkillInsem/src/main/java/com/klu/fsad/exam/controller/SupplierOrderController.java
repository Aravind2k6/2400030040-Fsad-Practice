package com.klu.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.service.SupplierOrderService;

@RestController
@RequestMapping("/orders")
public class SupplierOrderController
{
    @Autowired
    private SupplierOrderService service;

    // POST operation
    @PostMapping("/add")
    public SupplierOrder addOrder(@RequestBody SupplierOrder order)
    {
        return service.addOrder(order);
    }

    // GET operation
    @GetMapping("/all")
    public List<SupplierOrder> getOrders()
    {
        return service.getAllOrders();
    }
}