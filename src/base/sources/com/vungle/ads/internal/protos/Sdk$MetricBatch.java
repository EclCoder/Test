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
public final class Sdk$MetricBatch extends y implements b {
    private static final Sdk$MetricBatch DEFAULT_INSTANCE;
    public static final int METRICS_FIELD_NUMBER = 1;
    private static volatile c1 PARSER;
    private a0.i metrics_ = y.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends y.b implements b {
        /* synthetic */ a(com.vungle.ads.internal.protos.a aVar) {
            this();
        }

        public a addAllMetrics(Iterable<? extends Sdk$SDKMetric> iterable) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addAllMetrics(iterable);
            return this;
        }

        public a addMetrics(Sdk$SDKMetric sdk$SDKMetric) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(sdk$SDKMetric);
            return this;
        }

        public a clearMetrics() {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).clearMetrics();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.b
        public Sdk$SDKMetric getMetrics(int i10) {
            return ((Sdk$MetricBatch) this.instance).getMetrics(i10);
        }

        @Override // com.vungle.ads.internal.protos.b
        public int getMetricsCount() {
            return ((Sdk$MetricBatch) this.instance).getMetricsCount();
        }

        @Override // com.vungle.ads.internal.protos.b
        public List<Sdk$SDKMetric> getMetricsList() {
            return Collections.unmodifiableList(((Sdk$MetricBatch) this.instance).getMetricsList());
        }

        public a removeMetrics(int i10) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).removeMetrics(i10);
            return this;
        }

        public a setMetrics(int i10, Sdk$SDKMetric sdk$SDKMetric) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).setMetrics(i10, sdk$SDKMetric);
            return this;
        }

        private a() {
            super(Sdk$MetricBatch.DEFAULT_INSTANCE);
        }

        public a addMetrics(int i10, Sdk$SDKMetric sdk$SDKMetric) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(i10, sdk$SDKMetric);
            return this;
        }

        public a setMetrics(int i10, Sdk$SDKMetric.a aVar) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).setMetrics(i10, (Sdk$SDKMetric) aVar.build());
            return this;
        }

        public a addMetrics(Sdk$SDKMetric.a aVar) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics((Sdk$SDKMetric) aVar.build());
            return this;
        }

        public a addMetrics(int i10, Sdk$SDKMetric.a aVar) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(i10, (Sdk$SDKMetric) aVar.build());
            return this;
        }
    }

    static {
        Sdk$MetricBatch sdk$MetricBatch = new Sdk$MetricBatch();
        DEFAULT_INSTANCE = sdk$MetricBatch;
        y.registerDefaultInstance(Sdk$MetricBatch.class, sdk$MetricBatch);
    }

    private Sdk$MetricBatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends Sdk$SDKMetric> iterable) {
        ensureMetricsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.metrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(sdk$SDKMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = y.emptyProtobufList();
    }

    private void ensureMetricsIsMutable() {
        a0.i iVar = this.metrics_;
        if (iVar.isModifiable()) {
            return;
        }
        this.metrics_ = y.mutableCopy(iVar);
    }

    public static Sdk$MetricBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$MetricBatch parseDelimitedFrom(InputStream inputStream) {
        return (Sdk$MetricBatch) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$MetricBatch parseFrom(ByteBuffer byteBuffer) {
        return (Sdk$MetricBatch) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetrics(int i10) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(int i10, Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i10, sdk$SDKMetric);
    }

    @Override // com.google.protobuf.y
    protected final Object dynamicMethod(y.h hVar, Object obj, Object obj2) {
        c1 cVar;
        com.vungle.ads.internal.protos.a aVar = null;
        switch (com.vungle.ads.internal.protos.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[hVar.ordinal()]) {
            case 1:
                return new Sdk$MetricBatch();
            case 2:
                return new a(aVar);
            case 3:
                return y.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"metrics_", Sdk$SDKMetric.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c1 c1Var = PARSER;
                if (c1Var != null) {
                    return c1Var;
                }
                synchronized (Sdk$MetricBatch.class) {
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

    @Override // com.vungle.ads.internal.protos.b
    public Sdk$SDKMetric getMetrics(int i10) {
        return (Sdk$SDKMetric) this.metrics_.get(i10);
    }

    @Override // com.vungle.ads.internal.protos.b
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // com.vungle.ads.internal.protos.b
    public List<Sdk$SDKMetric> getMetricsList() {
        return this.metrics_;
    }

    public e getMetricsOrBuilder(int i10) {
        return (e) this.metrics_.get(i10);
    }

    public List<? extends e> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public static a newBuilder(Sdk$MetricBatch sdk$MetricBatch) {
        return (a) DEFAULT_INSTANCE.createBuilder(sdk$MetricBatch);
    }

    public static Sdk$MetricBatch parseDelimitedFrom(InputStream inputStream, p pVar) {
        return (Sdk$MetricBatch) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pVar);
    }

    public static Sdk$MetricBatch parseFrom(ByteBuffer byteBuffer, p pVar) {
        return (Sdk$MetricBatch) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, pVar);
    }

    public static Sdk$MetricBatch parseFrom(i iVar) {
        return (Sdk$MetricBatch) y.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(int i10, Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i10, sdk$SDKMetric);
    }

    public static Sdk$MetricBatch parseFrom(i iVar, p pVar) {
        return (Sdk$MetricBatch) y.parseFrom(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static Sdk$MetricBatch parseFrom(byte[] bArr) {
        return (Sdk$MetricBatch) y.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$MetricBatch parseFrom(byte[] bArr, p pVar) {
        return (Sdk$MetricBatch) y.parseFrom(DEFAULT_INSTANCE, bArr, pVar);
    }

    public static Sdk$MetricBatch parseFrom(InputStream inputStream) {
        return (Sdk$MetricBatch) y.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$MetricBatch parseFrom(InputStream inputStream, p pVar) {
        return (Sdk$MetricBatch) y.parseFrom(DEFAULT_INSTANCE, inputStream, pVar);
    }

    public static Sdk$MetricBatch parseFrom(j jVar) {
        return (Sdk$MetricBatch) y.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Sdk$MetricBatch parseFrom(j jVar, p pVar) {
        return (Sdk$MetricBatch) y.parseFrom(DEFAULT_INSTANCE, jVar, pVar);
    }
}
