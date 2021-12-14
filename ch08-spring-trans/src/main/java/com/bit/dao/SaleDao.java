package com.bit.dao;

import com.bit.domain.Sale;

public interface SaleDao {
    //增加销售（订单）记录
    int insertSale(Sale sale);
}
