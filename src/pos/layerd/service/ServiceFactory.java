/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service;

import pos.layerd.service.carcategory.Impl.CarCategoryServiceImpl;

/**
 *
 * @author ASUS
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory==null){
            serviceFactory =new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(Servicetype type){
        switch (type) {
            case CARCATEGORY:
                
                return new CarCategoryServiceImpl();
            default:
                return null;
        }
    }
    public enum Servicetype{
        CARCATEGORY;
    }
}
