package n0;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f46642a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScrollFeedbackProvider f46643a;

        b(View view) {
            this.f46643a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // n0.h0.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f46643a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // n0.h0.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f46643a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    private h0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46642a = new b(view);
        } else {
            this.f46642a = new c();
        }
    }

    public static h0 a(View view) {
        return new h0(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f46642a.onScrollLimit(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f46642a.onScrollProgress(i10, i11, i12, i13);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c implements d {
        private c() {
        }

        @Override // n0.h0.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // n0.h0.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }
}
