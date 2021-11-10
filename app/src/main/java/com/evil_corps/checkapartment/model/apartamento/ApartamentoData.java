package com.evil_corps.checkapartment.model.apartamento;

import java.util.ArrayList;
import java.util.List;

public class ApartamentoData {
    public static List<Apartamento> apartamentoList() {
        List<Apartamento> apartamentoList = new ArrayList<>();
        Apartamento apartment01 = new Apartamento("Edificio Almendro", "Torre 1", "depto 2002", "san jose 345, La florida , Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
        Apartamento apartment02 = new Apartamento("Edificio Almendro", "Torre 1", "depto 2003", "san jose 345, La florida, Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
        Apartamento apartment03 = new Apartamento("Edificio Almendro", "Torre 1", "depto 1601", "san jose 345, La florida, Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
        Apartamento apartment04 = new Apartamento("Edificio Alerces", "Torre b", "depto 1602", "nueva providencia 1801, Providencia", "https://unsplash.com/photos/PhYq704ffdA/download?force=true&w=640");
        Apartamento apartment05 = new Apartamento("Edificio Alerces", "Torre b", "depto 1801", "nueva providencia 1801, Providencia", "https://unsplash.com/photos/PhYq704ffdA/download?force=true&w=640");
        Apartamento apartment06 = new Apartamento("Edificio Legado 2", "Torre a", "depto 801", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
        Apartamento apartment07 = new Apartamento("Edificio Legado 2", "Torre a", "depto 902", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
        Apartamento apartment08 = new Apartamento("Edificio Legado 2", "Torre a", "depto 909", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
        Apartamento apartment09 = new Apartamento("Edificio Legado 2", "Torre a", "depto 1901", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
        Apartamento apartment10 = new Apartamento("Condominio nuevo mirador", "Torre 1", "depto 102", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        Apartamento apartment11 = new Apartamento("Condominio nuevo mirador", "Torre 1", "depto 103", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        Apartamento apartment12 = new Apartamento("Condominio nuevo mirador", "Torre 1", "depto 1501", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        Apartamento apartment13 = new Apartamento("Condominio nuevo mirador", "Torre 1", "depto 1503", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        Apartamento apartment14 = new Apartamento("Condominio nuevo mirador", "Torre 2", "depto 2001", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        Apartamento apartment15 = new Apartamento("Condominio nuevo mirador", "Torre 2", "depto 2201", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");

        apartamentoList.add(apartment01);
        apartamentoList.add(apartment02);
        apartamentoList.add(apartment03);
        apartamentoList.add(apartment04);
        apartamentoList.add(apartment05);
        apartamentoList.add(apartment06);
        apartamentoList.add(apartment07);
        apartamentoList.add(apartment08);
        apartamentoList.add(apartment09);
        apartamentoList.add(apartment10);
        apartamentoList.add(apartment11);
        apartamentoList.add(apartment12);
        apartamentoList.add(apartment13);
        apartamentoList.add(apartment13);
        apartamentoList.add(apartment14);
        apartamentoList.add(apartment15);

    return apartamentoList;
    }
}
