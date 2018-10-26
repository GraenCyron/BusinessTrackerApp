package com.daicy.dto;

import javax.validation.constraints.NotNull;

public class AddressDTO {

    private long id;
    private String unitNumber;
    private String houseBuildingStreetNumber;
    private String streetName;
    @NotNull
    private String district;
    @NotNull
    private String cityMunicipality;
    @NotNull
    private String postalCode;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getHouseBuildingStreetNumber() {
        return houseBuildingStreetNumber;
    }

    public void setHouseBuildingStreetNumber(String houseBuildingStreetNumber) {
        this.houseBuildingStreetNumber = houseBuildingStreetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCityMunicipality() {
        return cityMunicipality;
    }

    public void setCityMunicipality(String cityMunicipality) {
        this.cityMunicipality = cityMunicipality;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", unitNumber=" + unitNumber
                + ", houseBuildingStreetNumber=" + houseBuildingStreetNumber
                + ", streetName=" + streetName + ", district=" + district
                + ", cityMunicipality=" + cityMunicipality + ", postalCode="
                + postalCode + "]";
    }
}