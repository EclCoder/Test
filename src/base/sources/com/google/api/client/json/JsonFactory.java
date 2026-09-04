package com.google.api.client.json;

import com.google.api.client.util.Charsets;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonFactory {
    private ByteArrayOutputStream toByteStream(Object obj, boolean z10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JsonGenerator jsonGeneratorCreateJsonGenerator = createJsonGenerator(byteArrayOutputStream, Charsets.UTF_8);
        if (z10) {
            jsonGeneratorCreateJsonGenerator.enablePrettyPrint();
        }
        jsonGeneratorCreateJsonGenerator.serialize(obj);
        jsonGeneratorCreateJsonGenerator.flush();
        return byteArrayOutputStream;
    }

    public abstract JsonGenerator createJsonGenerator(OutputStream outputStream, Charset charset);

    public abstract JsonGenerator createJsonGenerator(Writer writer);

    public final JsonObjectParser createJsonObjectParser() {
        return new JsonObjectParser(this);
    }

    public abstract JsonParser createJsonParser(InputStream inputStream);

    public abstract JsonParser createJsonParser(InputStream inputStream, Charset charset);

    public abstract JsonParser createJsonParser(Reader reader);

    public abstract JsonParser createJsonParser(String str);

    public final <T> T fromInputStream(InputStream inputStream, Class<T> cls) {
        return (T) createJsonParser(inputStream).parseAndClose((Class) cls);
    }

    public final <T> T fromReader(Reader reader, Class<T> cls) {
        return (T) createJsonParser(reader).parseAndClose((Class) cls);
    }

    public final <T> T fromString(String str, Class<T> cls) {
        return (T) createJsonParser(str).parse((Class) cls);
    }

    public final byte[] toByteArray(Object obj) {
        return toByteStream(obj, false).toByteArray();
    }

    public final String toPrettyString(Object obj) {
        return toString(obj, true);
    }

    public final String toString(Object obj) {
        return toString(obj, false);
    }

    private String toString(Object obj, boolean z10) {
        return toByteStream(obj, z10).toString(C.UTF8_NAME);
    }

    public final <T> T fromInputStream(InputStream inputStream, Charset charset, Class<T> cls) {
        return (T) createJsonParser(inputStream, charset).parseAndClose((Class) cls);
    }
}
