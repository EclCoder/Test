package b6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import m6.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements t5.c, t5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Drawable f8491a;

    public e(Drawable drawable) {
        this.f8491a = (Drawable) k.e(drawable);
    }

    @Override // t5.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f8491a.getConstantState();
        return constantState == null ? this.f8491a : constantState.newDrawable();
    }

    @Override // t5.b
    public void initialize() {
        Drawable drawable = this.f8491a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof d6.c) {
            ((d6.c) drawable).e().prepareToDraw();
        }
    }
}
