package com.google.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class v0 implements l1 {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final s0 defaultInstance;
    private final q extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final i0 listFieldSchema;
    private final boolean lite;
    private final n0 mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final x0 newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final e1 syntax;
    private final r1 unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = v1.getUnsafe();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[x1.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[x1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private v0(int[] iArr, Object[] objArr, int i10, int i11, s0 s0Var, e1 e1Var, boolean z10, int[] iArr2, int i12, int i13, x0 x0Var, i0 i0Var, r1 r1Var, q qVar, n0 n0Var) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = s0Var instanceof y;
        this.syntax = e1Var;
        this.hasExtensions = qVar != null && qVar.hasExtensions(s0Var);
        this.useCachedSizeField = z10;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = x0Var;
        this.listFieldSchema = i0Var;
        this.unknownFieldSchema = r1Var;
        this.extensionSchema = qVar;
        this.defaultInstance = s0Var;
        this.mapFieldSchema = n0Var;
    }

    private boolean arePresentForEquals(Object obj, Object obj2, int i10) {
        return isFieldPresent(obj, i10) == isFieldPresent(obj2, i10);
    }

    private static <T> boolean booleanAt(T t10, long j10) {
        return v1.getBoolean(t10, j10);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, l0.b bVar, Map<K, V> map, e.b bVar2) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = e.decodeVarint32(bArr, i10, bVar2);
        int i12 = bVar2.int1;
        if (i12 < 0 || i12 > i11 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = iDecodeVarint32 + i12;
        Object obj = bVar.defaultKey;
        Object obj2 = bVar.defaultValue;
        while (iDecodeVarint32 < i13) {
            int iDecodeVarint33 = iDecodeVarint32 + 1;
            int i14 = bArr[iDecodeVarint32];
            if (i14 < 0) {
                iDecodeVarint33 = e.decodeVarint32(i14, bArr, iDecodeVarint33, bVar2);
                i14 = bVar2.int1;
            }
            int i15 = iDecodeVarint33;
            int i16 = i14 >>> 3;
            int i17 = i14 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == bVar.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i15, i11, bVar.valueType, bVar.defaultValue.getClass(), bVar2);
                    obj2 = bVar2.object1;
                } else {
                    iDecodeVarint32 = e.skipField(i14, bArr, i15, i11, bVar2);
                }
            } else if (i17 == bVar.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i15, i11, bVar.keyType, null, bVar2);
                obj = bVar2.object1;
            } else {
                iDecodeVarint32 = e.skipField(i14, bArr, i15, i11, bVar2);
            }
        }
        if (iDecodeVarint32 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i13;
    }

    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, x1.b bVar, Class<?> cls, e.b bVar2) {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                int iDecodeVarint64 = e.decodeVarint64(bArr, i10, bVar2);
                bVar2.object1 = Boolean.valueOf(bVar2.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return e.decodeBytes(bArr, i10, bVar2);
            case 3:
                bVar2.object1 = Double.valueOf(e.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                bVar2.object1 = Integer.valueOf(e.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                bVar2.object1 = Long.valueOf(e.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                bVar2.object1 = Float.valueOf(e.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = e.decodeVarint32(bArr, i10, bVar2);
                bVar2.object1 = Integer.valueOf(bVar2.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = e.decodeVarint64(bArr, i10, bVar2);
                bVar2.object1 = Long.valueOf(bVar2.long1);
                return iDecodeVarint65;
            case 14:
                return e.decodeMessageField(f1.getInstance().schemaFor((Class) cls), bArr, i10, i11, bVar2);
            case 15:
                int iDecodeVarint33 = e.decodeVarint32(bArr, i10, bVar2);
                bVar2.object1 = Integer.valueOf(j.decodeZigZag32(bVar2.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = e.decodeVarint64(bArr, i10, bVar2);
                bVar2.object1 = Long.valueOf(j.decodeZigZag64(bVar2.long1));
                return iDecodeVarint66;
            case 17:
                return e.decodeStringRequireUtf8(bArr, i10, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t10, long j10) {
        return v1.getDouble(t10, j10);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub2, r1 r1Var, Object obj2) {
        a0.e enumFieldVerifier;
        int iNumberAt = numberAt(i10);
        Object object = v1.getObject(obj, offset(typeAndOffsetAt(i10)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i10)) == null) ? ub2 : (UB) filterUnknownEnumMap(i10, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, r1Var, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, a0.e eVar, UB ub2, r1 r1Var, Object obj) {
        l0.b bVarForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = (UB) r1Var.getBuilderFromMessage(obj);
                }
                i.h hVarNewCodedBuilder = i.newCodedBuilder(l0.computeSerializedSize(bVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    l0.writeTo(hVarNewCodedBuilder.getCodedOutput(), bVarForMapMetadata, next.getKey(), next.getValue());
                    r1Var.addLengthDelimited(ub2, i11, hVarNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t10, long j10) {
        return v1.getFloat(t10, j10);
    }

    private a0.e getEnumFieldVerifier(int i10) {
        return (a0.e) this.objects[((i10 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    private l1 getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        l1 l1Var = (l1) this.objects[i11];
        if (l1Var != null) {
            return l1Var;
        }
        l1 l1VarSchemaFor = f1.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = l1VarSchemaFor;
        return l1VarSchemaFor;
    }

    static s1 getMutableUnknownFields(Object obj) {
        y yVar = (y) obj;
        s1 s1Var = yVar.unknownFields;
        if (s1Var != s1.getDefaultInstance()) {
            return s1Var;
        }
        s1 s1VarNewInstance = s1.newInstance();
        yVar.unknownFields = s1VarNewInstance;
        return s1VarNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(r1 r1Var, Object obj) {
        return r1Var.getSerializedSize(r1Var.getFromMessage(obj));
    }

    private static <T> int intAt(T t10, long j10) {
        return v1.getInt(t10, j10);
    }

    private static boolean isEnforceUtf8(int i10) {
        return (i10 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return isFieldPresent(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) v1.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        l1 messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMapInitialized(Object obj, int i10, int i11) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(v1.getObject(obj, offset(i10)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)).valueType.getJavaType() != x1.c.MESSAGE) {
            return true;
        }
        l1 l1VarSchemaFor = null;
        for (Object obj2 : mapForMapData.values()) {
            if (l1VarSchemaFor == null) {
                l1VarSchemaFor = f1.getInstance().schemaFor((Class) obj2.getClass());
            }
            if (!l1VarSchemaFor.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y) {
            return ((y) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(Object obj, Object obj2, int i10) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        return v1.getInt(obj, jPresenceMaskAndOffsetAt) == v1.getInt(obj2, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(Object obj, int i10, int i11) {
        return v1.getInt(obj, (long) (presenceMaskAndOffsetAt(i11) & 1048575)) == i10;
    }

    private static boolean isRequired(int i10) {
        return (i10 & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t10, long j10) {
        return v1.getLong(t10, j10);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends com.google.protobuf.u.c> void mergeFromHelper(com.google.protobuf.r1 r18, com.google.protobuf.q r19, java.lang.Object r20, com.google.protobuf.j1 r21, com.google.protobuf.p r22) {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.mergeFromHelper(com.google.protobuf.r1, com.google.protobuf.q, java.lang.Object, com.google.protobuf.j1, com.google.protobuf.p):void");
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, p pVar, j1 j1Var) {
        long jOffset = offset(typeAndOffsetAt(i10));
        Object object = v1.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            v1.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            v1.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        j1Var.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), pVar);
    }

    private void mergeMessage(Object obj, Object obj2, int i10) {
        if (isFieldPresent(obj2, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + obj2);
            }
            l1 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isFieldPresent(obj, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(obj, jOffset, object);
                }
                setFieldPresent(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeOneofMessage(Object obj, Object obj2, int i10) {
        int iNumberAt = numberAt(i10);
        if (isOneofPresent(obj2, iNumberAt, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + obj2);
            }
            l1 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isOneofPresent(obj, iNumberAt, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(obj, jOffset, object);
                }
                setOneofPresent(obj, iNumberAt, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(Object obj, Object obj2, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i10);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(obj2, i10)) {
                    v1.putDouble(obj, jOffset, v1.getDouble(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 1:
                if (isFieldPresent(obj2, i10)) {
                    v1.putFloat(obj, jOffset, v1.getFloat(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 2:
                if (isFieldPresent(obj2, i10)) {
                    v1.putLong(obj, jOffset, v1.getLong(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 3:
                if (isFieldPresent(obj2, i10)) {
                    v1.putLong(obj, jOffset, v1.getLong(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 4:
                if (isFieldPresent(obj2, i10)) {
                    v1.putInt(obj, jOffset, v1.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 5:
                if (isFieldPresent(obj2, i10)) {
                    v1.putLong(obj, jOffset, v1.getLong(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 6:
                if (isFieldPresent(obj2, i10)) {
                    v1.putInt(obj, jOffset, v1.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 7:
                if (isFieldPresent(obj2, i10)) {
                    v1.putBoolean(obj, jOffset, v1.getBoolean(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 8:
                if (isFieldPresent(obj2, i10)) {
                    v1.putObject(obj, jOffset, v1.getObject(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 9:
                mergeMessage(obj, obj2, i10);
                break;
            case 10:
                if (isFieldPresent(obj2, i10)) {
                    v1.putObject(obj, jOffset, v1.getObject(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 11:
                if (isFieldPresent(obj2, i10)) {
                    v1.putInt(obj, jOffset, v1.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 12:
                if (isFieldPresent(obj2, i10)) {
                    v1.putInt(obj, jOffset, v1.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 13:
                if (isFieldPresent(obj2, i10)) {
                    v1.putInt(obj, jOffset, v1.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 14:
                if (isFieldPresent(obj2, i10)) {
                    v1.putLong(obj, jOffset, v1.getLong(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 15:
                if (isFieldPresent(obj2, i10)) {
                    v1.putInt(obj, jOffset, v1.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 16:
                if (isFieldPresent(obj2, i10)) {
                    v1.putLong(obj, jOffset, v1.getLong(obj2, jOffset));
                    setFieldPresent(obj, i10);
                }
                break;
            case 17:
                mergeMessage(obj, obj2, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case SDK_INIT_API_VALUE:
            case AD_START_EVENT_VALUE:
            case AD_CLICK_EVENT_VALUE:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(obj, obj2, jOffset);
                break;
            case 50:
                n1.mergeMap(this.mapFieldSchema, obj, obj2, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case AD_VISIBILITY_VALUE:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                if (isOneofPresent(obj2, iNumberAt, i10)) {
                    v1.putObject(obj, jOffset, v1.getObject(obj2, jOffset));
                    setOneofPresent(obj, iNumberAt, i10);
                }
                break;
            case 60:
                mergeOneofMessage(obj, obj2, i10);
                break;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case DEPRECATED_API_USED_VALUE:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case BLACK_SCREEN_IS_DETECTED_VALUE:
            case NATIVE_PLAY_ASSET_TYPE_VALUE:
                if (isOneofPresent(obj2, iNumberAt, i10)) {
                    v1.putObject(obj, jOffset, v1.getObject(obj2, jOffset));
                    setOneofPresent(obj, iNumberAt, i10);
                }
                break;
            case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                mergeOneofMessage(obj, obj2, i10);
                break;
        }
    }

    private Object mutableMessageFieldForMerge(Object obj, int i10) {
        l1 messageFieldSchema = getMessageFieldSchema(i10);
        long jOffset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(obj, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private Object mutableOneofMessageFieldForMerge(Object obj, int i10, int i11) {
        l1 messageFieldSchema = getMessageFieldSchema(i11);
        if (!isOneofPresent(obj, i10, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset(typeAndOffsetAt(i11)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    static <T> v0 newSchema(Class<T> cls, q0 q0Var, x0 x0Var, i0 i0Var, r1 r1Var, q qVar, n0 n0Var) {
        return q0Var instanceof i1 ? newSchemaForRawMessageInfo((i1) q0Var, x0Var, i0Var, r1Var, qVar, n0Var) : newSchemaForMessageInfo((p1) q0Var, x0Var, i0Var, r1Var, qVar, n0Var);
    }

    static <T> v0 newSchemaForMessageInfo(p1 p1Var, x0 x0Var, i0 i0Var, r1 r1Var, q qVar, n0 n0Var) {
        int fieldNumber;
        int fieldNumber2;
        t[] fields = p1Var.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i10 = 0;
        int i11 = 0;
        for (t tVar : fields) {
            if (tVar.getType() == v.MAP) {
                i10++;
            } else if (tVar.getType().id() >= 18 && tVar.getType().id() <= 49) {
                i11++;
            }
        }
        int[] iArr2 = i10 > 0 ? new int[i10] : null;
        int[] iArr3 = i11 > 0 ? new int[i11] : null;
        int[] checkInitialized = p1Var.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < fields.length) {
            t tVar2 = fields[i12];
            int fieldNumber3 = tVar2.getFieldNumber();
            storeFieldData(tVar2, iArr, i13, objArr);
            if (i14 < checkInitialized.length && checkInitialized[i14] == fieldNumber3) {
                checkInitialized[i14] = i13;
                i14++;
            }
            if (tVar2.getType() == v.MAP) {
                iArr2[i15] = i13;
                i15++;
            } else {
                if (tVar2.getType().id() >= 18 && tVar2.getType().id() <= 49) {
                    iArr3[i16] = (int) v1.objectFieldOffset(tVar2.getField());
                    i16++;
                }
                i12++;
                i13 += 3;
            }
            i12++;
            i13 += 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new v0(iArr, objArr, fieldNumber, fieldNumber2, p1Var.getDefaultInstance(), p1Var.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, x0Var, i0Var, r1Var, qVar, n0Var);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    static <T> v0 newSchemaForRawMessageInfo(i1 i1Var, x0 x0Var, i0 i0Var, r1 r1Var, q qVar, n0 n0Var) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        int iObjectFieldOffset3;
        int i31;
        Field fieldReflectField;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldReflectField2;
        int i35;
        Object obj2;
        Field fieldReflectField3;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String stringInfo = i1Var.getStringInfo();
        int length = stringInfo.length();
        char c10 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (stringInfo.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt2 = stringInfo.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = stringInfo.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt2 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i16 = 0;
            i11 = 0;
            i15 = 0;
            iArr = EMPTY_INT_ARRAY;
            i14 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = stringInfo.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i24 = i44 + 1;
                    cCharAt8 = stringInfo.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i24;
                }
                iCharAt3 = i45 | (cCharAt8 << i46);
                i44 = i24;
            }
            int i47 = i44 + 1;
            int iCharAt4 = stringInfo.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    cCharAt7 = stringInfo.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                iCharAt4 = i48 | (cCharAt7 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int iCharAt5 = stringInfo.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt6 = stringInfo.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                iCharAt5 = i51 | (cCharAt6 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int iCharAt6 = stringInfo.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt5 = stringInfo.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                iCharAt6 = i54 | (cCharAt5 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            iCharAt = stringInfo.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt4 = stringInfo.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            int iCharAt7 = stringInfo.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt3 = stringInfo.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                iCharAt7 = i60 | (cCharAt3 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            int iCharAt8 = stringInfo.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt2 = stringInfo.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int iCharAt9 = stringInfo.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt = stringInfo.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i11 = (iCharAt3 * 2) + iCharAt4;
            int i68 = iCharAt7;
            i12 = iCharAt5;
            i13 = i68;
            i14 = iCharAt3;
            iArr = iArr2;
            i15 = iCharAt9;
            i41 = i65;
            i16 = iCharAt6;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = i1Var.getObjects();
        Class<?> cls = i1Var.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i69 = i15 + i13;
        int i70 = i69;
        int i71 = i15;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int iCharAt10 = stringInfo.charAt(i41);
            if (iCharAt10 >= c10) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    cCharAt12 = stringInfo.charAt(i76);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i38;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i25 = i38;
            } else {
                i25 = i74;
            }
            int i78 = i25 + 1;
            int iCharAt11 = stringInfo.charAt(i25);
            if (iCharAt11 >= c10) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt11 = stringInfo.charAt(i80);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i26 = i37;
            } else {
                i26 = i78;
            }
            int i82 = iCharAt11 & 255;
            int i83 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int[] iArr4 = iArr3;
            if (i82 >= 51) {
                int i84 = i26 + 1;
                int iCharAt12 = stringInfo.charAt(i26);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = 13;
                    while (true) {
                        i36 = i84 + 1;
                        cCharAt10 = stringInfo.charAt(i84);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i84 = i36;
                        c11 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i86);
                    i84 = i36;
                }
                int i87 = i82 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i33 = i11 + 1;
                    objArr[((i73 / 3) * 2) + 1] = objects[i11];
                } else {
                    if (i87 == 12 && (i1Var.getSyntax().equals(e1.PROTO2) || (iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0)) {
                        i33 = i11 + 1;
                        objArr[((i73 / 3) * 2) + 1] = objects[i11];
                    }
                    i34 = iCharAt12 * 2;
                    obj = objects[i34];
                    if (obj instanceof Field) {
                        fieldReflectField2 = (Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (String) obj);
                        objects[i34] = fieldReflectField2;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    i35 = i34 + 1;
                    obj2 = objects[i35];
                    if (obj2 instanceof Field) {
                        fieldReflectField3 = (Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (String) obj2);
                        objects[i35] = fieldReflectField3;
                    }
                    stringInfo = stringInfo;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    i31 = iObjectFieldOffset4;
                    i30 = 0;
                    i27 = iCharAt10;
                    i41 = i88;
                }
                i11 = i33;
                i34 = iCharAt12 * 2;
                obj = objects[i34];
                if (obj instanceof Field) {
                    fieldReflectField2 = (Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i34] = fieldReflectField2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                i35 = i34 + 1;
                obj2 = objects[i35];
                if (obj2 instanceof Field) {
                    fieldReflectField3 = (Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i35] = fieldReflectField3;
                }
                stringInfo = stringInfo;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i31 = iObjectFieldOffset5;
                i30 = 0;
                i27 = iCharAt10;
                i41 = i88;
            } else {
                int i89 = i11 + 1;
                Field fieldReflectField4 = reflectField(cls, (String) objects[i11]);
                if (i82 == 9 || i82 == 17) {
                    i27 = iCharAt10;
                    objArr[((i73 / 3) * 2) + 1] = fieldReflectField4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i27 = iCharAt10;
                        i32 = i11 + 2;
                        objArr[((i73 / 3) * 2) + 1] = objects[i89];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i27 = iCharAt10;
                        if (i1Var.getSyntax() == e1.PROTO2 || (iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0) {
                            i32 = i11 + 2;
                            objArr[((i73 / 3) * 2) + 1] = objects[i89];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((iCharAt11 & 4096) != 0 || i82 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            int i90 = i26 + 1;
                            int iCharAt13 = stringInfo.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i91 = iCharAt13 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i29 = i90 + 1;
                                    cCharAt9 = stringInfo.charAt(i90);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i91 |= (cCharAt9 & 8191) << i92;
                                    i92 += 13;
                                    i90 = i29;
                                }
                                iCharAt13 = i91 | (cCharAt9 << i92);
                            } else {
                                i29 = i90;
                            }
                            int i93 = (i14 * 2) + (iCharAt13 / 32);
                            Object obj3 = objects[i93];
                            if (obj3 instanceof Field) {
                                fieldReflectField = (Field) obj3;
                            } else {
                                fieldReflectField = reflectField(cls, (String) obj3);
                                objects[i93] = fieldReflectField;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                            i30 = iCharAt13 % 32;
                        }
                        int i94 = iObjectFieldOffset2;
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        iObjectFieldOffset3 = i94;
                        i31 = iObjectFieldOffset;
                        i11 = i28;
                        i41 = i29;
                    } else {
                        if (i82 == 50) {
                            int i95 = i71 + 1;
                            iArr[i71] = i73;
                            int i96 = (i73 / 3) * 2;
                            int i97 = i11 + 2;
                            objArr[i96] = objects[i89];
                            if ((iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0) {
                                i28 = i11 + 3;
                                objArr[i96 + 1] = objects[i97];
                                i27 = iCharAt10;
                                i71 = i95;
                            } else {
                                i28 = i97;
                                i71 = i95;
                                i27 = iCharAt10;
                            }
                        } else {
                            i27 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        }
                        int i98 = iObjectFieldOffset2;
                        if (i82 >= 18) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        iObjectFieldOffset3 = i98;
                        i31 = iObjectFieldOffset;
                        i11 = i28;
                        i41 = i29;
                    }
                    i28 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    }
                    int i99 = iObjectFieldOffset2;
                    if (i82 >= 18) {
                        iArr[i70] = iObjectFieldOffset;
                        i70++;
                    }
                    iObjectFieldOffset3 = i99;
                    i31 = iObjectFieldOffset;
                    i11 = i28;
                    i41 = i29;
                }
                i28 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                }
                int i910 = iObjectFieldOffset2;
                if (i82 >= 18) {
                    iArr[i70] = iObjectFieldOffset;
                    i70++;
                }
                iObjectFieldOffset3 = i910;
                i31 = iObjectFieldOffset;
                i11 = i28;
                i41 = i29;
            }
            int i100 = i73 + 1;
            iArr4[i73] = i27;
            int i101 = i73 + 2;
            int i102 = iObjectFieldOffset3;
            iArr4[i100] = ((iCharAt11 & 512) != 0 ? ENFORCE_UTF8_MASK : 0) | ((iCharAt11 & 256) != 0 ? REQUIRED_MASK : 0) | ((iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | i31;
            i73 += 3;
            iArr4[i101] = (i30 << 20) | i102;
            length = i83;
            iArr3 = iArr4;
            stringInfo = stringInfo;
            c10 = 55296;
        }
        return new v0(iArr3, objArr, i12, i16, i1Var.getDefaultInstance(), i1Var.getSyntax(), false, iArr, i15, i69, x0Var, i0Var, r1Var, qVar, n0Var);
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t10, long j10) {
        return ((Boolean) v1.getObject(t10, j10)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t10, long j10) {
        return ((Double) v1.getObject(t10, j10)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t10, long j10) {
        return ((Float) v1.getObject(t10, j10)).floatValue();
    }

    private static <T> int oneofIntAt(T t10, long j10) {
        return ((Integer) v1.getObject(t10, j10)).intValue();
    }

    private static <T> long oneofLongAt(T t10, long j10) {
        return ((Long) v1.getObject(t10, j10)).longValue();
    }

    private <K, V> int parseMapField(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, e.b bVar) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(obj, j10);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(obj, j10, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i10, i11, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), bVar);
    }

    private int parseOneofField(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e.b bVar) throws InvalidProtocolBufferException {
        Unsafe unsafe = UNSAFE;
        long j11 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(e.decodeDouble(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(e.decodeFloat(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint64 = e.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(obj, j10, Long.valueOf(bVar.long1));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint64;
            case 55:
            case DEPRECATED_API_USED_VALUE:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint32 = e.decodeVarint32(bArr, i10, bVar);
                unsafe.putObject(obj, j10, Integer.valueOf(bVar.int1));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint32;
            case AD_VISIBILITY_VALUE:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(e.decodeFixed64(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(e.decodeFixed32(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint65 = e.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(bVar.long1 != 0));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint65;
            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeVarint33 = e.decodeVarint32(bArr, i10, bVar);
                int i22 = bVar.int1;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & ENFORCE_UTF8_MASK) != 0 && !w1.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iDecodeVarint33, i22, a0.UTF_8));
                    iDecodeVarint33 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint33;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(obj, i13, i17);
                int iMergeMessageField = e.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i17), bArr, i10, i11, bVar);
                storeOneofMessageField(obj, i13, i17, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeBytes = e.decodeBytes(bArr, i10, bVar);
                unsafe.putObject(obj, j10, bVar.object1);
                unsafe.putInt(obj, j11, i13);
                return iDecodeBytes;
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint34 = e.decodeVarint32(bArr, i10, bVar);
                int i23 = bVar.int1;
                a0.e enumFieldVerifier = getEnumFieldVerifier(i17);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i23)) {
                    getMutableUnknownFields(obj).storeField(i12, Long.valueOf(i23));
                    return iDecodeVarint34;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(i23));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint34;
            case BLACK_SCREEN_IS_DETECTED_VALUE:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint35 = e.decodeVarint32(bArr, i10, bVar);
                unsafe.putObject(obj, j10, Integer.valueOf(j.decodeZigZag32(bVar.int1)));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint35;
            case NATIVE_PLAY_ASSET_TYPE_VALUE:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint66 = e.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(obj, j10, Long.valueOf(j.decodeZigZag64(bVar.long1)));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint66;
            case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                if (i14 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(obj, i13, i17);
                    int iMergeGroupField = e.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    storeOneofMessageField(obj, i13, i17, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, e.b bVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        a0.i iVarMutableCopyWithCapacity = (a0.i) unsafe.getObject(obj, j11);
        if (!iVarMutableCopyWithCapacity.isModifiable()) {
            int size = iVarMutableCopyWithCapacity.size();
            iVarMutableCopyWithCapacity = iVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, iVarMutableCopyWithCapacity);
        }
        a0.i iVar = iVarMutableCopyWithCapacity;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return e.decodePackedDoubleList(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return e.decodeDoubleList(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return e.decodePackedFloatList(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return e.decodeFloatList(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return e.decodePackedVarint64List(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.decodeVarint64List(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return e.decodePackedVarint32List(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.decodeVarint32List(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case AD_START_EVENT_VALUE:
                if (i14 == 2) {
                    return e.decodePackedFixed64List(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return e.decodeFixed64List(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case SDK_INIT_API_VALUE:
                if (i14 == 2) {
                    return e.decodePackedFixed32List(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return e.decodeFixed32List(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return e.decodePackedBoolList(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.decodeBoolList(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? e.decodeStringList(i12, bArr, i10, i11, iVar, bVar) : e.decodeStringListRequireUtf8(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return e.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return e.decodeBytesList(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iDecodeVarint32List = e.decodeVarint32List(i12, bArr, i10, i11, iVar, bVar);
                    }
                    return i10;
                }
                iDecodeVarint32List = e.decodePackedVarint32List(bArr, i10, iVar, bVar);
                n1.filterUnknownEnumList(obj, i13, iVar, getEnumFieldVerifier(i15), (Object) null, this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case AD_CLICK_EVENT_VALUE:
                if (i14 == 2) {
                    return e.decodePackedSInt32List(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.decodeSInt32List(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return e.decodePackedSInt64List(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.decodeSInt64List(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return e.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    private int positionForFieldNumber(int i10) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, 0);
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j10, j1 j1Var, l1 l1Var, p pVar) {
        j1Var.readGroupList(this.listFieldSchema.mutableListAt(obj, j10), l1Var, pVar);
    }

    private <E> void readMessageList(Object obj, int i10, j1 j1Var, l1 l1Var, p pVar) {
        j1Var.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), l1Var, pVar);
    }

    private void readString(Object obj, int i10, j1 j1Var) {
        if (isEnforceUtf8(i10)) {
            v1.putObject(obj, offset(i10), j1Var.readStringRequireUtf8());
        } else if (this.lite) {
            v1.putObject(obj, offset(i10), j1Var.readString());
        } else {
            v1.putObject(obj, offset(i10), j1Var.readBytes());
        }
    }

    private void readStringList(Object obj, int i10, j1 j1Var) {
        if (isEnforceUtf8(i10)) {
            j1Var.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            j1Var.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        }
    }

    private static Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(Object obj, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 == 1048575) {
            return;
        }
        v1.putInt(obj, j10, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | v1.getInt(obj, j10));
    }

    private void setOneofPresent(Object obj, int i10, int i11) {
        v1.putInt(obj, presenceMaskAndOffsetAt(i11) & 1048575, i10);
    }

    private int slowPositionForFieldNumber(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iNumberAt = numberAt(i13);
            if (i10 == iNumberAt) {
                return i13;
            }
            if (i10 < iNumberAt) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(t tVar, int[] iArr, int i10, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i11;
        Class<?> messageFieldClass;
        int i12;
        b1 oneof = tVar.getOneof();
        if (oneof == null) {
            v type = tVar.getType();
            iObjectFieldOffset = (int) v1.objectFieldOffset(tVar.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                Field presenceField = tVar.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) v1.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(tVar.getPresenceMask());
            } else if (tVar.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = v1.objectFieldOffset(tVar.getCachedSizeField());
            }
            iArr[i10] = tVar.getFieldNumber();
            int i13 = i10 + 1;
            if (tVar.isEnforceUtf8()) {
                i11 = ENFORCE_UTF8_MASK;
            } else {
                i11 = 0;
            }
            iArr[i13] = (tVar.isRequired() ? REQUIRED_MASK : 0) | i11 | (iId << 20) | iObjectFieldOffset;
            iArr[i10 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = tVar.getMessageFieldClass();
            if (tVar.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[((i10 / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (tVar.getEnumVerifier() != null) {
                        objArr[((i10 / 3) * 2) + 1] = tVar.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i12 = (i10 / 3) * 2;
            objArr[i12] = tVar.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i12 + 1] = messageFieldClass;
            } else if (tVar.getEnumVerifier() != null) {
                objArr[i12 + 1] = tVar.getEnumVerifier();
            }
        }
        iId = tVar.getType().id() + 51;
        iObjectFieldOffset = (int) v1.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = v1.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i10] = tVar.getFieldNumber();
        int i14 = i10 + 1;
        if (tVar.isEnforceUtf8()) {
            i11 = ENFORCE_UTF8_MASK;
        } else {
            i11 = 0;
        }
        iArr[i14] = (tVar.isRequired() ? REQUIRED_MASK : 0) | i11 | (iId << 20) | iObjectFieldOffset;
        iArr[i10 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = tVar.getMessageFieldClass();
        if (tVar.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objArr[((i10 / 3) * 2) + 1] = messageFieldClass;
                return;
            } else {
                if (tVar.getEnumVerifier() != null) {
                    objArr[((i10 / 3) * 2) + 1] = tVar.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i12 = (i10 / 3) * 2;
        objArr[i12] = tVar.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i12 + 1] = messageFieldClass;
        } else if (tVar.getEnumVerifier() != null) {
            objArr[i12 + 1] = tVar.getEnumVerifier();
        }
    }

    private void storeMessageField(Object obj, int i10, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i10)), obj2);
        setFieldPresent(obj, i10);
    }

    private void storeOneofMessageField(Object obj, int i10, int i11, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i11)), obj2);
        setOneofPresent(obj, i10, i11);
    }

    private static int type(int i10) {
        return (i10 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void writeFieldsInAscendingOrder(Object obj, y1 y1Var) {
        Map.Entry<u.c, Object> next;
        Iterator<Map.Entry<u.c, Object>> it;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        v0 v0Var = this;
        if (v0Var.hasExtensions) {
            u extensions = v0Var.extensionSchema.getExtensions(obj);
            if (extensions.isEmpty()) {
                next = null;
                it = null;
            } else {
                Iterator<Map.Entry<u.c, Object>> it2 = extensions.iterator();
                next = it2.next();
                it = it2;
            }
        } else {
            next = null;
            it = null;
        }
        int length = v0Var.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iTypeAndOffsetAt = v0Var.typeAndOffsetAt(i14);
            int iNumberAt = v0Var.numberAt(i14);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i16 = v0Var.buffer[i14 + 2];
                z10 = true;
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i15 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = i13;
                i11 = i15;
                i12 = 1 << (i16 >>> 20);
            } else {
                z10 = true;
                i10 = i13;
                i11 = i15;
                i12 = 0;
            }
            while (next != null && v0Var.extensionSchema.extensionNumber(next) <= iNumberAt) {
                v0Var.extensionSchema.serializeExtension(y1Var, next);
                next = it.hasNext() ? it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeDouble(iNumberAt, doubleAt(obj, jOffset));
                    }
                    break;
                case 1:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeFloat(iNumberAt, floatAt(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 2:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeInt64(iNumberAt, unsafe.getLong(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 3:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeUInt64(iNumberAt, unsafe.getLong(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 4:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeInt32(iNumberAt, unsafe.getInt(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 5:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeFixed64(iNumberAt, unsafe.getLong(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 6:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeFixed32(iNumberAt, unsafe.getInt(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 7:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeBool(iNumberAt, booleanAt(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 8:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        v0Var.writeString(iNumberAt, unsafe.getObject(obj, jOffset), y1Var);
                    }
                    break;
                case 9:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeMessage(iNumberAt, unsafe.getObject(obj, jOffset), v0Var.getMessageFieldSchema(i14));
                    }
                    break;
                case 10:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeBytes(iNumberAt, (i) unsafe.getObject(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 11:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeUInt32(iNumberAt, unsafe.getInt(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 12:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeEnum(iNumberAt, unsafe.getInt(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 13:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeSFixed32(iNumberAt, unsafe.getInt(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 14:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeSFixed64(iNumberAt, unsafe.getLong(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 15:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeSInt32(iNumberAt, unsafe.getInt(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 16:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeSInt64(iNumberAt, unsafe.getLong(obj, jOffset));
                    }
                    v0Var = this;
                    break;
                case 17:
                    if (v0Var.isFieldPresent(obj, i14, i10, i11, i12)) {
                        y1Var.writeGroup(iNumberAt, unsafe.getObject(obj, jOffset), v0Var.getMessageFieldSchema(i14));
                    }
                    break;
                case 18:
                    n1.writeDoubleList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 19:
                    n1.writeFloatList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 20:
                    n1.writeInt64List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 21:
                    n1.writeUInt64List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 22:
                    n1.writeInt32List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 23:
                    n1.writeFixed64List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 24:
                    n1.writeFixed32List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 25:
                    n1.writeBoolList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 26:
                    n1.writeStringList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var);
                    break;
                case 27:
                    n1.writeMessageList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, v0Var.getMessageFieldSchema(i14));
                    break;
                case 28:
                    n1.writeBytesList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var);
                    break;
                case 29:
                    z11 = false;
                    n1.writeUInt32List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 30:
                    z11 = false;
                    n1.writeEnumList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 31:
                    z11 = false;
                    n1.writeSFixed32List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 32:
                    z11 = false;
                    n1.writeSFixed64List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 33:
                    z11 = false;
                    n1.writeSInt32List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 34:
                    z11 = false;
                    n1.writeSInt64List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, false);
                    break;
                case 35:
                    n1.writeDoubleList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 36:
                    n1.writeFloatList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 37:
                    n1.writeInt64List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 38:
                    n1.writeUInt64List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 39:
                    n1.writeInt32List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 40:
                    n1.writeFixed64List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 41:
                    n1.writeFixed32List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 42:
                    n1.writeBoolList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 43:
                    n1.writeUInt32List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 44:
                    n1.writeEnumList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case SDK_INIT_API_VALUE:
                    n1.writeSFixed32List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case AD_START_EVENT_VALUE:
                    n1.writeSFixed64List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case AD_CLICK_EVENT_VALUE:
                    n1.writeSInt32List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 48:
                    n1.writeSInt64List(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, z10);
                    break;
                case 49:
                    n1.writeGroupList(v0Var.numberAt(i14), (List) unsafe.getObject(obj, jOffset), y1Var, v0Var.getMessageFieldSchema(i14));
                    break;
                case 50:
                    v0Var.writeMapHelper(y1Var, iNumberAt, unsafe.getObject(obj, jOffset), i14);
                    break;
                case 51:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeDouble(iNumberAt, oneofDoubleAt(obj, jOffset));
                    }
                    break;
                case 52:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeFloat(iNumberAt, oneofFloatAt(obj, jOffset));
                    }
                    break;
                case 53:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeInt64(iNumberAt, oneofLongAt(obj, jOffset));
                    }
                    break;
                case 54:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeUInt64(iNumberAt, oneofLongAt(obj, jOffset));
                    }
                    break;
                case 55:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeInt32(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeFixed64(iNumberAt, oneofLongAt(obj, jOffset));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeFixed32(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeBool(iNumberAt, oneofBooleanAt(obj, jOffset));
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        v0Var.writeString(iNumberAt, unsafe.getObject(obj, jOffset), y1Var);
                    }
                    break;
                case 60:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeMessage(iNumberAt, unsafe.getObject(obj, jOffset), v0Var.getMessageFieldSchema(i14));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeBytes(iNumberAt, (i) unsafe.getObject(obj, jOffset));
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeUInt32(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeEnum(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case 64:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeSFixed32(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case 65:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeSFixed64(iNumberAt, oneofLongAt(obj, jOffset));
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeSInt32(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeSInt64(iNumberAt, oneofLongAt(obj, jOffset));
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (v0Var.isOneofPresent(obj, iNumberAt, i14)) {
                        y1Var.writeGroup(iNumberAt, unsafe.getObject(obj, jOffset), v0Var.getMessageFieldSchema(i14));
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i15 = i11;
            i13 = i10;
            next = next;
        }
        while (next != null) {
            v0Var.extensionSchema.serializeExtension(y1Var, next);
            next = it.hasNext() ? it.next() : null;
        }
        v0Var.writeUnknownInMessageTo(v0Var.unknownFieldSchema, obj, y1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(Object obj, y1 y1Var) {
        Iterator<Map.Entry<u.c, Object>> itDescendingIterator;
        Map.Entry<u.c, Object> next;
        writeUnknownInMessageTo(this.unknownFieldSchema, obj, y1Var);
        if (this.hasExtensions) {
            u extensions = this.extensionSchema.getExtensions(obj);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                next = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                next = itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            next = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (next != null && this.extensionSchema.extensionNumber(next) > iNumberAt) {
                this.extensionSchema.serializeExtension(y1Var, next);
                next = itDescendingIterator.hasNext() ? itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeDouble(iNumberAt, doubleAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeFloat(iNumberAt, floatAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeInt64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeUInt64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeInt32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeFixed64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeFixed32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeBool(iNumberAt, booleanAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(obj, length)) {
                        writeString(iNumberAt, v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var);
                    }
                    break;
                case 9:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeMessage(iNumberAt, v1.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeBytes(iNumberAt, (i) v1.getObject(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeUInt32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeEnum(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeSFixed32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeSFixed64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeSInt32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeSInt64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(obj, length)) {
                        y1Var.writeGroup(iNumberAt, v1.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    n1.writeDoubleList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 19:
                    n1.writeFloatList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 20:
                    n1.writeInt64List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 21:
                    n1.writeUInt64List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 22:
                    n1.writeInt32List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 23:
                    n1.writeFixed64List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 24:
                    n1.writeFixed32List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 25:
                    n1.writeBoolList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 26:
                    n1.writeStringList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var);
                    break;
                case 27:
                    n1.writeMessageList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, getMessageFieldSchema(length));
                    break;
                case 28:
                    n1.writeBytesList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var);
                    break;
                case 29:
                    n1.writeUInt32List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 30:
                    n1.writeEnumList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 31:
                    n1.writeSFixed32List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 32:
                    n1.writeSFixed64List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 33:
                    n1.writeSInt32List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 34:
                    n1.writeSInt64List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 35:
                    n1.writeDoubleList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 36:
                    n1.writeFloatList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 37:
                    n1.writeInt64List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 38:
                    n1.writeUInt64List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 39:
                    n1.writeInt32List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 40:
                    n1.writeFixed64List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 41:
                    n1.writeFixed32List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 42:
                    n1.writeBoolList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 43:
                    n1.writeUInt32List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 44:
                    n1.writeEnumList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case SDK_INIT_API_VALUE:
                    n1.writeSFixed32List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case AD_START_EVENT_VALUE:
                    n1.writeSFixed64List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case AD_CLICK_EVENT_VALUE:
                    n1.writeSInt32List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 48:
                    n1.writeSInt64List(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 49:
                    n1.writeGroupList(numberAt(length), (List) v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(y1Var, iNumberAt, v1.getObject(obj, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeDouble(iNumberAt, oneofDoubleAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeFloat(iNumberAt, oneofFloatAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeInt64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeUInt64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeInt32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeFixed64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeFixed32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeBool(iNumberAt, oneofBooleanAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        writeString(iNumberAt, v1.getObject(obj, offset(iTypeAndOffsetAt)), y1Var);
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeMessage(iNumberAt, v1.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeBytes(iNumberAt, (i) v1.getObject(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeUInt32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeEnum(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeSFixed32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeSFixed64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeSInt32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeSInt64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        y1Var.writeGroup(iNumberAt, v1.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (next != null) {
            this.extensionSchema.serializeExtension(y1Var, next);
            next = itDescendingIterator.hasNext() ? itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(y1 y1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            y1Var.writeMap(i10, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i10, Object obj, y1 y1Var) {
        if (obj instanceof String) {
            y1Var.writeString(i10, (String) obj);
        } else {
            y1Var.writeBytes(i10, (i) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(r1 r1Var, Object obj, y1 y1Var) {
        r1Var.writeTo(r1Var.getFromMessage(obj), y1Var);
    }

    @Override // com.google.protobuf.l1
    public boolean equals(Object obj, Object obj2) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!equals(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v2 com.google.protobuf.v0) = 
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v24 com.google.protobuf.v0)
      (r0v30 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
      (r0v1 com.google.protobuf.v0)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0552: PHI (r1v4 java.lang.Object) = 
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v5 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.l1
    public int getSerializedSize(Object obj) {
        int i10;
        int iComputeDoubleSize;
        int iComputeFloatSize;
        int iComputeInt64Size;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        v0 v0Var = this;
        Object obj2 = obj;
        Unsafe unsafe = UNSAFE;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i12 < v0Var.buffer.length) {
            int iTypeAndOffsetAt = v0Var.typeAndOffsetAt(i12);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = v0Var.numberAt(i12);
            int i16 = v0Var.buffer[i12 + 2];
            int i17 = i16 & i11;
            if (iType <= 17) {
                if (i17 != i15) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj2, i17);
                    i15 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = i14;
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < v.DOUBLE_LIST_PACKED.id() || iType > v.SINT64_LIST_PACKED.id()) {
                i17 = 0;
            }
            switch (iType) {
                case 0:
                    if (!v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i14 = i18 + iComputeFloatSize;
                        v0Var = this;
                        obj2 = obj;
                    }
                    v0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 2:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        v0Var = this;
                    }
                    v0Var = this;
                    i14 = i18;
                    break;
                case 3:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        v0Var = this;
                    }
                    v0Var = this;
                    i14 = i18;
                    break;
                case 4:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        v0Var = this;
                    }
                    v0Var = this;
                    i14 = i18;
                    break;
                case 5:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i14 = i18 + iComputeFloatSize;
                        v0Var = this;
                        obj2 = obj;
                    }
                    v0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 6:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i14 = i18 + iComputeFloatSize;
                        v0Var = this;
                        obj2 = obj;
                    }
                    v0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 7:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i14 = i18 + iComputeFloatSize;
                        v0Var = this;
                        obj2 = obj;
                    }
                    v0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 8:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        Object object = unsafe.getObject(obj2, jOffset);
                        iComputeInt64Size = object instanceof i ? CodedOutputStream.computeBytesSize(iNumberAt, (i) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        i14 = i18 + iComputeInt64Size;
                        v0Var = this;
                    }
                    v0Var = this;
                    i14 = i18;
                    break;
                case 9:
                    if (!v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = n1.computeSizeMessage(iNumberAt, unsafe.getObject(obj2, jOffset), v0Var.getMessageFieldSchema(i12));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case 10:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeBytesSize(iNumberAt, (i) unsafe.getObject(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        v0Var = this;
                    }
                    v0Var = this;
                    i14 = i18;
                    break;
                case 11:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        v0Var = this;
                    }
                    v0Var = this;
                    i14 = i18;
                    break;
                case 12:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        v0Var = this;
                    }
                    v0Var = this;
                    i14 = i18;
                    break;
                case 13:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i14 = i18 + iComputeFloatSize;
                        v0Var = this;
                        obj2 = obj;
                    }
                    v0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 14:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i14 = i18 + iComputeFloatSize;
                        v0Var = this;
                        obj2 = obj;
                    }
                    v0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 15:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        v0Var = this;
                    }
                    v0Var = this;
                    i14 = i18;
                    break;
                case 16:
                    if (v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        v0Var = this;
                    }
                    v0Var = this;
                    i14 = i18;
                    break;
                case 17:
                    if (!v0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (s0) unsafe.getObject(obj2, jOffset), v0Var.getMessageFieldSchema(i12));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case 18:
                    iComputeDoubleSize = n1.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = n1.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = n1.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = n1.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = n1.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = n1.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = n1.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = n1.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = n1.computeSizeStringList(iNumberAt, (List) unsafe.getObject(obj2, jOffset));
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = n1.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(obj2, jOffset), v0Var.getMessageFieldSchema(i12));
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = n1.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(obj2, jOffset));
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = n1.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = n1.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = n1.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = n1.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = n1.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = n1.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeInt64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeInt32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeBoolListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeEnumListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case SDK_INIT_API_VALUE:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case AD_START_EVENT_VALUE:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case AD_CLICK_EVENT_VALUE:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i14 = i18;
                    } else {
                        if (v0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 49:
                    iComputeDoubleSize = n1.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(obj2, jOffset), v0Var.getMessageFieldSchema(i12));
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = v0Var.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(obj2, jOffset), v0Var.getMapFieldDefaultEntry(i12));
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 51:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case 52:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case 53:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case 54:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case 55:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        Object object2 = unsafe.getObject(obj2, jOffset);
                        iComputeDoubleSize = object2 instanceof i ? CodedOutputStream.computeBytesSize(iNumberAt, (i) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case 60:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = n1.computeSizeMessage(iNumberAt, unsafe.getObject(obj2, jOffset), v0Var.getMessageFieldSchema(i12));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (i) unsafe.getObject(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case 64:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case 65:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (!v0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        i14 = i18;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (s0) unsafe.getObject(obj2, jOffset), v0Var.getMessageFieldSchema(i12));
                        i14 = i18 + iComputeDoubleSize;
                    }
                    break;
                default:
                    i14 = i18;
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        int unknownFieldsSerializedSize = i14 + v0Var.getUnknownFieldsSerializedSize(v0Var.unknownFieldSchema, obj2);
        return v0Var.hasExtensions ? unknownFieldsSerializedSize + v0Var.extensionSchema.getExtensions(obj2).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.l1
    public int hashCode(Object obj) {
        int i10;
        int iHashLong;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i12);
            int iNumberAt = numberAt(i12);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(Double.doubleToLongBits(v1.getDouble(obj, jOffset)));
                    i11 = i10 + iHashLong;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(v1.getFloat(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(v1.getLong(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(v1.getLong(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(v1.getLong(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = a0.hashBoolean(v1.getBoolean(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) v1.getObject(obj, jOffset)).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 9:
                    Object object = v1.getObject(obj, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = v1.getObject(obj, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(v1.getLong(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(v1.getLong(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 17:
                    Object object2 = v1.getObject(obj, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case SDK_INIT_API_VALUE:
                case AD_START_EVENT_VALUE:
                case AD_CLICK_EVENT_VALUE:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iHashLong = v1.getObject(obj, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = v1.getObject(obj, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(Double.doubleToLongBits(oneofDoubleAt(obj, jOffset)));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(oneofLongAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(oneofLongAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(oneofLongAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashBoolean(oneofBooleanAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = ((String) v1.getObject(obj, jOffset)).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = v1.getObject(obj, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = v1.getObject(obj, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(oneofLongAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(oneofLongAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = v1.getObject(obj, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.unknownFieldSchema.getFromMessage(obj).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(obj).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.protobuf.l1
    public final boolean isInitialized(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.checkInitializedCount) {
            int i15 = this.intArray[i13];
            int iNumberAt = numberAt(i15);
            int iTypeAndOffsetAt = typeAndOffsetAt(i15);
            int i16 = this.buffer[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = UNSAFE.getInt(obj, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            Object obj2 = obj;
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(obj2, i15, i10, i11, i18)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(obj2, i15, i10, i11, i18) && !isInitialized(obj2, iTypeAndOffsetAt, getMessageFieldSchema(i15))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(obj2, iTypeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(obj2, iNumberAt, i15) && !isInitialized(obj2, iTypeAndOffsetAt, getMessageFieldSchema(i15))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(obj2, iTypeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (!isListInitialized(obj2, iTypeAndOffsetAt, i15)) {
                return false;
            }
            i13++;
            obj = obj2;
            i12 = i10;
            i14 = i11;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(obj).isInitialized();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    @Override // com.google.protobuf.l1
    public void makeImmutable(Object obj) {
        if (isMutable(obj)) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                yVar.clearMemoizedSerializedSize();
                yVar.clearMemoizedHashCode();
                yVar.markImmutable();
            }
            int length = this.buffer.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i10);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    if (iType != 60 && iType != 68) {
                        switch (iType) {
                            case 17:
                                if (isFieldPresent(obj, i10)) {
                                    getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(obj, jOffset));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case SDK_INIT_API_VALUE:
                            case AD_START_EVENT_VALUE:
                            case AD_CLICK_EVENT_VALUE:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(obj, jOffset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(obj, jOffset);
                                if (object != null) {
                                    unsafe.putObject(obj, jOffset, this.mapFieldSchema.toImmutable(object));
                                }
                                break;
                        }
                    } else if (isOneofPresent(obj, numberAt(i10), i10)) {
                        getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(obj, jOffset));
                    }
                } else if (isFieldPresent(obj, i10)) {
                    getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(obj, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(obj);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(obj);
            }
        }
    }

    @Override // com.google.protobuf.l1
    public void mergeFrom(Object obj, Object obj2) {
        checkMutable(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(obj, obj2, i10);
        }
        n1.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            n1.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // com.google.protobuf.l1
    public Object newInstance() {
        return this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    int parseMessage(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.e.b r32) {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.parseMessage(java.lang.Object, byte[], int, int, int, com.google.protobuf.e$b):int");
    }

    @Override // com.google.protobuf.l1
    public void writeTo(Object obj, y1 y1Var) {
        if (y1Var.fieldOrder() == y1.a.DESCENDING) {
            writeFieldsInDescendingOrder(obj, y1Var);
        } else {
            writeFieldsInAscendingOrder(obj, y1Var);
        }
    }

    private boolean isFieldPresent(Object obj, int i10) {
        boolean zEquals;
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 != 1048575) {
            return (v1.getInt(obj, j10) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(v1.getDouble(obj, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(v1.getFloat(obj, jOffset)) != 0;
            case 2:
                return v1.getLong(obj, jOffset) != 0;
            case 3:
                return v1.getLong(obj, jOffset) != 0;
            case 4:
                return v1.getInt(obj, jOffset) != 0;
            case 5:
                return v1.getLong(obj, jOffset) != 0;
            case 6:
                return v1.getInt(obj, jOffset) != 0;
            case 7:
                return v1.getBoolean(obj, jOffset);
            case 8:
                Object object = v1.getObject(obj, jOffset);
                if (object instanceof String) {
                    zEquals = ((String) object).isEmpty();
                } else {
                    if (!(object instanceof i)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = i.EMPTY.equals(object);
                }
                break;
            case 9:
                return v1.getObject(obj, jOffset) != null;
            case 10:
                zEquals = i.EMPTY.equals(v1.getObject(obj, jOffset));
                break;
            case 11:
                return v1.getInt(obj, jOffset) != 0;
            case 12:
                return v1.getInt(obj, jOffset) != 0;
            case 13:
                return v1.getInt(obj, jOffset) != 0;
            case 14:
                return v1.getLong(obj, jOffset) != 0;
            case 15:
                return v1.getInt(obj, jOffset) != 0;
            case 16:
                return v1.getLong(obj, jOffset) != 0;
            case 17:
                return v1.getObject(obj, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    @Override // com.google.protobuf.l1
    public void mergeFrom(Object obj, j1 j1Var, p pVar) {
        pVar.getClass();
        checkMutable(obj);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, j1Var, pVar);
    }

    private boolean equals(Object obj, Object obj2, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(obj, obj2, i10) && Double.doubleToLongBits(v1.getDouble(obj, jOffset)) == Double.doubleToLongBits(v1.getDouble(obj2, jOffset));
            case 1:
                return arePresentForEquals(obj, obj2, i10) && Float.floatToIntBits(v1.getFloat(obj, jOffset)) == Float.floatToIntBits(v1.getFloat(obj2, jOffset));
            case 2:
                return arePresentForEquals(obj, obj2, i10) && v1.getLong(obj, jOffset) == v1.getLong(obj2, jOffset);
            case 3:
                return arePresentForEquals(obj, obj2, i10) && v1.getLong(obj, jOffset) == v1.getLong(obj2, jOffset);
            case 4:
                return arePresentForEquals(obj, obj2, i10) && v1.getInt(obj, jOffset) == v1.getInt(obj2, jOffset);
            case 5:
                return arePresentForEquals(obj, obj2, i10) && v1.getLong(obj, jOffset) == v1.getLong(obj2, jOffset);
            case 6:
                return arePresentForEquals(obj, obj2, i10) && v1.getInt(obj, jOffset) == v1.getInt(obj2, jOffset);
            case 7:
                return arePresentForEquals(obj, obj2, i10) && v1.getBoolean(obj, jOffset) == v1.getBoolean(obj2, jOffset);
            case 8:
                return arePresentForEquals(obj, obj2, i10) && n1.safeEquals(v1.getObject(obj, jOffset), v1.getObject(obj2, jOffset));
            case 9:
                return arePresentForEquals(obj, obj2, i10) && n1.safeEquals(v1.getObject(obj, jOffset), v1.getObject(obj2, jOffset));
            case 10:
                return arePresentForEquals(obj, obj2, i10) && n1.safeEquals(v1.getObject(obj, jOffset), v1.getObject(obj2, jOffset));
            case 11:
                return arePresentForEquals(obj, obj2, i10) && v1.getInt(obj, jOffset) == v1.getInt(obj2, jOffset);
            case 12:
                return arePresentForEquals(obj, obj2, i10) && v1.getInt(obj, jOffset) == v1.getInt(obj2, jOffset);
            case 13:
                return arePresentForEquals(obj, obj2, i10) && v1.getInt(obj, jOffset) == v1.getInt(obj2, jOffset);
            case 14:
                return arePresentForEquals(obj, obj2, i10) && v1.getLong(obj, jOffset) == v1.getLong(obj2, jOffset);
            case 15:
                return arePresentForEquals(obj, obj2, i10) && v1.getInt(obj, jOffset) == v1.getInt(obj2, jOffset);
            case 16:
                return arePresentForEquals(obj, obj2, i10) && v1.getLong(obj, jOffset) == v1.getLong(obj2, jOffset);
            case 17:
                return arePresentForEquals(obj, obj2, i10) && n1.safeEquals(v1.getObject(obj, jOffset), v1.getObject(obj2, jOffset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case SDK_INIT_API_VALUE:
            case AD_START_EVENT_VALUE:
            case AD_CLICK_EVENT_VALUE:
            case 48:
            case 49:
                return n1.safeEquals(v1.getObject(obj, jOffset), v1.getObject(obj2, jOffset));
            case 50:
                return n1.safeEquals(v1.getObject(obj, jOffset), v1.getObject(obj2, jOffset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case AD_VISIBILITY_VALUE:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
            case 60:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case DEPRECATED_API_USED_VALUE:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case BLACK_SCREEN_IS_DETECTED_VALUE:
            case NATIVE_PLAY_ASSET_TYPE_VALUE:
            case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                return isOneofCaseEqual(obj, obj2, i10) && n1.safeEquals(v1.getObject(obj, jOffset), v1.getObject(obj2, jOffset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.l1
    public void mergeFrom(Object obj, byte[] bArr, int i10, int i11, e.b bVar) {
        parseMessage(obj, bArr, i10, i11, 0, bVar);
    }

    private static boolean isInitialized(Object obj, int i10, l1 l1Var) {
        return l1Var.isInitialized(v1.getObject(obj, offset(i10)));
    }
}
