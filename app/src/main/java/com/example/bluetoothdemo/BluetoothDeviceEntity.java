package com.example.bluetoothdemo;


import android.bluetooth.BluetoothDevice;

public class BluetoothDeviceEntity {

    public String name;
    public String address;
    public boolean status;
    public BluetoothDevice device;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public BluetoothDevice getDevice() {
        return device;
    }

    public void setDevice(BluetoothDevice device) {
        this.device = device;
    }

    public BluetoothDeviceEntity(String name, String address, boolean status, BluetoothDevice device) {
        this.name = name;
        this.address = address;
        this.status = status;
        this.device = device;
    }
}