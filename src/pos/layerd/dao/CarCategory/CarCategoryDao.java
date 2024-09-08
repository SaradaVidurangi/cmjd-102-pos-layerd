/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layerd.dao.CarCategory;

import pos.layerd.dao.SuperDao;
import pos.layerd.entity.CarCategoryEntity;

/**
 *
 * @author ASUS
 */
public interface CarCategoryDao extends SuperDao{
    String addCarCategory(CarCategoryEntity carCategoryEntity) throws Exception;
}
