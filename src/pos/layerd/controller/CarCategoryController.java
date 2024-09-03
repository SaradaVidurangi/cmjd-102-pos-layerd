/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.controller;

import pos.layerd.dto.CarCategoryDto;
import pos.layerd.service.ServiceFactory;
import pos.layerd.service.carcategory.CarCategoryService;

/**
 *
 * @author ASUS
 */
public class CarCategoryController {
    
    CarCategoryService carCategoryService=(CarCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.Servicetype.CARCATEGORY);

    public String addCarCategory(CarCategoryDto carCategoryDto) throws Exception{
        return carCategoryService.addCarCategory(carCategoryDto);
        
    }
    
}
