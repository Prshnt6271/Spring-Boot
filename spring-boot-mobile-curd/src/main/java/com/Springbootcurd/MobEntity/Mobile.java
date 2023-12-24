package com.Springbootcurd.MobEntity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@EntityScan
public class Mobile {
	
	@Id
	private int id;
	private String MobName;
	private String mobComp;
	private int Ram;
    private	int Rom;
    private String OS;
    private String ProcName;
    private int IMEI;
    private double Price;
    private int camPix;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int id, String mobName, String mobComp, int ram, int rom, String oS, String procName, int iMEI,
			double price, int camPix) {
		super();
		this.id = id;
		MobName = mobName;
		this.mobComp = mobComp;
		Ram = ram;
		Rom = rom;
		OS = oS;
		ProcName = procName;
		IMEI = iMEI;
		Price = price;
		this.camPix = camPix;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobName() {
		return MobName;
	}
	public void setMobName(String mobName) {
		MobName = mobName;
	}
	public String getMobComp() {
		return mobComp;
	}
	public void setMobComp(String mobComp) {
		this.mobComp = mobComp;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public int getRom() {
		return Rom;
	}
	public void setRom(int rom) {
		Rom = rom;
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public String getProcName() {
		return ProcName;
	}
	public void setProcName(String procName) {
		ProcName = procName;
	}
	public int getIMEI() {
		return IMEI;
	}
	public void setIMEI(int iMEI) {
		IMEI = iMEI;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getCamPix() {
		return camPix;
	}
	public void setCamPix(int camPix) {
		this.camPix = camPix;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", MobName=" + MobName + ", mobComp=" + mobComp + ", Ram=" + Ram + ", Rom=" + Rom
				+ ", OS=" + OS + ", ProcName=" + ProcName + ", IMEI=" + IMEI + ", Price=" + Price + ", camPix=" + camPix
				+ "]";
	}
    

}
