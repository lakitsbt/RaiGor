package service;

import java.util.List;

import entites.Dept;

public interface DeptService {
	
    public boolean add(Dept dept);
    public Dept	get(int id);
    public List<Dept> list();
	
}
