package com.pusair.smopi.Presentation.Blanko6O;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pusair.smopi.Model.Blanko06;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterAddListBlanko6O extends RecyclerView.Adapter<AdapterAddListBlanko6O.ViewHolder> {

    public static List<Blanko06> blanko06List;
    private Context context;
    private int perioda;
    private int action;

    public AdapterAddListBlanko6O(List<Blanko06> blanko06List, Context context, int perioda, int action) {
        this.blanko06List = blanko06List;
        this.context = context;
        this.perioda = perioda;
        this.action = action;
    }

    public void setPerioda(int perioda) {
        this.perioda = perioda;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        if (perioda == 1) {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_add_blanko_6o, parent, false);
        } else {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_add_blanko_6o_periode_2, parent, false);
        }

        return new AdapterAddListBlanko6O.ViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Blanko06 blanko06 = blanko06List.get(position);
        int debit_rata;
        String[] nmBangtrol = blanko06.getNm_bangtrol().split("B.");
        holder.tvNamaBangtrol.setText("B." + nmBangtrol[1]);
        holder.tvPetakTersier.setText("Petak Tersier " + blanko06.getPetak_tersier());
        if (action == Constant.ACTION_EDIT) {
            holder.layoutDebitRata.setVisibility(View.VISIBLE);
            holder.layoutJumlahDebit.setVisibility(View.VISIBLE);
            if (perioda == 1){
                holder.et01.setText(String.valueOf(blanko06.getTg01()));
                holder.et02.setText(String.valueOf(blanko06.getTg02()));
                holder.et03.setText(String.valueOf(blanko06.getTg03()));
                holder.et04.setText(String.valueOf(blanko06.getTg04()));
                holder.et05.setText(String.valueOf(blanko06.getTg05()));
                holder.et06.setText(String.valueOf(blanko06.getTg06()));
                holder.et07.setText(String.valueOf(blanko06.getTg07()));
                holder.et08.setText(String.valueOf(blanko06.getTg08()));
                holder.et09.setText(String.valueOf(blanko06.getTg09()));
                holder.et10.setText(String.valueOf(blanko06.getTg10()));
                holder.et11.setText(String.valueOf(blanko06.getTg11()));
                holder.et12.setText(String.valueOf(blanko06.getTg12()));
                holder.et13.setText(String.valueOf(blanko06.getTg13()));
                holder.et14.setText(String.valueOf(blanko06.getTg14()));
                holder.et15.setText(String.valueOf(blanko06.getTg15()));

                holder.tvJumlahDebit.setText(String.valueOf(blanko06.getTg01() + blanko06.getTg02() + blanko06.getTg03() + blanko06.getTg04() +
                        blanko06.getTg05() + blanko06.getTg06() + blanko06.getTg07() + blanko06.getTg08() + blanko06.getTg09() +
                        blanko06.getTg10() + blanko06.getTg11() + blanko06.getTg12() + blanko06.getTg13() + blanko06.getTg14() +
                        blanko06.getTg15()));

                debit_rata = Math.round(blanko06.getTg01() + blanko06.getTg02() + blanko06.getTg03() + blanko06.getTg04() +
                        blanko06.getTg05() + blanko06.getTg06() + blanko06.getTg07() + blanko06.getTg08() + blanko06.getTg09() +
                        blanko06.getTg10() + blanko06.getTg11() + blanko06.getTg12() + blanko06.getTg13() + blanko06.getTg14() +
                        blanko06.getTg15()) / 15;

                holder.etQSuplesi.setText(String.valueOf(blanko06.getQs1()));
                holder.etQHilang.setText(String.valueOf(blanko06.getQh1()));
                holder.etQlainlain.setText(String.valueOf(blanko06.getQl1()));

                if (blanko06.getCara_ukur1() != null) {
                    if (blanko06.getCara_ukur1().equals("A")) {
                        holder.cbA.setChecked(true);
                    } else {
                        holder.cbB.setChecked(true);
                    }
                }

                if (blanko06.getKon_ukur1() != null) {
                    if (blanko06.getKon_ukur1().equals("Baik")) {
                        holder.cbBaik.setChecked(true);
                    } else {
                        holder.cbRusak.setChecked(true);
                    }
                }
            } else {
                holder.et01.setText(String.valueOf(blanko06.getTg16()));
                holder.et02.setText(String.valueOf(blanko06.getTg17()));
                holder.et03.setText(String.valueOf(blanko06.getTg18()));
                holder.et04.setText(String.valueOf(blanko06.getTg19()));
                holder.et05.setText(String.valueOf(blanko06.getTg20()));
                holder.et06.setText(String.valueOf(blanko06.getTg21()));
                holder.et07.setText(String.valueOf(blanko06.getTg22()));
                holder.et08.setText(String.valueOf(blanko06.getTg23()));
                holder.et09.setText(String.valueOf(blanko06.getTg24()));
                holder.et10.setText(String.valueOf(blanko06.getTg25()));
                holder.et11.setText(String.valueOf(blanko06.getTg26()));
                holder.et12.setText(String.valueOf(blanko06.getTg27()));
                holder.et13.setText(String.valueOf(blanko06.getTg28()));
                holder.et14.setText(String.valueOf(blanko06.getTg29()));
                holder.et15.setText(String.valueOf(blanko06.getTg30()));
                holder.et31.setText(String.valueOf(blanko06.getTg31()));

                holder.tvJumlahDebit.setText(String.valueOf(blanko06.getTg16() + blanko06.getTg17() + blanko06.getTg18() + blanko06.getTg19() +
                        blanko06.getTg20() + blanko06.getTg21() + blanko06.getTg22() + blanko06.getTg23() + blanko06.getTg24() +
                        blanko06.getTg25() + blanko06.getTg26() + blanko06.getTg27() + blanko06.getTg28() + blanko06.getTg29() +
                        blanko06.getTg30() + blanko06.getTg31()));

                debit_rata = Math.round(blanko06.getTg16() + blanko06.getTg17() + blanko06.getTg18() + blanko06.getTg19() +
                        blanko06.getTg20() + blanko06.getTg21() + blanko06.getTg22() + blanko06.getTg23() + blanko06.getTg24() +
                        blanko06.getTg25() + blanko06.getTg26() + blanko06.getTg27() + blanko06.getTg28() + blanko06.getTg29() +
                        blanko06.getTg30()+blanko06.getTg31() / 16);

                holder.etQSuplesi.setText(String.valueOf(blanko06.getQs2()));
                holder.etQHilang.setText(String.valueOf(blanko06.getQh2()));
                holder.etQlainlain.setText(String.valueOf(blanko06.getQl2()));

                if (blanko06.getCara_ukur2() != null) {
                    if (blanko06.getCara_ukur2().equals("A")) {
                        holder.cbA.setChecked(true);
                    } else {
                        holder.cbB.setChecked(true);
                    }
                }

                if (blanko06.getKon_ukur2() != null) {
                    if (blanko06.getKon_ukur2().equals("Baik")) {
                        holder.cbBaik.setChecked(true);
                    } else {
                        holder.cbRusak.setChecked(true);
                    }
                }
            }

            holder.tvDebitRata.setText(String.valueOf(debit_rata));
        }
    }

    @Override
    public int getItemCount() {
        return blanko06List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.namaBangtrol)
        TextView tvNamaBangtrol;
        @BindView(R.id.petakTersier)
        TextView tvPetakTersier;

        @BindView(R.id.et01)
        EditText et01;
        @BindView(R.id.et02)
        EditText et02;
        @BindView(R.id.et03)
        EditText et03;
        @BindView(R.id.et04)
        EditText et04;
        @BindView(R.id.et05)
        EditText et05;
        @BindView(R.id.et06)
        EditText et06;
        @BindView(R.id.et07)
        EditText et07;
        @BindView(R.id.et08)
        EditText et08;
        @BindView(R.id.et09)
        EditText et09;
        @BindView(R.id.et10)
        EditText et10;
        @BindView(R.id.et11)
        EditText et11;
        @BindView(R.id.et12)
        EditText et12;
        @BindView(R.id.et13)
        EditText et13;
        @BindView(R.id.et14)
        EditText et14;
        @BindView(R.id.et15)
        EditText et15;
        @BindView(R.id.et31)
        EditText et31;
        @BindView(R.id.etQlainlain)
        EditText etQlainlain;
        @BindView(R.id.etQHilang)
        EditText etQHilang;
        @BindView(R.id.etQSuplesi)
        EditText etQSuplesi;

        @BindView(R.id.radioGroupAB)
        RadioGroup radioGroupAB;
        @BindView(R.id.radioGroupAlatUkur)
        RadioGroup radioGroupAlatUkur;
        @BindView(R.id.cbA)
        RadioButton cbA;
        @BindView(R.id.cbB)
        RadioButton cbB;
        @BindView(R.id.cbBaik)
        RadioButton cbBaik;
        @BindView(R.id.cbRusak)
        RadioButton cbRusak;

        @BindView(R.id.layoutJumlahDebit)
        LinearLayout layoutJumlahDebit;
        @BindView(R.id.tvJumlahDebit)
        TextView tvJumlahDebit;
        @BindView(R.id.layoutDebitRata)
        LinearLayout layoutDebitRata;
        @BindView(R.id.tvDebitRata)
        TextView tvDebitRata;

        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
            et01.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg01(Float.parseFloat(et01.getText().toString()));
                        } else {
                            blanko06.setTg16(Float.parseFloat(et01.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et02.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg02(Float.parseFloat(et02.getText().toString()));
                        } else {
                            blanko06.setTg17(Float.parseFloat(et02.getText().toString()));
                        }
                    } else {

                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et03.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg03(Float.parseFloat(et03.getText().toString()));
                        } else {
                            blanko06.setTg18(Float.parseFloat(et03.getText().toString()));
                        }
                    } else {
                        if (perioda == 1) {
                            blanko06.setTg03(Float.parseFloat("0"));
                        } else {
                            blanko06.setTg18(Float.parseFloat("0"));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et04.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg04(Float.parseFloat(et04.getText().toString()));
                        } else {
                            blanko06.setTg19(Float.parseFloat(et04.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et05.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg05(Float.parseFloat(et05.getText().toString()));
                        } else {
                            blanko06.setTg20(Float.parseFloat(et05.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et06.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg06(Float.parseFloat(et06.getText().toString()));
                        } else {
                            blanko06.setTg21(Float.parseFloat(et06.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et07.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg07(Float.parseFloat(et07.getText().toString()));
                        } else {
                            blanko06.setTg22(Float.parseFloat(et07.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et08.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg08(Float.parseFloat(et08.getText().toString()));
                        } else {
                            blanko06.setTg23(Float.parseFloat(et08.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et09.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg09(Float.parseFloat(et09.getText().toString()));
                        } else {
                            blanko06.setTg24(Float.parseFloat(et09.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et10.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg10(Float.parseFloat(et10.getText().toString()));
                        } else {
                            blanko06.setTg25(Float.parseFloat(et10.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et11.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg11(Float.parseFloat(et11.getText().toString()));
                        } else {
                            blanko06.setTg26(Float.parseFloat(et11.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et12.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg12(Float.parseFloat(et12.getText().toString()));
                        } else {
                            blanko06.setTg27(Float.parseFloat(et12.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et13.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg13(Float.parseFloat(et13.getText().toString()));
                        } else {
                            blanko06.setTg28(Float.parseFloat(et13.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et14.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg14(Float.parseFloat(et14.getText().toString()));
                        } else {
                            blanko06.setTg29(Float.parseFloat(et14.getText().toString()));
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            et15.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1) {
                            blanko06.setTg15(Float.parseFloat(et15.getText().toString()));
                        } else {
                            blanko06.setTg30(Float.parseFloat(et15.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            et31.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        blanko06.setTg31(Float.parseFloat(et31.getText().toString()));
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            etQlainlain.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1){
                            blanko06.setQl1(Float.parseFloat(etQlainlain.getText().toString()));
                        } else {
                            blanko06.setQl2(Float.parseFloat(etQlainlain.getText().toString()));
                        }
                    }


                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            etQHilang.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1){
                            blanko06.setQh1(Float.parseFloat(etQHilang.getText().toString()));
                        } else {
                            blanko06.setQh2(Float.parseFloat(etQHilang.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            etQSuplesi.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                    if (charSequence.length() > 0) {
                        if (perioda == 1){
                            blanko06.setQs1(Float.parseFloat(etQSuplesi.getText().toString()));
                        } else {
                            blanko06.setQs2(Float.parseFloat(etQSuplesi.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            radioGroupAB.setOnCheckedChangeListener((radioGroup, i) -> {
                Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                switch (i) {
                    case R.id.cbA:
                        if (perioda == 1){
                            blanko06.setCara_ukur1("A");
                        } else {
                            blanko06.setCara_ukur2("A");
                        }
                        Log.d("Radio Selected", "A");
                        break;
                    case R.id.cbB:
                        if (perioda == 1){
                            blanko06.setCara_ukur1("B");
                        } else {
                            blanko06.setCara_ukur2("B");
                        }
                        Log.d("Radio Selected", "B");
                        break;
                }
            });

            radioGroupAlatUkur.setOnCheckedChangeListener((radioGroup, i) -> {
                Blanko06 blanko06 = blanko06List.get(getAdapterPosition());
                switch (i) {
                    case R.id.cbBaik:
                        if (perioda == 1){
                            blanko06.setKon_ukur1("Baik");
                        } else {
                            blanko06.setKon_ukur2("Baik");
                        }
                        Log.d("Radio Selected", "Baik");
                        break;
                    case R.id.cbRusak:
                        if (perioda == 1){
                            blanko06.setKon_ukur1("Rusak");
                        } else {
                            blanko06.setKon_ukur2("Rusak");
                        }
                        Log.d("Radio Selected", "Rusak");
                        break;
                }
            });
        }
    }
}
