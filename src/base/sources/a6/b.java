package a6;

import m6.k;
import t5.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f149a;

    public b(byte[] bArr) {
        this.f149a = (byte[]) k.e(bArr);
    }

    @Override // t5.c
    public Class b() {
        return byte[].class;
    }

    @Override // t5.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f149a;
    }

    @Override // t5.c
    public int getSize() {
        return this.f149a.length;
    }

    @Override // t5.c
    public void a() {
    }
}
