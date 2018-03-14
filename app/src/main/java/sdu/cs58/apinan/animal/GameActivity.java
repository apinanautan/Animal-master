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

    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;
    int questionCount = 1;
    ArrayList<Integer> qID = new ArrayList<Integer>();//เป็นตัวชนิดสุ่มคำถามโดยเป็นชนิดจำนวนเต็ม
    String answer;//เป็นตัวแปรไว้เก็บคำตอบ
    int score = 0;//เป็นตัวแปรไว้เก็บคะแนน ค่าเริ่มต้นเป็น0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //ผูก in
        btn1 = findViewById(R.id.vtn1);
        btn2 = findViewById(R.id.vtn2);
        btn3 = findViewById(R.id.vtn3);
        btn4 = findViewById(R.id.vtn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumnImageButton = findViewById(R.id.imbVolumn);

        //แสดงคำถาม
        for (int i= 1; i<= questionCount; i++){
            qID.add(i); //เช็คจำนวนคำถาม
        }
        Collections.shuffle(qID);//กำหนดคำถามแบบสุ่ม
        setQuestion(qID.remove(0)); // กำหนดข้อคำถามในเเต่ละข้อ




    }//end Method


    //ใช้สำหรับกำหนดข้อคำถามเเละเฉลยในเเต่ละข้อ
    private void setQuestion(int qID) {
        if (qID == 1){
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);
            mediaPlayer = MediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("หมา");
            choice.add("แกะ");
            Collections.shuffle(choice);//กำหนดให้สุ่มคำถาม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));


        }


    }//end setQurstion Method

    public void choiceAns(View view){ //ตรวจคำตอบ
        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)){
            score++;
        }
        if (qID.isEmpty()) {//ถ้าทำครบทุกข้อเเล้ว qID จะเป็นค่าว่าง
            dialogboxScore(); // เป็น method เเสดงคะเเนนรวม
        }else {
            setQuestion(qID.remove(0));


        }


    }//end choiceAns

    private void dialogboxScore() {// method dialogboxScore
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะเเนนจ้า");
        builder.setMessage("ได้คะเเนน "+ score +"คะเเนน")
            .setCancelable(false)
            .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            })
            .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            });
        AlertDialog alertDialog =builder.create();
        alertDialog.show();





    }// end dialogboxScore


    public void playSound(View view){
        mediaPlayer.start();


    }//end playSound Method

}//endclass
