package com.google.protobuf;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class l0 {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final Object key;
    private final b metadata;
    private final Object value;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[x1.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[x1.b.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {
        public final Object defaultKey;
        public final Object defaultValue;
        public final x1.b keyType;
        public final x1.b valueType;

        public b(x1.b bVar, Object obj, x1.b bVar2, Object obj2) {
            this.keyType = bVar;
            this.defaultKey = obj;
            this.valueType = bVar2;
            this.defaultValue = obj2;
        }
    }

    private l0(x1.b bVar, Object obj, x1.b bVar2, Object obj2) {
        this.metadata = new b(bVar, obj, bVar2, obj2);
        this.key = obj;
        this.value = obj2;
    }

    static <K, V> int computeSerializedSize(b bVar, K k10, V v10) {
        return u.computeElementSize(bVar.keyType, 1, k10) + u.computeElementSize(bVar.valueType, 2, v10);
    }

    public static <K, V> l0 newDefaultInstance(x1.b bVar, K k10, x1.b bVar2, V v10) {
        return new l0(bVar, k10, bVar2, v10);
    }

    static <T> T parseField(j jVar, p pVar, x1.b bVar, T t10) {
        int i10 = a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()];
        if (i10 == 1) {
            s0.a builder = ((s0) t10).toBuilder();
            jVar.readMessage(builder, pVar);
            return (T) builder.buildPartial();
        }
        if (i10 == 2) {
            return (T) Integer.valueOf(jVar.readEnum());
        }
        if (i10 != 3) {
            return (T) u.readPrimitiveField(jVar, bVar, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    static <K, V> void writeTo(CodedOutputStream codedOutputStream, b bVar, K k10, V v10) {
        u.writeElement(codedOutputStream, bVar.keyType, 1, k10);
        u.writeElement(codedOutputStream, bVar.valueType, 2, v10);
    }

    public int computeMessageSize(int i10, Object obj, Object obj2) {
        return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, obj, obj2));
    }

    public Object getKey() {
        return this.key;
    }

    b getMetadata() {
        return this.metadata;
    }

    public Object getValue() {
        return this.value;
    }

    public Map.Entry<Object, Object> parseEntry(i iVar, p pVar) {
        return parseEntry(iVar.newCodedInput(), this.metadata, pVar);
    }

    public void parseInto(m0 m0Var, j jVar, p pVar) {
        int iPushLimit = jVar.pushLimit(jVar.readRawVarint32());
        b bVar = this.metadata;
        Object field = bVar.defaultKey;
        Object field2 = bVar.defaultValue;
        while (true) {
            int tag = jVar.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == x1.makeTag(1, this.metadata.keyType.getWireType())) {
                field = parseField(jVar, pVar, this.metadata.keyType, field);
            } else if (tag == x1.makeTag(2, this.metadata.valueType.getWireType())) {
                field2 = parseField(jVar, pVar, this.metadata.valueType, field2);
            } else if (!jVar.skipField(tag)) {
                break;
            }
        }
        jVar.checkLastTagWas(0);
        jVar.popLimit(iPushLimit);
        m0Var.put(field, field2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i10, Object obj, Object obj2) {
        codedOutputStream.writeTag(i10, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, obj, obj2));
        writeTo(codedOutputStream, this.metadata, obj, obj2);
    }

    static <K, V> Map.Entry<K, V> parseEntry(j jVar, b bVar, p pVar) {
        Object field = bVar.defaultKey;
        Object field2 = bVar.defaultValue;
        while (true) {
            int tag = jVar.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == x1.makeTag(1, bVar.keyType.getWireType())) {
                field = parseField(jVar, pVar, bVar.keyType, field);
            } else if (tag == x1.makeTag(2, bVar.valueType.getWireType())) {
                field2 = parseField(jVar, pVar, bVar.valueType, field2);
            } else if (!jVar.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(field, field2);
    }

    private l0(b bVar, Object obj, Object obj2) {
        this.metadata = bVar;
        this.key = obj;
        this.value = obj2;
    }
}
