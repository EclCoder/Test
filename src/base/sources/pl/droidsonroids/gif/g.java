package pl.droidsonroids.gif;

import android.content.res.AssetManager;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f50237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f50238b;

        public b(AssetManager assetManager, String str) {
            super();
            this.f50237a = assetManager;
            this.f50238b = str;
        }

        @Override // pl.droidsonroids.gif.g
        GifInfoHandle a() {
            return new GifInfoHandle(this.f50237a.openFd(this.f50238b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f50239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f50240b;

        public c(Resources resources, int i10) {
            super();
            this.f50239a = resources;
            this.f50240b = i10;
        }

        @Override // pl.droidsonroids.gif.g
        GifInfoHandle a() {
            return new GifInfoHandle(this.f50239a.openRawResourceFd(this.f50240b));
        }
    }

    abstract GifInfoHandle a();

    private g() {
    }
}
