package jp.study.chatapplicarion;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedHashMap;

public class ChatActivity extends ActionBarActivity implements View.OnClickListener{

    private EditText mInputMessage;
    private Button mSendMessage;
    private LinearLayout mMessageLog;
    private TextView mCpuMessage;
    private TextView mUserMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        mInputMessage = (EditText) findViewById(R.id.input_message);
        mSendMessage = (Button) findViewById(R.id.send_message);
        mMessageLog = (LinearLayout) findViewById(R.id.message_log);
        mCpuMessage = (TextView) findViewById(R.id.cpu_message);
        mUserMessage = (TextView) findViewById(R.id.user_message);
        mSendMessage.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chat, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.equals(mSendMessage)) {
            String inputText = mInputMessage.getText().toString();
            mUserMessage.setText(inputText);
            mCpuMessage.setText("それはいい");
            mInputMessage.setText("");
        }
    }
}
