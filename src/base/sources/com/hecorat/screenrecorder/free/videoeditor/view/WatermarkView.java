package com.hecorat.screenrecorder.free.videoeditor.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/view/WatermarkView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "Lfl/g0;", "onDraw", "(Landroid/graphics/Canvas;)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/text/TextPaint;", "a", "Landroid/text/TextPaint;", "textPaint", "Landroid/graphics/Rect;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/graphics/Rect;", "bounds", "", "c", "Ljava/lang/String;", "text", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "shadowDx", "e", "shadowDy", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WatermarkView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TextPaint textPaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Rect bounds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int shadowDx;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int shadowDy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatermarkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.h(context, "context");
        this.textPaint = new TextPaint(1);
        this.bounds = new Rect();
        String string = getResources().getString(R.string.az_recorder);
        s.g(string, "getString(...)");
        this.text = string;
        this.shadowDx = getResources().getDimensionPixelSize(R.dimen.watermark_shadow_dx);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.watermark_shadow_dy);
        this.shadowDy = dimensionPixelSize;
        this.textPaint.density = getResources().getDisplayMetrics().density;
        this.textPaint.setTextSize(getResources().getDimensionPixelSize(R.dimen.watermark_text_size));
        this.textPaint.setColor(-1);
        this.textPaint.setShadowLayer(1.0f, this.shadowDx, dimensionPixelSize, -16777216);
        TextPaint textPaint = this.textPaint;
        String str = this.text;
        textPaint.getTextBounds(str, 0, str.length(), this.bounds);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.h(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawText(this.text, 0.0f, this.bounds.height(), this.textPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.bounds.width() + this.shadowDx, this.bounds.height() + this.shadowDy);
    }
}
