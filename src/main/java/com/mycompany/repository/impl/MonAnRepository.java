/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.impl;

import com.mycompany.domainModel.MonAn;
import com.mycompany.hibernateUtil.HibernateUtil;
import com.mycompany.repository.ICommonRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class MonAnRepository implements ICommonRepository<MonAn, Boolean, String> {

    private static final Session session = HibernateUtil.getFactory().openSession();
    private String fromTable = "FROM MonAn ";

    @Override
    public List<MonAn> getAll() {
        String hql = fromTable + "WHERE trangThai = 0";
        Query query = session.createQuery(hql);
        List<MonAn> monAns = query.getResultList();
        return monAns;
    }

    @Override
    public MonAn getOne(String ma) {
        String hql = fromTable + "WHERE trangThai = 0 ANH maMonAn = :ma";
        Query query = session.createQuery(hql);
        MonAn monAn = (MonAn) query.getSingleResult();
        return monAn;
    }

    @Override
    public Boolean add(MonAn kh) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(kh);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean update(MonAn kh, String ma) {
        String hql = "UPDATE " + fromTable + "SET tenMonAn = :ten, hinhAnh = :hinhAnh, donGia = :donGia, donViTinh = :donViTinh "
                + "WHERE maMonAn =:ma";
        Transaction transaction = null;
        int check = 0;
        try {
            transaction = session.beginTransaction();
            session.clear();
            Query query = session.createQuery(hql);
            query.setParameter("ten", kh.getTenMonAn());
            query.setParameter("hinhAnh", kh.getHinhAnh());
            query.setParameter("donGia", kh.getDonGia());
            query.setParameter("donViTinh", kh.getDonViTinh());
            query.setParameter("ma", ma);
            check = query.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public Boolean remove(String ma) {
        String hql = "UPDATE " + fromTable + "SET trangThai = 1 "
                + "WHERE maMonAn =:ma";
        Transaction transaction = null;
        int check = 0;
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery(hql);
            query.setParameter("ma", ma);
            check = query.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return check > 0;
    }
}
