package com.vungle.ads.internal.protos;

import com.google.protobuf.a0;
import com.google.protobuf.c1;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.p;
import com.google.protobuf.y;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Sdk$SDKErrorBatch extends y implements c {
    private static final Sdk$SDKErrorBatch DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 1;
    private static volatile c1 PARSER;
    private a0.i errors_ = y.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends y.b implements c {
        /* synthetic */ a(com.vungle.ads.internal.protos.a aVar) {
            this();
        }

        public a addAllErrors(Iterable<? extends Sdk$SDKError> iterable) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addAllErrors(iterable);
            return this;
        }

        public a addErrors(Sdk$SDKError sdk$SDKError) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(sdk$SDKError);
            return this;
        }

        public a clearErrors() {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).clearErrors();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.c
        public Sdk$SDKError getErrors(int i10) {
            return ((Sdk$SDKErrorBatch) this.instance).getErrors(i10);
        }

        @Override // com.vungle.ads.internal.protos.c
        public int getErrorsCount() {
            return ((Sdk$SDKErrorBatch) this.instance).getErrorsCount();
        }

        @Override // com.vungle.ads.internal.protos.c
        public List<Sdk$SDKError> getErrorsList() {
            return Collections.unmodifiableList(((Sdk$SDKErrorBatch) this.instance).getErrorsList());
        }

        public a removeErrors(int i10) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).removeErrors(i10);
            return this;
        }

        public a setErrors(int i10, Sdk$SDKError sdk$SDKError) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).setErrors(i10, sdk$SDKError);
            return this;
        }

        private a() {
            super(Sdk$SDKErrorBatch.DEFAULT_INSTANCE);
        }

        public a addErrors(int i10, Sdk$SDKError sdk$SDKError) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(i10, sdk$SDKError);
            return this;
        }

        public a setErrors(int i10, Sdk$SDKError.a aVar) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).setErrors(i10, (Sdk$SDKError) aVar.build());
            return this;
        }

        public a addErrors(Sdk$SDKError.a aVar) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors((Sdk$SDKError) aVar.build());
            return this;
        }

        public a addErrors(int i10, Sdk$SDKError.a aVar) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(i10, (Sdk$SDKError) aVar.build());
            return this;
        }
    }

    static {
        Sdk$SDKErrorBatch sdk$SDKErrorBatch = new Sdk$SDKErrorBatch();
        DEFAULT_INSTANCE = sdk$SDKErrorBatch;
        y.registerDefaultInstance(Sdk$SDKErrorBatch.class, sdk$SDKErrorBatch);
    }

    private Sdk$SDKErrorBatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllErrors(Iterable<? extends Sdk$SDKError> iterable) {
        ensureErrorsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.errors_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addErrors(Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.add(sdk$SDKError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrors() {
        this.errors_ = y.emptyProtobufList();
    }

    private void ensureErrorsIsMutable() {
        a0.i iVar = this.errors_;
        if (iVar.isModifiable()) {
            return;
        }
        this.errors_ = y.mutableCopy(iVar);
    }

    public static Sdk$SDKErrorBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKErrorBatch parseDelimitedFrom(InputStream inputStream) {
        return (Sdk$SDKErrorBatch) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteBuffer byteBuffer) {
        return (Sdk$SDKErrorBatch) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeErrors(int i10) {
        ensureErrorsIsMutable();
        this.errors_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrors(int i10, Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.set(i10, sdk$SDKError);
    }

    @Override // com.google.protobuf.y
    protected final Object dynamicMethod(y.h hVar, Object obj, Object obj2) {
        c1 cVar;
        com.vungle.ads.internal.protos.a aVar = null;
        switch (com.vungle.ads.internal.protos.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[hVar.ordinal()]) {
            case 1:
                return new Sdk$SDKErrorBatch();
            case 2:
                return new a(aVar);
            case 3:
                return y.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"errors_", Sdk$SDKError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c1 c1Var = PARSER;
                if (c1Var != null) {
                    return c1Var;
                }
                synchronized (Sdk$SDKErrorBatch.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new y.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.vungle.ads.internal.protos.c
    public Sdk$SDKError getErrors(int i10) {
        return (Sdk$SDKError) this.errors_.get(i10);
    }

    @Override // com.vungle.ads.internal.protos.c
    public int getErrorsCount() {
        return this.errors_.size();
    }

    @Override // com.vungle.ads.internal.protos.c
    public List<Sdk$SDKError> getErrorsList() {
        return this.errors_;
    }

    public d getErrorsOrBuilder(int i10) {
        return (d) this.errors_.get(i10);
    }

    public List<? extends d> getErrorsOrBuilderList() {
        return this.errors_;
    }

    public static a newBuilder(Sdk$SDKErrorBatch sdk$SDKErrorBatch) {
        return (a) DEFAULT_INSTANCE.createBuilder(sdk$SDKErrorBatch);
    }

    public static Sdk$SDKErrorBatch parseDelimitedFrom(InputStream inputStream, p pVar) {
        return (Sdk$SDKErrorBatch) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pVar);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteBuffer byteBuffer, p pVar) {
        return (Sdk$SDKErrorBatch) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, pVar);
    }

    public static Sdk$SDKErrorBatch parseFrom(i iVar) {
        return (Sdk$SDKErrorBatch) y.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addErrors(int i10, Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.add(i10, sdk$SDKError);
    }

    public static Sdk$SDKErrorBatch parseFrom(i iVar, p pVar) {
        return (Sdk$SDKErrorBatch) y.parseFrom(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static Sdk$SDKErrorBatch parseFrom(byte[] bArr) {
        return (Sdk$SDKErrorBatch) y.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKErrorBatch parseFrom(byte[] bArr, p pVar) {
        return (Sdk$SDKErrorBatch) y.parseFrom(DEFAULT_INSTANCE, bArr, pVar);
    }

    public static Sdk$SDKErrorBatch parseFrom(InputStream inputStream) {
        return (Sdk$SDKErrorBatch) y.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(InputStream inputStream, p pVar) {
        return (Sdk$SDKErrorBatch) y.parseFrom(DEFAULT_INSTANCE, inputStream, pVar);
    }

    public static Sdk$SDKErrorBatch parseFrom(j jVar) {
        return (Sdk$SDKErrorBatch) y.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Sdk$SDKErrorBatch parseFrom(j jVar, p pVar) {
        return (Sdk$SDKErrorBatch) y.parseFrom(DEFAULT_INSTANCE, jVar, pVar);
    }
}
