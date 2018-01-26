package com.mamdouh.magiczodiac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class intro extends AppCompatActivity {
    TextView tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13, tv_14, tv_15, tv_16,
            tv_18, tv_19, tv_20, tv_21, tv_22, tv_23, tv_24, tv_25, tv_26, tv_27, tv_28, tv_29, tv_30, tv_31, tv_32, tv_33,
            tv_34, tv_35, tv_36, tv_37, tv_38, tv_39, tv_40, tv_41, tv_42, tv_43, tv_44, tv_45, tv_46, tv_47, tv_48, tv_49,
            tv_50, tv_51, tv_52, tv_53, tv_54, tv_55, tv_56, tv_57, tv_58, tv_59, tv_60, tv_62, tv_63, tv_64, tv_65, tv_17,
            tv_66, tv_67, tv_68, tv_69, tv_70, tv_71;


    ImageView iv_1, iv_2, iv_3, iv_4, iv_5, iv_6, iv_7, iv_8, iv_9, iv_10, iv_11, iv_12, iv_13, iv_14, iv_15,
            iv_16, iv_17, iv_18, iv_19,
            iv_20, iv_21, iv_22, iv_23, iv_24, iv_25, iv_26, iv_27, iv_28, iv_29, iv_30,
            iv_31, iv_32, iv_33, iv_34, iv_35, iv_36, iv_37, iv_38, iv_39, iv_40, iv_41, iv_42, iv_43, iv_44, iv_45,
            iv_46, iv_47, iv_48, iv_49, iv_50, iv_51, iv_52, iv_53, iv_54, iv_55, iv_56, iv_57, iv_58, iv_59, iv_60,
            iv_61, iv_62, iv_63, iv_64, iv_65, iv_66, iv_67, iv_68, iv_69, iv_70, iv_71, iv_Result;

    Button btn,btn_try;
    int Numbers[] = {
            R.drawable.t,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.k,
            R.drawable.l,
            R.drawable.j};
    Random N = new Random();
    int T = N.nextInt(Numbers.length);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        tv_1 = (TextView) findViewById(R.id.tv_1); tv_2 = (TextView) findViewById(R.id.tv_2); tv_3 = (TextView) findViewById(R.id.tv_3); tv_4 = (TextView) findViewById(R.id.tv_4);
        tv_5 = (TextView) findViewById(R.id.tv_5); tv_6 = (TextView) findViewById(R.id.tv_6); tv_7 = (TextView) findViewById(R.id.tv_7); tv_8 = (TextView) findViewById(R.id.tv_8);
        tv_9 = (TextView) findViewById(R.id.tv_9); tv_10 = (TextView) findViewById(R.id.tv_10); tv_11 = (TextView) findViewById(R.id.tv_11); tv_12 = (TextView) findViewById(R.id.tv_12);
        tv_13 = (TextView) findViewById(R.id.tv_13); tv_14 = (TextView) findViewById(R.id.tv_14); tv_15 = (TextView) findViewById(R.id.tv_15); tv_16 = (TextView) findViewById(R.id.tv_16);
        tv_17 = (TextView) findViewById(R.id.tv_17); tv_18 = (TextView) findViewById(R.id.tv_18); tv_19 = (TextView) findViewById(R.id.tv_19); tv_20 = (TextView) findViewById(R.id.tv_20);
        tv_21 = (TextView) findViewById(R.id.tv_21); tv_22 = (TextView) findViewById(R.id.tv_22); tv_23 = (TextView) findViewById(R.id.tv_23); tv_24 = (TextView) findViewById(R.id.tv_24);
        tv_25 = (TextView) findViewById(R.id.tv_25); tv_26 = (TextView) findViewById(R.id.tv_26); tv_27 = (TextView) findViewById(R.id.tv_27); tv_28 = (TextView) findViewById(R.id.tv_28); tv_29 = (TextView) findViewById(R.id.tv_29); tv_30 = (TextView) findViewById(R.id.tv_30);
        tv_31 = (TextView) findViewById(R.id.tv_31); tv_32 = (TextView) findViewById(R.id.tv_32); tv_33 = (TextView) findViewById(R.id.tv_33); tv_34 = (TextView) findViewById(R.id.tv_34);
        tv_35 = (TextView) findViewById(R.id.tv_35); tv_36 = (TextView) findViewById(R.id.tv_36); tv_37 = (TextView) findViewById(R.id.tv_37); tv_38 = (TextView) findViewById(R.id.tv_38);
        tv_39 = (TextView) findViewById(R.id.tv_39); tv_40 = (TextView) findViewById(R.id.tv_40); tv_41 = (TextView) findViewById(R.id.tv_41); tv_42 = (TextView) findViewById(R.id.tv_42);
        tv_43 = (TextView) findViewById(R.id.tv_43); tv_44 = (TextView) findViewById(R.id.tv_44); tv_45 = (TextView) findViewById(R.id.tv_45); tv_46 = (TextView) findViewById(R.id.tv_46);
        tv_47 = (TextView) findViewById(R.id.tv_47); tv_48 = (TextView) findViewById(R.id.tv_48); tv_49 = (TextView) findViewById(R.id.tv_49); tv_50 = (TextView) findViewById(R.id.tv_50);
        tv_51 = (TextView) findViewById(R.id.tv_51); tv_52 = (TextView) findViewById(R.id.tv_52); tv_53 = (TextView) findViewById(R.id.tv_53); tv_54 = (TextView) findViewById(R.id.tv_54);
        tv_55 = (TextView) findViewById(R.id.tv_55); tv_56 = (TextView) findViewById(R.id.tv_56); tv_57 = (TextView) findViewById(R.id.tv_57); tv_58 = (TextView) findViewById(R.id.tv_58);
        tv_59 = (TextView) findViewById(R.id.tv_59); tv_60 = (TextView) findViewById(R.id.tv_60); tv_62 = (TextView) findViewById(R.id.tv_62); tv_63 = (TextView) findViewById(R.id.tv_63);
        tv_64 = (TextView) findViewById(R.id.tv_64); tv_65 = (TextView) findViewById(R.id.tv_65); tv_66 = (TextView) findViewById(R.id.tv_66); tv_67 = (TextView) findViewById(R.id.tv_67);
        tv_68 = (TextView) findViewById(R.id.tv_68); tv_69 = (TextView) findViewById(R.id.tv_69); tv_70 = (TextView) findViewById(R.id.tv_70); tv_71 = (TextView) findViewById(R.id.tv_71);

        iv_Result = (ImageView) findViewById(R.id.iv_Result);
        iv_1 = (ImageView) findViewById(R.id.iv_1); iv_2 = (ImageView) findViewById(R.id.iv_2); iv_3 = (ImageView) findViewById(R.id.iv_3);  iv_4 = (ImageView) findViewById(R.id.iv_4);
        iv_5 = (ImageView) findViewById(R.id.iv_5);  iv_6 = (ImageView) findViewById(R.id.iv_6); iv_7 = (ImageView) findViewById(R.id.iv_7);  iv_8 = (ImageView) findViewById(R.id.iv_8);
        iv_9 = (ImageView) findViewById(R.id.iv_9);  iv_10 = (ImageView) findViewById(R.id.iv_10); iv_11 = (ImageView) findViewById(R.id.iv_11); iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13); iv_14 = (ImageView) findViewById(R.id.iv_14); iv_15 = (ImageView) findViewById(R.id.iv_15); iv_16 = (ImageView) findViewById(R.id.iv_16);
        iv_17 = (ImageView) findViewById(R.id.iv_17); iv_18 = (ImageView) findViewById(R.id.iv_18); iv_19 = (ImageView) findViewById(R.id.iv_19); iv_20 = (ImageView) findViewById(R.id.iv_20);
        iv_21 = (ImageView) findViewById(R.id.iv_21); iv_22 = (ImageView) findViewById(R.id.iv_22); iv_23 = (ImageView) findViewById(R.id.iv_23); iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_25 = (ImageView) findViewById(R.id.iv_25); iv_26 = (ImageView) findViewById(R.id.iv_26); iv_27 = (ImageView) findViewById(R.id.iv_27); iv_28 = (ImageView) findViewById(R.id.iv_28);
        iv_29 = (ImageView) findViewById(R.id.iv_29); iv_30 = (ImageView) findViewById(R.id.iv_30); iv_31 = (ImageView) findViewById(R.id.iv_31); iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33); iv_34 = (ImageView) findViewById(R.id.iv_34); iv_35 = (ImageView) findViewById(R.id.iv_35); iv_36 = (ImageView) findViewById(R.id.iv_36);
        iv_37 = (ImageView) findViewById(R.id.iv_37); iv_38 = (ImageView) findViewById(R.id.iv_38); iv_39 = (ImageView) findViewById(R.id.iv_39); iv_40 = (ImageView) findViewById(R.id.iv_40);
        iv_41 = (ImageView) findViewById(R.id.iv_41); iv_42 = (ImageView) findViewById(R.id.iv_42); iv_43 = (ImageView) findViewById(R.id.iv_43); iv_44 = (ImageView) findViewById(R.id.iv_44);
        iv_45 = (ImageView) findViewById(R.id.iv_45); iv_46 = (ImageView) findViewById(R.id.iv_46); iv_47 = (ImageView) findViewById(R.id.iv_47); iv_48 = (ImageView) findViewById(R.id.iv_48);
        iv_49 = (ImageView) findViewById(R.id.iv_49); iv_50 = (ImageView) findViewById(R.id.iv_50); iv_51 = (ImageView) findViewById(R.id.iv_51); iv_52 = (ImageView) findViewById(R.id.iv_52);
        iv_53 = (ImageView) findViewById(R.id.iv_53); iv_54 = (ImageView) findViewById(R.id.iv_54); iv_55 = (ImageView) findViewById(R.id.iv_55); iv_56 = (ImageView) findViewById(R.id.iv_56);
        iv_57 = (ImageView) findViewById(R.id.iv_57); iv_58 = (ImageView) findViewById(R.id.iv_58); iv_59 = (ImageView) findViewById(R.id.iv_59); iv_60 = (ImageView) findViewById(R.id.iv_60);
        iv_62 = (ImageView) findViewById(R.id.iv_62); iv_63 = (ImageView) findViewById(R.id.iv_63); iv_64 = (ImageView) findViewById(R.id.iv_64); iv_65 = (ImageView) findViewById(R.id.iv_65);
        iv_66 = (ImageView) findViewById(R.id.iv_66); iv_67 = (ImageView) findViewById(R.id.iv_67); iv_68 = (ImageView) findViewById(R.id.iv_68); iv_69 = (ImageView) findViewById(R.id.iv_69);
        iv_70 = (ImageView) findViewById(R.id.iv_70); iv_71 = (ImageView) findViewById(R.id.iv_71);

        Mix();

        btn = (Button) findViewById(R.id.btn);
        btn_try = (Button) findViewById(R.id.btn_try);
        btn.setEnabled(false);
        iv_Result.setVisibility(View.INVISIBLE);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_Result.setVisibility(View.VISIBLE);
            }
        });
        btn_try.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setEnabled(true);
                Mix();
                Result();
            }
        });

    }


    public void Result (){
        Random U = new Random();
        int H = U.nextInt(Numbers.length);

        iv_Result.setImageResource(Numbers[H]);
        iv_Result.setVisibility(View.INVISIBLE);
        iv_10.setImageResource(Numbers[H]);
        iv_19.setImageResource(Numbers[H]);
        iv_28.setImageResource(Numbers[H]);
        iv_37.setImageResource(Numbers[H]);
        iv_46.setImageResource(Numbers[H]);
        iv_65.setImageResource(Numbers[H]);
    }


    public void Mix() {

        iv_1.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_2.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_3.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_4.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_5.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_6.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_7.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_8.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_9.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_11.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_12.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_13.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_14.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_15.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_16.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_17.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_18.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_20.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_12.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_22.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_23.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_24.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_25.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_26.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_27.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_29.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_30.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_31.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_32.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_33.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_34.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_35.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_36.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_38.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_39.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_40.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_41.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_42.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_43.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_44.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_45.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_47.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_48.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_49.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_50.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_51.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_52.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_53.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_54.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_56.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_57.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_58.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_59.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_60.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_71.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_62.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_63.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_64.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_66.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_67.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_68.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_69.setImageResource(Numbers[N.nextInt(Numbers.length)]);
        iv_70.setImageResource(Numbers[N.nextInt(Numbers.length)]);

        iv_Result.setImageResource(0);

    }
}
