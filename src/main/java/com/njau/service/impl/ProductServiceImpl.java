package com.njau.service.impl;

import com.njau.entity.Product;
import com.njau.mapper.ProductMapper;
import com.njau.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-20
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
