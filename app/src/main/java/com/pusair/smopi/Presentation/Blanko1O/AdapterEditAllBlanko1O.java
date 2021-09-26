package com.pusair.smopi.Presentation.Blanko1O;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Blanko0123Model;
import com.pusair.smopi.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterEditAllBlanko1O extends RecyclerView.Adapter<AdapterEditAllBlanko1O.ViewHolder> {

    public static List<Blanko0123Model> blanko0123List;
    private Context context;

    public AdapterEditAllBlanko1O(List<Blanko0123Model> blanko0123List, Context context) {
        this.blanko0123List = blanko0123List;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterEditAllBlanko1O.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_edit_all_blanko_1o, parent, false);
        ButterKnife.bind(this, v);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterEditAllBlanko1O.ViewHolder holder, int position) {
        try {
            Blanko0123Model blanko0123Model = blanko0123List.get(position);
            List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
            List<Blanko0123> blanko0123Keputusan = blanko0123Model.getBlanko0123k();
            holder.ip3Name.setText(blanko0123Usulan.get(0).getKd_org());
            for (Blanko0123 blanko0123 : blanko0123Usulan) {
                switch (blanko0123.getUrut_mt()) {
                    case "MT1":
                        holder.usulanMT1Padi.setText(String.valueOf(blanko0123.getPadi()));
                        holder.usulanMT1TebuMuda.setText(String.valueOf(blanko0123.getTebu_muda()));
                        holder.usulanMT1TebuTua.setText(String.valueOf(blanko0123.getTebu_tua()));
                        holder.usulanMT1Palawija.setText(String.valueOf(blanko0123.getPalawija()));
                        holder.usulanMT1KeperluanLain.setText(String.valueOf(blanko0123.getLain()));
                        holder.usulanMT1Bero.setText(String.valueOf(blanko0123.getBero()));
                        holder.usulanMT1GolTanam.setText(String.valueOf(blanko0123.getGol()));
                        holder.usulanMT1TglOlah.setText(blanko0123.getTgl_olah());
                        break;
                    case "MT2":
                        holder.usulanMT2Padi.setText(String.valueOf(blanko0123.getPadi()));
                        holder.usulanMT2TebuMuda.setText(String.valueOf(blanko0123.getTebu_muda()));
                        holder.usulanMT2TebuTua.setText(String.valueOf(blanko0123.getTebu_tua()));
                        holder.usulanMT2Palawija.setText(String.valueOf(blanko0123.getPalawija()));
                        holder.usulanMT2KeperluanLain.setText(String.valueOf(blanko0123.getLain()));
                        holder.usulanMT2Bero.setText(String.valueOf(blanko0123.getBero()));
                        holder.usulanMT2GolTanam.setText(String.valueOf(blanko0123.getGol()));
                        holder.usulanMT2TglOlah.setText(blanko0123.getTgl_olah());
                        break;
                    case "MT3":
                        holder.usulanMT3Padi.setText(String.valueOf(blanko0123.getPadi()));
                        holder.usulanMT3TebuMuda.setText(String.valueOf(blanko0123.getTebu_muda()));
                        holder.usulanMT3TebuTua.setText(String.valueOf(blanko0123.getTebu_tua()));
                        holder.usulanMT3Palawija.setText(String.valueOf(blanko0123.getPalawija()));
                        holder.usulanMT3KeperluanLain.setText(String.valueOf(blanko0123.getLain()));
                        holder.usulanMT3Bero.setText(String.valueOf(blanko0123.getBero()));
                        holder.usulanMT3GolTanam.setText(String.valueOf(blanko0123.getGol()));
                        holder.usulanMT3TglOlah.setText(blanko0123.getTgl_olah());
                        break;
                }
            }
            for (Blanko0123 blanko0123 : blanko0123Keputusan) {
                switch (blanko0123.getUrut_mt()) {
                    case "MT1":
                        holder.keputusanMT1Padi.setText(String.valueOf(blanko0123.getPadi()));
                        holder.keputusanMT1TebuMuda.setText(String.valueOf(blanko0123.getTebu_muda()));
                        holder.keputusanMT1TebuTua.setText(String.valueOf(blanko0123.getTebu_tua()));
                        holder.keputusanMT1Palawija.setText(String.valueOf(blanko0123.getPalawija()));
                        holder.keputusanMT1KeperluanLain.setText(String.valueOf(blanko0123.getLain()));
                        holder.keputusanMT1Bero.setText(String.valueOf(blanko0123.getBero()));
                        holder.keputusanMT1GolTanam.setText(String.valueOf(blanko0123.getGol()));
                        holder.keputusanMT1TglOlah.setText(blanko0123.getTgl_olah());
                        break;
                    case "MT2":
                        holder.usulanMT2Padi.setText(String.valueOf(blanko0123.getPadi()));
                        holder.keputusanMT2TebuTua.setText(String.valueOf(blanko0123.getTebu_muda()));
                        holder.keputusanMT2TebuMuda.setText(String.valueOf(blanko0123.getTebu_tua()));
                        holder.keputusanMT2Palawija.setText(String.valueOf(blanko0123.getPalawija()));
                        holder.keputusanMT2KeperluanLain.setText(String.valueOf(blanko0123.getPalawija()));
                        holder.keputusanMT2Bero.setText(String.valueOf(blanko0123.getLain()));
                        holder.keputusanMT2GolTanam.setText(String.valueOf(blanko0123.getBero()));
                        holder.keputusanMT2TglOlah.setText(String.valueOf(blanko0123.getGol()));
                        break;
                    case "MT3":
                        holder.keputusanMT3Padi.setText(String.valueOf(blanko0123.getPadi()));
                        holder.keputusanMT3TebuTua.setText(String.valueOf(blanko0123.getTebu_muda()));
                        holder.keputusanMT3TebuMuda.setText(String.valueOf(blanko0123.getTebu_tua()));
                        holder.keputusanMT3Palawija.setText(String.valueOf(blanko0123.getPalawija()));
                        holder.keputusanMT3KeperluanLain.setText(String.valueOf(blanko0123.getLain()));
                        holder.keputusanMT3Bero.setText(String.valueOf(blanko0123.getBero()));
                        holder.keputusanMT3GolTanam.setText(String.valueOf(blanko0123.getGol()));
                        holder.keputusanMT3TglOlah.setText(blanko0123.getTgl_olah());
                        break;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return blanko0123List.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView ip3Name;
        public EditText usulanMT1Padi;
        public EditText usulanMT2Padi;
        public EditText usulanMT3Padi;
        public EditText usulanMT1TebuTua;
        public EditText usulanMT2TebuTua;
        public EditText usulanMT3TebuTua;
        public EditText usulanMT1TebuMuda;
        public EditText usulanMT2TebuMuda;
        public EditText usulanMT3TebuMuda;
        public EditText usulanMT1Palawija;
        public EditText usulanMT2Palawija;
        public EditText usulanMT3Palawija;
        public EditText usulanMT1KeperluanLain;
        public EditText usulanMT2KeperluanLain;
        public EditText usulanMT3KeperluanLain;
        public EditText usulanMT1Bero;
        public EditText usulanMT2Bero;
        public EditText usulanMT3Bero;
        public EditText usulanMT1GolTanam;
        public EditText usulanMT2GolTanam;
        public EditText usulanMT3GolTanam;
        public EditText usulanMT1TglOlah;
        public EditText usulanMT2TglOlah;
        public EditText usulanMT3TglOlah;

        @BindView(R.id.keputusanMT1Padi)
        TextView keputusanMT1Padi;

        @BindView(R.id.keputusanMT2Padi)
        TextView keputusanMT2Padi;

        @BindView(R.id.keputusanMT3Padi)
        TextView keputusanMT3Padi;

        @BindView(R.id.keputusanMT1TebuTua)
        TextView keputusanMT1TebuTua;

        @BindView(R.id.keputusanMT2TebuTua)
        TextView keputusanMT2TebuTua;

        @BindView(R.id.keputusanMT3TebuTua)
        TextView keputusanMT3TebuTua;

        @BindView(R.id.keputusanMT1TebuMuda)
        TextView keputusanMT1TebuMuda;

        @BindView(R.id.keputusanMT2TebuMuda)
        TextView keputusanMT2TebuMuda;

        @BindView(R.id.keputusanMT3TebuMuda)
        TextView keputusanMT3TebuMuda;

        @BindView(R.id.keputusanMT1Palawija)
        TextView keputusanMT1Palawija;

        @BindView(R.id.keputusanMT2Palawija)
        TextView keputusanMT2Palawija;

        @BindView(R.id.keputusanMT3Palawija)
        TextView keputusanMT3Palawija;

        @BindView(R.id.keputusanMT1KeperluanLain)
        TextView keputusanMT1KeperluanLain;

        @BindView(R.id.keputusanMT2KeperluanLain)
        TextView keputusanMT2KeperluanLain;

        @BindView(R.id.keputusanMT3KeperluanLain)
        TextView keputusanMT3KeperluanLain;

        @BindView(R.id.keputusanMT1Bero)
        TextView keputusanMT1Bero;

        @BindView(R.id.keputusanMT2Bero)
        TextView keputusanMT2Bero;

        @BindView(R.id.keputusanMT3Bero)
        TextView keputusanMT3Bero;

        @BindView(R.id.keputusanMT1GolTanam)
        TextView keputusanMT1GolTanam;

        @BindView(R.id.keputusanMT2GolTanam)
        TextView keputusanMT2GolTanam;

        @BindView(R.id.keputusanMT3GolTanam)
        TextView keputusanMT3GolTanam;

        @BindView(R.id.keputusanMT1TglOlah)
        TextView keputusanMT1TglOlah;

        @BindView(R.id.keputusanMT2TglOlah)
        TextView keputusanMT2TglOlah;

        @BindView(R.id.keputusanMT3TglOlah)
        TextView keputusanMT3TglOlah;

        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
            ip3Name = v.findViewById(R.id.namaIp3a);
            usulanMT1Padi = v.findViewById(R.id.usulanMT1Padi);
            usulanMT1Padi.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT1".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setPadi(Float.parseFloat(usulanMT1Padi.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT2Padi = v.findViewById(R.id.usulanMT2Padi);
            usulanMT2Padi.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT2".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setPadi(Float.parseFloat(usulanMT2Padi.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT3Padi = v.findViewById(R.id.usulanMT3Padi);
            usulanMT3Padi.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT3".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setPadi(Float.parseFloat(usulanMT3Padi.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT1TebuTua = v.findViewById(R.id.usulanMT1TebuTua);
            usulanMT1TebuTua.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT1".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setTebu_tua(Float.parseFloat(usulanMT1TebuTua.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            usulanMT2TebuTua = v.findViewById(R.id.usulanMT2TebuTua);
            usulanMT2TebuTua.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT2".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setTebu_tua(Float.parseFloat(usulanMT2TebuTua.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT3TebuTua = v.findViewById(R.id.usulanMT3TebuTua);
            usulanMT3TebuTua.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT3".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setTebu_tua(Float.parseFloat(usulanMT3TebuTua.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT1TebuMuda = v.findViewById(R.id.usulanMT1TebuMuda);
            usulanMT1TebuMuda.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT1".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setTebu_muda(Float.parseFloat(usulanMT1TebuMuda.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT2TebuMuda = v.findViewById(R.id.usulanMT2TebuMuda);
            usulanMT2TebuMuda.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT2".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setTebu_muda(Float.parseFloat(usulanMT2TebuMuda.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT3TebuMuda = v.findViewById(R.id.usulanMT3TebuMuda);
            usulanMT3TebuMuda.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT3".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setTebu_muda(Float.parseFloat(usulanMT3TebuMuda.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT1Palawija = v.findViewById(R.id.usulanMT1Palawija);
            usulanMT1Palawija.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT1".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setPalawija(Float.parseFloat(usulanMT1Palawija.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT2Palawija = v.findViewById(R.id.usulanMT2Palawija);
            usulanMT2Palawija.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT2".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setPalawija(Float.parseFloat(usulanMT2Palawija.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT3Palawija = v.findViewById(R.id.usulanMT3Palawija);
            usulanMT3Palawija.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT3".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setPalawija(Float.parseFloat(usulanMT3Palawija.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT1KeperluanLain = v.findViewById(R.id.usulanMT1KeperluanLain);
            usulanMT1KeperluanLain.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT1".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setLain(Float.parseFloat(usulanMT1KeperluanLain.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT2KeperluanLain = v.findViewById(R.id.usulanMT2KeperluanLain);
            usulanMT2KeperluanLain.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT2".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setLain(Float.parseFloat(usulanMT2KeperluanLain.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT3KeperluanLain = v.findViewById(R.id.usulanMT3KeperluanLain);
            usulanMT3KeperluanLain.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT3".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setLain(Float.parseFloat(usulanMT3KeperluanLain.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT1Bero = v.findViewById(R.id.usulanMT1Bero);
            usulanMT1Bero.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT1".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setBero(Float.parseFloat(usulanMT1Bero.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT2Bero = v.findViewById(R.id.usulanMT2Bero);
            usulanMT2Bero.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT2".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setBero(Float.parseFloat(usulanMT2Bero.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT3Bero = v.findViewById(R.id.usulanMT3Bero);
            usulanMT3Bero.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT3".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setBero(Float.parseFloat(usulanMT3Bero.getText().toString()));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT1GolTanam = v.findViewById(R.id.usulanMT1GolTanam);
            usulanMT1GolTanam.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT1".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setGol(usulanMT1GolTanam.getText().toString());
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT2GolTanam = v.findViewById(R.id.usulanMT2GolTanam);
            usulanMT2GolTanam.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT2".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setGol(usulanMT2GolTanam.getText().toString());
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT3GolTanam = v.findViewById(R.id.usulanMT3GolTanam);
            usulanMT3GolTanam.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT3".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setGol(usulanMT3GolTanam.getText().toString());
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT1TglOlah = v.findViewById(R.id.usulanMT1TglOlah);
            usulanMT1TglOlah.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT1".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setTgl_olah(usulanMT1TglOlah.getText().toString());
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT2TglOlah = v.findViewById(R.id.usulanMT2TglOlah);
            usulanMT2TglOlah.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT2".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setTgl_olah(usulanMT2TglOlah.getText().toString());
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            usulanMT3TglOlah = v.findViewById(R.id.usulanMT3TglOlah);
            usulanMT3TglOlah.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Blanko0123Model blanko0123Model = blanko0123List.get(getAdapterPosition());
                    List<Blanko0123> blanko0123Usulan = blanko0123Model.getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        if ("MT3".equals(blanko0123.getUrut_mt())) {
                            blanko0123.setTgl_olah(usulanMT3TglOlah.getText().toString());
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
        }
    }
}
