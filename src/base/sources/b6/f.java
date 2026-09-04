package b6;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class f extends e {
    private f(Drawable drawable) {
        super(drawable);
    }

    static t5.c d(Drawable drawable) {
        if (drawable != null) {
            return new f(drawable);
        }
        return null;
    }

    @Override // t5.c
    public Class b() {
        return this.f8491a.getClass();
    }

    @Override // t5.c
    public int getSize() {
        return Math.max(1, this.f8491a.getIntrinsicWidth() * this.f8491a.getIntrinsicHeight() * 4);
    }

    @Override // t5.c
    public void a() {
    }
}
