package com.mbridge.msdk.thrid.okio;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f33671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f33672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f33673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f33674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f33675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    o f33676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o f33677g;

    o() {
        this.f33671a = new byte[8192];
        this.f33675e = true;
        this.f33674d = false;
    }

    public final o a(o oVar) {
        oVar.f33677g = this;
        oVar.f33676f = this.f33676f;
        this.f33676f.f33677g = oVar;
        this.f33676f = oVar;
        return oVar;
    }

    public final o b() {
        o oVar = this.f33676f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f33677g;
        oVar3.f33676f = oVar;
        this.f33676f.f33677g = oVar3;
        this.f33676f = null;
        this.f33677g = null;
        return oVar2;
    }

    final o c() {
        this.f33674d = true;
        return new o(this.f33671a, this.f33672b, this.f33673c, true, false);
    }

    o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f33671a = bArr;
        this.f33672b = i10;
        this.f33673c = i11;
        this.f33674d = z10;
        this.f33675e = z11;
    }

    public final o a(int i10) {
        o oVarA;
        if (i10 > 0 && i10 <= this.f33673c - this.f33672b) {
            if (i10 >= 1024) {
                oVarA = c();
            } else {
                oVarA = p.a();
                System.arraycopy(this.f33671a, this.f33672b, oVarA.f33671a, 0, i10);
            }
            oVarA.f33673c = oVarA.f33672b + i10;
            this.f33672b += i10;
            this.f33677g.a(oVarA);
            return oVarA;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        o oVar = this.f33677g;
        if (oVar != this) {
            if (oVar.f33675e) {
                int i10 = this.f33673c - this.f33672b;
                if (i10 > (8192 - oVar.f33673c) + (oVar.f33674d ? 0 : oVar.f33672b)) {
                    return;
                }
                a(oVar, i10);
                b();
                p.a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(o oVar, int i10) {
        if (oVar.f33675e) {
            int i11 = oVar.f33673c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!oVar.f33674d) {
                    int i13 = oVar.f33672b;
                    if (i12 - i13 <= 8192) {
                        byte[] bArr = oVar.f33671a;
                        System.arraycopy(bArr, i13, bArr, 0, i11 - i13);
                        oVar.f33673c -= oVar.f33672b;
                        oVar.f33672b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f33671a, this.f33672b, oVar.f33671a, oVar.f33673c, i10);
            oVar.f33673c += i10;
            this.f33672b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
