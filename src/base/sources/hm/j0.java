package hm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class j0 extends im.a implements w, e, im.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f40552f = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40553e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40554r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f40555s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f40556t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f40557u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f40558v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f40559w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f40561y;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40559w = obj;
            this.f40561y |= Integer.MIN_VALUE;
            return j0.this.collect(null, this);
        }
    }

    public j0(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean r(Object obj, Object obj2) {
        int i10;
        im.c[] cVarArrN;
        synchronized (this) {
            Object obj3 = f40552f.get(this);
            if (obj != null && !kotlin.jvm.internal.s.c(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.s.c(obj3, obj2)) {
                return true;
            }
            f40552f.set(this, obj2);
            int i11 = this.f40553e;
            if ((i11 & 1) != 0) {
                this.f40553e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f40553e = i12;
            im.c[] cVarArrN2 = n();
            fl.g0 g0Var = fl.g0.f38750a;
            while (true) {
                l0[] l0VarArr = (l0[]) cVarArrN2;
                if (l0VarArr != null) {
                    for (l0 l0Var : l0VarArr) {
                        if (l0Var != null) {
                            l0Var.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f40553e;
                    if (i10 == i12) {
                        this.f40553e = i12 + 1;
                        return true;
                    }
                    cVarArrN = n();
                    fl.g0 g0Var2 = fl.g0.f38750a;
                }
                cVarArrN2 = cVarArrN;
                i12 = i10;
            }
        }
    }

    @Override // im.k
    public e a(kl.j jVar, int i10, gm.a aVar) {
        return k0.d(this, jVar, i10, aVar);
    }

    @Override // hm.v
    public boolean b(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // hm.w
    public boolean c(Object obj, Object obj2) {
        if (obj == null) {
            obj = im.n.f41534a;
        }
        if (obj2 == null) {
            obj2 = im.n.f41534a;
        }
        return r(obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081 A[Catch: all -> 0x003e, PHI: r2 r6 r7 r10
      0x0081: PHI (r2v5 em.z1) = (r2v2 em.z1), (r2v4 em.z1), (r2v4 em.z1), (r2v9 em.z1) binds: [B:28:0x0072, B:45:0x00ba, B:47:0x00d0, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r6v5 hm.l0) = (r6v2 hm.l0), (r6v4 hm.l0), (r6v4 hm.l0), (r6v11 hm.l0) binds: [B:28:0x0072, B:45:0x00ba, B:47:0x00d0, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r7v3 hm.f) = (r7v0 hm.f), (r7v2 hm.f), (r7v2 hm.f), (r7v7 hm.f) binds: [B:28:0x0072, B:45:0x00ba, B:47:0x00d0, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r10v6 java.lang.Object) = (r10v3 java.lang.Object), (r10v5 java.lang.Object), (r10v5 java.lang.Object), (r10v16 java.lang.Object) binds: [B:28:0x0072, B:45:0x00ba, B:47:0x00d0, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003e, blocks: (B:15:0x003a, B:29:0x0081, B:31:0x008b, B:33:0x0090, B:44:0x00b6, B:46:0x00bc, B:35:0x0096, B:39:0x009d, B:22:0x0057, B:25:0x0064, B:28:0x0072), top: B:51:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:15:0x003a, B:29:0x0081, B:31:0x008b, B:33:0x0090, B:44:0x00b6, B:46:0x00bc, B:35:0x0096, B:39:0x009d, B:22:0x0057, B:25:0x0064, B:28:0x0072), top: B:51:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:15:0x003a, B:29:0x0081, B:31:0x008b, B:33:0x0090, B:44:0x00b6, B:46:0x00bc, B:35:0x0096, B:39:0x009d, B:22:0x0057, B:25:0x0064, B:28:0x0072), top: B:51:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:15:0x003a, B:29:0x0081, B:31:0x008b, B:33:0x0090, B:44:0x00b6, B:46:0x00bc, B:35:0x0096, B:39:0x009d, B:22:0x0057, B:25:0x0064, B:28:0x0072), top: B:51:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ba -> B:29:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d0 -> B:29:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // hm.z, hm.e
    public java.lang.Object collect(hm.f r10, kl.f r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.j0.collect(hm.f, kl.f):java.lang.Object");
    }

    @Override // hm.v, hm.f
    public Object emit(Object obj, kl.f fVar) {
        setValue(obj);
        return fl.g0.f38750a;
    }

    @Override // hm.w, hm.i0
    public Object getValue() {
        jm.d0 d0Var = im.n.f41534a;
        Object obj = f40552f.get(this);
        if (obj == d0Var) {
            return null;
        }
        return obj;
    }

    @Override // hm.v
    public void j() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public l0 i() {
        return new l0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public l0[] k(int i10) {
        return new l0[i10];
    }

    @Override // hm.w
    public void setValue(Object obj) {
        if (obj == null) {
            obj = im.n.f41534a;
        }
        r(null, obj);
    }
}
