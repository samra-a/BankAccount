import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    @Test
    void testDeposit(){

        BankAccount account = new BankAccount();
        account.setBalance(0);
        account.deposit(73);
        assertThat(account.getBalance()).isEqualTo(73);

    }

    @Test
    void testWithdrawal(){
        BankAccount account = new BankAccount();
        account.setBalance(0);
        account.withdrawal(45);
        assertThat(account.getBalance()).isEqualTo(-45);
    }




}
