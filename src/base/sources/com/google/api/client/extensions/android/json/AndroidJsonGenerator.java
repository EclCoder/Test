package com.google.api.client.extensions.android.json;

import android.util.JsonWriter;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class AndroidJsonGenerator extends JsonGenerator {
    private final AndroidJsonFactory factory;
    private final JsonWriter writer;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class StringNumber extends Number {
        private static final long serialVersionUID = 1;
        private final String encodedValue;

        StringNumber(String str) {
            this.encodedValue = str;
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return 0.0d;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return 0.0f;
        }

        @Override // java.lang.Number
        public int intValue() {
            return 0;
        }

        @Override // java.lang.Number
        public long longValue() {
            return 0L;
        }

        public String toString() {
            return this.encodedValue;
        }
    }

    AndroidJsonGenerator(AndroidJsonFactory androidJsonFactory, JsonWriter jsonWriter) {
        this.factory = androidJsonFactory;
        this.writer = jsonWriter;
        jsonWriter.setLenient(true);
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.writer.close();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void enablePrettyPrint() {
        this.writer.setIndent("  ");
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        this.writer.flush();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public JsonFactory getFactory() {
        return this.factory;
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeBoolean(boolean z10) throws IOException {
        this.writer.value(z10);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndArray() throws IOException {
        this.writer.endArray();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndObject() throws IOException {
        this.writer.endObject();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        this.writer.name(str);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNull() throws IOException {
        this.writer.nullValue();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(int i10) throws IOException {
        this.writer.value(i10);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartArray() throws IOException {
        this.writer.beginArray();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartObject() throws IOException {
        this.writer.beginObject();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeString(String str) throws IOException {
        this.writer.value(str);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(long j10) throws IOException {
        this.writer.value(j10);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        this.writer.value(bigInteger);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(double d10) throws IOException {
        this.writer.value(d10);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(float f10) throws IOException {
        this.writer.value(f10);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        this.writer.value(bigDecimal);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(String str) throws IOException {
        this.writer.value(new StringNumber(str));
    }
}
