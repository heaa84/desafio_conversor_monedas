package com.cobacha.Logica;

public record ExtraccionConversionResult(String conversion_result) {
    @Override
    public String toString() {
        return  conversion_result;
    }
}
