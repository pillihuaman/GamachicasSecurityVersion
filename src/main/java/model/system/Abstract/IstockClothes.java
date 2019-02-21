package model.system.Abstract;

import domain.System.BusinessEntity.ViewStockBE;
import java.util.List;

/**
 *
 * @author zarmir
 */
public  interface IstockClothes {
    
     List<ViewStockBE>  getViewStock(ViewStockBE objs);
}