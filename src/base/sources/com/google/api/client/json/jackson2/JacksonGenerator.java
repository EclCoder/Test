package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.c;
import com.google.api.client.json.JsonGenerator;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class JacksonGenerator extends JsonGenerator {
    private final JacksonFactory factory;
    private final c generator;

    JacksonGenerator(JacksonFactory jacksonFactory, c cVar) {
        this.factory = jacksonFactory;
        this.generator = cVar;
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.generator.close();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void enablePrettyPrint() {
        this.generator.k();
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Flushable
    public void flush() {
        this.generator.flush();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeBoolean(boolean z10) {
        this.generator.l(z10);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndArray() {
        this.generator.m();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndObject() {
        this.generator.q();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeFieldName(String str) {
        this.generator.r(str);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNull() {
        this.generator.s();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(int i10) {
        this.generator.d0(i10);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartArray() {
        this.generator.U0();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartObject() {
        this.generator.V0();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeString(String str) {
        this.generator.W0(str);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public JacksonFactory getFactory() {
        return this.factory;
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(long j10) {
        this.generator.g0(j10);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigInteger bigInteger) {
        this.generator.p0(bigInteger);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(double d10) {
        this.generator.t(d10);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(float f10) {
        this.generator.c0(f10);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) {
        this.generator.m0(bigDecimal);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(String str) {
        this.generator.i0(str);
    }
}
