package jd;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pd.j f42309b;

    public h0(String str, pd.j jVar) {
        this.f42308a = str;
        this.f42309b = jVar;
    }

    private File b() {
        return this.f42309b.g(this.f42308a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            gd.g.f().e("Error creating marker: " + this.f42308a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
