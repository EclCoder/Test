package nf;

import android.graphics.Color;
import com.hecorat.screenrecorder.free.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 nf.w, still in use, count: 1, list:
  (r0v0 nf.w) from 0x010b: SPUT (r0v0 nf.w) (LINE:268) nf.w.i nf.w
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class w {
    CLASSIC(R.string.caption_style_classic, -1, 0.035f, 0.92f, "Roboto-Regular.ttf", 0, 0.0f, 96, null),
    YOUTUBE(R.string.caption_style_youtube, -1, 0.042f, 0.9f, "Roboto-Bold.ttf", 0, 0.0f, 96, null),
    MINIMAL(R.string.caption_style_minimal, Color.parseColor("#E0E0E0"), 0.028f, 0.94f, "Roboto-Thin.ttf", 0, 0.0f, 96, null),
    MONO(R.string.caption_style_mono, -1, 0.034f, 0.91f, "RobotoMono-Regular.ttf", 0, 0.0f, 96, null),
    YELLOW(R.string.caption_style_yellow, Color.parseColor("#FFEB3B"), 0.045f, 0.86f, "Roboto-Bold.ttf", 0, 0.0f, 96, null),
    TIKTOK(R.string.caption_style_tiktok, Color.parseColor("#FFEB3B"), 0.06f, 0.58f, "Roboto-Black.ttf", 0, 0.14f, 32, null),
    PINK(R.string.caption_style_pink, Color.parseColor("#FF4081"), 0.055f, 0.62f, "Roboto-Black.ttf", 0, 0.14f, 32, null),
    CYAN(R.string.caption_style_cyan, Color.parseColor("#4DD0E1"), 0.042f, 0.86f, "Roboto-Bold.ttf", 0, 0.0f, 96, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f47661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f47662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f47663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f47664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f47665g;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ ml.a f47658s = ml.b.a(d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f47647h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final w f47648i = new w(R.string.caption_style_classic, -1, 0.035f, 0.92f, "Roboto-Regular.ttf", 0, 0.0f, 96, null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a() {
            return w.f47648i;
        }

        private a() {
        }
    }

    static {
    }

    private w(String str, int i10, int i11, int i12, float f10, float f11, String str2, int i13, float f12) {
        super(str, i10);
        this.f47659a = i11;
        this.f47660b = i12;
        this.f47661c = f10;
        this.f47662d = f11;
        this.f47663e = str2;
        this.f47664f = i13;
        this.f47665g = f12;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f47657r.clone();
    }

    public final int h() {
        return this.f47660b;
    }

    public final float i() {
        return this.f47661c;
    }

    public final int j() {
        return this.f47659a;
    }

    public final String k() {
        return this.f47663e;
    }

    public final int l() {
        return this.f47664f;
    }

    public final float m() {
        return this.f47665g;
    }

    public final float n() {
        return this.f47662d;
    }

    /* synthetic */ w(int i10, int i11, float f10, float f11, String str, int i12, float f12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i10, i11, f10, f11, str, (i13 & 32) != 0 ? -16777216 : i12, (i13 & 64) != 0 ? 0.12f : f12);
    }
}
