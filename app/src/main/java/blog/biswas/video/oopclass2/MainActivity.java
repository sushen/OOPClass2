package blog.biswas.video.oopclass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {

    Loan loan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loan = new Loan();
        Log.i("address","address:" +loan.toString());
        loan.setLoanAmount(500000);
        setLoan(loan);
        int dueAmount = loan.getDueAmount();


    }
    public void setLoan(Loan l){
        Log.i("address","address:"+l.toString());
        l.setDipositAmount(5000);
    }
}
