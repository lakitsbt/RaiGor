package dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import entites.Dept;

@Mapper
public interface DeptDao
{
  public boolean addDept(Dept dept);
 
  public Dept findById(int id);
 
  public List<Dept> findAll();
}
