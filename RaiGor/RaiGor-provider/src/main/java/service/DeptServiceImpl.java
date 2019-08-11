package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DeptDao;
import entites.Dept;
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
    private DeptDao dao ;
    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }
    @Override
    public Dept get(int id)
    {
        return dao.findById(id);
    }
    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}
