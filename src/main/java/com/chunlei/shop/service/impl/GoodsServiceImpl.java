package com.chunlei.shop.service.impl;

import com.chunlei.shop.common.MsgConstant;
import com.chunlei.shop.entity.BaseProduct;
import com.chunlei.shop.mapper.CategoryMapper;
import com.chunlei.shop.mapper.ProductMapper;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.model.duct.*;
import com.chunlei.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created by lcl on 2019/8/27 0027
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void findGoodsDetails(Integer ductId, ApiResp<GoodsDetails> resp) {
        BaseProduct product = productMapper.findById(ductId);
        if(product==null){
            resp.respErr(MsgConstant.DATA_NULL);
        }else {
            GoodsDetails details = new GoodsDetails();
            //基础信息
            details.setBasicInfo(product);
            //类别详情
            details.setCategory(categoryMapper.findById(product.getCategoryId()));
            //商品展示详情
            details.setContent("<p><img title=\"https://cdn.it120.cc/apifactory/2019/01/29/cfe2d939df117950cf8f3d22c5daef09.jpg\" src=\"https://cdn.it120.cc/apifactory/2019/01/29/cfe2d939df117950cf8f3d22c5daef09.jpg\" alt=\"33.jpg\" /></p>");
            //物流
            Logistics logistics = new Logistics(true,0,"按件数");
            details.setLogistics(logistics);
            //商品图片
            PictureOfGoods p1 = new PictureOfGoods(1,1,"https://cdn.it120.cc/apifactory/2019/01/29/3e1c94a46b185b2b475e60387a5ac93f.png");
            PictureOfGoods p2 = new PictureOfGoods(1,2,"https://cdn.it120.cc/apifactory/2019/01/29/6ad94fd9f5dcb593182f7507d6f29302.jpg");
            List<PictureOfGoods> pics = new ArrayList();
            pics.add(p1);
            pics.add(p2);
            details.setPics(pics);
            //商品基础SPU
            SpuOfGoods spu1 = new SpuOfGoods(1,"黑色",1,null);
            SpuOfGoods spu2 = new SpuOfGoods(2,"银色",2,null);
            SpuOfGoods spu3 = new SpuOfGoods(3,"橙色",3,null);
            List<PropeOfGoods> pros = new ArrayList();
            List<SpuOfGoods> childsCurGoods = new ArrayList();
            PropeOfGoods g1 = new PropeOfGoods();
            childsCurGoods.add(spu1);
            childsCurGoods.add(spu2);
            childsCurGoods.add(spu3);
            pros.add(g1);
            g1.setChildsCurGoods(childsCurGoods);
            details.setProperties(pros);
            resp.setRespData(details);
        }


    }


}
