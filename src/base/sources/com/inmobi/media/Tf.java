package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Tf implements Transformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f25762a;

    public Tf(Bitmap.Config config) {
        kotlin.jvm.internal.s.h(config, "config");
        this.f25762a = config;
    }

    @Override // com.squareup.picasso.Transformation
    public final String key() {
        return "config(" + this.f25762a + ")";
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap transform(Bitmap source) {
        kotlin.jvm.internal.s.h(source, "source");
        Bitmap bitmapCopy = source.copy(this.f25762a, false);
        source.recycle();
        kotlin.jvm.internal.s.e(bitmapCopy);
        return bitmapCopy;
    }
}
