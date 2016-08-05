package com.example.rmi;

import java.rmi.RemoteException;

/**
 * 
 * @author yandypiedra
 *
 */
public class AdderImp implements Adder {

	@Override
	public int add(int x, int y) throws RemoteException {
		// TODO Auto-generated method stub
		return x + y ;
	}

}
