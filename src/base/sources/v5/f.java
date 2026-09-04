package v5;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f55172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f55173b;

        a(Context context, String str) {
            this.f55172a = context;
            this.f55173b = str;
        }

        @Override // v5.d.a
        public File a() {
            File cacheDir = this.f55172a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f55173b != null ? new File(cacheDir, this.f55173b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
