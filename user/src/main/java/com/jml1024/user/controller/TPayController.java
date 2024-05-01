package com.jml1024.user.controller;

import com.jml1024.common.response.Result;
import com.jml1024.core.domain.TPay;
import com.jml1024.core.dto.TPayDTO;
import com.jml1024.core.service.TPayService;
import com.jml1024.core.vo.TPayVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/tpay")
@Tag(name = "支付api")
public class TPayController {
    private TPayService tPayService;

    public TPayController(TPayService tPayService) {
        this.tPayService = tPayService;
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "获取订单信息", description = "根据订单ID获取订单信息")
    public Result<TPayVO> get(@PathVariable(name = "id") Long id) {
        TPay tPay = tPayService.selectByPrimaryKey(id);
        TPayVO vo = new TPayVO();
        BeanUtils.copyProperties(tPay, vo);
        Result<TPayVO> result = new Result<>();
        result.setCode(000000);
        result.setTimestamp(System.currentTimeMillis());
        result.setData(vo);
        return result;
    }

    @PostMapping(value = "/add")
    @Operation(summary = "新增", description = "新增支付订单记录")
    public Result add(@RequestBody TPayDTO dto) {
        TPay tPay = new TPay();
        BeanUtils.copyProperties(dto, tPay);
        tPay.setCreateDateTime(LocalDateTime.now());
        int count = tPayService.insertSelective(tPay);
        Result result = new Result();
        result.setTimestamp(System.currentTimeMillis());
        if (count > 0) {
            result.setCode(000000);
        } else {
            result.setCode(100001);
            result.setMessage("新增支付订单失败");
        }
        return result;
    }
}
