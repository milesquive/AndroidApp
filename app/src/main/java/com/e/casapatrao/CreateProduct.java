package com.e.casapatrao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;

import com.e.casapatrao.Utils.MyDialogFragment;
import com.e.casapatrao.Utils.ServiceApiClientGet;

/**
 * @author hilarioquive@gmail.com
 */

public class CreateProduct extends AppCompatActivity {

    private Button _btnRegist;
    private ServiceApiClientGet _apiClientGet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_product);
        setTitle("Registar Produto");

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy =
                    new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        _apiClientGet = new ServiceApiClientGet();

        _btnRegist = findViewById(R.id.btnRegist);
        _btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createProduct();
            }
        });

    }

    private void createProduct() {

        _apiClientGet.getServiceCliente();
        //  DialogFragment dialog = new MyDialogFragment();
        //  dialog.show(getSupportFragmentManager(), "MyDialogFragmentTag");
    }
}
