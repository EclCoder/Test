package com.fasterxml.jackson.core.io;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f16232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.fasterxml.jackson.core.a f16233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f16234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final i8.a f16235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected byte[] f16236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected byte[] f16237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected char[] f16238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected char[] f16239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected char[] f16240i;

    public b(i8.a aVar, Object obj, boolean z10) {
        this.f16235d = aVar;
        this.f16232a = obj;
        this.f16234c = z10;
    }

    private IllegalArgumentException s() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    protected final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    protected final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw s();
        }
    }

    protected final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw s();
        }
    }

    public char[] d() {
        a(this.f16239h);
        char[] cArrC = this.f16235d.c(1);
        this.f16239h = cArrC;
        return cArrC;
    }

    public byte[] e() {
        a(this.f16236e);
        byte[] bArrA = this.f16235d.a(0);
        this.f16236e = bArrA;
        return bArrA;
    }

    public char[] f() {
        a(this.f16238g);
        char[] cArrC = this.f16235d.c(0);
        this.f16238g = cArrC;
        return cArrC;
    }

    public char[] g(int i10) {
        a(this.f16238g);
        char[] cArrD = this.f16235d.d(0, i10);
        this.f16238g = cArrD;
        return cArrD;
    }

    public byte[] h() {
        a(this.f16237f);
        byte[] bArrA = this.f16235d.a(1);
        this.f16237f = bArrA;
        return bArrA;
    }

    public i8.i i() {
        return new i8.i(this.f16235d);
    }

    public com.fasterxml.jackson.core.a j() {
        return this.f16233b;
    }

    public Object k() {
        return this.f16232a;
    }

    public boolean l() {
        return this.f16234c;
    }

    public void m(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f16239h);
            this.f16239h = null;
            this.f16235d.j(1, cArr);
        }
    }

    public void n(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f16240i);
            this.f16240i = null;
            this.f16235d.j(3, cArr);
        }
    }

    public void o(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f16236e);
            this.f16236e = null;
            this.f16235d.i(0, bArr);
        }
    }

    public void p(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f16238g);
            this.f16238g = null;
            this.f16235d.j(0, cArr);
        }
    }

    public void q(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f16237f);
            this.f16237f = null;
            this.f16235d.i(1, bArr);
        }
    }

    public void r(com.fasterxml.jackson.core.a aVar) {
        this.f16233b = aVar;
    }
}
