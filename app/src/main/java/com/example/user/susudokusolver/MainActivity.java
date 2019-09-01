package com.example.user.susudokusolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et11,et12,et13,et14,et15,et16,et17,et18,et19,
            et21,et22,et23,et24,et25,et26,et27,et28,et29,
            et31,et32,et33,et34,et35,et36,et37,et38,et39,
            et41,et42,et43,et44,et45,et46,et47,et48,et49,
            et51,et52,et53,et54,et55,et56,et57,et58,et59,
            et61,et62,et63,et64,et65,et66,et67,et68,et69,
            et71,et72,et73,et74,et75,et76,et77,et78,et79,
            et81,et82,et83,et84,et85,et86,et87,et88,et89,
            et91,et92,et93,et94,et95,et96,et97,et98,et99;

    Button btn1,btn2;
    int N=9;
    int UNASSIGNED=0;
    int row1,col1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

        et11=findViewById(R.id.et11);
        et12=findViewById(R.id.et12);
        et13=findViewById(R.id.et13);
        et14=findViewById(R.id.et14);
        et15=findViewById(R.id.et15);
        et16=findViewById(R.id.et16);
        et17=findViewById(R.id.et17);
        et18=findViewById(R.id.et18);
        et19=findViewById(R.id.et19);
        et21=findViewById(R.id.et21);
        et22=findViewById(R.id.et22);
        et23=findViewById(R.id.et23);
        et24=findViewById(R.id.et24);
        et25=findViewById(R.id.et25);
        et26=findViewById(R.id.et26);
        et27=findViewById(R.id.et27);
        et28=findViewById(R.id.et28);
        et29=findViewById(R.id.et29);
        et31=findViewById(R.id.et31);
        et32=findViewById(R.id.et32);
        et33=findViewById(R.id.et33);
        et34=findViewById(R.id.et34);
        et35=findViewById(R.id.et35);
        et36=findViewById(R.id.et36);
        et37=findViewById(R.id.et37);
        et38=findViewById(R.id.et38);
        et39=findViewById(R.id.et39);
        et41=findViewById(R.id.et41);
        et42=findViewById(R.id.et42);
        et43=findViewById(R.id.et43);
        et44=findViewById(R.id.et44);
        et45=findViewById(R.id.et45);
        et46=findViewById(R.id.et46);
        et47=findViewById(R.id.et47);
        et48=findViewById(R.id.et48);
        et49=findViewById(R.id.et49);
        et51=findViewById(R.id.et51);
        et52=findViewById(R.id.et52);
        et53=findViewById(R.id.et53);
        et54=findViewById(R.id.et54);
        et55=findViewById(R.id.et55);
        et56=findViewById(R.id.et56);
        et57=findViewById(R.id.et57);
        et58=findViewById(R.id.et58);
        et59=findViewById(R.id.et59);
        et61=findViewById(R.id.et61);
        et62=findViewById(R.id.et62);
        et63=findViewById(R.id.et63);
        et64=findViewById(R.id.et64);
        et65=findViewById(R.id.et65);
        et66=findViewById(R.id.et66);
        et67=findViewById(R.id.et67);
        et68=findViewById(R.id.et68);
        et69=findViewById(R.id.et69);
        et71=findViewById(R.id.et71);
        et72=findViewById(R.id.et72);
        et73=findViewById(R.id.et73);
        et74=findViewById(R.id.et74);
        et75=findViewById(R.id.et75);
        et76=findViewById(R.id.et76);
        et77=findViewById(R.id.et77);
        et78=findViewById(R.id.et78);
        et79=findViewById(R.id.et79);
        et81=findViewById(R.id.et81);
        et82=findViewById(R.id.et82);
        et83=findViewById(R.id.et83);
        et84=findViewById(R.id.et84);
        et85=findViewById(R.id.et85);
        et86=findViewById(R.id.et86);
        et87=findViewById(R.id.et87);
        et88=findViewById(R.id.et88);
        et89=findViewById(R.id.et89);
        et91=findViewById(R.id.et91);
        et92=findViewById(R.id.et92);
        et93=findViewById(R.id.et93);
        et94=findViewById(R.id.et94);
        et95=findViewById(R.id.et95);
        et96=findViewById(R.id.et96);
        et97=findViewById(R.id.et97);
        et98=findViewById(R.id.et98);
        et99=findViewById(R.id.et99);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int grid[][]=new int[9][9];
                try{
                    grid[0][0]=Integer.parseInt(et11.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[0][0]=0;
                }
                try{
                    grid[0][1]=Integer.parseInt(et12.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[0][1]=0;
                }
                try{
                    grid[0][2]=Integer.parseInt(et13.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[0][2]=0;
                }
                try{
                    grid[0][3]=Integer.parseInt(et14.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[0][3]=0;
                }
                try{
                    grid[0][4]=Integer.parseInt(et15.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[0][4]=0;
                }
                try{
                    grid[0][5]=Integer.parseInt(et16.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[0][5]=0;
                }
                try{
                    grid[0][6]=Integer.parseInt(et17.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[0][6]=0;
                }
                try{
                    grid[0][7]=Integer.parseInt(et18.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[0][7]=0;
                }
                try{
                    grid[0][8]=Integer.parseInt(et19.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[0][8]=0;
                }
                try{
                    grid[1][0]=Integer.parseInt(et21.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[1][0]=0;
                }
                try{
                    grid[1][1]=Integer.parseInt(et22.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[1][1]=0;
                }
                try{
                    grid[1][2]=Integer.parseInt(et23.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[1][2]=0;
                }
                try{
                    grid[1][3]=Integer.parseInt(et24.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[1][3]=0;
                }
                try{
                    grid[1][4]=Integer.parseInt(et25.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[1][4]=0;
                }
                try{
                    grid[1][5]=Integer.parseInt(et26.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[1][5]=0;
                }
                try{
                    grid[1][6]=Integer.parseInt(et27.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[1][6]=0;
                }
                try{
                    grid[1][7]=Integer.parseInt(et28.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[1][7]=0;
                }
                try{
                    grid[1][8]=Integer.parseInt(et29.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[1][8]=0;
                }
                try{
                    grid[2][0]=Integer.parseInt(et31.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[2][0]=0;
                }
                try{
                    grid[2][1]=Integer.parseInt(et32.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[2][1]=0;
                }
                try{
                    grid[2][2]=Integer.parseInt(et33.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[2][2]=0;
                }
                try{
                    grid[2][3]=Integer.parseInt(et34.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[2][3]=0;
                }
                try{
                    grid[2][4]=Integer.parseInt(et35.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[2][4]=0;
                }
                try{
                    grid[2][5]=Integer.parseInt(et36.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[2][5]=0;
                }
                try{
                    grid[2][6]=Integer.parseInt(et37.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[2][6]=0;
                }
                try{
                    grid[2][7]=Integer.parseInt(et38.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[2][7]=0;
                }
                try{
                    grid[2][8]=Integer.parseInt(et39.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[2][8]=0;
                }
                try{
                    grid[3][0]=Integer.parseInt(et41.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[3][0]=0;
                }
                try{
                    grid[3][1]=Integer.parseInt(et42.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[3][1]=0;
                }
                try{
                    grid[3][2]=Integer.parseInt(et43.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[3][2]=0;
                }
                try{
                    grid[3][3]=Integer.parseInt(et44.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[3][3]=0;
                }
                try{
                    grid[3][4]=Integer.parseInt(et45.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[3][4]=0;
                }
                try{
                    grid[3][5]=Integer.parseInt(et46.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[3][5]=0;
                }
                try{
                    grid[3][6]=Integer.parseInt(et47.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[3][6]=0;
                }
                try{
                    grid[3][7]=Integer.parseInt(et48.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[3][7]=0;
                }
                try{
                    grid[3][8]=Integer.parseInt(et49.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[3][8]=0;
                }
                try{
                    grid[4][0]=Integer.parseInt(et51.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[4][0]=0;
                }
                try{
                    grid[4][1]=Integer.parseInt(et52.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[4][1]=0;
                }
                try{
                    grid[4][2]=Integer.parseInt(et53.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[4][2]=0;
                }
                try{
                    grid[4][3]=Integer.parseInt(et54.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[4][3]=0;
                }
                try{
                    grid[4][4]=Integer.parseInt(et55.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[4][4]=0;
                }
                try{
                    grid[4][5]=Integer.parseInt(et56.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[4][5]=0;
                }
                try{
                    grid[4][6]=Integer.parseInt(et57.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[4][6]=0;
                }
                try{
                    grid[4][7]=Integer.parseInt(et58.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[4][7]=0;
                }
                try{
                    grid[4][8]=Integer.parseInt(et59.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[4][8]=0;
                }
                try{
                    grid[5][0]=Integer.parseInt(et61.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[5][0]=0;
                }
                try{
                    grid[5][1]=Integer.parseInt(et62.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[5][1]=0;
                }
                try{
                    grid[5][2]=Integer.parseInt(et63.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[5][2]=0;
                }
                try{
                    grid[5][3]=Integer.parseInt(et64.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[5][3]=0;
                }
                try{
                    grid[5][4]=Integer.parseInt(et65.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[5][4]=0;
                }
                try{
                    grid[5][5]=Integer.parseInt(et66.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[5][5]=0;
                }
                try{
                    grid[5][6]=Integer.parseInt(et67.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[5][6]=0;
                }
                try{
                    grid[5][7]=Integer.parseInt(et68.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[5][7]=0;
                }
                try{
                    grid[5][8]=Integer.parseInt(et69.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[5][8]=0;
                }
                try{
                    grid[6][0]=Integer.parseInt(et71.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[6][0]=0;
                }
                try{
                    grid[6][1]=Integer.parseInt(et72.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[6][1]=0;
                }
                try{
                    grid[6][2]=Integer.parseInt(et73.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[6][2]=0;
                }
                try{
                    grid[6][3]=Integer.parseInt(et74.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[6][3]=0;
                }
                try{
                    grid[6][4]=Integer.parseInt(et75.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[6][4]=0;
                }
                try{
                    grid[6][5]=Integer.parseInt(et76.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[6][5]=0;
                }
                try{
                    grid[6][6]=Integer.parseInt(et77.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[6][6]=0;
                }
                try{
                    grid[6][7]=Integer.parseInt(et78.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[6][7]=0;
                }
                try{
                    grid[6][8]=Integer.parseInt(et79.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[6][8]=0;
                }
                try{
                    grid[7][0]=Integer.parseInt(et81.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[7][0]=0;
                }
                try{
                    grid[7][1]=Integer.parseInt(et82.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[7][1]=0;
                }
                try{
                    grid[7][2]=Integer.parseInt(et83.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[7][2]=0;
                }
                try{
                    grid[7][3]=Integer.parseInt(et84.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[7][3]=0;
                }
                try{
                    grid[7][4]=Integer.parseInt(et85.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[7][4]=0;
                }
                try{
                    grid[7][5]=Integer.parseInt(et86.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[7][5]=0;
                }
                try{
                    grid[7][6]=Integer.parseInt(et87.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[7][6]=0;
                }
                try{
                    grid[7][7]=Integer.parseInt(et88.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[7][7]=0;
                }
                try{
                    grid[7][8]=Integer.parseInt(et89.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[7][8]=0;
                }
                try{
                    grid[8][0]=Integer.parseInt(et91.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[8][0]=0;
                }
                try{
                    grid[8][1]=Integer.parseInt(et92.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[8][1]=0;
                }
                try{
                    grid[8][2]=Integer.parseInt(et93.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[8][2]=0;
                }
                try{
                    grid[8][3]=Integer.parseInt(et94.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[8][3]=0;
                }
                try{
                    grid[8][4]=Integer.parseInt(et95.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[8][4]=0;
                }
                try{
                    grid[8][5]=Integer.parseInt(et96.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[8][5]=0;
                }
                try{
                    grid[8][6]=Integer.parseInt(et97.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[8][6]=0;
                }
                try{
                    grid[8][7]=Integer.parseInt(et98.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[8][7]=0;
                }
                try{
                    grid[8][8]=Integer.parseInt(et99.getText().toString());
                }
                catch (NumberFormatException e){
                    grid[8][8]=0;
                }

                boolean ck=false;
                for (int row = 0; row < N; row++) {
                    for (int col = 0; col < N; col++) {
                        if (grid[row][col] != 0) {
                            for (int row2 = 0; row2 < row; row2++) {
                                if (grid[row][col] == grid[row2][col])
                                    ck = true;
                            }
                            for (int row2 = row + 1; row2 < N; row2++) {
                                if (grid[row][col] == grid[row2][col])
                                    ck = true;
                            }
                            for (int col2 = 0; col2 < col; col2++) {
                                if (grid[row][col] == grid[row][col2])
                                    ck = true;
                            }
                            for (int col2 = col + 1; col2 < N; col2++) {
                                if (grid[row][col] == grid[row][col2])
                                    ck = true;
                            }
                            for (int row2 = 0; row2 < 3; row2++)
                                for (int col2 = 0; col2 < 3; col2++)
                                    if (grid[row2+row-row%3][col2+col-col%3] == grid[row][col]){
                                        if((row2+row-row%3)!=row || (col2+col-col%3)!=col)
                                            ck = true;
                                    }

                        }
                    }
                }
                if(ck){
                    Toast.makeText(MainActivity.this,"No Solution Exist",Toast.LENGTH_LONG).show();
                }
                else if (SolveSudoku(grid)){
                    printGrid(grid);
                    Toast.makeText(MainActivity.this,"Solved",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"No Solution Exist",Toast.LENGTH_LONG).show();
                }
                et11.setFocusable(false);
                et12.setFocusable(false);
                et13.setFocusable(false);
                et14.setFocusable(false);
                et15.setFocusable(false);
                et16.setFocusable(false);
                et17.setFocusable(false);
                et18.setFocusable(false);
                et19.setFocusable(false);
                et21.setFocusable(false);
                et22.setFocusable(false);
                et23.setFocusable(false);
                et24.setFocusable(false);
                et25.setFocusable(false);
                et26.setFocusable(false);
                et27.setFocusable(false);
                et28.setFocusable(false);
                et29.setFocusable(false);
                et31.setFocusable(false);
                et32.setFocusable(false);
                et33.setFocusable(false);
                et34.setFocusable(false);
                et35.setFocusable(false);
                et36.setFocusable(false);
                et37.setFocusable(false);
                et38.setFocusable(false);
                et39.setFocusable(false);
                et41.setFocusable(false);
                et42.setFocusable(false);
                et43.setFocusable(false);
                et44.setFocusable(false);
                et45.setFocusable(false);
                et46.setFocusable(false);
                et47.setFocusable(false);
                et48.setFocusable(false);
                et49.setFocusable(false);
                et51.setFocusable(false);
                et52.setFocusable(false);
                et53.setFocusable(false);
                et54.setFocusable(false);
                et55.setFocusable(false);
                et56.setFocusable(false);
                et57.setFocusable(false);
                et58.setFocusable(false);
                et59.setFocusable(false);
                et61.setFocusable(false);
                et62.setFocusable(false);
                et63.setFocusable(false);
                et64.setFocusable(false);
                et65.setFocusable(false);
                et66.setFocusable(false);
                et67.setFocusable(false);
                et68.setFocusable(false);
                et69.setFocusable(false);
                et71.setFocusable(false);
                et72.setFocusable(false);
                et73.setFocusable(false);
                et74.setFocusable(false);
                et75.setFocusable(false);
                et76.setFocusable(false);
                et77.setFocusable(false);
                et78.setFocusable(false);
                et79.setFocusable(false);
                et81.setFocusable(false);
                et82.setFocusable(false);
                et83.setFocusable(false);
                et84.setFocusable(false);
                et85.setFocusable(false);
                et86.setFocusable(false);
                et87.setFocusable(false);
                et88.setFocusable(false);
                et89.setFocusable(false);
                et91.setFocusable(false);
                et92.setFocusable(false);
                et93.setFocusable(false);
                et94.setFocusable(false);
                et95.setFocusable(false);
                et96.setFocusable(false);
                et97.setFocusable(false);
                et98.setFocusable(false);
                et99.setFocusable(false);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et11.setFocusableInTouchMode(true);
                et12.setFocusableInTouchMode(true);
                et13.setFocusableInTouchMode(true);
                et14.setFocusableInTouchMode(true);
                et15.setFocusableInTouchMode(true);
                et16.setFocusableInTouchMode(true);
                et17.setFocusableInTouchMode(true);
                et18.setFocusableInTouchMode(true);
                et19.setFocusableInTouchMode(true);
                et21.setFocusableInTouchMode(true);
                et22.setFocusableInTouchMode(true);
                et23.setFocusableInTouchMode(true);
                et24.setFocusableInTouchMode(true);
                et25.setFocusableInTouchMode(true);
                et26.setFocusableInTouchMode(true);
                et27.setFocusableInTouchMode(true);
                et28.setFocusableInTouchMode(true);
                et29.setFocusableInTouchMode(true);
                et31.setFocusableInTouchMode(true);
                et32.setFocusableInTouchMode(true);
                et33.setFocusableInTouchMode(true);
                et34.setFocusableInTouchMode(true);
                et35.setFocusableInTouchMode(true);
                et36.setFocusableInTouchMode(true);
                et37.setFocusableInTouchMode(true);
                et38.setFocusableInTouchMode(true);
                et39.setFocusableInTouchMode(true);
                et41.setFocusableInTouchMode(true);
                et42.setFocusableInTouchMode(true);
                et43.setFocusableInTouchMode(true);
                et44.setFocusableInTouchMode(true);
                et45.setFocusableInTouchMode(true);
                et46.setFocusableInTouchMode(true);
                et47.setFocusableInTouchMode(true);
                et48.setFocusableInTouchMode(true);
                et49.setFocusableInTouchMode(true);
                et51.setFocusableInTouchMode(true);
                et52.setFocusableInTouchMode(true);
                et53.setFocusableInTouchMode(true);
                et54.setFocusableInTouchMode(true);
                et55.setFocusableInTouchMode(true);
                et56.setFocusableInTouchMode(true);
                et57.setFocusableInTouchMode(true);
                et58.setFocusableInTouchMode(true);
                et59.setFocusableInTouchMode(true);
                et61.setFocusableInTouchMode(true);
                et62.setFocusableInTouchMode(true);
                et63.setFocusableInTouchMode(true);
                et64.setFocusableInTouchMode(true);
                et65.setFocusableInTouchMode(true);
                et66.setFocusableInTouchMode(true);
                et67.setFocusableInTouchMode(true);
                et68.setFocusableInTouchMode(true);
                et69.setFocusableInTouchMode(true);
                et71.setFocusableInTouchMode(true);
                et72.setFocusableInTouchMode(true);
                et73.setFocusableInTouchMode(true);
                et74.setFocusableInTouchMode(true);
                et75.setFocusableInTouchMode(true);
                et76.setFocusableInTouchMode(true);
                et77.setFocusableInTouchMode(true);
                et78.setFocusableInTouchMode(true);
                et79.setFocusableInTouchMode(true);
                et81.setFocusableInTouchMode(true);
                et82.setFocusableInTouchMode(true);
                et83.setFocusableInTouchMode(true);
                et84.setFocusableInTouchMode(true);
                et85.setFocusableInTouchMode(true);
                et86.setFocusableInTouchMode(true);
                et87.setFocusableInTouchMode(true);
                et88.setFocusableInTouchMode(true);
                et89.setFocusableInTouchMode(true);
                et91.setFocusableInTouchMode(true);
                et92.setFocusableInTouchMode(true);
                et93.setFocusableInTouchMode(true);
                et94.setFocusableInTouchMode(true);
                et95.setFocusableInTouchMode(true);
                et96.setFocusableInTouchMode(true);
                et97.setFocusableInTouchMode(true);
                et98.setFocusableInTouchMode(true);
                et99.setFocusableInTouchMode(true);;


                et11.setText("");
                et12.setText("");
                et13.setText("");
                et14.setText("");
                et15.setText("");
                et16.setText("");
                et17.setText("");
                et18.setText("");
                et19.setText("");
                et21.setText("");
                et22.setText("");
                et23.setText("");
                et24.setText("");
                et25.setText("");
                et26.setText("");
                et27.setText("");
                et28.setText("");
                et29.setText("");
                et31.setText("");
                et32.setText("");
                et33.setText("");
                et34.setText("");
                et35.setText("");
                et36.setText("");
                et37.setText("");
                et38.setText("");
                et39.setText("");
                et41.setText("");
                et42.setText("");
                et43.setText("");
                et44.setText("");
                et45.setText("");
                et46.setText("");
                et47.setText("");
                et48.setText("");
                et49.setText("");
                et51.setText("");
                et52.setText("");
                et53.setText("");
                et54.setText("");
                et55.setText("");
                et56.setText("");
                et57.setText("");
                et58.setText("");
                et59.setText("");
                et61.setText("");
                et62.setText("");
                et63.setText("");
                et64.setText("");
                et65.setText("");
                et66.setText("");
                et67.setText("");
                et68.setText("");
                et69.setText("");
                et71.setText("");
                et72.setText("");
                et73.setText("");
                et74.setText("");
                et75.setText("");
                et76.setText("");
                et77.setText("");
                et78.setText("");
                et79.setText("");
                et81.setText("");
                et82.setText("");
                et83.setText("");
                et84.setText("");
                et85.setText("");
                et86.setText("");
                et87.setText("");
                et88.setText("");
                et89.setText("");
                et91.setText("");
                et92.setText("");
                et93.setText("");
                et94.setText("");
                et95.setText("");
                et96.setText("");
                et97.setText("");
                et98.setText("");
                et99.setText("");
            }
        });
    }
    public void printGrid(int grid[][]){
        et11.setText(String.valueOf(grid[0][0]));
        et12.setText(String.valueOf(grid[0][1]));
        et13.setText(String.valueOf(grid[0][2]));
        et14.setText(String.valueOf(grid[0][3]));
        et15.setText(String.valueOf(grid[0][4]));
        et16.setText(String.valueOf(grid[0][5]));
        et17.setText(String.valueOf(grid[0][6]));
        et18.setText(String.valueOf(grid[0][7]));
        et19.setText(String.valueOf(grid[0][8]));
        et21.setText(String.valueOf(grid[1][0]));
        et22.setText(String.valueOf(grid[1][1]));
        et23.setText(String.valueOf(grid[1][2]));
        et24.setText(String.valueOf(grid[1][3]));
        et25.setText(String.valueOf(grid[1][4]));
        et26.setText(String.valueOf(grid[1][5]));
        et27.setText(String.valueOf(grid[1][6]));
        et28.setText(String.valueOf(grid[1][7]));
        et29.setText(String.valueOf(grid[1][8]));
        et31.setText(String.valueOf(grid[2][0]));
        et32.setText(String.valueOf(grid[2][1]));
        et33.setText(String.valueOf(grid[2][2]));
        et34.setText(String.valueOf(grid[2][3]));
        et35.setText(String.valueOf(grid[2][4]));
        et36.setText(String.valueOf(grid[2][5]));
        et37.setText(String.valueOf(grid[2][6]));
        et38.setText(String.valueOf(grid[2][7]));
        et39.setText(String.valueOf(grid[2][8]));
        et41.setText(String.valueOf(grid[3][0]));
        et42.setText(String.valueOf(grid[3][1]));
        et43.setText(String.valueOf(grid[3][2]));
        et44.setText(String.valueOf(grid[3][3]));
        et45.setText(String.valueOf(grid[3][4]));
        et46.setText(String.valueOf(grid[3][5]));
        et47.setText(String.valueOf(grid[3][6]));
        et48.setText(String.valueOf(grid[3][7]));
        et49.setText(String.valueOf(grid[3][8]));
        et51.setText(String.valueOf(grid[4][0]));
        et52.setText(String.valueOf(grid[4][1]));
        et53.setText(String.valueOf(grid[4][2]));
        et54.setText(String.valueOf(grid[4][3]));
        et55.setText(String.valueOf(grid[4][4]));
        et56.setText(String.valueOf(grid[4][5]));
        et57.setText(String.valueOf(grid[4][6]));
        et58.setText(String.valueOf(grid[4][7]));
        et59.setText(String.valueOf(grid[4][8]));
        et61.setText(String.valueOf(grid[5][0]));
        et62.setText(String.valueOf(grid[5][1]));
        et63.setText(String.valueOf(grid[5][2]));
        et64.setText(String.valueOf(grid[5][3]));
        et65.setText(String.valueOf(grid[5][4]));
        et66.setText(String.valueOf(grid[5][5]));
        et67.setText(String.valueOf(grid[5][6]));
        et68.setText(String.valueOf(grid[5][7]));
        et69.setText(String.valueOf(grid[5][8]));
        et71.setText(String.valueOf(grid[6][0]));
        et72.setText(String.valueOf(grid[6][1]));
        et73.setText(String.valueOf(grid[6][2]));
        et74.setText(String.valueOf(grid[6][3]));
        et75.setText(String.valueOf(grid[6][4]));
        et76.setText(String.valueOf(grid[6][5]));
        et77.setText(String.valueOf(grid[6][6]));
        et78.setText(String.valueOf(grid[6][7]));
        et79.setText(String.valueOf(grid[6][8]));
        et81.setText(String.valueOf(grid[7][0]));
        et82.setText(String.valueOf(grid[7][1]));
        et83.setText(String.valueOf(grid[7][2]));
        et84.setText(String.valueOf(grid[7][3]));
        et85.setText(String.valueOf(grid[7][4]));
        et86.setText(String.valueOf(grid[7][5]));
        et87.setText(String.valueOf(grid[7][6]));
        et88.setText(String.valueOf(grid[7][7]));
        et89.setText(String.valueOf(grid[7][8]));
        et91.setText(String.valueOf(grid[8][0]));
        et92.setText(String.valueOf(grid[8][1]));
        et93.setText(String.valueOf(grid[8][2]));
        et94.setText(String.valueOf(grid[8][3]));
        et95.setText(String.valueOf(grid[8][4]));
        et96.setText(String.valueOf(grid[8][5]));
        et97.setText(String.valueOf(grid[8][6]));
        et98.setText(String.valueOf(grid[8][7]));
        et99.setText(String.valueOf(grid[8][8]));
    }
    boolean isSafe(int grid[][], int row, int col, int num){
        return !UsedInRow(grid, row, num) && !UsedInCol(grid, col, num) &&
                !UsedInBox(grid, row - row%3 , col - col%3, num);
    }
    boolean UsedInBox(int grid[][], int boxStartRow, int boxStartCol, int num){
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (grid[row+boxStartRow][col+boxStartCol] == num)
                    return true;
        return false;
    }
    boolean UsedInCol(int grid[][], int col, int num){
        for (int row = 0; row < N; row++)
            if (grid[row][col] == num)
                return true;
        return false;
    }
    boolean UsedInRow(int grid[][], int row, int num){
        for (int col = 0; col < N; col++)
            if (grid[row][col] == num)
                return true;
        return false;
    }
    boolean FindUnassignedLocation(int grid[][]){
        for (int row = 0; row < N; row++)
            for (int col = 0; col < N; col++)
                if (grid[row][col] == UNASSIGNED){
                    row1=row;
                    col1=col;
                    return true;
                }
        return false;
    }
    boolean SolveSudoku(int grid[][]){
        int row, col;
        if (!FindUnassignedLocation(grid))
            return true;

        row=row1;
        col=col1;
        for (int num = 1; num <= 9; num++) {
            if (isSafe(grid, row, col, num)) {

                grid[row][col] = num;

                if (SolveSudoku(grid))
                    return true;
                grid[row][col] = UNASSIGNED;
            }
        }
        return false;
    }
}
