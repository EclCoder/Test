package com.google.api.client.testing.json;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MockJsonGenerator extends JsonGenerator {
    private final JsonFactory factory;

    MockJsonGenerator(JsonFactory jsonFactory) {
        this.factory = jsonFactory;
    }

    @Override // com.google.api.client.json.JsonGenerator
    public JsonFactory getFactory() {
        return this.factory;
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(double d10) {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(float f10) {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(int i10) {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(long j10) {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(String str) {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigInteger bigInteger) {
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Flushable
    public void flush() {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndArray() {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndObject() {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNull() {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartArray() {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartObject() {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeBoolean(boolean z10) {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeFieldName(String str) {
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeString(String str) {
    }
}
