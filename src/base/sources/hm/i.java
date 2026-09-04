package hm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class i {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40543r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f40544s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f40545t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f40546u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f40547v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f40548w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f40549x;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40548w = obj;
            this.f40549x |= Integer.MIN_VALUE;
            return i.c(null, null, false, this);
        }
    }

    public static final Object b(f fVar, gm.t tVar, kl.f fVar2) {
        Object objC = c(fVar, tVar, true, fVar2);
        return objC == ll.b.f() ? objC : fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0037, B:24:0x0063, B:28:0x007a, B:30:0x0082, B:20:0x0055, B:23:0x005f), top: B:44:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r2.emit(r11, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009a -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(hm.f r8, gm.t r9, boolean r10, kl.f r11) {
        /*
            boolean r0 = r11 instanceof hm.i.a
            if (r0 == 0) goto L13
            r0 = r11
            hm.i$a r0 = (hm.i.a) r0
            int r1 = r0.f40549x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40549x = r1
            goto L18
        L13:
            hm.i$a r0 = new hm.i$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f40548w
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f40549x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L59
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3f
            boolean r10 = r0.f40547v
            java.lang.Object r8 = r0.f40545t
            gm.i r8 = (gm.i) r8
            java.lang.Object r9 = r0.f40544s
            gm.t r9 = (gm.t) r9
            java.lang.Object r2 = r0.f40543r
            hm.f r2 = (hm.f) r2
            fl.s.b(r11)     // Catch: java.lang.Throwable -> L3d
        L3a:
            r11 = r8
            r8 = r2
            goto L63
        L3d:
            r8 = move-exception
            goto La5
        L3f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L47:
            boolean r10 = r0.f40547v
            java.lang.Object r8 = r0.f40545t
            gm.i r8 = (gm.i) r8
            java.lang.Object r9 = r0.f40544s
            gm.t r9 = (gm.t) r9
            java.lang.Object r2 = r0.f40543r
            hm.f r2 = (hm.f) r2
            fl.s.b(r11)     // Catch: java.lang.Throwable -> L3d
            goto L7a
        L59:
            fl.s.b(r11)
            hm.g.o(r8)
            gm.i r11 = r9.iterator()     // Catch: java.lang.Throwable -> L3d
        L63:
            r0.f40543r = r8     // Catch: java.lang.Throwable -> L3d
            r0.f40544s = r9     // Catch: java.lang.Throwable -> L3d
            r0.f40545t = r11     // Catch: java.lang.Throwable -> L3d
            r0.f40546u = r5     // Catch: java.lang.Throwable -> L3d
            r0.f40547v = r10     // Catch: java.lang.Throwable -> L3d
            r0.f40549x = r4     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r11.b(r0)     // Catch: java.lang.Throwable -> L3d
            if (r2 != r1) goto L76
            goto L9c
        L76:
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r7
        L7a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L9d
            java.lang.Object r11 = r8.next()     // Catch: java.lang.Throwable -> L3d
            r0.f40543r = r2     // Catch: java.lang.Throwable -> L3d
            r0.f40544s = r9     // Catch: java.lang.Throwable -> L3d
            r0.f40545t = r8     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.l.a(r11)     // Catch: java.lang.Throwable -> L3d
            r0.f40546u = r6     // Catch: java.lang.Throwable -> L3d
            r0.f40547v = r10     // Catch: java.lang.Throwable -> L3d
            r0.f40549x = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r11 = r2.emit(r11, r0)     // Catch: java.lang.Throwable -> L3d
            if (r11 != r1) goto L3a
        L9c:
            return r1
        L9d:
            if (r10 == 0) goto La2
            gm.m.a(r9, r5)
        La2:
            fl.g0 r8 = fl.g0.f38750a
            return r8
        La5:
            throw r8     // Catch: java.lang.Throwable -> La6
        La6:
            r11 = move-exception
            if (r10 == 0) goto Lac
            gm.m.a(r9, r8)
        Lac:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.i.c(hm.f, gm.t, boolean, kl.f):java.lang.Object");
    }
}
