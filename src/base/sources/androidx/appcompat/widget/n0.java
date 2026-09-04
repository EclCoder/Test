package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class n0 extends g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f1658b;

    public n0(Context context, Resources resources) {
        super(resources);
        this.f1658b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawableA = a(i10);
        Context context = (Context) this.f1658b.get();
        if (drawableA != null && context != null) {
            f0.g().w(context, i10, drawableA);
        }
        return drawableA;
    }
}
