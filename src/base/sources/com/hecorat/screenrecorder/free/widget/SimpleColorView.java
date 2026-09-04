package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class SimpleColorView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f23703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Canvas f23704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f23705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f23706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f23707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f23708f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(int i10);

        void b(int i10);
    }

    public SimpleColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23707e == null) {
            this.f23707e = new Paint();
        }
        canvas.drawBitmap(this.f23703a, 0.0f, 0.0f, this.f23707e);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        Bitmap bitmap = this.f23703a;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f23703a.recycle();
        }
        this.f23703a = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.f23704b = new Canvas(this.f23703a);
        if (this.f23705c == null) {
            this.f23705c = new Paint();
        }
        int[] iArr = new int[12];
        float[] fArr = new float[12];
        for (int i14 = 1; i14 < 11; i14++) {
            iArr[i14] = Color.HSVToColor(new float[]{((i14 - 1) * 360) / 9, 1.0f, 1.0f});
            fArr[i14] = i14 / 11;
        }
        iArr[0] = -1;
        fArr[0] = 0.0f;
        iArr[11] = -16777216;
        fArr[11] = 1.0f;
        this.f23705c.setShader(new LinearGradient(0.0f, 0.0f, i10, 0.0f, iArr, fArr, Shader.TileMode.CLAMP));
        int i15 = i10 / 24;
        int i16 = (i10 * 23) / 24;
        Rect rect = new Rect(i15, 0, i16, i11);
        this.f23706d = rect;
        this.f23704b.drawRect(rect, this.f23705c);
        this.f23705c.setShader(null);
        this.f23706d = new Rect(0, 0, i15, i11);
        this.f23705c.setColor(-1);
        this.f23704b.drawRect(this.f23706d, this.f23705c);
        this.f23706d = new Rect(i16, 0, i10, i11);
        this.f23705c.setColor(-16777216);
        this.f23704b.drawRect(this.f23706d, this.f23705c);
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (x10 < 0) {
            x10 = 0;
        }
        if (x10 >= this.f23703a.getWidth()) {
            x10 = this.f23703a.getWidth() - 1;
        }
        if (y10 < 0) {
            y10 = 0;
        }
        if (y10 >= this.f23703a.getHeight()) {
            y10 = this.f23703a.getHeight() - 1;
        }
        int pixel = this.f23703a.getPixel(x10, y10);
        a aVar = this.f23708f;
        if (aVar != null) {
            aVar.b(pixel);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f23708f.a(pixel);
            }
        }
        return true;
    }

    public void setOnColorPickListener(a aVar) {
        this.f23708f = aVar;
    }

    public SimpleColorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
