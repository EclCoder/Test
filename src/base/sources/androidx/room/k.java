package androidx.room;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class k implements p4.c.InterfaceC0762c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f7194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p4.c.InterfaceC0762c f7195c;

    k(String str, File file, p4.c.InterfaceC0762c interfaceC0762c) {
        this.f7193a = str;
        this.f7194b = file;
        this.f7195c = interfaceC0762c;
    }

    @Override // p4.c.InterfaceC0762c
    public p4.c a(p4.c.b bVar) {
        return new j(bVar.f49508a, this.f7193a, this.f7194b, bVar.f49510c.f49507a, this.f7195c.a(bVar));
    }
}
