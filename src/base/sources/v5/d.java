package v5;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements v5.a.InterfaceC0829a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f55165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f55166b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f55165a = j10;
        this.f55166b = aVar;
    }

    @Override // v5.a.InterfaceC0829a
    public v5.a build() {
        File fileA = this.f55166b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f55165a);
        }
        return null;
    }
}
