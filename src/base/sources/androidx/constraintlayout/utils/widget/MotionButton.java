package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f2494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Path f2496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ViewOutlineProvider f2497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    RectF f2498h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionButton.this.f2494d) / 2.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f2495e);
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2494d = 0.0f;
        this.f2495e = Float.NaN;
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f3109y5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.I5) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.J5) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f2495e;
    }

    public float getRoundPercent() {
        return this.f2494d;
    }

    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f2495e = f10;
            float f11 = this.f2494d;
            this.f2494d = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f2495e != f10;
        this.f2495e = f10;
        if (f10 != 0.0f) {
            if (this.f2496f == null) {
                this.f2496f = new Path();
            }
            if (this.f2498h == null) {
                this.f2498h = new RectF();
            }
            if (this.f2497g == null) {
                b bVar = new b();
                this.f2497g = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2498h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2496f.reset();
            Path path = this.f2496f;
            RectF rectF = this.f2498h;
            float f12 = this.f2495e;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10 = this.f2494d != f10;
        this.f2494d = f10;
        if (f10 != 0.0f) {
            if (this.f2496f == null) {
                this.f2496f = new Path();
            }
            if (this.f2498h == null) {
                this.f2498h = new RectF();
            }
            if (this.f2497g == null) {
                a aVar = new a();
                this.f2497g = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f2494d) / 2.0f;
            this.f2498h.set(0.0f, 0.0f, width, height);
            this.f2496f.reset();
            this.f2496f.addRoundRect(this.f2498h, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }
}
