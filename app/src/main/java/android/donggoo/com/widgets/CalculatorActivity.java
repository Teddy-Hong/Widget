package android.donggoo.com.widgets;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt0;
    Button btPS;
    Button btMS;
    Button btMY;
    Button btDE;
    Button btRUN;
    Button btCAN;

    TextView result;
    TextView preview;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        bt1 = (Button) findViewById(R.id.button15);
        bt2 = (Button) findViewById(R.id.button16);
        bt3 = (Button) findViewById(R.id.button17);
        bt4 = (Button) findViewById(R.id.button19);
        bt5 = (Button) findViewById(R.id.button20);
        bt6 = (Button) findViewById(R.id.button21);
        bt7 = (Button) findViewById(R.id.button23);
        bt8 = (Button) findViewById(R.id.button24);
        bt9 = (Button) findViewById(R.id.button25);
        bt0 = (Button) findViewById(R.id.button28);

        btCAN = (Button) findViewById(R.id.button27);
        btRUN = (Button) findViewById(R.id.button29);

        btPS = (Button) findViewById(R.id.button18);
        btMS = (Button) findViewById(R.id.button22);
        btMY = (Button) findViewById(R.id.button26);
        btDE = (Button) findViewById(R.id.button30);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);

        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);
        btRUN.setOnClickListener(this);
        btCAN.setOnClickListener(this);

        btPS.setOnClickListener(this);
        btMS.setOnClickListener(this);
        btMY.setOnClickListener(this);
        btDE.setOnClickListener(this);

        result = (TextView) findViewById(R.id.textView);
        preview = (TextView)findViewById(R.id.textView4);
        result.setText("");
        preview.setText("");
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button15:    //1
                preview.setText(preview.getText() + "1");
                break;

            case R.id.button16:    //2
                preview.setText(preview.getText() + "2");

                break;

            case R.id.button17:    //3
                preview.setText(preview.getText() + "3");

                break;

            case R.id.button18:    //+
                String tpPlus = (String)preview.getText();
                char[] carrPlus = tpPlus.toCharArray();
                int end = carrPlus.length - 1;
                //if ( carrPlus[end] == '+' || carrPlus[end] == '-' || carrPlus[end] == '*' || carrPlus[end] == '/' ) { //부호면
                if (carrPlus[end] < '0' || carrPlus[end] > '9'){
                    carrPlus[end] = '+';
                    tpPlus = new String(carrPlus);
                    preview.setText(tpPlus);
                }
                else {
                    preview.setText(preview.getText() + "+");
                }
                break;

            case R.id.button19:    //4
                preview.setText(preview.getText() + "4");

                break;

            case R.id.button20:    //5
                preview.setText(preview.getText() + "5");

                break;

            case R.id.button21:    //6
                preview.setText(preview.getText() + "6");

                break;

            case R.id.button22:    //-
                String tpMinus = (String)preview.getText();
                char[] carrMinus = tpMinus.toCharArray();
                int endMinus = carrMinus.length - 1;
                if (carrMinus[endMinus] < '0' || carrMinus[endMinus] > '9'){    //부호면
                    carrMinus[endMinus] = '-';
                    tpMinus = new String(carrMinus);
                    preview.setText(tpMinus);
                }
                else {
                    preview.setText(preview.getText() + "-");
                }

                break;

            case R.id.button23:    //7
                preview.setText(preview.getText() + "7");

                break;

            case R.id.button24:    //8
                preview.setText(preview.getText() + "8");

                break;

            case R.id.button25:    //9
                preview.setText(preview.getText() + "9");

                break;

            case R.id.button26:    //*
                String tpMultiple = (String)preview.getText();
                char[] carrMultiple = tpMultiple.toCharArray();
                int endMultiple = carrMultiple.length - 1;
                if (carrMultiple[endMultiple] < '0' || carrMultiple[endMultiple] > '9'){    //부호면
                    carrMultiple[endMultiple] = '*';
                    tpMultiple = new String(carrMultiple);
                    preview.setText(tpMultiple);
                }
                else {
                    preview.setText(preview.getText() + "*");
                }
                break;

            case R.id.button27:    //cancel
                result.setText("");
                preview.setText("");
                break;

            case R.id.button28:    //0
                preview.setText(preview.getText() + "0");

                break;

            case R.id.button29:    //run


//                String str = (String) preview.getText();
//                String[] istr = str.split("(?<=[*/+-])|(?=[*/+-])");
//
//                double sum = 0;
//
//                if (istr[1].equals("+")) {
//                    sum = Integer.parseInt(istr[0]) + Integer.parseInt(istr[2]);
//                    System.out.println("plus");
//                }
//                else if (istr[1].equals("-")) {
//                    sum = Integer.parseInt(istr[0]) - Integer.parseInt(istr[2]);
//                    System.out.println("minus");
//                }
//                else if (istr[1].equals("*")) {
//                    sum = Integer.parseInt(istr[0]) * Integer.parseInt(istr[2]);
//                    System.out.println("multiple");
//                }
//                else if (istr[1].equals("/")) {
//                    sum = Integer.parseInt(istr[0]) / Integer.parseInt(istr[2]);
//                    System.out.println("divide");
//                }
//                result.setText(sum + "");
                //Double.parseDouble(istr[0])

                this.total();
                break;

            case R.id.button30:    ///
                String tpDivide = (String)preview.getText();
                char[] carrDivide = tpDivide.toCharArray();
                int endDivide = carrDivide.length - 1;
                if (carrDivide[endDivide] < '0' || carrDivide[endDivide] > '9'){    //부호면
                    carrDivide[endDivide] = '/';
                    tpDivide = new String(carrDivide);
                    preview.setText(tpDivide);
                }
                else {
                    preview.setText(preview.getText() + "/");
                }
                break;
        }
    }

    public void total()
    {
        ArrayList<String> iarr = new ArrayList<String>();
        String str = (String) preview.getText();
        char[] charr = str.toCharArray();
        int size = str.length();

        int temp = 0;

        if (charr[charr.length-1] < '0' || charr[charr.length-1] > '9') {    //부호면
            Toast.makeText(getApplicationContext(), "수식확인염", Toast.LENGTH_SHORT).show();
        }
        else {
            String[] istr = str.split("(?<=[*/+-])|(?=[*/+-])");

            int idx = 0;
            int itemp1, itemp2;
            int isize = 0;
            itemp1 = 0;
            itemp2 = 0;
            for (String item : istr) {
                iarr.add(item);
            }

            for (; idx < iarr.size();) {
                double sum = 0;
                String item = iarr.get(idx);
                if (item.equals("*")) { //부호면
                    double first = Double.parseDouble(iarr.get(idx -1));
                    double second = Double.parseDouble(iarr.get(idx +1));
                    sum = first*second;

                    iarr.set(idx, sum+"");
                    iarr.remove(idx+1);
                    iarr.remove(idx-1);

                } else if (item.equals("/")) { //부호면
                    double first = Double.parseDouble(iarr.get(idx -1));
                    double second = Double.parseDouble(iarr.get(idx +1));
                    sum = first/second;

                    iarr.set(idx, sum+"");
                    iarr.remove(idx+1);
                    iarr.remove(idx-1);
                }
                else {
                    idx++;
                }
            }

            idx = 0;
            for (; idx < iarr.size();) {
                double sum = 0;
                String item = iarr.get(idx);
                if (item.equals("+")) { //부호면
                    double first = Double.parseDouble(iarr.get(idx -1));
                    double second = Double.parseDouble(iarr.get(idx +1));
                    sum = first+second;

                    iarr.set(idx, sum+"");
                    iarr.remove(idx+1);
                    iarr.remove(idx-1);

                } else if (item.equals("-")) { //부호면
                    double first = Double.parseDouble(iarr.get(idx -1));
                    double second = Double.parseDouble(iarr.get(idx +1));
                    sum = first-second;

                    iarr.set(idx, sum+"");
                    iarr.remove(idx+1);
                    iarr.remove(idx-1);
                }
                else {
                    idx++;
                }
            }

            result.setText(iarr.get(0));
//
//            int ss = 0;
//            int se = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (carr[i] < '0' || carr[i] > '9') { //부호면
//
//                    se = i;
//                    for (int j = i - 1; j >= 0; j--) {
//                        if (carr[j] < '0' || carr[i] > '9') {
//                            ss = j + 1;
//                        }
//                    }
//                    char[] temp1 = new char[se-ss];
//
//                    for ( int k = 0; k < se-ss; k++)
//                    {
//                        temp1[k] = carr[ss + k];
//                    }
//                    iarr[isize] = Integer.parseInt(new String(temp1));
//                    code[isize] = carr[i];
//                    isize++;
//
//                    int check;
//                    for (check = i+1; check < str.length(); check++) {
//                        if (carr[check] < '0' || carr[check] > '9') {
//                            check = str.length() + 10;
//                        }
//                    }
//
//                    if (check == str.length()) {
//                        char[] temp2 = new char[str.length() - (i+1)];
//                        for (int l = i + 1; l < str.length(); l++) {
//                            temp2[l - (i + 1)] = carr[l];
//                        }
//                        iarr[isize] = Integer.parseInt(new String(temp1));
//                        isize++;
//                    }
//                }
//            }
//
//            // result.setText(isum + "");
//
//            int[] iarr2 = new int[isize];
//            char[] code2 = new char[isize-1];
//
//            int pack = 0;
//            for (int i = 0; i < isize; i++) {
//                if ( code[i] == '*') {
//                    iarr2[pack] = iarr[i] * iarr[i+1];
//                }else if( code[i] == '/') {
//                    iarr2[pack] = iarr[i] / iarr[i+1];
//                }
//                else {
//                    if (isize -1 == i)
//                    {
//                        iarr2[pack] = iarr[i];
//                    }
//                    else {
//                        code2[pack] = code[i];
//                        iarr2[pack] = iarr[i];
//                        pack++;
//                    }
//                }
//            }
//
//            int total = iarr2[0];
//            for (int i = 0; i < pack; i++) {
//                if (code2[i] == '+') {
//                    total = total + iarr2[i+1];
//                }
//                else {
//                    total = total - iarr2[i+1];
//                }
//                if (pack - 1 == i) {
//                    i++;
//                }
//            }
//            result.setText("");
        }
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Widget Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
