package z0;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class m implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f58425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f58426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f58427c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58428r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58429s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f58430t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f58432v;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58430t = obj;
            this.f58432v |= Integer.MIN_VALUE;
            return m.i(m.this, this);
        }
    }

    public m(File file, d0 serializer) {
        kotlin.jvm.internal.s.h(file, "file");
        kotlin.jvm.internal.s.h(serializer, "serializer");
        this.f58425a = file;
        this.f58426b = serializer;
        this.f58427c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [z0.m] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, z0.m] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [z0.m] */
    static /* synthetic */ Object i(m mVar, kl.f fVar) throws IOException {
        a aVar;
        Throwable th2;
        Closeable closeable;
        Closeable closeable2;
        Throwable th3;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f58432v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f58432v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f58430t;
        Object objF = ll.b.f();
        ?? r10 = aVar.f58432v;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    closeable2 = (Closeable) aVar.f58429s;
                    r10 = (m) aVar.f58428r;
                    try {
                        fl.s.b(obj);
                        ql.b.a(closeable2, null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        try {
                            throw th3;
                        } catch (Throwable th5) {
                            ql.b.a(closeable2, th3);
                            throw th5;
                        }
                    }
                }
                if (r10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f58428r;
                try {
                    fl.s.b(obj);
                    ql.b.a(closeable, null);
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th2;
                    } catch (Throwable th7) {
                        ql.b.a(closeable, th2);
                        throw th7;
                    }
                }
            }
            fl.s.b(obj);
            mVar.f();
            try {
                FileInputStream fileInputStream = new FileInputStream(((m) mVar).f58425a);
                try {
                    d0 d0Var = ((m) mVar).f58426b;
                    aVar.f58428r = mVar;
                    aVar.f58429s = fileInputStream;
                    aVar.f58432v = 1;
                    Object from = d0Var.readFrom(fileInputStream, aVar);
                    if (from != objF) {
                        closeable2 = fileInputStream;
                        obj = from;
                        ql.b.a(closeable2, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    r10 = mVar;
                    closeable2 = fileInputStream;
                    th3 = th8;
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                if (!((m) mVar).f58425a.exists()) {
                    return ((m) mVar).f58426b.getDefaultValue();
                }
                FileInputStream fileInputStream2 = new FileInputStream(((m) mVar).f58425a);
                try {
                    d0 d0Var2 = ((m) mVar).f58426b;
                    aVar.f58428r = fileInputStream2;
                    aVar.f58429s = null;
                    aVar.f58432v = 2;
                    Object from2 = d0Var2.readFrom(fileInputStream2, aVar);
                    if (from2 != objF) {
                        obj = from2;
                        closeable = fileInputStream2;
                        ql.b.a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    closeable = fileInputStream2;
                    throw th2;
                }
            }
            return objF;
        } catch (FileNotFoundException unused2) {
            mVar = r10;
        }
    }

    @Override // z0.b0
    public Object b(kl.f fVar) {
        return i(this, fVar);
    }

    @Override // z0.c
    public void close() {
        this.f58427c.set(true);
    }

    protected final File g() {
        return this.f58425a;
    }

    protected final d0 h() {
        return this.f58426b;
    }

    protected final void f() {
        if (this.f58427c.get()) {
            throw new IllegalStateException(qEagQqzJZsd.LsDk);
        }
    }
}
