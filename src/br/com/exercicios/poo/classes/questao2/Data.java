package br.com.exercicios.poo.classes.questao2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Data {

    private int dia, mes, ano;
    private String mesPorExtenso;
    private Date data;


    private boolean bissexto;

    public Data(int dia, int mes, int ano) {

        setBissexto(ano);

        if(verificarAno(ano) && verificarMes(mes) && verificarDia(dia, mes)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
            setBissexto(0001);
        }
        setMesPorExtenso();
        setData();

    }

    private boolean verificarAno(int ano) {
        if(ano >= 0001)return true;
        else return false;

    }
    private boolean verificarMes(int mes) {
        if(mes >= 1 && mes <=12)return true;
        else return false;
    }
    private boolean verificarDia(int dia, int mes) {
        switch (mes){
            case 2:
                if(this.isBissexto()){
                    if(dia >= 1 && dia <= 29){
                        return true;
                    }else {
                        return false;
                    }
                }else {
                    if(dia >= 1 && dia <= 28){
                        return true;
                    }else {
                        return false;
                    }
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if(dia >= 1 && dia <= 30){
                    return true;
                }else {
                    return false;
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(dia >= 1 && dia <= 31){
                    return true;
                }else {
                    return false;
                }
            default:
                return false;
        }
    }




    public int compara(Data data) {
        int result;

        if(this.getData().equals(data.getData())){
            result = 0;
        } else if (this.getAno() >= data.getAno()) {
            if(!(this.getAno() == data.getAno())){
                result = 1;
            } else if(this.getMes() >= data.getMes()){
                if(!(this.getMes() == data.getMes())){
                    result = 1;
                } else if(this.getDia() > data.getDia()){
                    result = 1;
                }else {
                    result = -1;
                }
            }else {
                result=-1;
            }
        }else {
            result=-1;
        }
        return result;

    }


    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMesPorExtenso() {
        return mesPorExtenso;
    }
    public void setMesPorExtenso() {
        switch (this.mes){
            case 1: this.mesPorExtenso = "Janeiro";
                break;
            case 2: this.mesPorExtenso = "Fevereiro";
                break;
            case 3: this.mesPorExtenso = "Março";
                break;
            case 4: this.mesPorExtenso = "Abril";
                break;
            case 5: this.mesPorExtenso = "Maio";
                break;
            case 6: this.mesPorExtenso = "Junho";
                break;
            case 7: this.mesPorExtenso = "Julho";
                break;
            case 8: this.mesPorExtenso = "Agosto";
                break;
            case 9: this.mesPorExtenso = "Setembro";
                break;
            case 10: this.mesPorExtenso = "Outubro";
                break;
            case 11: this.mesPorExtenso = "Novembro";
                break;
            case 12: this.mesPorExtenso = "Dezembro";
                break;

        }
        this.mesPorExtenso = mesPorExtenso;
    }

    public boolean isBissexto() {
        return bissexto;
    }
    public void setBissexto(int ano) {
        this.bissexto = true;
        if(ano % 4 == 0){
            if(ano % 100 == 0){
                if(ano % 400 == 0){
                    this.bissexto = true;
                }else {
                    this.bissexto = false;
                }
            }else {
                this.bissexto = true;
            }
        }else {
            this.bissexto = false;
        }
    }

    public Date getData() {
        return data;
    }
    public void setData() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date dataFormatada = null;
        try {
            dataFormatada = formato.parse(dia + "/" + mes + "/" + ano);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        this.data = dataFormatada;

    }

    public void setData(int horas, int minutos, int segundos) {
        SimpleDateFormat formatar = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

        Date dataFormatada = null;
        try {
            dataFormatada = formatar.parse(ano + "-" + mes + "-" + dia + " "+ horas + ":" + minutos + ":" + segundos);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        this.data = dataFormatada;

    }

    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

    @Override
    public String toString() {
        return "Data: " + getData();
    }
}
