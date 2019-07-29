package khoapham.ptp.phamtanphat.asyntask10052019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAsync;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAsync = findViewById(R.id.buttonAsynctask);
        txt = findViewById(R.id.textviewKytu);

        // Xin chao
        //X
        //i
        //n
        //
        //C
        //H
        //a
        //o
        // 1 : Thông báo bắt đầu xử lý tách chuỗi
        // 2 : Thực thi tách từng chữ mỗi chữ tách 1 s
        // 3 : in ra chữ sau khi tách
        //3 * : tách xong thông báo kết thúc

        btnAsync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //class vo danh
                new XulyAsync().execute("Xin chào");
            }
        });
    }

    //param : tham số truyền vào để xử lý logic
    //progress : tham số cập nhật giá trị khi xử lý
    //result : tham số trả về sau khi xử lý xong tác vụ
    class XulyAsync extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            Toast.makeText(MainActivity.this, "Bắt đầu tách chuỗi", Toast.LENGTH_SHORT).show();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected String doInBackground(String... strings) {
            String chuoi = strings[0];
            String[] mangkytu = chuoi.split(" ");
            for (String mang : mangkytu) {
                for (int i = 0; i < mang.length(); i++) {
                    Log.d("BBB", String.valueOf(mang.charAt(i)));
                }
                Log.d("BBB"," ");
            }
            return null;
        }


    }
}
