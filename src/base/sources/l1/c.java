package l1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f43737d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f43738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f43739b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f43736c = new a(defaultConstructorMarker);
        float f10 = 0.0f;
        f43737d = new c(f10, f10, 3, defaultConstructorMarker);
    }

    public c(float f10, float f11) {
        this.f43738a = f10;
        this.f43739b = f11;
    }

    public final float a() {
        return this.f43738a;
    }

    public final float b() {
        return this.f43739b;
    }

    public /* synthetic */ c(float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }
}
