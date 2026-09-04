package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y extends com.google.protobuf.a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, y> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected s1 unknownFields = s1.getDefaultInstance();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[x1.c.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[x1.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b extends com.google.protobuf.a.AbstractC0331a {
        private final y defaultInstance;
        protected y instance;

        protected b(y yVar) {
            this.defaultInstance = yVar;
            if (yVar.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = newMutableInstance();
        }

        private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            f1.getInstance().schemaFor(messagetype).mergeFrom(messagetype, messagetype2);
        }

        private y newMutableInstance() {
            return this.defaultInstance.newMutableInstance();
        }

        protected final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        protected void copyOnWriteInternal() {
            y yVarNewMutableInstance = newMutableInstance();
            mergeFromInstance(yVarNewMutableInstance, this.instance);
            this.instance = yVarNewMutableInstance;
        }

        @Override // com.google.protobuf.a.AbstractC0331a, com.google.protobuf.s0.a, com.google.protobuf.t0
        public final boolean isInitialized() {
            return y.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.a.AbstractC0331a, com.google.protobuf.s0.a
        public final y build() {
            y yVarBuildPartial = buildPartial();
            if (yVarBuildPartial.isInitialized()) {
                return yVarBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0331a.newUninitializedMessageException(yVarBuildPartial);
        }

        @Override // com.google.protobuf.a.AbstractC0331a, com.google.protobuf.s0.a
        public y buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // com.google.protobuf.a.AbstractC0331a, com.google.protobuf.s0.a
        public final b clear() {
            if (this.defaultInstance.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = newMutableInstance();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0331a, com.google.protobuf.s0.a, com.google.protobuf.t0
        public y getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.a.AbstractC0331a
        public b internalMergeFrom(y yVar) {
            return mergeFrom(yVar);
        }

        @Override // com.google.protobuf.a.AbstractC0331a
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public b mo45clone() {
            b bVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            bVarNewBuilderForType.instance = buildPartial();
            return bVarNewBuilderForType;
        }

        public b mergeFrom(y yVar) {
            if (getDefaultInstanceForType().equals(yVar)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, yVar);
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0331a, com.google.protobuf.s0.a
        public b mergeFrom(byte[] bArr, int i10, int i11, p pVar) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                f1.getInstance().schemaFor(this.instance).mergeFrom(this.instance, bArr, i10, i10 + i11, new com.google.protobuf.e.b(pVar));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.a.AbstractC0331a, com.google.protobuf.s0.a
        public b mergeFrom(byte[] bArr, int i10, int i11) {
            return mergeFrom(bArr, i10, i11, p.getEmptyRegistry());
        }

        @Override // com.google.protobuf.a.AbstractC0331a, com.google.protobuf.s0.a
        public b mergeFrom(j jVar, p pVar) throws IOException {
            copyOnWrite();
            try {
                f1.getInstance().schemaFor(this.instance).mergeFrom(this.instance, k.forCodedInput(jVar), pVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e extends t0 {
        @Override // com.google.protobuf.t0
        /* synthetic */ s0 getDefaultInstanceForType();

        <Type> Type getExtension(n nVar);

        <Type> Type getExtension(n nVar, int i10);

        <Type> int getExtensionCount(n nVar);

        <Type> boolean hasExtension(n nVar);

        @Override // com.google.protobuf.t0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f implements u.c {
        final a0.d enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final x1.b type;

        f(a0.d dVar, int i10, x1.b bVar, boolean z10, boolean z11) {
            this.enumTypeMap = dVar;
            this.number = i10;
            this.type = bVar;
            this.isRepeated = z10;
            this.isPacked = z11;
        }

        @Override // com.google.protobuf.u.c
        public a0.d getEnumType() {
            return this.enumTypeMap;
        }

        @Override // com.google.protobuf.u.c
        public x1.c getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // com.google.protobuf.u.c
        public x1.b getLiteType() {
            return this.type;
        }

        @Override // com.google.protobuf.u.c
        public int getNumber() {
            return this.number;
        }

        @Override // com.google.protobuf.u.c
        public s0.a internalMergeFrom(s0.a aVar, s0 s0Var) {
            return ((b) aVar).mergeFrom((y) s0Var);
        }

        @Override // com.google.protobuf.u.c
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // com.google.protobuf.u.c
        public boolean isRepeated() {
            return this.isRepeated;
        }

        @Override // java.lang.Comparable
        public int compareTo(f fVar) {
            return this.number - fVar.number;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class g extends n {
        final s0 containingTypeDefaultInstance;
        final Object defaultValue;
        final f descriptor;
        final s0 messageDefaultInstance;

        g(s0 s0Var, Object obj, s0 s0Var2, f fVar, Class cls) {
            if (s0Var == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (fVar.getLiteType() == x1.b.MESSAGE && s0Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = s0Var;
            this.defaultValue = obj;
            this.messageDefaultInstance = s0Var2;
            this.descriptor = fVar;
        }

        Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != x1.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularFromFieldSetType(it.next()));
            }
            return arrayList;
        }

        public s0 getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // com.google.protobuf.n
        public Object getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.google.protobuf.n
        public x1.b getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override // com.google.protobuf.n
        public s0 getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        @Override // com.google.protobuf.n
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override // com.google.protobuf.n
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        Object singularFromFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == x1.c.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == x1.c.ENUM ? Integer.valueOf(((a0.c) obj).getNumber()) : obj;
        }

        Object toFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularToFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != x1.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularToFieldSetType(it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum h {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends d, BuilderType, T> g checkIsLite(n nVar) {
        if (nVar.isLite()) {
            return (g) nVar;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends y> T checkMessageInitialized(T t10) throws InvalidProtocolBufferException {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t10);
    }

    private int computeSerializedSize(l1 l1Var) {
        return l1Var == null ? f1.getInstance().schemaFor(this).getSerializedSize(this) : l1Var.getSerializedSize(this);
    }

    protected static a0.a emptyBooleanList() {
        return com.google.protobuf.f.emptyList();
    }

    protected static a0.b emptyDoubleList() {
        return m.emptyList();
    }

    protected static a0.f emptyFloatList() {
        return w.emptyList();
    }

    protected static a0.g emptyIntList() {
        return z.emptyList();
    }

    protected static a0.h emptyLongList() {
        return j0.emptyList();
    }

    protected static <E> a0.i emptyProtobufList() {
        return g1.emptyList();
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == s1.getDefaultInstance()) {
            this.unknownFields = s1.newInstance();
        }
    }

    static <T extends y> T getDefaultInstance(Class<T> cls) {
        T t10 = (T) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) ((y) v1.allocateInstance(cls)).getDefaultInstanceForType();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static a0.g mutableCopy(a0.g gVar) {
        int size = gVar.size();
        return gVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Object newMessageInfo(s0 s0Var, String str, Object[] objArr) {
        return new i1(s0Var, str, objArr);
    }

    public static <ContainingType extends s0, Type> g newRepeatedGeneratedExtension(ContainingType containingtype, s0 s0Var, a0.d dVar, int i10, x1.b bVar, boolean z10, Class cls) {
        return new g(containingtype, Collections.EMPTY_LIST, s0Var, new f(dVar, i10, bVar, true, z10), cls);
    }

    public static <ContainingType extends s0, Type> g newSingularGeneratedExtension(ContainingType containingtype, Type type, s0 s0Var, a0.d dVar, int i10, x1.b bVar, Class cls) {
        return new g(containingtype, type, s0Var, new f(dVar, i10, bVar, false, false), cls);
    }

    protected static <T extends y> T parseDelimitedFrom(T t10, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t10, inputStream, p.getEmptyRegistry()));
    }

    protected static <T extends y> T parseFrom(T t10, ByteBuffer byteBuffer, p pVar) {
        return (T) checkMessageInitialized(parseFrom(t10, j.newInstance(byteBuffer), pVar));
    }

    private static <T extends y> T parsePartialDelimitedFrom(T t10, InputStream inputStream, p pVar) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            j jVarNewInstance = j.newInstance(new com.google.protobuf.a.AbstractC0331a.C0332a(inputStream, j.readRawVarint32(i10, inputStream)));
            T t11 = (T) parsePartialFrom(t10, jVarNewInstance, pVar);
            try {
                jVarNewInstance.checkLastTagWas(0);
                return t11;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(t11);
            }
        } catch (InvalidProtocolBufferException e11) {
            if (e11.getThrownFromInputStream()) {
                throw new InvalidProtocolBufferException((IOException) e11);
            }
            throw e11;
        } catch (IOException e12) {
            throw new InvalidProtocolBufferException(e12);
        }
    }

    static <T extends y> T parsePartialFrom(T t10, j jVar, p pVar) throws InvalidProtocolBufferException {
        T t11 = (T) t10.newMutableInstance();
        try {
            l1 l1VarSchemaFor = f1.getInstance().schemaFor(t11);
            l1VarSchemaFor.mergeFrom(t11, k.forCodedInput(jVar), pVar);
            l1VarSchemaFor.makeImmutable(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends y> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.markImmutable();
        defaultInstanceMap.put(cls, t10);
    }

    Object buildMessageInfo() {
        return dynamicMethod(h.BUILD_MESSAGE_INFO);
    }

    void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    int computeHashCode() {
        return f1.getInstance().schemaFor(this).hashCode(this);
    }

    protected final <MessageType extends y, BuilderType extends b> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(h.NEW_BUILDER);
    }

    protected Object dynamicMethod(h hVar, Object obj) {
        return dynamicMethod(hVar, obj, null);
    }

    protected abstract Object dynamicMethod(h hVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return f1.getInstance().schemaFor(this).equals(this, (y) obj);
        }
        return false;
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.a
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.s0
    public final c1 getParserForType() {
        return (c1) dynamicMethod(h.GET_PARSER);
    }

    @Override // com.google.protobuf.a
    int getSerializedSize(l1 l1Var) {
        if (!isMutable()) {
            if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
                return getMemoizedSerializedSize();
            }
            int iComputeSerializedSize = computeSerializedSize(l1Var);
            setMemoizedSerializedSize(iComputeSerializedSize);
            return iComputeSerializedSize;
        }
        int iComputeSerializedSize2 = computeSerializedSize(l1Var);
        if (iComputeSerializedSize2 >= 0) {
            return iComputeSerializedSize2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iComputeSerializedSize2);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.s0, com.google.protobuf.t0
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void makeImmutable() {
        f1.getInstance().schemaFor(this).makeImmutable(this);
        markImmutable();
    }

    void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    protected void mergeLengthDelimitedField(int i10, i iVar) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i10, iVar);
    }

    protected final void mergeUnknownFields(s1 s1Var) {
        this.unknownFields = s1.mutableCopyOf(this.unknownFields, s1Var);
    }

    protected void mergeVarintField(int i10, int i11) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i10, i11);
    }

    y newMutableInstance() {
        return (y) dynamicMethod(h.NEW_MUTABLE_INSTANCE);
    }

    protected boolean parseUnknownField(int i10, j jVar) {
        if (x1.getTagWireType(i10) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i10, jVar);
    }

    void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.protobuf.a
    void setMemoizedSerializedSize(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    public String toString() {
        return u0.toString(this, super.toString());
    }

    @Override // com.google.protobuf.a, com.google.protobuf.s0
    public void writeTo(CodedOutputStream codedOutputStream) {
        f1.getInstance().schemaFor(this).writeTo(this, l.forCodedOutput(codedOutputStream));
    }

    protected static final <T extends y> boolean isInitialized(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.dynamicMethod(h.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = f1.getInstance().schemaFor(t10).isInitialized(t10);
        if (z10) {
            t10.dynamicMethod(h.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? t10 : null);
        }
        return zIsInitialized;
    }

    protected final <MessageType extends y, BuilderType extends b> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((y) messagetype);
    }

    protected Object dynamicMethod(h hVar) {
        return dynamicMethod(hVar, null, null);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.s0, com.google.protobuf.t0
    public final y getDefaultInstanceForType() {
        return (y) dynamicMethod(h.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.s0
    public final b newBuilderForType() {
        return (b) dynamicMethod(h.NEW_BUILDER);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.s0
    public final b toBuilder() {
        return ((b) dynamicMethod(h.NEW_BUILDER)).mergeFrom(this);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class c extends com.google.protobuf.b {
        private final y defaultInstance;

        public c(y yVar) {
            this.defaultInstance = yVar;
        }

        @Override // com.google.protobuf.b, com.google.protobuf.c1
        public y parsePartialFrom(j jVar, p pVar) {
            return y.parsePartialFrom(this.defaultInstance, jVar, pVar);
        }

        @Override // com.google.protobuf.b, com.google.protobuf.c1
        public y parsePartialFrom(byte[] bArr, int i10, int i11, p pVar) {
            return y.parsePartialFrom(this.defaultInstance, bArr, i10, i11, pVar);
        }
    }

    protected static a0.h mutableCopy(a0.h hVar) {
        int size = hVar.size();
        return hVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends y> T parseFrom(T t10, ByteBuffer byteBuffer) {
        return (T) parseFrom(t10, byteBuffer, p.getEmptyRegistry());
    }

    protected static <T extends y> T parseDelimitedFrom(T t10, InputStream inputStream, p pVar) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t10, inputStream, pVar));
    }

    protected static <T extends y> T parseFrom(T t10, i iVar) {
        return (T) checkMessageInitialized(parseFrom(t10, iVar, p.getEmptyRegistry()));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class d extends y implements e {
        protected u extensions = u.emptySet();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        protected class a {
            private final Iterator<Map.Entry<f, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<f, Object> next;

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void writeUntil(int i10, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry<f, Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= i10) {
                        return;
                    }
                    f key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == x1.c.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (s0) this.next.getValue());
                    } else {
                        u.writeField(key, this.next.getValue(), codedOutputStream);
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator it = d.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = (Map.Entry) it.next();
                }
                this.messageSetWireFormat = z10;
            }
        }

        private void eagerlyMergeMessageSetExtension(j jVar, g gVar, p pVar, int i10) {
            parseExtension(jVar, pVar, gVar, x1.makeTag(i10, 2), i10);
        }

        private void mergeMessageSetExtensionFromBytes(i iVar, p pVar, g gVar) {
            s0 s0Var = (s0) this.extensions.getField(gVar.descriptor);
            s0.a builder = s0Var != null ? s0Var.toBuilder() : null;
            if (builder == null) {
                builder = gVar.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(iVar, pVar);
            ensureExtensionsAreMutable().setField(gVar.descriptor, gVar.singularToFieldSetType(builder.build()));
        }

        private <MessageType extends s0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, j jVar, p pVar) {
            int uInt32 = 0;
            i bytes = null;
            g gVarFindLiteExtensionByNumber = null;
            while (true) {
                int tag = jVar.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == x1.MESSAGE_SET_TYPE_ID_TAG) {
                    uInt32 = jVar.readUInt32();
                    if (uInt32 != 0) {
                        gVarFindLiteExtensionByNumber = pVar.findLiteExtensionByNumber(messagetype, uInt32);
                    }
                } else if (tag == x1.MESSAGE_SET_MESSAGE_TAG) {
                    if (uInt32 == 0 || gVarFindLiteExtensionByNumber == null) {
                        bytes = jVar.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(jVar, gVarFindLiteExtensionByNumber, pVar, uInt32);
                        bytes = null;
                    }
                } else if (!jVar.skipField(tag)) {
                    break;
                }
            }
            jVar.checkLastTagWas(x1.MESSAGE_SET_ITEM_END_TAG);
            if (bytes == null || uInt32 == 0) {
                return;
            }
            if (gVarFindLiteExtensionByNumber != null) {
                mergeMessageSetExtensionFromBytes(bytes, pVar, gVarFindLiteExtensionByNumber);
            } else {
                mergeLengthDelimitedField(uInt32, bytes);
            }
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0008  */
        private boolean parseExtension(j jVar, p pVar, g gVar, int i10, int i11) {
            boolean z10;
            boolean z11;
            Object objBuild;
            s0 s0Var;
            int tagWireType = x1.getTagWireType(i10);
            if (gVar == null) {
                z11 = true;
                z10 = false;
            } else if (tagWireType == u.getWireFormatForFieldType(gVar.descriptor.getLiteType(), false)) {
                z11 = false;
                z10 = false;
            } else {
                f fVar = gVar.descriptor;
                if (fVar.isRepeated && fVar.type.isPackable() && tagWireType == u.getWireFormatForFieldType(gVar.descriptor.getLiteType(), true)) {
                    z10 = true;
                    z11 = false;
                } else {
                    z11 = true;
                    z10 = false;
                }
            }
            if (z11) {
                return parseUnknownField(i10, jVar);
            }
            ensureExtensionsAreMutable();
            if (z10) {
                int iPushLimit = jVar.pushLimit(jVar.readRawVarint32());
                if (gVar.descriptor.getLiteType() == x1.b.ENUM) {
                    while (jVar.getBytesUntilLimit() > 0) {
                        a0.c cVarFindValueByNumber = gVar.descriptor.getEnumType().findValueByNumber(jVar.readEnum());
                        if (cVarFindValueByNumber == null) {
                            return true;
                        }
                        this.extensions.addRepeatedField(gVar.descriptor, gVar.singularToFieldSetType(cVarFindValueByNumber));
                    }
                } else {
                    while (jVar.getBytesUntilLimit() > 0) {
                        this.extensions.addRepeatedField(gVar.descriptor, u.readPrimitiveField(jVar, gVar.descriptor.getLiteType(), false));
                    }
                }
                jVar.popLimit(iPushLimit);
            } else {
                int i12 = a.$SwitchMap$com$google$protobuf$WireFormat$JavaType[gVar.descriptor.getLiteJavaType().ordinal()];
                if (i12 == 1) {
                    s0.a builder = (gVar.descriptor.isRepeated() || (s0Var = (s0) this.extensions.getField(gVar.descriptor)) == null) ? null : s0Var.toBuilder();
                    if (builder == null) {
                        builder = gVar.getMessageDefaultInstance().newBuilderForType();
                    }
                    if (gVar.descriptor.getLiteType() == x1.b.GROUP) {
                        jVar.readGroup(gVar.getNumber(), builder, pVar);
                    } else {
                        jVar.readMessage(builder, pVar);
                    }
                    objBuild = builder.build();
                } else if (i12 != 2) {
                    objBuild = u.readPrimitiveField(jVar, gVar.descriptor.getLiteType(), false);
                } else {
                    int i13 = jVar.readEnum();
                    a0.c cVarFindValueByNumber2 = gVar.descriptor.getEnumType().findValueByNumber(i13);
                    if (cVarFindValueByNumber2 == null) {
                        mergeVarintField(i11, i13);
                        return true;
                    }
                    objBuild = cVarFindValueByNumber2;
                }
                if (gVar.descriptor.isRepeated()) {
                    this.extensions.addRepeatedField(gVar.descriptor, gVar.singularToFieldSetType(objBuild));
                } else {
                    this.extensions.setField(gVar.descriptor, gVar.singularToFieldSetType(objBuild));
                }
            }
            return true;
        }

        private void verifyExtensionContainingType(g gVar) {
            if (gVar.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        u ensureExtensionsAreMutable() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m46clone();
            }
            return this.extensions;
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        @Override // com.google.protobuf.y, com.google.protobuf.a, com.google.protobuf.s0, com.google.protobuf.t0
        public /* bridge */ /* synthetic */ s0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.y.e
        public final <Type> Type getExtension(n nVar) {
            g gVarCheckIsLite = y.checkIsLite(nVar);
            verifyExtensionContainingType(gVarCheckIsLite);
            Object field = this.extensions.getField(gVarCheckIsLite.descriptor);
            return field == null ? (Type) gVarCheckIsLite.defaultValue : (Type) gVarCheckIsLite.fromFieldSetType(field);
        }

        @Override // com.google.protobuf.y.e
        public final <Type> int getExtensionCount(n nVar) {
            g gVarCheckIsLite = y.checkIsLite(nVar);
            verifyExtensionContainingType(gVarCheckIsLite);
            return this.extensions.getRepeatedFieldCount(gVarCheckIsLite.descriptor);
        }

        @Override // com.google.protobuf.y.e
        public final <Type> boolean hasExtension(n nVar) {
            g gVarCheckIsLite = y.checkIsLite(nVar);
            verifyExtensionContainingType(gVarCheckIsLite);
            return this.extensions.hasField(gVarCheckIsLite.descriptor);
        }

        protected final void mergeExtensionFields(d dVar) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m46clone();
            }
            this.extensions.mergeFrom(dVar.extensions);
        }

        @Override // com.google.protobuf.y, com.google.protobuf.a, com.google.protobuf.s0
        public /* bridge */ /* synthetic */ s0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        protected com.google.protobuf.y$d.a newExtensionWriter() {
            return new a(this, false, null);
        }

        protected com.google.protobuf.y$d.a newMessageSetExtensionWriter() {
            return new a(this, true, null);
        }

        protected <MessageType extends s0> boolean parseUnknownField(MessageType messagetype, j jVar, p pVar, int i10) {
            int tagFieldNumber = x1.getTagFieldNumber(i10);
            return parseExtension(jVar, pVar, pVar.findLiteExtensionByNumber(messagetype, tagFieldNumber), i10, tagFieldNumber);
        }

        protected <MessageType extends s0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, j jVar, p pVar, int i10) {
            if (i10 != x1.MESSAGE_SET_ITEM_TAG) {
                return x1.getTagWireType(i10) == 2 ? parseUnknownField(messagetype, jVar, pVar, i10) : jVar.skipField(i10);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype, jVar, pVar);
            return true;
        }

        @Override // com.google.protobuf.y, com.google.protobuf.a, com.google.protobuf.s0
        public /* bridge */ /* synthetic */ s0.a toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.y.e
        public final <Type> Type getExtension(n nVar, int i10) {
            g gVarCheckIsLite = y.checkIsLite(nVar);
            verifyExtensionContainingType(gVarCheckIsLite);
            return (Type) gVarCheckIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(gVarCheckIsLite.descriptor, i10));
        }
    }

    protected static a0.f mutableCopy(a0.f fVar) {
        int size = fVar.size();
        return fVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends y> T parseFrom(T t10, i iVar, p pVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t10, iVar, pVar));
    }

    protected static a0.b mutableCopy(a0.b bVar) {
        int size = bVar.size();
        return bVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends y> T parseFrom(T t10, byte[] bArr) {
        return (T) checkMessageInitialized(parsePartialFrom(t10, bArr, 0, bArr.length, p.getEmptyRegistry()));
    }

    @Override // com.google.protobuf.a, com.google.protobuf.s0
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    protected static a0.a mutableCopy(a0.a aVar) {
        int size = aVar.size();
        return aVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends y> T parseFrom(T t10, byte[] bArr, p pVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t10, bArr, 0, bArr.length, pVar));
    }

    protected static <E> a0.i mutableCopy(a0.i iVar) {
        int size = iVar.size();
        return iVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends y> T parseFrom(T t10, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialFrom(t10, j.newInstance(inputStream), p.getEmptyRegistry()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends y> T parsePartialFrom(T t10, byte[] bArr, int i10, int i11, p pVar) throws InvalidProtocolBufferException {
        T t11 = (T) t10.newMutableInstance();
        try {
            l1 l1VarSchemaFor = f1.getInstance().schemaFor(t11);
            l1VarSchemaFor.mergeFrom(t11, bArr, i10, i10 + i11, new com.google.protobuf.e.b(pVar));
            l1VarSchemaFor.makeImmutable(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            InvalidProtocolBufferException invalidProtocolBufferException = e10;
            if (invalidProtocolBufferException.getThrownFromInputStream()) {
                invalidProtocolBufferException = new InvalidProtocolBufferException((IOException) invalidProtocolBufferException);
            }
            throw invalidProtocolBufferException.setUnfinishedMessage(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t11);
        }
    }

    protected static <T extends y> T parseFrom(T t10, InputStream inputStream, p pVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t10, j.newInstance(inputStream), pVar));
    }

    protected static <T extends y> T parseFrom(T t10, j jVar) {
        return (T) parseFrom(t10, jVar, p.getEmptyRegistry());
    }

    protected static <T extends y> T parseFrom(T t10, j jVar, p pVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t10, jVar, pVar));
    }

    protected static <T extends y> T parsePartialFrom(T t10, j jVar) {
        return (T) parsePartialFrom(t10, jVar, p.getEmptyRegistry());
    }

    private static <T extends y> T parsePartialFrom(T t10, i iVar, p pVar) throws InvalidProtocolBufferException {
        j jVarNewCodedInput = iVar.newCodedInput();
        T t11 = (T) parsePartialFrom(t10, jVarNewCodedInput, pVar);
        try {
            jVarNewCodedInput.checkLastTagWas(0);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(t11);
        }
    }
}
