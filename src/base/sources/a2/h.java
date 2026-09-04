package a2;

import androidx.media3.datasource.cache.Cache;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.media3.datasource.cache.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f99a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet f100b = new TreeSet(new Comparator() { // from class: a2.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return h.g((c) obj, (c) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f101c;

    public h(long j10) {
        this.f99a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(c cVar, c cVar2) {
        long j10 = cVar.f93f;
        long j11 = cVar2.f93f;
        if (j10 - j11 == 0) {
            return cVar.compareTo(cVar2);
        }
        return j10 < j11 ? -1 : 1;
    }

    private void h(Cache cache, long j10) {
        while (this.f101c + j10 > this.f99a && !this.f100b.isEmpty()) {
            cache.a((c) this.f100b.first());
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void a(Cache cache, c cVar, c cVar2) {
        c(cache, cVar);
        b(cache, cVar2);
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void b(Cache cache, c cVar) {
        this.f100b.add(cVar);
        this.f101c += cVar.f90c;
        h(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void c(Cache cache, c cVar) {
        this.f100b.remove(cVar);
        this.f101c -= cVar.f90c;
    }

    @Override // androidx.media3.datasource.cache.b
    public boolean d() {
        return true;
    }

    @Override // androidx.media3.datasource.cache.b
    public void e(Cache cache, String str, long j10, long j11) {
        if (j11 != -1) {
            h(cache, j11);
        }
    }

    @Override // androidx.media3.datasource.cache.b
    public void onCacheInitialized() {
    }
}
