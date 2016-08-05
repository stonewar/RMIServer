package com.example.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteServer;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * @author yandypiedra
 *
 */
public class Server {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		
		LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
		
		AdderImp adder = new AdderImp();
		Adder stub = (Adder) UnicastRemoteObject.exportObject(adder, 0);
		RemoteServer.setLog(System.out);
		
		Registry registry = LocateRegistry.getRegistry();
		registry.rebind("Adder", stub);
		System.out.println("Adder angemeldet");
	}

}
