package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i10) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i10;
    }

    protected abstract void zaa(Drawable drawable, boolean z10, boolean z11, boolean z12);

    final void zab(Context context, zam zamVar, boolean z10) {
        int i10 = this.zab;
        zaa(i10 != 0 ? context.getResources().getDrawable(i10) : null, z10, false, false);
    }

    final void zac(Context context, Bitmap bitmap, boolean z10) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
