package com.google.api.client.json;

import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import java.io.Closeable;
import java.io.Flushable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonGenerator implements Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract void flush();

    public abstract JsonFactory getFactory();

    public final void serialize(Object obj) {
        serialize(false, obj);
    }

    public abstract void writeBoolean(boolean z10);

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public abstract void writeFieldName(String str);

    public abstract void writeNull();

    public abstract void writeNumber(double d10);

    public abstract void writeNumber(float f10);

    public abstract void writeNumber(int i10);

    public abstract void writeNumber(long j10);

    public abstract void writeNumber(String str);

    public abstract void writeNumber(BigDecimal bigDecimal);

    public abstract void writeNumber(BigInteger bigInteger);

    public abstract void writeStartArray();

    public abstract void writeStartObject();

    public abstract void writeString(String str);

    private void serialize(boolean z10, Object obj) {
        boolean z11;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (Data.isNull(obj)) {
            writeNull();
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        boolean z12 = false;
        if (obj instanceof Number) {
            if (z10) {
                writeString(obj.toString());
                return;
            }
            if (obj instanceof BigDecimal) {
                writeNumber((BigDecimal) obj);
                return;
            }
            if (obj instanceof BigInteger) {
                writeNumber((BigInteger) obj);
                return;
            }
            if (obj instanceof Long) {
                writeNumber(((Long) obj).longValue());
                return;
            }
            if (obj instanceof Float) {
                float fFloatValue = ((Number) obj).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue)) {
                    z12 = true;
                }
                Preconditions.checkArgument(z12);
                writeNumber(fFloatValue);
                return;
            }
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                writeNumber(((Number) obj).intValue());
                return;
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
                z12 = true;
            }
            Preconditions.checkArgument(z12);
            writeNumber(dDoubleValue);
            return;
        }
        if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof DateTime) {
            writeString(((DateTime) obj).toStringRfc3339());
            return;
        }
        if (((obj instanceof Iterable) || cls.isArray()) && !(obj instanceof Map) && !(obj instanceof GenericData)) {
            writeStartArray();
            Iterator it = Types.iterableOf(obj).iterator();
            while (it.hasNext()) {
                serialize(z10, it.next());
            }
            writeEndArray();
            return;
        }
        if (cls.isEnum()) {
            String name = FieldInfo.of((Enum<?>) obj).getName();
            if (name == null) {
                writeNull();
                return;
            } else {
                writeString(name);
                return;
            }
        }
        writeStartObject();
        boolean z13 = (obj instanceof Map) && !(obj instanceof GenericData);
        ClassInfo classInfoOf = z13 ? null : ClassInfo.of(cls);
        for (Map.Entry<String, Object> entry : Data.mapOf(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (z13) {
                    z11 = z10;
                } else {
                    Field field = classInfoOf.getField(key);
                    z11 = (field == null || field.getAnnotation(JsonString.class) == null) ? false : true;
                }
                writeFieldName(key);
                serialize(z11, value);
            }
        }
        writeEndObject();
    }

    public void enablePrettyPrint() {
    }
}
