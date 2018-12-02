package com.example.besby.poisoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class day2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);
        String user = " ";

        user = getIntent().getStringExtra("name1");

        TextView textView = (TextView)findViewById(R.id.textView2);
        switch (user){
            case "Понедельник": textView.setText("11:40-13:50\n              Физкультура \n13:50-15:25\n              ЛК ТАУ \n15:40-17:15\n              ЛК Инновационная деятельность \n17:30-19:05\n              ЛР Метрология (2 неделя) ");break;
            case "Вторник": textView.setText("13:50-15:40\n              ЛК Педагогика семьи \n15:40-17:15\n              ЛР ТОИИ \n17:30-19:05\n              ПЗ Экономика \n19:20-20:55\n              КП ТОИИ (1 неделя)");break;
            case "Среда"  : textView.setText("11:40-13:50\n              ЛР Сулим \n13:50-15:25\n              ЛК Электрические машины (1 неделя)\n              ЛК ТОИИ (2 неделя) \n15:40-17:15\n              ЛР ТОИИ (1 неделя)");break;
            case "Четверг": textView.setText("11:40-13:50\n              Физкультура \n13:50-15:25\n              ЛК Сулим \n15:40-17:15\n              КП Детали машин (1 неделя)\n              ПЗ Энергосбережение (2 неделя)\n17:30-19:05\n              ЛР Сулим (2 неделя) ");break;
            case "Пятница": textView.setText("11:40-13:50\n              ЛР ТАУ \n13:50-15:25\n              ЛК Энергосбережение (1 неделя)\n              ЛК Метрология (2 неделя) \n15:40-17:15\n              ЛК ТОИИ \n17:30-19:05\n              ЛК Экономика");break;
            case "Суббота": textView.setText("11:40-13:50\n              ЛР Электрические машины \n13:50-15:25\n              ПЗ ТАУ (1 неделя)\n              ПЗ Электрические машины (2 неделя) ");break;

        }
    }
}
