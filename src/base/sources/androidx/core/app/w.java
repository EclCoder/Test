package androidx.core.app;

import android.app.PictureInPictureUiState;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3321c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3323b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a(PictureInPictureUiState uiState) {
            kotlin.jvm.internal.s.h(uiState, "uiState");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 35) {
                return new w(uiState.isStashed(), uiState.isTransitioningToPip());
            }
            return i10 >= 31 ? new w(uiState.isStashed(), false) : new w(false, false);
        }

        private a() {
        }
    }

    public w(boolean z10, boolean z11) {
        this.f3322a = z10;
        this.f3323b = z11;
    }
}
