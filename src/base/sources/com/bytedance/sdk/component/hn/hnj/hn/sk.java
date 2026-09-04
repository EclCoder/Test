package com.bytedance.sdk.component.hn.hnj.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class sk {
    sk dkl;
    sk dse;
    boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    int f12869hn;
    final byte[] hnj;
    int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    boolean f12870sk;

    sk() {
        this.hnj = new byte[8192];
        this.f12870sk = true;
        this.gjv = false;
    }

    public final sk hn() {
        sk skVar = this.dkl;
        sk skVar2 = skVar != this ? skVar : null;
        sk skVar3 = this.dse;
        if (skVar3 != null) {
            skVar3.dkl = skVar;
        }
        sk skVar4 = this.dkl;
        if (skVar4 != null) {
            skVar4.dse = skVar3;
        }
        this.dkl = null;
        this.dse = null;
        return skVar2;
    }

    final sk hnj() {
        this.gjv = true;
        return new sk(this.hnj, this.f12869hn, this.qor, true, false);
    }

    public final sk hnj(sk skVar) {
        skVar.dse = this;
        skVar.dkl = this.dkl;
        this.dkl.dse = skVar;
        this.dkl = skVar;
        return skVar;
    }

    sk(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.hnj = bArr;
        this.f12869hn = i10;
        this.qor = i11;
        this.gjv = z10;
        this.f12870sk = z11;
    }
}
