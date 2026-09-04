package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class u {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final u DEFAULT_INSTANCE = new u(true);
    private final o1 fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[x1.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[x1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[x1.c.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[x1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {
        private o1 fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        /* synthetic */ b(a aVar) {
            this();
        }

        private u buildImpl(boolean z10) {
            if (this.fields.isEmpty()) {
                return u.emptySet();
            }
            this.isMutable = false;
            o1 o1VarCloneAllFieldsMap = this.fields;
            if (this.hasNestedBuilders) {
                o1VarCloneAllFieldsMap = u.cloneAllFieldsMap(o1VarCloneAllFieldsMap, false);
                replaceBuilders(o1VarCloneAllFieldsMap, z10);
            }
            u uVar = new u(o1VarCloneAllFieldsMap, null);
            uVar.hasLazyField = this.hasLazyField;
            return uVar;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = u.cloneAllFieldsMap(this.fields, true);
            this.isMutable = true;
        }

        public static <T extends c> b fromFieldSet(u uVar) {
            b bVar = new b(u.cloneAllFieldsMap(uVar.fields, true));
            bVar.hasLazyField = uVar.hasLazyField;
            return bVar;
        }

        private void mergeFromField(Map.Entry<c, Object> entry) {
            c key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof e0) {
                value = ((e0) value).getValue();
            }
            if (key.isRepeated()) {
                List arrayList = (List) getFieldAllowBuilders(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.fields.put((Comparable<Object>) key, (Object) arrayList);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(u.cloneIfMutable(it.next()));
                }
                return;
            }
            if (key.getLiteJavaType() != x1.c.MESSAGE) {
                this.fields.put((Comparable<Object>) key, u.cloneIfMutable(value));
                return;
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(key);
            if (fieldAllowBuilders == null) {
                this.fields.put((Comparable<Object>) key, u.cloneIfMutable(value));
            } else if (fieldAllowBuilders instanceof s0.a) {
                key.internalMergeFrom((s0.a) fieldAllowBuilders, (s0) value);
            } else {
                this.fields.put((Comparable<Object>) key, (Object) key.internalMergeFrom(((s0) fieldAllowBuilders).toBuilder(), (s0) value).build());
            }
        }

        private static Object replaceBuilder(Object obj, boolean z10) {
            if (!(obj instanceof s0.a)) {
                return obj;
            }
            s0.a aVar = (s0.a) obj;
            return z10 ? aVar.buildPartial() : aVar.build();
        }

        private static <T extends c> void replaceBuilders(o1 o1Var, boolean z10) {
            for (int i10 = 0; i10 < o1Var.getNumArrayEntries(); i10++) {
                replaceBuilders(o1Var.getArrayEntryAt(i10), z10);
            }
            Iterator<Map.Entry<Comparable<Object>, Object>> it = o1Var.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders(it.next(), z10);
            }
        }

        private void verifyType(c cVar, Object obj) {
            if (u.isValidType(cVar.getLiteType(), obj)) {
                return;
            }
            if (cVar.getLiteType().getJavaType() != x1.c.MESSAGE || !(obj instanceof s0.a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(cVar.getNumber()), cVar.getLiteType().getJavaType(), obj.getClass().getName()));
            }
        }

        public void addRepeatedField(c cVar, Object obj) {
            List arrayList;
            ensureIsMutable();
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof s0.a);
            verifyType(cVar, obj);
            Object fieldAllowBuilders = getFieldAllowBuilders(cVar);
            if (fieldAllowBuilders == null) {
                arrayList = new ArrayList();
                this.fields.put((Comparable<Object>) cVar, (Object) arrayList);
            } else {
                arrayList = (List) fieldAllowBuilders;
            }
            arrayList.add(obj);
        }

        public u build() {
            return buildImpl(false);
        }

        public u buildPartial() {
            return buildImpl(true);
        }

        public void clearField(c cVar) {
            ensureIsMutable();
            this.fields.remove(cVar);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public Map<c, Object> getAllFields() {
            if (!this.hasLazyField) {
                return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
            }
            o1 o1VarCloneAllFieldsMap = u.cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                o1VarCloneAllFieldsMap.makeImmutable();
                return o1VarCloneAllFieldsMap;
            }
            replaceBuilders(o1VarCloneAllFieldsMap, true);
            return o1VarCloneAllFieldsMap;
        }

        public Object getField(c cVar) {
            return replaceBuilders(cVar, getFieldAllowBuilders(cVar), true);
        }

        Object getFieldAllowBuilders(c cVar) {
            Object obj = this.fields.get(cVar);
            return obj instanceof e0 ? ((e0) obj).getValue() : obj;
        }

        public Object getRepeatedField(c cVar, int i10) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(cVar, i10), true);
        }

        Object getRepeatedFieldAllowBuilders(c cVar, int i10) {
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(cVar);
            if (fieldAllowBuilders != null) {
                return ((List) fieldAllowBuilders).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }

        public int getRepeatedFieldCount(c cVar) {
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(cVar);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((List) fieldAllowBuilders).size();
        }

        public boolean hasField(c cVar) {
            if (cVar.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.fields.get(cVar) != null;
        }

        public boolean isInitialized() {
            for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
                if (!u.isInitialized(this.fields.getArrayEntryAt(i10))) {
                    return false;
                }
            }
            Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!u.isInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFrom(u uVar) {
            ensureIsMutable();
            for (int i10 = 0; i10 < uVar.fields.getNumArrayEntries(); i10++) {
                mergeFromField(uVar.fields.getArrayEntryAt(i10));
            }
            Iterator<Map.Entry<Comparable<Object>, Object>> it = uVar.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField(it.next());
            }
        }

        public void setField(c cVar, Object obj) {
            ensureIsMutable();
            if (!cVar.isRepeated()) {
                verifyType(cVar, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) obj);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    verifyType(cVar, obj2);
                    this.hasNestedBuilders = this.hasNestedBuilders || (obj2 instanceof s0.a);
                }
                obj = arrayList;
            }
            if (obj instanceof e0) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof s0.a);
            this.fields.put((Comparable<Object>) cVar, obj);
        }

        public void setRepeatedField(c cVar, int i10, Object obj) {
            ensureIsMutable();
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof s0.a);
            Object fieldAllowBuilders = getFieldAllowBuilders(cVar);
            if (fieldAllowBuilders == null) {
                throw new IndexOutOfBoundsException();
            }
            verifyType(cVar, obj);
            ((List) fieldAllowBuilders).set(i10, obj);
        }

        private b() {
            this(o1.newFieldMap(16));
        }

        private b(o1 o1Var) {
            this.fields = o1Var;
            this.isMutable = true;
        }

        private static <T extends c> void replaceBuilders(Map.Entry<T, Object> entry, boolean z10) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z10));
        }

        private static <T extends c> Object replaceBuilders(T t10, Object obj, boolean z10) {
            if (obj == null || t10.getLiteJavaType() != x1.c.MESSAGE) {
                return obj;
            }
            if (t10.isRepeated()) {
                if (obj instanceof List) {
                    List arrayList = (List) obj;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        Object obj2 = arrayList.get(i10);
                        Object objReplaceBuilder = replaceBuilder(obj2, z10);
                        if (objReplaceBuilder != obj2) {
                            if (arrayList == obj) {
                                arrayList = new ArrayList(arrayList);
                            }
                            arrayList.set(i10, objReplaceBuilder);
                        }
                    }
                    return arrayList;
                }
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            return replaceBuilder(obj, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c extends Comparable {
        a0.d getEnumType();

        x1.c getLiteJavaType();

        x1.b getLiteType();

        int getNumber();

        s0.a internalMergeFrom(s0.a aVar, s0 s0Var);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ u(o1 o1Var, a aVar) {
        this(o1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c> o1 cloneAllFieldsMap(o1 o1Var, boolean z10) {
        o1 o1VarNewFieldMap = o1.newFieldMap(16);
        for (int i10 = 0; i10 < o1Var.getNumArrayEntries(); i10++) {
            cloneFieldEntry(o1VarNewFieldMap, o1Var.getArrayEntryAt(i10), z10);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = o1Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(o1VarNewFieldMap, it.next(), z10);
        }
        return o1VarNewFieldMap;
    }

    private static <T extends c> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z10) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            map.put(key, ((e0) value).getValue());
        } else if (z10 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int computeElementSize(x1.b bVar, int i10, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10);
        if (bVar == x1.b.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + computeElementSizeNoTag(bVar, obj);
    }

    static int computeElementSizeNoTag(x1.b bVar, Object obj) {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((s0) obj);
            case 10:
                return obj instanceof e0 ? CodedOutputStream.computeLazyFieldSizeNoTag((e0) obj) : CodedOutputStream.computeMessageSizeNoTag((s0) obj);
            case 11:
                return obj instanceof i ? CodedOutputStream.computeBytesSizeNoTag((i) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof i ? CodedOutputStream.computeBytesSizeNoTag((i) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof a0.c ? CodedOutputStream.computeEnumSizeNoTag(((a0.c) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(c cVar, Object obj) {
        x1.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        List list = (List) obj;
        int iComputeElementSize = 0;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iComputeElementSize += computeElementSize(liteType, number, it.next());
            }
            return iComputeElementSize;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iComputeElementSize += computeElementSizeNoTag(liteType, it2.next());
        }
        return CodedOutputStream.computeTagSize(number) + iComputeElementSize + CodedOutputStream.computeUInt32SizeNoTag(iComputeElementSize);
    }

    public static <T extends c> u emptySet() {
        return DEFAULT_INSTANCE;
    }

    static int getWireFormatForFieldType(x1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.getWireType();
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof t0) {
            return ((t0) obj).isInitialized();
        }
        if (obj instanceof e0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(x1.b bVar, Object obj) {
        a0.checkNotNull(obj);
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$JavaType[bVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof a0.c);
            case 9:
                return (obj instanceof s0) || (obj instanceof e0);
            default:
                return false;
        }
    }

    private void mergeFromField(Map.Entry<c, Object> entry) {
        c key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            value = ((e0) value).getValue();
        }
        if (key.isRepeated()) {
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((Comparable<Object>) key, field);
            return;
        }
        if (key.getLiteJavaType() != x1.c.MESSAGE) {
            this.fields.put((Comparable<Object>) key, cloneIfMutable(value));
            return;
        }
        Object field2 = getField(key);
        if (field2 == null) {
            this.fields.put((Comparable<Object>) key, cloneIfMutable(value));
        } else {
            this.fields.put((Comparable<Object>) key, (Object) key.internalMergeFrom(((s0) field2).toBuilder(), (s0) value).build());
        }
    }

    public static <T extends c> b newBuilder() {
        return new b((a) null);
    }

    public static <T extends c> u newFieldSet() {
        return new u();
    }

    public static Object readPrimitiveField(j jVar, x1.b bVar, boolean z10) {
        return z10 ? x1.readPrimitiveField(jVar, bVar, x1.d.STRICT) : x1.readPrimitiveField(jVar, bVar, x1.d.LOOSE);
    }

    private void verifyType(c cVar, Object obj) {
        if (!isValidType(cVar.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(cVar.getNumber()), cVar.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    static void writeElement(CodedOutputStream codedOutputStream, x1.b bVar, int i10, Object obj) {
        if (bVar == x1.b.GROUP) {
            codedOutputStream.writeGroup(i10, (s0) obj);
        } else {
            codedOutputStream.writeTag(i10, getWireFormatForFieldType(bVar, false));
            writeElementNoTag(codedOutputStream, bVar, obj);
        }
    }

    static void writeElementNoTag(CodedOutputStream codedOutputStream, x1.b bVar, Object obj) {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((s0) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((s0) obj);
                break;
            case 11:
                if (!(obj instanceof i)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((i) obj);
                }
                break;
            case 12:
                if (!(obj instanceof i)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((i) obj);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof a0.c)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((a0.c) obj).getNumber());
                }
                break;
        }
    }

    public static void writeField(c cVar, Object obj, CodedOutputStream codedOutputStream) {
        x1.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            if (obj instanceof e0) {
                writeElement(codedOutputStream, liteType, number, ((e0) obj).getValue());
                return;
            } else {
                writeElement(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                writeElement(codedOutputStream, liteType, number, it.next());
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            codedOutputStream.writeTag(number, 2);
            Iterator it2 = list.iterator();
            int iComputeElementSizeNoTag = 0;
            while (it2.hasNext()) {
                iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, it2.next());
            }
            codedOutputStream.writeUInt32NoTag(iComputeElementSizeNoTag);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                writeElementNoTag(codedOutputStream, liteType, it3.next());
            }
        }
    }

    public void addRepeatedField(c cVar, Object obj) {
        List arrayList;
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(cVar, obj);
        Object field = getField(cVar);
        if (field == null) {
            arrayList = new ArrayList();
            this.fields.put((Comparable<Object>) cVar, (Object) arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(c cVar) {
        this.fields.remove(cVar);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    Iterator<Map.Entry<c, Object>> descendingIterator() {
        return this.hasLazyField ? new e0.c(this.fields.descendingEntrySet().iterator()) : this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.fields.equals(((u) obj).fields);
        }
        return false;
    }

    public Map<c, Object> getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
        }
        o1 o1VarCloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
        if (this.fields.isImmutable()) {
            o1VarCloneAllFieldsMap.makeImmutable();
        }
        return o1VarCloneAllFieldsMap;
    }

    public Object getField(c cVar) {
        Object obj = this.fields.get(cVar);
        return obj instanceof e0 ? ((e0) obj).getValue() : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getMessageSetSerializedSize() {
        int messageSetSerializedSize = 0;
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i10));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            messageSetSerializedSize += getMessageSetSerializedSize(it.next());
        }
        return messageSetSerializedSize;
    }

    public Object getRepeatedField(c cVar, int i10) {
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(cVar);
        if (field != null) {
            return ((List) field).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(c cVar) {
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(cVar);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        int iComputeFieldSize = 0;
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            iComputeFieldSize += computeFieldSize((c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            iComputeFieldSize += computeFieldSize((c) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(c cVar) {
        if (cVar.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(cVar) != null;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean isInitialized() {
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<c, Object>> iterator() {
        return this.hasLazyField ? new e0.c(this.fields.entrySet().iterator()) : this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            if (arrayEntryAt.getValue() instanceof y) {
                ((y) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFrom(u uVar) {
        for (int i10 = 0; i10 < uVar.fields.getNumArrayEntries(); i10++) {
            mergeFromField(uVar.fields.getArrayEntryAt(i10));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = uVar.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    public void setField(c cVar, Object obj) {
        if (!cVar.isRepeated()) {
            verifyType(cVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                verifyType(cVar, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof e0) {
            this.hasLazyField = true;
        }
        this.fields.put((Comparable<Object>) cVar, obj);
    }

    public void setRepeatedField(c cVar, int i10, Object obj) {
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(cVar);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        verifyType(cVar, obj);
        ((List) field).set(i10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeMessageSetTo(CodedOutputStream codedOutputStream) {
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i10), codedOutputStream);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo(it.next(), codedOutputStream);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            writeField((c) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            writeField((c) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    private u() {
        this.fields = o1.newFieldMap(16);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public u m46clone() {
        u uVarNewFieldSet = newFieldSet();
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            uVarNewFieldSet.setField((c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            uVarNewFieldSet.setField((c) entry.getKey(), entry.getValue());
        }
        uVarNewFieldSet.hasLazyField = this.hasLazyField;
        return uVarNewFieldSet;
    }

    private u(boolean z10) {
        this(o1.newFieldMap(0));
        makeImmutable();
    }

    private int getMessageSetSerializedSize(Map.Entry<c, Object> entry) {
        c key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == x1.c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof e0) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (e0) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (s0) value);
        }
        return computeFieldSize(key, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c> boolean isInitialized(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != x1.c.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!isMessageFieldValueInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(Map.Entry<c, Object> entry, CodedOutputStream codedOutputStream) {
        c key = entry.getKey();
        if (key.getLiteJavaType() == x1.c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof e0) {
                codedOutputStream.writeRawMessageSetExtension(entry.getKey().getNumber(), ((e0) value).toByteString());
                return;
            } else {
                codedOutputStream.writeMessageSetExtension(entry.getKey().getNumber(), (s0) value);
                return;
            }
        }
        writeField(key, entry.getValue(), codedOutputStream);
    }

    private u(o1 o1Var) {
        this.fields = o1Var;
        makeImmutable();
    }
}
