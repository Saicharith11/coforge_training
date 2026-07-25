package com.coforge.pms.dto;

public class SupplierDTO {

    private Long supplierId;
    private String supplierName;
    private String city;

    public SupplierDTO() {
        super();
    }

    public SupplierDTO(Long supplierId, String supplierName, String city) {
        super();
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.city = city;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "SupplierDTO [supplierId=" + supplierId
                + ", supplierName=" + supplierName
                + ", city=" + city + "]";
    }
}