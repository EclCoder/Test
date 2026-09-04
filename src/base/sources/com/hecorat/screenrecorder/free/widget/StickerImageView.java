package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class StickerImageView extends StickerView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f23709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ImageView f23710q;

    public StickerImageView(Context context, float f10) {
        super(context, f10);
    }

    public static /* synthetic */ void v(StickerImageView stickerImageView, View view) {
        View mainView = stickerImageView.getMainView();
        mainView.setRotationY(mainView.getRotationY() == -180.0f ? 0.0f : -180.0f);
        mainView.invalidate();
        stickerImageView.requestLayout();
        StickerView.c cVar = stickerImageView.f23729n;
        if (cVar != null) {
            cVar.u(stickerImageView);
        }
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView
    public Bitmap getBitmap() {
        Bitmap bitmapCreateBitmap;
        this.f23710q.setDrawingCacheEnabled(true);
        this.f23710q.buildDrawingCache(true);
        Bitmap drawingCache = this.f23710q.getDrawingCache(true);
        if (drawingCache == null || drawingCache.isRecycled()) {
            bitmapCreateBitmap = null;
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawingCache);
            drawingCache.recycle();
        }
        this.f23710q.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView
    public View getMainView() {
        if (this.f23710q == null) {
            ImageView imageView = new ImageView(getContext());
            this.f23710q = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        this.f23719d.setImageResource(R.drawable.ic_flip);
        this.f23719d.setOnClickListener(new View.OnClickListener() { // from class: com.hecorat.screenrecorder.free.widget.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StickerImageView.v(this.f23785a, view);
            }
        });
        return this.f23710q;
    }

    public String getOwnerId() {
        return this.f23709p;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f23710q.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f23710q.setImageDrawable(drawable);
    }

    public void setImageResource(int i10) {
        this.f23710q.setImageResource(i10);
    }

    public void setOwnerId(String str) {
        this.f23709p = str;
    }

    public StickerImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
