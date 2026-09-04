package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.a;
import com.fasterxml.jackson.core.b;
import com.fasterxml.jackson.core.c;
import com.fasterxml.jackson.core.g;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.Preconditions;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class JacksonFactory extends JsonFactory {
    private final b factory;

    /* JADX INFO: renamed from: com.google.api.client.json.jackson2.JacksonFactory$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            int[] iArr = new int[g.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr;
            try {
                iArr[g.END_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[g.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[g.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[g.START_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[g.VALUE_FALSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[g.VALUE_TRUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[g.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[g.VALUE_STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[g.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[g.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[g.FIELD_NAME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class InstanceHolder {
        static final JacksonFactory INSTANCE = new JacksonFactory();

        InstanceHolder() {
        }
    }

    public JacksonFactory() {
        b bVar = new b();
        this.factory = bVar;
        bVar.o(c.a.AUTO_CLOSE_JSON_CONTENT, false);
    }

    static JsonToken convert(g gVar) {
        if (gVar == null) {
            return null;
        }
        switch (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[gVar.ordinal()]) {
            case 1:
                return JsonToken.END_ARRAY;
            case 2:
                return JsonToken.START_ARRAY;
            case 3:
                return JsonToken.END_OBJECT;
            case 4:
                return JsonToken.START_OBJECT;
            case 5:
                return JsonToken.VALUE_FALSE;
            case 6:
                return JsonToken.VALUE_TRUE;
            case 7:
                return JsonToken.VALUE_NULL;
            case 8:
                return JsonToken.VALUE_STRING;
            case 9:
                return JsonToken.VALUE_NUMBER_FLOAT;
            case 10:
                return JsonToken.VALUE_NUMBER_INT;
            case 11:
                return JsonToken.FIELD_NAME;
            default:
                return JsonToken.NOT_AVAILABLE;
        }
    }

    public static JacksonFactory getDefaultInstance() {
        return InstanceHolder.INSTANCE;
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonGenerator createJsonGenerator(OutputStream outputStream, Charset charset) {
        return new JacksonGenerator(this, this.factory.r(outputStream, a.UTF8));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(Reader reader) {
        Preconditions.checkNotNull(reader);
        return new JacksonParser(this, this.factory.u(reader));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonGenerator createJsonGenerator(Writer writer) {
        return new JacksonGenerator(this, this.factory.s(writer));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream);
        return new JacksonParser(this, this.factory.t(inputStream));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(InputStream inputStream, Charset charset) {
        Preconditions.checkNotNull(inputStream);
        return new JacksonParser(this, this.factory.t(inputStream));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(String str) {
        Preconditions.checkNotNull(str);
        return new JacksonParser(this, this.factory.v(str));
    }
}
