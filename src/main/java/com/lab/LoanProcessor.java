package com.lab;

public class LoanProcessor {
    int credit_score;
    boolean Employemnet;
    int LoanAmount;

    String processLoanApplication(int credit_score , boolean Employemnet, int LoanAmount){
        if (credit_score <= 600){
           return "Rejected: Credit score too low";
        }
        else if (Employemnet == false){
            return "Rejected: Applicant must be employed";
        }
        else if(LoanAmount > 50000){
            return "Rejected: Loan amount too high";
        }
        else{return "Approved";}
    }
}
