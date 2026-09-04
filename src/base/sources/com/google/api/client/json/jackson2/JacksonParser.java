package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.e;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class JacksonParser extends JsonParser {
    private final JacksonFactory factory;
    private final e parser;

    JacksonParser(JacksonFactory jacksonFactory, e eVar) {
        this.factory = jacksonFactory;
        this.parser = eVar;
    }

    @Override // com.google.api.client.json.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.parser.close();
    }

    @Override // com.google.api.client.json.JsonParser
    public BigInteger getBigIntegerValue() {
        return this.parser.d();
    }

    @Override // com.google.api.client.json.JsonParser
    public byte getByteValue() {
        return this.parser.h();
    }

    @Override // com.google.api.client.json.JsonParser
    public String getCurrentName() {
        return this.parser.l();
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonToken getCurrentToken() {
        return JacksonFactory.convert(this.parser.m());
    }

    @Override // com.google.api.client.json.JsonParser
    public BigDecimal getDecimalValue() {
        return this.parser.q();
    }

    @Override // com.google.api.client.json.JsonParser
    public double getDoubleValue() {
        return this.parser.r();
    }

    @Override // com.google.api.client.json.JsonParser
    public float getFloatValue() {
        return this.parser.s();
    }

    @Override // com.google.api.client.json.JsonParser
    public int getIntValue() {
        return this.parser.t();
    }

    @Override // com.google.api.client.json.JsonParser
    public long getLongValue() {
        return this.parser.c0();
    }

    @Override // com.google.api.client.json.JsonParser
    public short getShortValue() {
        return this.parser.d0();
    }

    @Override // com.google.api.client.json.JsonParser
    public String getText() {
        return this.parser.g0();
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonToken nextToken() {
        return JacksonFactory.convert(this.parser.m0());
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonParser skipChildren() {
        this.parser.p0();
        return this;
    }

    @Override // com.google.api.client.json.JsonParser
    public JacksonFactory getFactory() {
        return this.factory;
    }
}
