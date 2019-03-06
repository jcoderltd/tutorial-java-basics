/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.casting;

/**
 * Example interface used to explain the instanceof (type comparison) operator and object casting
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/casting
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class LightIdentifier {
    public void identify(Light light) {
        if (light instanceof BluetoothLight) {
            System.out.println("This is a bluetooth light");
        } else if (light instanceof WiFiLight) {
            System.out.println("This is a wifi light");
        } else {
            System.out.println("Not a bluetooth nor a wifi light");
        }
    }

    public void connectTo(Light light) {
        if (light instanceof BluetoothLight) {
            BluetoothLight bluetoothLight = (BluetoothLight) light;
            bluetoothLight.connectBluetooth("BTLIGHT", 1234);
        } else if (light instanceof WiFiLight) {
            WiFiLight wiFiLight = (WiFiLight) light;
            wiFiLight.connectWifi("NetWorkName", "Som3Pa55word");
        } else {
            System.out.println("Don't know how to connect to that type of Light");
        }
    }
}
