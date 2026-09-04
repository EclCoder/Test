package lg;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources.Theme f44507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedValue f44508b = new TypedValue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TypedValue f44509c = new TypedValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypedValue f44510d = new TypedValue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TypedValue f44511e = new TypedValue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TypedValue f44512f = new TypedValue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TypedValue f44513g = new TypedValue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TypedValue f44514h = new TypedValue();

    public h(Context context) {
        this.f44507a = context.getTheme();
        c();
    }

    private void c() {
        this.f44507a.resolveAttribute(R.attr.colorPrimary, this.f44508b, true);
        this.f44507a.resolveAttribute(R.attr.colorPrimaryDark, this.f44509c, true);
        this.f44507a.resolveAttribute(R.attr.colorAccent, this.f44510d, true);
        this.f44507a.resolveAttribute(R.attr.editTextColor, this.f44511e, true);
        this.f44507a.resolveAttribute(android.R.attr.colorBackground, this.f44512f, true);
        this.f44507a.resolveAttribute(R.attr.colorBackgroundFloating, this.f44513g, true);
        this.f44507a.resolveAttribute(R.attr.colorControlNormal, this.f44514h, true);
    }

    public TypedValue a() {
        return this.f44510d;
    }

    public TypedValue b() {
        return this.f44508b;
    }
}
