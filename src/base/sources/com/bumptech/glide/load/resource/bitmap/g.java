package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements r5.k {
    @Override // r5.k
    public final t5.c b(Context context, t5.c cVar, int i10, int i11) {
        if (!m6.l.t(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        u5.d dVarH = com.bumptech.glide.c.e(context).h();
        Bitmap bitmap = (Bitmap) cVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(dVarH, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? cVar : f.d(bitmapC, dVarH);
    }

    protected abstract Bitmap c(u5.d dVar, Bitmap bitmap, int i10, int i11);
}
