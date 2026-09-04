package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f2483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f2484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f2485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f2488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f2489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2493k;

    public MockView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2483a = new Paint();
        this.f2484b = new Paint();
        this.f2485c = new Paint();
        this.f2486d = true;
        this.f2487e = true;
        this.f2488f = null;
        this.f2489g = new Rect();
        this.f2490h = Color.argb(255, 0, 0, 0);
        this.f2491i = Color.argb(255, 200, 200, 200);
        this.f2492j = Color.argb(255, 50, 50, 50);
        this.f2493k = 4;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.M8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.O8) {
                    this.f2488f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == f.R8) {
                    this.f2486d = typedArrayObtainStyledAttributes.getBoolean(index, this.f2486d);
                } else if (index == f.N8) {
                    this.f2490h = typedArrayObtainStyledAttributes.getColor(index, this.f2490h);
                } else if (index == f.P8) {
                    this.f2492j = typedArrayObtainStyledAttributes.getColor(index, this.f2492j);
                } else if (index == f.Q8) {
                    this.f2491i = typedArrayObtainStyledAttributes.getColor(index, this.f2491i);
                } else if (index == f.S8) {
                    this.f2487e = typedArrayObtainStyledAttributes.getBoolean(index, this.f2487e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f2488f == null) {
            try {
                this.f2488f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f2483a.setColor(this.f2490h);
        this.f2483a.setAntiAlias(true);
        this.f2484b.setColor(this.f2491i);
        this.f2484b.setAntiAlias(true);
        this.f2485c.setColor(this.f2492j);
        this.f2493k = Math.round(this.f2493k * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2486d) {
            width--;
            height--;
            float f10 = width;
            float f11 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f10, f11, this.f2483a);
            canvas2.drawLine(0.0f, f11, f10, 0.0f, this.f2483a);
            canvas2.drawLine(0.0f, 0.0f, f10, 0.0f, this.f2483a);
            canvas2.drawLine(f10, 0.0f, f10, f11, this.f2483a);
            canvas2.drawLine(f10, f11, 0.0f, f11, this.f2483a);
            canvas2.drawLine(0.0f, f11, 0.0f, 0.0f, this.f2483a);
        } else {
            canvas2 = canvas;
        }
        String str = this.f2488f;
        if (str == null || !this.f2487e) {
            return;
        }
        this.f2484b.getTextBounds(str, 0, str.length(), this.f2489g);
        float fWidth = (width - this.f2489g.width()) / 2.0f;
        float fHeight = ((height - this.f2489g.height()) / 2.0f) + this.f2489g.height();
        this.f2489g.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f2489g;
        int i10 = rect.left;
        int i11 = this.f2493k;
        rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
        canvas2.drawRect(this.f2489g, this.f2485c);
        canvas2.drawText(this.f2488f, fWidth, fHeight, this.f2484b);
    }
}
