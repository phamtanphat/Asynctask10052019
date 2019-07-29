package khoapham.ptp.phamtanphat.asyntask10052019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAsync;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAsync = findViewById(R.id.buttonAsynctask);

        btnAsync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
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
    }
    //param : tham số truyền vào để xử lý logic
    //progress : tham số cập nhật giá trị khi xử lý
    //result : tham số trả về sau khi xử lý xong tác vụ
    class XulyAsync extends AsyncTask<String,String,Integer> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Integer doInBackground(String... strings) {
            return 1;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Integer s) {
            super.onPostExecute(s);
        }
    }
}
