package com.serverinventory.dao;

import java.util.List;

public interface Dao<T> {
	
	public void add (T t) ;
	
	public void edit (T t) ;
	
	public void remove (T t) ;
	
	public List<T> toList() ;
	
}
