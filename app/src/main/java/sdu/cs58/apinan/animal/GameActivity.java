package sdu.cs58.apinan.animal;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {

    //Explicit
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;
    int questionCount = 10;
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String answer;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Initial view
        btn1 = findViewById(R.id.vtn1);
        btn2 = findViewById(R.id.vtn2);
        btn3 = findViewById(R.id.vtn3);
        btn4 = findViewById(R.id.vtn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumnImageButton = findViewById(R.id.imbVolumn);

        //แสดงคำถาม
        for (int i=1; i <= questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);   //กำหนดการ random คำถาม
        setQuestion(qID.remove(0));
    }//end onCreate Method

    private void setQuestion(int qID) { // method setQuestion ทำหน้าที่กำหนดข้อคำถ่มและเฉลยในแต่ละข้อ

        if (qID == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);
            mediaPlayer = MediaPlayer.create(this, R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ม้า");
            choice.add("แมว");
            choice.add("หมู");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แมว");
            choice.add("ม้า");
            choice.add("หมู");
            choice.add("นก");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("วัว");
            choice.add("ม้า");
            choice.add("ช้าง");
            choice.add("หมู");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 4) {
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog);
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมา");
            choice.add("ยุ่ง");
            choice.add("สิงโต");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("ม้า");
            choice.add("แมว");
            choice.add("ยุ่ง");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ม้า");
            choice.add("หมู");
            choice.add("แกะ");
            choice.add("หมู");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("ยุง");
            choice.add("ช้าง");
            choice.add("หมู");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID ==8) {
            answer = "ยุ่ง";
            questionImageView.setImageResource(R.drawable.mosquito);
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ยุ่ง");
            choice.add("หมู");
            choice.add("ช้าง");
            choice.add("สิงโต");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมู");
            choice.add("ม้า");
            choice.add("หมา");
            choice.add("แมว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แกะ");
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("หมู");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
    }//end setQuestion Method

    public void choiceAns (View view){ //สำหรับไว้ตรวจคำตอบ

        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)){
            score++;
        }

        if (qID.isEmpty()) {//ถ้าทำครบทุกข้อเเล้ว qid เป็นค่าว่าง
            dialogboxScore();//สำหรับเเสดงคะเเนนรวม
        }else {//ถ้ายังทำไม่ครบทุกข้อ
            setQuestion(qID.remove(0));//เรียก method  setQuestion เเสดงค่าคำถามถัดไป
        }


    }//end choiceAns

    private void dialogboxScore() {// Method สำหรับเเสดงคะเนน
        AlertDialog.Builder builder =  new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะเเนนจ้า");
        builder.setMessage("ได้คะเเนน "+ score +" คะแนน")
                .setCancelable(false)
                .setPositiveButton("ออกจากเกม",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();//ปิด Activity ออกจากแอป
                    }
                })
                .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);//กำหนดให้สร้าง
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();//กำหนดให้เเสดง

    }// end dialogboxScore method

    public void playSound(View view) {
        mediaPlayer.start();
    }//end playSound Method

}// end Class