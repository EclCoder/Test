package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class StickerTextView extends StickerView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f23713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f23714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AutoResizeTextView f23715t;

    public StickerTextView(Context context, float f10) {
        super(context, f10);
        this.f23713r = "Text here";
    }

    public static /* synthetic */ void v(StickerTextView stickerTextView, View view) {
        StickerView.c cVar = stickerTextView.f23729n;
        if (cVar != null) {
            cVar.u(stickerTextView);
        }
    }

    public int getBgColor() {
        return this.f23712q;
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView
    public Bitmap getBitmap() {
        Bitmap bitmapCreateBitmap;
        this.f23715t.setDrawingCacheEnabled(true);
        this.f23715t.buildDrawingCache(true);
        Bitmap drawingCache = this.f23715t.getDrawingCache(true);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(drawingCache);
            if (drawingCache != null) {
                try {
                    if (!drawingCache.isRecycled()) {
                        drawingCache.recycle();
                    }
                } catch (NullPointerException e10) {
                    e = e10;
                    wp.a.e(e);
                    com.google.firebase.crashlytics.a.b().d(e);
                    return bitmapCreateBitmap;
                }
            }
            this.f23715t.setDrawingCacheEnabled(false);
            return bitmapCreateBitmap;
        } catch (NullPointerException e11) {
            e = e11;
            bitmapCreateBitmap = null;
        }
    }

    public String getFontPath() {
        return this.f23714s;
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView
    public View getMainView() {
        AutoResizeTextView autoResizeTextView = this.f23715t;
        if (autoResizeTextView != null) {
            return autoResizeTextView;
        }
        AutoResizeTextView autoResizeTextView2 = new AutoResizeTextView(getContext());
        this.f23715t = autoResizeTextView2;
        autoResizeTextView2.setTextColor(-1);
        this.f23715t.setGravity(17);
        this.f23715t.setTextSize(400.0f);
        this.f23715t.setShadowLayer(4.0f, 0.0f, 0.0f, -16777216);
        this.f23715t.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f23715t.setLayoutParams(layoutParams);
        this.f23719d.setImageResource(R.drawable.ic_edit_text);
        this.f23719d.setOnClickListener(new View.OnClickListener() { // from class: com.hecorat.screenrecorder.free.widget.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StickerTextView.v(this.f23786a, view);
            }
        });
        return this.f23715t;
    }

    public String getText() {
        return this.f23713r;
    }

    public int getTextColor() {
        return this.f23711p;
    }

    public void setBgColor(int i10) {
        this.f23712q = i10;
        this.f23715t.setBackgroundColor(i10);
    }

    public void setText(String str) {
        this.f23713r = str;
        this.f23715t.setText(str);
    }

    public void setTextColor(int i10) {
        this.f23711p = i10;
        this.f23715t.setTextColor(i10);
    }

    public void setTextFont(String str) {
        this.f23714s = str;
        this.f23715t.setTypeface(Typeface.createFromFile(str));
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView
    protected void u(boolean z10) {
        super.u(z10);
    }

    public StickerTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23713r = "Text here";
    }
}
