package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button restart;
    private TextView result;

    private int[][] game = new int[3][3];

    boolean starter = true;
    boolean gameOver = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        restart = (Button) findViewById(R.id.restart);
        result = (TextView) findViewById(R.id.result);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gameOver) {
                    if (starter) {
                        button1.setText("X");
                        game[0][0] = 1;
                        starter = false;
                    } else {
                        button1.setText("O");
                        game[0][0] = 2;
                        starter = true;
                    }
                    checkGame();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gameOver) {
                    if (starter) {
                        button2.setText("X");
                        game[0][1] = 1;
                        starter = false;
                    } else {
                        button2.setText("O");
                        game[0][1] = 2;
                        starter = true;
                    }
                    checkGame();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gameOver) {
                    if (starter) {
                        button3.setText("X");
                        game[0][2] = 1;
                        starter = false;
                    } else {
                        button3.setText("O");
                        game[0][2] = 2;
                        starter = true;
                    }
                    checkGame();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gameOver) {
                    if (starter) {
                        button4.setText("X");
                        game[1][0] = 1;
                        starter = false;
                    } else {
                        button4.setText("O");
                        game[1][0] = 2;
                        starter = true;
                    }
                    checkGame();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gameOver) {
                    if (starter) {
                        button5.setText("X");
                        game[1][1] = 1;
                        starter = false;
                    } else {
                        button5.setText("O");
                        game[1][1] = 2;
                        starter = true;
                    }
                    checkGame();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gameOver) {
                    if (starter) {
                        button6.setText("X");
                        game[1][2] = 1;
                        starter = false;
                    } else {
                        button6.setText("O");
                        game[1][2] = 2;
                        starter = true;
                    }
                    checkGame();
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gameOver) {
                    if (starter) {
                        button7.setText("X");
                        game[2][0] = 1;
                        starter = false;
                    } else {
                        button7.setText("O");
                        game[2][0] = 2;
                        starter = true;
                    }
                    checkGame();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gameOver) {
                    if (starter) {
                        button8.setText("X");
                        game[2][1] = 1;
                        starter = false;
                    } else {
                        button8.setText("O");
                        game[2][1] = 2;
                        starter = true;
                    }
                    checkGame();
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gameOver) {
                    if (starter) {
                        button9.setText("X");
                        game[2][2] = 1;
                        starter = false;
                    } else {
                        button9.setText("O");
                        game[2][2] = 2;
                        starter = true;
                    }
                    checkGame();
                }
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                game = new int[3][3];
                gameOver = false;
                starter = true;
            }
        });

    }

    private void checkGame() {
        if (winner() != null) {
            result.setText(winner()+" WON!");
            gameOver = true;
        }
    }

    private String winner() {
        if (game[0][0] != 0 && game[0][0]==game[0][1] && game[0][0]==game[0][2]) {
            return game[0][0] == 1 ? "X" : "O";
        }
        if (game[1][0] != 0 && game[1][0]==game[1][1] && game[1][0]==game[1][2]) {
            return game[1][0] == 1 ? "X" : "O";
        }
        if (game[2][0] != 0 && game[2][0]==game[2][1] && game[2][0]==game[2][2]) {
            return game[2][0] == 1 ? "X" : "O";
        }
        if (game[0][0] != 0 && game[0][0]==game[1][0] && game[0][0]==game[2][0]) {
            return game[0][0] == 1 ? "X" : "O";
        }
        if (game[0][1] != 0 && game[0][1]==game[1][1] && game[0][1]==game[2][1]) {
            return game[0][1] == 1 ? "X" : "O";
        }
        if (game[0][2] != 0 && game[0][2]==game[1][2] && game[0][2]==game[2][2]) {
            return game[0][2] == 1 ? "X" : "O";
        }
        if (game[0][0] != 0 && game[0][0]==game[1][1] && game[0][0]==game[2][2]) {
            return game[0][0] == 1 ? "X" : "O";
        }
        if (game[0][2] != 0 && game[0][2]==game[1][1] && game[0][2]==game[2][0]) {
            return game[0][2] == 1 ? "X" : "O";
        }
        return null;
    }
}
