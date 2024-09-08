/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service.carcategory.Impl;

import pos.layerd.dto.CarCategoryDto;
import pos.layerd.entity.CarCategoryEntity;
import pos.layerd.service.carcategory.CarCategoryService;

/**
 *
 * @author ASUS
 */
public class CarCategoryServiceImpl implements CarCategoryService{
    CarCategor

    
    public String addCarCategory(CarCategoryDto carCategoryDto) throws Exception {
        CarCategoryEntity cce=new CarCategoryEntity(carCategoryDto.getCategory_id(), carCategoryDto.getCategory_name(), carCategoryDto.getDaily_rate());
        return null;
    }
    
}
