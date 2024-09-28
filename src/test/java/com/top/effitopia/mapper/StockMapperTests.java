package com.top.effitopia.mapper;

import com.top.effitopia.dto.PageRequestDTO;
import com.top.effitopia.dto.StockDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class StockMapperTests {

    @Autowired
    private StockMapper stockMapper;

    @Test
    public void updateListTest() {
        stockMapper.updateList();
    }

    @Test
    public void getListStockTest() {
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().build();
        log.info(pageRequestDTO);
        log.info(stockMapper.selectListStock(pageRequestDTO));
    }
}
