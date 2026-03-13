package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class SupplierOrder
{
    @Id
    private int supplierOrderId;

    private String name;
    private String status;
    private Date date;

    public SupplierOrder() {}

    public int getSupplierOrderId() {
        return supplierOrderId;
    }

    public void setSupplierOrderId(int supplierOrderId) {
        this.supplierOrderId = supplierOrderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}