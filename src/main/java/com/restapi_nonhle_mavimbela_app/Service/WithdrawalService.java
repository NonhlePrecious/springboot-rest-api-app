package com.restapi_nonhle_mavimbela_app.Service;

import com.restapi_nonhle_mavimbela_app.Model.WithdrawalNotice;
import com.restapi_nonhle_mavimbela_app.Repository.WithdrawalNoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class WithdrawalService {

    @Autowired
    private WithdrawalNoticeRepository withdrawalNoticeRepository;

    public WithdrawalNotice createWithdrawalNotice(WithdrawalNotice withdrawalNotice) {
        // Validation logic here
        if (withdrawalNotice.getAmount().compareTo(withdrawalNotice.getProduct().getCurrentBalance().multiply(BigDecimal.valueOf(0.9))) > 0) {
            throw new IllegalArgumentException("Cannot withdraw more than 90% of the current balance.");
        }

        return withdrawalNoticeRepository.save(withdrawalNotice);
    }
}
