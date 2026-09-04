package z0;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f58447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f58448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f58449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tl.a f58450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f58451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nm.a f58452f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58453r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58454s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f58455t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f58456u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f58458w;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58456u = obj;
            this.f58458w |= Integer.MIN_VALUE;
            return o.this.d(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58459r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58460s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f58461t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f58462u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f58463v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f58465x;

        b(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58463v = obj;
            this.f58465x |= Integer.MIN_VALUE;
            return o.this.a(null, this);
        }
    }

    public o(File file, d0 serializer, s coordinator, tl.a onClose) {
        kotlin.jvm.internal.s.h(file, "file");
        kotlin.jvm.internal.s.h(serializer, "serializer");
        kotlin.jvm.internal.s.h(coordinator, "coordinator");
        kotlin.jvm.internal.s.h(onClose, "onClose");
        this.f58447a = file;
        this.f58448b = serializer;
        this.f58449c = coordinator;
        this.f58450d = onClose;
        this.f58451e = new AtomicBoolean(false);
        this.f58452f = nm.g.b(false, 1, null);
    }

    private final void f() {
        if (this.f58451e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, nm.a] */
    @Override // z0.j0
    public Object a(tl.o oVar, kl.f fVar) throws IOException {
        b bVar;
        File file;
        o oVar2;
        nm.a aVar;
        p pVar;
        Throwable th2;
        c cVar;
        File file2;
        o oVar3;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f58465x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f58465x = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f58463v;
        Object objF = ll.b.f();
        ?? r10 = bVar.f58465x;
        try {
            try {
                try {
                    try {
                        if (r10 == 0) {
                            fl.s.b(obj);
                            f();
                            g(this.f58447a);
                            nm.a aVar2 = this.f58452f;
                            bVar.f58459r = this;
                            bVar.f58460s = oVar;
                            bVar.f58461t = aVar2;
                            bVar.f58465x = 1;
                            if (aVar2.e(null, bVar) != objF) {
                                oVar2 = this;
                                aVar = aVar2;
                            }
                            return objF;
                        }
                        if (r10 != 1) {
                            if (r10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar = (c) bVar.f58462u;
                            File file3 = (File) bVar.f58461t;
                            aVar = (nm.a) bVar.f58460s;
                            oVar3 = (o) bVar.f58459r;
                            try {
                                fl.s.b(obj);
                                file2 = file3;
                                fl.g0 g0Var = fl.g0.f38750a;
                                try {
                                    cVar.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists() && !l.a(file2, oVar3.f58447a)) {
                                    throw new IOException("Unable to rename " + file2 + " to " + oVar3.f58447a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                fl.g0 g0Var2 = fl.g0.f38750a;
                                aVar.f(null);
                                return fl.g0.f38750a;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    cVar.close();
                                } catch (Throwable th5) {
                                    fl.e.a(th2, th5);
                                }
                                throw th2;
                            }
                        }
                        nm.a aVar3 = (nm.a) bVar.f58461t;
                        tl.o oVar4 = (tl.o) bVar.f58460s;
                        oVar2 = (o) bVar.f58459r;
                        fl.s.b(obj);
                        aVar = aVar3;
                        oVar = oVar4;
                        bVar.f58459r = oVar2;
                        bVar.f58460s = aVar;
                        bVar.f58461t = file;
                        bVar.f58462u = pVar;
                        bVar.f58465x = 2;
                        if (oVar.invoke(pVar, bVar) != objF) {
                            file2 = file;
                            oVar3 = oVar2;
                            cVar = pVar;
                            fl.g0 g0Var3 = fl.g0.f38750a;
                            cVar.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                throw new IOException("Unable to rename " + file2 + " to " + oVar3.f58447a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            fl.g0 g0Var4 = fl.g0.f38750a;
                            aVar.f(null);
                            return fl.g0.f38750a;
                        }
                        return objF;
                    } catch (Throwable th6) {
                        th2 = th6;
                        cVar = pVar;
                        cVar.close();
                        throw th2;
                    }
                    pVar = new p(file, oVar2.f58448b);
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(oVar2.f58447a.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                r10.f(null);
                throw th7;
            }
        } catch (IOException e11) {
            e = e11;
            file = objF;
        }
    }

    @Override // z0.c
    public void close() {
        this.f58451e.set(true);
        this.f58450d.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [z0.o] */
    /* JADX WARN: Type inference failed for: r0v14, types: [z0.o] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, z0.o$a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [z0.o] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // z0.j0
    public Object d(Function3 function3, kl.f fVar) throws Throwable {
        ?? aVar;
        Throwable th2;
        c cVar;
        ?? r10;
        ?? r11;
        if (fVar instanceof a) {
            a aVar2 = (a) fVar;
            int i10 = aVar2.f58458w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f58458w = i10 - Integer.MIN_VALUE;
                aVar = aVar2;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f58456u;
        Object objF = ll.b.f();
        int i11 = aVar.f58458w;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function3 = aVar.f58455t;
                cVar = (c) aVar.f58454s;
                aVar = (o) aVar.f58453r;
                try {
                    fl.s.b(obj);
                    r11 = aVar;
                    r10 = function3;
                    try {
                        cVar.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        nm.a.b(r11.f58452f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        cVar.close();
                    } catch (Throwable th5) {
                        fl.e.a(th2, th5);
                    }
                    throw th2;
                }
            }
            fl.s.b(obj);
            f();
            boolean zG = nm.a.g(this.f58452f, null, 1, null);
            try {
                m mVar = new m(this.f58447a, this.f58448b);
                try {
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(zG);
                    aVar.f58453r = this;
                    aVar.f58454s = mVar;
                    aVar.f58455t = zG;
                    aVar.f58458w = 1;
                    Object objInvoke = function3.invoke(mVar, boolA, aVar);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    obj = objInvoke;
                    r10 = zG;
                    r11 = this;
                    cVar = mVar;
                    cVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        nm.a.b(r11.f58452f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    function3 = zG;
                    aVar = this;
                    cVar = mVar;
                    cVar.close();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                function3 = zG;
                aVar = this;
                if (function3 != 0) {
                    nm.a.b(aVar.f58452f, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (function3 != 0) {
                nm.a.b(aVar.f58452f, null, 1, null);
            }
            throw th;
        }
    }

    @Override // z0.j0
    public s e() {
        return this.f58449c;
    }
}
