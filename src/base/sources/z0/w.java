package z0;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class w implements s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f58476j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f58477k = "Resource deadlock would occur";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f58478l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f58479m = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl.j f58480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f58481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hm.e f58482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f58483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f58484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f58485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final nm.a f58486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final fl.k f58487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final fl.k f58488i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: z0.w$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0897a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f58489r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            long f58490s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f58491t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f58493v;

            C0897a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f58491t = obj;
                this.f58493v |= Integer.MIN_VALUE;
                return a.this.b(null, this);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            r2 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (r2 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        
            r15.f58489r = r14;
            r15.f58490s = r5;
            r15.f58493v = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            if (em.y0.a(r5, r15) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(java.io.FileOutputStream r14, kl.f r15) throws java.io.IOException {
            /*
                r13 = this;
                boolean r0 = r15 instanceof z0.w.a.C0897a
                if (r0 == 0) goto L13
                r0 = r15
                z0.w$a$a r0 = (z0.w.a.C0897a) r0
                int r1 = r0.f58493v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f58493v = r1
                goto L18
            L13:
                z0.w$a$a r0 = new z0.w$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f58491t
                java.lang.Object r1 = ll.b.f()
                int r2 = r0.f58493v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L39
                if (r2 != r4) goto L31
                long r5 = r0.f58490s
                java.lang.Object r14 = r0.f58489r
                java.io.FileOutputStream r14 = (java.io.FileOutputStream) r14
                fl.s.b(r15)
                r15 = r0
                goto L7f
            L31:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L39:
                fl.s.b(r15)
                long r5 = z0.w.i()
                r15 = r0
            L41:
                long r7 = z0.w.k()
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            */
            //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r0 > 0) goto L83
                java.nio.channels.FileChannel r7 = r14.getChannel()     // Catch: java.io.IOException -> L5f
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r0 = r7.lock(r8, r10, r12)     // Catch: java.io.IOException -> L5f
                kotlin.jvm.internal.s.g(r0, r2)     // Catch: java.io.IOException -> L5f
                return r0
            L5f:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                if (r2 == 0) goto L82
                java.lang.String r7 = z0.w.h()
                r8 = 0
                r9 = 0
                boolean r2 = bm.r.T(r2, r7, r8, r3, r9)
                if (r2 != r4) goto L82
                r15.f58489r = r14
                r15.f58490s = r5
                r15.f58493v = r4
                java.lang.Object r0 = em.y0.a(r5, r15)
                if (r0 != r1) goto L7f
                return r1
            L7f:
                long r7 = (long) r3
                long r5 = r5 * r7
                goto L41
            L82:
                throw r0
            L83:
                java.nio.channels.FileChannel r7 = r14.getChannel()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r14 = r7.lock(r8, r10, r12)
                kotlin.jvm.internal.s.g(r14, r2)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.w.a.b(java.io.FileOutputStream, kl.f):java.lang.Object");
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58494r;

        public b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return w.this.new b(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f58494r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return kotlin.coroutines.jvm.internal.b.d(w.this.r().b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58496r;

        public c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return w.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f58496r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return kotlin.coroutines.jvm.internal.b.d(w.this.r().c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.jvm.internal.t implements tl.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f58499a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar) {
                super(0);
                this.f58499a = wVar;
            }

            @Override // tl.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final File invoke() throws IOException {
                w wVar = this.f58499a;
                File fileP = wVar.p(wVar.f58484e);
                this.f58499a.n(fileP);
                return fileP;
            }
        }

        d() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            e0.a aVar = e0.f58223b;
            aVar.d();
            return aVar.a(new a(w.this));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58500r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58501s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f58502t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f58503u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f58505w;

        e(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58503u = obj;
            this.f58505w |= Integer.MIN_VALUE;
            return w.this.c(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends kotlin.jvm.internal.t implements tl.a {
        f() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final File invoke() throws IOException {
            w wVar = w.this;
            File fileP = wVar.p(wVar.f58483d);
            w.this.n(fileP);
            return fileP;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58507r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58508s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f58509t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f58510u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f58511v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f58513x;

        g(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58511v = obj;
            this.f58513x |= Integer.MIN_VALUE;
            return w.this.e(null, this);
        }
    }

    public w(kl.j context, File file) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(file, "file");
        this.f58480a = context;
        this.f58481b = file;
        this.f58482c = z.f58518c.e(file);
        this.f58483d = ".lock";
        this.f58484e = ".version";
        this.f58485f = "fcntl failed: EAGAIN";
        this.f58486g = nm.g.b(false, 1, null);
        this.f58487h = fl.l.b(new f());
        this.f58488i = fl.l.b(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(File file) throws IOException {
        o(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final void o(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File p(String str) {
        return new File(this.f58481b.getAbsolutePath() + str);
    }

    private final File q() {
        return (File) this.f58487h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e0 r() {
        return (e0) this.f58488i.getValue();
    }

    @Override // z0.s
    public Object a(kl.f fVar) {
        return this.f58488i.isInitialized() ? kotlin.coroutines.jvm.internal.b.d(r().c()) : em.i.j(this.f58480a, new c(null), fVar);
    }

    @Override // z0.s
    public hm.e b() {
        return this.f58482c;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [nm.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [nm.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [nm.a] */
    @Override // z0.s
    public Object c(Function1 function1, kl.f fVar) throws Throwable {
        e eVar;
        w wVar;
        FileOutputStream fileOutputStream;
        Throwable th2;
        Function1 function2;
        Closeable closeable;
        ?? r10;
        ?? r11;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Closeable closeable2;
        ?? r12;
        ?? r13;
        if (fVar instanceof e) {
            eVar = (e) fVar;
            int i10 = eVar.f58505w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f58505w = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(fVar);
            }
        } else {
            eVar = new e(fVar);
        }
        ?? r14 = eVar.f58503u;
        ?? F = ll.b.f();
        int i11 = eVar.f58505w;
        try {
            try {
                try {
                    if (i11 == 0) {
                        fl.s.b(r14);
                        nm.a aVar = this.f58486g;
                        eVar.f58500r = this;
                        eVar.f58501s = function1;
                        eVar.f58502t = aVar;
                        eVar.f58505w = 1;
                        if (aVar.e(null, eVar) != F) {
                            wVar = this;
                            r14 = aVar;
                        }
                        return F;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) eVar.f58502t;
                            closeable2 = (Closeable) eVar.f58501s;
                            nm.a aVar2 = (nm.a) eVar.f58500r;
                            try {
                                fl.s.b(r14);
                                r13 = aVar2;
                                r12 = r14;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    ql.b.a(closeable2, null);
                                    r13.f(null);
                                    return r12;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r14 = r13;
                                    r14.f(null);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        }
                        closeable = (Closeable) eVar.f58502t;
                        r10 = (nm.a) eVar.f58501s;
                        function2 = (Function1) eVar.f58500r;
                        try {
                            fl.s.b(r14);
                            r10 = r10;
                            r11 = r14;
                            fileLock2 = (FileLock) r11;
                            try {
                                eVar.f58500r = r10;
                                eVar.f58501s = closeable;
                                eVar.f58502t = fileLock2;
                                eVar.f58505w = 3;
                                objInvoke = function2.invoke(eVar);
                                if (objInvoke != F) {
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    r12 = objInvoke;
                                    r13 = r10;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    ql.b.a(closeable2, null);
                                    r13.f(null);
                                    return r12;
                                }
                                return F;
                            } catch (Throwable th5) {
                                fileLock = fileLock2;
                                th2 = th5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th2;
                        }
                    }
                    nm.a aVar3 = (nm.a) eVar.f58502t;
                    Function1 function3 = (Function1) eVar.f58501s;
                    wVar = (w) eVar.f58500r;
                    fl.s.b(r14);
                    r14 = aVar3;
                    function1 = function3;
                    a aVar4 = f58476j;
                    eVar.f58500r = function1;
                    eVar.f58501s = r14;
                    eVar.f58502t = fileOutputStream;
                    eVar.f58505w = 2;
                    Object objB = aVar4.b(fileOutputStream, eVar);
                    if (objB != F) {
                        function2 = function1;
                        closeable = fileOutputStream;
                        r10 = r14;
                        r11 = objB;
                        fileLock2 = (FileLock) r11;
                        eVar.f58500r = r10;
                        eVar.f58501s = closeable;
                        eVar.f58502t = fileLock2;
                        eVar.f58505w = 3;
                        objInvoke = function2.invoke(eVar);
                        if (objInvoke != F) {
                            closeable2 = closeable;
                            fileLock = fileLock2;
                            r12 = objInvoke;
                            r13 = r10;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            ql.b.a(closeable2, null);
                            r13.f(null);
                            return r12;
                        }
                    }
                    return F;
                } catch (Throwable th7) {
                    th2 = th7;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th2;
                }
                fileOutputStream = new FileOutputStream(wVar.q());
            } catch (Throwable th8) {
                th = th8;
                r14.f(null);
                throw th;
            }
        } catch (Throwable th9) {
            r14 = eVar;
            try {
                throw th9;
            } catch (Throwable th10) {
                ql.b.a(F, th9);
                throw th10;
            }
        }
    }

    @Override // z0.s
    public Object d(kl.f fVar) {
        return this.f58488i.isInitialized() ? kotlin.coroutines.jvm.internal.b.d(r().b()) : em.i.j(this.f58480a, new b(null), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[Catch: all -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0101 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [tl.o] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, z0.w$g] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [nm.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // z0.s
    public Object e(tl.o oVar, kl.f fVar) throws Throwable {
        ?? gVar;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        nm.a aVar;
        boolean z10;
        Closeable closeable;
        nm.a aVar2;
        boolean z11;
        ?? r10 = oVar;
        if (fVar instanceof g) {
            g gVar2 = (g) fVar;
            int i10 = gVar2.f58513x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar2.f58513x = i10 - Integer.MIN_VALUE;
                gVar = gVar2;
            } else {
                gVar = new g(fVar);
            }
        } else {
            gVar = new g(fVar);
        }
        Object objInvoke = gVar.f58511v;
        Object objF = ll.b.f();
        ?? r11 = gVar.f58513x;
        try {
            try {
                if (r11 != 0) {
                    if (r11 == 1) {
                        z11 = gVar.f58510u;
                        aVar2 = (nm.a) gVar.f58507r;
                        fl.s.b(objInvoke);
                        if (z11) {
                            aVar2.f(null);
                        }
                        return objInvoke;
                    }
                    if (r11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = gVar.f58510u;
                    fileLock = (FileLock) gVar.f58509t;
                    closeable = (Closeable) gVar.f58508s;
                    aVar = (nm.a) gVar.f58507r;
                    try {
                        fl.s.b(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        ql.b.a(closeable, null);
                        if (z10) {
                            aVar.f(null);
                        }
                        return objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                fl.s.b(objInvoke);
                nm.a aVar3 = this.f58486g;
                boolean zC = aVar3.c(null);
                try {
                    if (zC) {
                        FileInputStream fileInputStream = new FileInputStream(q());
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th3) {
                                th = th3;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e10) {
                            String message2 = e10.getMessage();
                            if ((message2 == null || !bm.r.N(message2, this.f58485f, false, 2, null)) && ((message = e10.getMessage()) == null || !bm.r.N(message, f58477k, false, 2, null))) {
                                throw e10;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(fileLockTryLock != null);
                            gVar.f58507r = aVar3;
                            gVar.f58508s = fileInputStream;
                            gVar.f58509t = fileLockTryLock;
                            gVar.f58510u = zC;
                            gVar.f58513x = 2;
                            objInvoke = r10.invoke(boolA, gVar);
                            if (objInvoke != objF) {
                                aVar = aVar3;
                                z10 = zC;
                                closeable = fileInputStream;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                ql.b.a(closeable, null);
                                if (z10) {
                                    aVar.f(null);
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a(false);
                        gVar.f58507r = aVar3;
                        gVar.f58510u = zC;
                        gVar.f58513x = 1;
                        objInvoke = r10.invoke(boolA2, gVar);
                        if (objInvoke != objF) {
                            aVar2 = aVar3;
                            z11 = zC;
                            if (z11) {
                                aVar2.f(null);
                            }
                            return objInvoke;
                        }
                    }
                    return objF;
                } catch (Throwable th5) {
                    th = th5;
                    gVar = aVar3;
                    r10 = zC;
                    if (r10 != 0) {
                        gVar.f(null);
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            ?? r12 = gVar;
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    ql.b.a(r11, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r10 = r10;
                    gVar = r12;
                    if (r10 != 0) {
                        gVar.f(null);
                    }
                    throw th;
                }
            }
        }
    }
}
