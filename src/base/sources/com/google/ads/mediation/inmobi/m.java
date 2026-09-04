package com.google.ads.mediation.inmobi;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class m extends NativeAd.Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f16323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f16324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f16325c;

    public m(Drawable drawable, Uri uri, double d10) {
        this.f16323a = drawable;
        this.f16324b = uri;
        this.f16325c = d10;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public Drawable getDrawable() {
        return this.f16323a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public double getScale() {
        return this.f16325c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public Uri getUri() {
        return this.f16324b;
    }
}
