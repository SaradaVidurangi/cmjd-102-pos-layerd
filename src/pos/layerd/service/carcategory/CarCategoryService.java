/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layerd.service.carcategory;

import pos.layerd.dto.CarCategoryDto;
import pos.layerd.service.SuperService;

/**
 *
 * @author ASUS
 */
public interface CarCategoryService extends SuperService{
    String addCarCategory(CarCategoryDto carCategoryDto) throws Exception;
}
