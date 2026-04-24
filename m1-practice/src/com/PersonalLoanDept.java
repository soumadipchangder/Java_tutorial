package com;

interface Bank {

    void assignLoans(int[] loans);

    void averageLoan();

    void maxLoan();

    void minLoan();
}

class PersonalLoanDept implements Bank {

    int[] loanAmounts;

    PersonalLoanDept(int clients) {
        loanAmounts = new int[clients];
    }

    public void assignLoans(int[] loans) {

        int n = Math.min(loans.length, loanAmounts.length);

        for (int i = 0; i < n; i++) {
            loanAmounts[i] = loans[i];
        }

        System.out.println("Loans for clients processed");
    }

    public void averageLoan() {

        double sum = 0;

        for (int loan : loanAmounts) {
            sum += loan;
        }

        double avg = sum / loanAmounts.length;

        System.out.printf("Average loan amount for clients is %.2f\n", avg);
    }

    public void maxLoan() {

        int max = Integer.MIN_VALUE;

        for (int loan : loanAmounts) {
            if (loan > max)
                max = loan;
        }

        System.out.println("Maximum loan amount = " + max);
    }

    public void minLoan() {

        int min = Integer.MAX_VALUE;

        for (int loan : loanAmounts) {
            if (loan < min)
                min = loan;
        }

        System.out.println("Minimum loan amount = " + min);
    }
}
