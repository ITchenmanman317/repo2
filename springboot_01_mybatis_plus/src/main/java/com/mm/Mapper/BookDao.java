package com.mm.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mm.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {

}
