package wa;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f56027a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends LinkedHashMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f56028a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f56028a = i11;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.f56028a;
        }
    }

    public e(int i10) {
        this.f56027a = new a(i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f56027a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f56027a.put((Uri) ob.a.e(uri), (byte[]) ob.a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f56027a.remove(ob.a.e(uri));
    }
}
