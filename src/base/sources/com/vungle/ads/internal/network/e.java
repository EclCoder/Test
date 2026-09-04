package com.vungle.ads.internal.network;

import com.vungle.ads.internal.util.q;
import fl.r;
import gn.a0;
import gn.f0;
import gn.g0;
import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import xn.c0;
import xn.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements com.vungle.ads.internal.network.a {
    public static final a Companion = new a(null);
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;
    private final gn.e rawCall;
    private final com.vungle.ads.internal.network.converters.a responseConverter;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void throwIfFatal(Throwable th2) throws Throwable {
            if ((th2 instanceof ThreadDeath) || (th2 instanceof LinkageError)) {
                throw th2;
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends g0 {
        private final g0 delegate;
        private final xn.g delegateSource;
        private IOException thrownException;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends o {
            a(xn.g gVar) {
                super(gVar);
            }

            @Override // xn.o, xn.q0
            public long read(xn.e sink, long j10) throws IOException {
                s.h(sink, "sink");
                try {
                    return super.read(sink, j10);
                } catch (IOException e10) {
                    b.this.setThrownException(e10);
                    throw e10;
                }
            }
        }

        public b(g0 delegate) {
            s.h(delegate, "delegate");
            this.delegate = delegate;
            this.delegateSource = c0.c(new a(delegate.source()));
        }

        @Override // gn.g0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // gn.g0
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // gn.g0
        public a0 contentType() {
            return this.delegate.contentType();
        }

        public final IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(IOException iOException) {
            this.thrownException = iOException;
        }

        @Override // gn.g0
        public xn.g source() {
            return this.delegateSource;
        }

        public final void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends g0 {
        private final long contentLength;
        private final a0 contentType;

        public c(a0 a0Var, long j10) {
            this.contentType = a0Var;
            this.contentLength = j10;
        }

        @Override // gn.g0
        public long contentLength() {
            return this.contentLength;
        }

        @Override // gn.g0
        public a0 contentType() {
            return this.contentType;
        }

        @Override // gn.g0
        public xn.g source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements gn.f {
        final /* synthetic */ com.vungle.ads.internal.network.b $callback;

        d(com.vungle.ads.internal.network.b bVar) {
            this.$callback = bVar;
        }

        private final void callFailure(Throwable th2) throws Throwable {
            try {
                this.$callback.onFailure(e.this, th2);
            } catch (Throwable th3) {
                e.Companion.throwIfFatal(th3);
                q.Companion.e(e.TAG, "Cannot pass failure to callback", th3);
            }
        }

        @Override // gn.f
        public void onFailure(gn.e call, IOException e10) throws Throwable {
            s.h(call, "call");
            s.h(e10, "e");
            callFailure(e10);
        }

        @Override // gn.f
        public void onResponse(gn.e call, f0 response) throws Throwable {
            s.h(call, "call");
            s.h(response, "response");
            try {
                try {
                    this.$callback.onResponse(e.this, e.this.parseResponse(response));
                } catch (Throwable th2) {
                    e.Companion.throwIfFatal(th2);
                    q.Companion.e(e.TAG, "Cannot pass response to callback", th2);
                }
            } catch (Throwable th3) {
                q.Companion.e(e.TAG, "[enqueue] Failed to parse response: " + th3.getLocalizedMessage());
                e.Companion.throwIfFatal(th3);
                callFailure(th3);
            }
        }
    }

    public e(gn.e rawCall, com.vungle.ads.internal.network.converters.a responseConverter) {
        s.h(rawCall, "rawCall");
        s.h(responseConverter, "responseConverter");
        this.rawCall = rawCall;
        this.responseConverter = responseConverter;
    }

    private final g0 buffer(g0 g0Var) {
        xn.e eVar = new xn.e();
        g0Var.source().D0(eVar);
        return g0.Companion.f(eVar, g0Var.contentType(), g0Var.contentLength());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f parseResponse(f0 f0Var) throws IOException {
        g0 g0VarD = f0Var.d();
        if (g0VarD == null) {
            return null;
        }
        f0 f0VarC = f0Var.F0().b(new c(g0VarD.contentType(), g0VarD.contentLength())).c();
        int iM = f0VarC.m();
        if (iM < 200 || iM >= 300) {
            try {
                f fVarError = f.Companion.error(buffer(g0VarD), f0VarC);
                ql.b.a(g0VarD, null);
                return fVarError;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(g0VarD, th2);
                    throw th3;
                }
            }
        }
        if (iM == 204 || iM == 205) {
            g0VarD.close();
            return f.Companion.success(null, f0VarC);
        }
        b bVar = new b(g0VarD);
        try {
            return f.Companion.success(this.responseConverter.convert(bVar), f0VarC);
        } catch (Throwable th4) {
            bVar.throwIfCaught();
            throw th4;
        }
    }

    @Override // com.vungle.ads.internal.network.a
    public void cancel() {
        gn.e eVar;
        this.canceled = true;
        synchronized (this) {
            eVar = this.rawCall;
            fl.g0 g0Var = fl.g0.f38750a;
        }
        eVar.cancel();
    }

    @Override // com.vungle.ads.internal.network.a
    public void enqueue(com.vungle.ads.internal.network.b callback) {
        gn.e eVar;
        s.h(callback, "callback");
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            eVar = this.rawCall;
            fl.g0 g0Var = fl.g0.f38750a;
        }
        if (this.canceled) {
            eVar.cancel();
        }
        eVar.a(new d(callback));
    }

    @Override // com.vungle.ads.internal.network.a
    public f execute() {
        gn.e eVar;
        Object objB;
        synchronized (this) {
            eVar = this.rawCall;
            fl.g0 g0Var = fl.g0.f38750a;
        }
        if (this.canceled) {
            eVar.cancel();
        }
        try {
            r.a aVar = r.f38769b;
            objB = r.b(parseResponse(eVar.execute()));
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Throwable thE = r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "[execute] Failed to parse response:  " + thE.getLocalizedMessage());
        }
        if (r.h(objB)) {
            objB = null;
        }
        return (f) objB;
    }

    @Override // com.vungle.ads.internal.network.a
    public boolean isCanceled() {
        boolean zIsCanceled;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            zIsCanceled = this.rawCall.isCanceled();
        }
        return zIsCanceled;
    }
}
