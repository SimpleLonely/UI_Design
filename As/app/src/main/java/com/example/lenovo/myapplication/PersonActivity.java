package com.example.lenovo.myapplication;

        import android.os.Bundle;
        import android.app.Activity;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.SimpleAdapter;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class PersonActivity extends Activity {
    private String[] names = new String[]{"消息", "设置", "反馈","合作","评分"};
    private int[] imgIds = new int[]{R.mipmap.messages, R.mipmap.setting, R.mipmap.feedback,R.mipmap.cooperate,R.mipmap.evaluate};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        List<Map<String, Object>> listitem = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < names.length; i++) {
            Map<String, Object> showitem = new HashMap<String, Object>();
            showitem.put("imgs", imgIds[i]);
            showitem.put("name", names[i]);
            listitem.add(showitem);
        }

        SimpleAdapter myAdapter = new SimpleAdapter(getApplicationContext(), listitem, R.layout.person_list_item, new String[]{"imgs", "name"}, new int[]{R.id.imgtou, R.id.name

        });
        ListView listView = (ListView) findViewById(R.id.person_list);
        listView.setAdapter(myAdapter);
    }
};


