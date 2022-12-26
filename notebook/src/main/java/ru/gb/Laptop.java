package ru.gb;

public class Laptop {
    
    private String laptopmodel;
    private int displaysize;
    private int ramsize;
    private int hddcapacity;
    private String operationsystem;
    private double laptopweight;
    private int batterylife;
    private int laptopprice;

    public Laptop(String laptopmodel, int displaysize, int ramsize, int hddcapacity, String operationsystem, double laptopweight, int batterylife, int laptopprice) {
        this.laptopmodel = laptopmodel;
        this.displaysize = displaysize;
        this.ramsize = ramsize;
        this.hddcapacity = hddcapacity;
        this.operationsystem = operationsystem;
        this.laptopweight = laptopweight;
        this.batterylife = batterylife;
        this.laptopprice = laptopprice;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((laptopmodel == null) ? 0 : laptopmodel.hashCode());
        result = prime * result + displaysize;
        result = prime * result + ramsize;
        result = prime * result + hddcapacity;
        result = prime * result + ((operationsystem == null) ? 0 : operationsystem.hashCode());
        long temp;
        temp = Double.doubleToLongBits(laptopweight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + batterylife;
        result = prime * result + laptopprice;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (laptopmodel == null) {
            if (other.laptopmodel != null)
                return false;
        } else if (!laptopmodel.equals(other.laptopmodel))
            return false;
        if (displaysize != other.displaysize)
            return false;
        if (ramsize != other.ramsize)
            return false;
        if (hddcapacity != other.hddcapacity)
            return false;
        if (operationsystem == null) {
            if (other.operationsystem != null)
                return false;
        } else if (!operationsystem.equals(other.operationsystem))
            return false;
        if (Double.doubleToLongBits(laptopweight) != Double.doubleToLongBits(other.laptopweight))
            return false;
        if (batterylife != other.batterylife)
            return false;
        if (laptopprice != other.laptopprice)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("[модель: %s, дисплей: %d дюймов, объём ОЗУ: %d Гб, объём ЖД: %d Гб, ОС: %s, вес: %.1f кг, автономная работа: до %d часов, цена: %d руб.]\n",
        laptopmodel, displaysize, ramsize, hddcapacity, operationsystem, laptopweight, batterylife, laptopprice);
    }

    public String getLaptopmodel() {
        return laptopmodel;
    }
    public void setLaptopmodel(String laptopmodel) {
        this.laptopmodel = laptopmodel;
    }
    public int getDisplaysize() {
        return displaysize;
    }
    public void setDisplaysize(int displaysize) {
        this.displaysize = displaysize; 
    }
    public int getRamsize() {
        return ramsize;
    }
    public void setRamsize(int ramsize) {
        this.ramsize = ramsize;
    }
    public int getHddcapacity() {
        return hddcapacity;
    }
    public void setHddcapacity(int hddcapacity) {
        this.hddcapacity = hddcapacity;
    }
    public String getOperationsystem() {
        return operationsystem;
    }
    public void setOperationsystem(String operationsystem) {
        this.operationsystem = operationsystem;
    }
    public double getLaptopweight() {
        return laptopweight;
    }
    public void setLaptopweight(double laptopweight) {
        this.laptopweight = laptopweight;
    }
    public int getBatterylife() {
        return batterylife;
    }
    public void setBatterylife(int batterylife) {
        this.batterylife = batterylife;
    }
    public int getLaptopprice() {
        return laptopprice;
    }
    public void setLaptopprice(int laptopprice) {
        this.laptopprice = laptopprice;
    }
    
}
