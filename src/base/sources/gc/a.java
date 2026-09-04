package gc;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.api.client.http.HttpStatusCodes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f39078a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final View f39079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f39080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f39081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f39082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.activity.b f39083f;

    public a(View view) {
        this.f39079b = view;
        Context context = view.getContext();
        this.f39080c = j.f(context, sb.c.M, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
        this.f39081d = j.f(context, sb.c.Q, 150);
        this.f39082e = j.f(context, sb.c.P, 100);
    }

    public float a(float f10) {
        return this.f39078a.getInterpolation(f10);
    }

    protected androidx.activity.b b() {
        if (this.f39083f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        androidx.activity.b bVar = this.f39083f;
        this.f39083f = null;
        return bVar;
    }

    public androidx.activity.b c() {
        androidx.activity.b bVar = this.f39083f;
        this.f39083f = null;
        return bVar;
    }

    protected void d(androidx.activity.b bVar) {
        this.f39083f = bVar;
    }

    protected androidx.activity.b e(androidx.activity.b bVar) {
        if (this.f39083f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = this.f39083f;
        this.f39083f = bVar;
        return bVar2;
    }
}
