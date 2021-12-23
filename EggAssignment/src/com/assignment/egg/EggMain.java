package com.assignment.egg;

public class EggMain
{
	public static void main(String[] args) 
	{
		EggUnit e = new EggUnit();
		e.setTotal(184);
		System.out.println(" number of gross eggs : "+e.getNum_gross());
		System.out.println(" number of dozen eggs : "+e.getNum_dozen());
		System.out.println(" number of remaining eggs : "+e.getRem_eggs());
	}

}
