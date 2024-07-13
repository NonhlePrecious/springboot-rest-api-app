package com.restapi_nonhle_mavimbela_app.Controller;

import com.restapi_nonhle_mavimbela_app.Model.WithdrawalNotice;
import com.restapi_nonhle_mavimbela_app.Service.WithdrawalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/withdrawals")
public class WithdrawalController {


    @Autowired
    private WithdrawalService withdrawalService;

    @PostMapping
    public ResponseEntity<WithdrawalNotice> createWithdrawalNotice(@RequestBody WithdrawalNotice withdrawalNotice) {
        return ResponseEntity.ok(withdrawalService.createWithdrawalNotice(withdrawalNotice));
    }
}