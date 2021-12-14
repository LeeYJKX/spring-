package com.bit.dao;

import com.bit.domain.Goods;

public interface GoodsDao {
    //更新库存
    //goods表示本次用户购买的商品信息
    int updateGoods(Goods good);

    //查询商品的信息
    Goods selectGoods(Integer id);
}
