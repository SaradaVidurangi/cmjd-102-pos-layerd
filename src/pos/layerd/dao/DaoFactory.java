/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dao;

import pos.layerd.dao.CarCategory.CarCategoryDao;
import pos.layerd.dao.CarCategory.Impl.CarCategoryDaoImpl;

/**
 *
 * @author ASUS
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if(daoFactory==null){
            daoFactory = new DaoFactory();
        
            return daoFactory;
            
            }
        public SuperDao getDao(DaoTypes type ){
            switch (type) {
                case CARCATEGORY:
                    
                    return new CarCategoryDaoImpl();
                default:
                    return null;
            }
        }
        public enum  DaoTypes{
              CARCATEGORY
    }}

