package com.leetcode.inernshala.oops.inheritance.hierarchical;

import com.leetcode.inernshala.oops.inheritance.Bank;

public class InvestmentBank extends Bank {
    private String investmentServices;

    public InvestmentBank (String bankName, String bankLocation, String nameOfInvestmentServices){
        super (bankName,bankLocation);
        this.investmentServices= nameOfInvestmentServices;

    }
    public String getInvestmentServices(){
        return investmentServices;
    }
}
