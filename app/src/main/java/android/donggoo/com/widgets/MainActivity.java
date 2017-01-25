package android.donggoo.com.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //1. 위젯정의
    Button bt;
    Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. 정의된 위젯변수의 xml의 위젯 ID를 가져와서 담아준다.
        bt = (Button)findViewById(R.id.btGrid);
        calc = (Button)findViewById(R.id.Cal);
        //3. 변수(위젯)을 리스너에 달아준다.
        bt.setOnClickListener(this);
        calc.setOnClickListener(this);
    }

    @Override
    public  void onClick(View view) {
        switch (view.getId()) {
            case R.id.btGrid :
                //안드로이드 메이저 컴포넌트를 로드하기 위해서는
                //intent를 통해서로드할 컴포넌트를 지정해야한다.
                Intent intent = new Intent(this, GridActivity.class);
                                                 // ↑ 대상이되는 컴포넌트
                startActivity(intent);
                //다른 액티비티 불러오는 것
                break;
            case R.id.Cal :
                //안드로이드 메이저 컴포넌트를 로드하기 위해서는
                //intent를 통해서로드할 컴포넌트를 지정해야한다.
                Intent intent1 = new Intent(this, CalculatorActivity.class);
                // ↑ 대상이되는 컴포넌트
                startActivity(intent1);
                //다른 액티비티 불러오는 것
                break;
        }
    }
}
