package Dao;

import java.util.ArrayList;

import Model.Khachhang;

public class KhachHangDAO implements DaoInterface<Khachhang>{

    public static KhachHangDAO getInstance() {
        return new KhachHangDAO();
    }

    @Override
    public int insert(Khachhang t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(Khachhang t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(Khachhang t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ArrayList<Khachhang> selectAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Khachhang selectById(Khachhang t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Khachhang> selectByCondition(String condition) {
        // TODO Auto-generated method stub
        return null;
    }

}
