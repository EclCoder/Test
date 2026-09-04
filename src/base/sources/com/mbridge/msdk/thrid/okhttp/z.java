package com.mbridge.msdk.thrid.okhttp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class z {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f33621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f33622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f33623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f33624d;

        a(u uVar, int i10, byte[] bArr, int i11) {
            this.f33621a = uVar;
            this.f33622b = i10;
            this.f33623c = bArr;
            this.f33624d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long a() {
            return this.f33622b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public u b() {
            return this.f33621a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public void a(com.mbridge.msdk.thrid.okio.d dVar) {
            dVar.write(this.f33623c, this.f33624d, this.f33622b);
        }
    }

    public static z a(u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public abstract long a();

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar);

    public abstract u b();

    public static z a(u uVar, byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i10, i11);
        return new a(uVar, i11, bArr, i10);
    }
}
