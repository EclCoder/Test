package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class NetworkImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f10483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap f10484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f10486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f10487g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f10488a;

        a(boolean z10) {
            this.f10488a = z10;
        }
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    private void b() {
        int i10 = this.f10482b;
        if (i10 != 0) {
            setImageResource(i10);
            return;
        }
        Drawable drawable = this.f10483c;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f10484d;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    void a(boolean z10) {
        boolean z11;
        boolean z12;
        int width = getWidth();
        int height = getHeight();
        getScaleType();
        if (getLayoutParams() != null) {
            z11 = getLayoutParams().width == -2;
            z12 = getLayoutParams().height == -2;
        } else {
            z11 = false;
            z12 = false;
        }
        boolean z13 = z11 && z12;
        if (width == 0 && height == 0 && !z13) {
            return;
        }
        if (TextUtils.isEmpty(this.f10481a)) {
            b();
        } else {
            new a(z10);
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f10482b = 0;
        this.f10483c = null;
        this.f10484d = bitmap;
    }

    public void setDefaultImageDrawable(Drawable drawable) {
        this.f10482b = 0;
        this.f10484d = null;
        this.f10483c = drawable;
    }

    public void setDefaultImageResId(int i10) {
        this.f10484d = null;
        this.f10483c = null;
        this.f10482b = i10;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.f10485e = 0;
        this.f10486f = null;
        this.f10487g = bitmap;
    }

    public void setErrorImageDrawable(Drawable drawable) {
        this.f10485e = 0;
        this.f10487g = null;
        this.f10486f = drawable;
    }

    public void setErrorImageResId(int i10) {
        this.f10487g = null;
        this.f10486f = null;
        this.f10485e = i10;
    }
}
