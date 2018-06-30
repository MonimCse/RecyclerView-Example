package org.login.com.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.login.com.recyclerviewexample.adapter.UserAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRvUserList;

    List<String> userList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   /*     userList.add("x");
        userList.add("y");
        userList.add("z");
        userList.add("a");*/

        mRvUserList = findViewById(R.id.rv_userlist);
        mRvUserList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRvUserList.setAdapter(new UserAdapter(userList));
    }
}
