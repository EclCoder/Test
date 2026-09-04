package com.hecorat.screenrecorder.free.helpers.zoom;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ImageViewTouch extends ImageViewTouchBase {
    private float E;
    protected ScaleGestureDetector F;
    protected GestureDetector G;
    protected int H;
    protected int I;
    protected GestureDetector.OnGestureListener J;
    protected ScaleGestureDetector.OnScaleGestureListener K;
    protected boolean L;
    protected boolean M;
    protected boolean N;
    private c O;
    long P;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            int i10 = ImageViewTouchBase.D;
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (imageViewTouch.L) {
                if (imageViewTouch.F.isQuickScaleEnabled()) {
                    return true;
                }
                ImageViewTouch imageViewTouch2 = ImageViewTouch.this;
                imageViewTouch2.f23020f = true;
                float scale = imageViewTouch2.getScale();
                ImageViewTouch imageViewTouch3 = ImageViewTouch.this;
                ImageViewTouch.this.Q(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(imageViewTouch3.V(scale, imageViewTouch3.getMaxScale(), ImageViewTouch.this.getMinScale()), ImageViewTouch.this.getMinScale())), motionEvent.getX(), motionEvent.getY(), ImageViewTouch.this.f23029o);
            }
            ImageViewTouch.T(ImageViewTouch.this);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            int i10 = ImageViewTouchBase.D;
            ImageViewTouch.this.L();
            return ImageViewTouch.this.W(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (!ImageViewTouch.this.N || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || ImageViewTouch.this.F.isInProgress()) {
                return false;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (jUptimeMillis - imageViewTouch.P > 150) {
                return imageViewTouch.X(motionEvent, motionEvent2, f10, f11);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (!ImageViewTouch.this.isLongClickable() || ImageViewTouch.this.F.isInProgress()) {
                return;
            }
            ImageViewTouch.this.setPressed(true);
            ImageViewTouch.this.performLongClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (ImageViewTouch.this.N && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.F.isInProgress()) {
                return ImageViewTouch.this.Y(motionEvent, motionEvent2, f10, f11);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.O != null) {
                ImageViewTouch.this.O.a();
            }
            return ImageViewTouch.this.Z(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return ImageViewTouch.this.a0(motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected boolean f23013a = false;

        public d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scale = ImageViewTouch.this.getScale() * scaleGestureDetector.getScaleFactor();
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (imageViewTouch.M) {
                boolean z10 = this.f23013a;
                if (z10 && currentSpan != 0.0f) {
                    imageViewTouch.f23020f = true;
                    ImageViewTouch.this.P(Math.min(imageViewTouch.getMaxScale(), Math.max(scale, ImageViewTouch.this.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    ImageViewTouch imageViewTouch2 = ImageViewTouch.this;
                    imageViewTouch2.I = 1;
                    imageViewTouch2.invalidate();
                    return true;
                }
                if (!z10) {
                    this.f23013a = true;
                }
            }
            return true;
        }
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = true;
        this.M = true;
        this.N = true;
    }

    static /* synthetic */ b T(ImageViewTouch imageViewTouch) {
        imageViewTouch.getClass();
        return null;
    }

    public boolean U() {
        if (getScale() > 1.0f) {
            return true;
        }
        return !this.f23037w.contains(getBitmapRect());
    }

    protected float V(float f10, float f11, float f12) {
        float f13 = this.E;
        return f10 + f13 <= f11 ? f10 + f13 : f12;
    }

    public boolean W(MotionEvent motionEvent) {
        return !getBitmapChanged();
    }

    public boolean X(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (!U()) {
            return false;
        }
        if (Math.abs(f10) <= this.f23030p * 4 && Math.abs(f11) <= this.f23030p * 4) {
            return false;
        }
        float fMin = Math.min(Math.max(2.0f, getScale() / 2.0f), 3.0f);
        float width = (f10 / this.f23031q) * getWidth() * fMin;
        float height = (f11 / this.f23031q) * getHeight() * fMin;
        this.f23020f = true;
        H(width, height, (long) Math.min(Math.max(300.0d, Math.sqrt(Math.pow(width, 2.0d) + Math.pow(height, 2.0d)) / 5.0d), 800.0d));
        postInvalidate();
        return true;
    }

    public boolean Y(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (!U()) {
            return false;
        }
        this.f23020f = true;
        G(-f10, -f11);
        invalidate();
        return true;
    }

    public boolean Z(MotionEvent motionEvent) {
        return true;
    }

    public boolean a0(MotionEvent motionEvent) {
        return !getBitmapChanged();
    }

    public boolean b0(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return false;
        }
        if (getScale() >= getMinScale()) {
            return true;
        }
        R(getMinScale(), 50L);
        return true;
    }

    public boolean getDoubleTapEnabled() {
        return this.L;
    }

    protected GestureDetector.OnGestureListener getGestureListener() {
        return new a();
    }

    public boolean getQuickScaleEnabled() {
        return this.F.isQuickScaleEnabled();
    }

    public float getScaleFactor() {
        return this.E;
    }

    protected ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return new d();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return false;
        }
        ImageView.ScaleType scaleType = getScaleType();
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType != scaleType2) {
            super.setScaleType(scaleType2);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6) {
            this.P = motionEvent.getEventTime();
        }
        this.F.onTouchEvent(motionEvent);
        if (!this.F.isInProgress()) {
            this.G.onTouchEvent(motionEvent);
        }
        if (actionMasked != 1) {
            return true;
        }
        return b0(motionEvent);
    }

    public void setDoubleTapEnabled(boolean z10) {
        this.L = z10;
    }

    public void setQuickScaleEnabled(boolean z10) {
        this.F.setQuickScaleEnabled(z10);
    }

    public void setScaleEnabled(boolean z10) {
        this.M = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.N = z10;
    }

    public void setSingleTapListener(c cVar) {
        this.O = cVar;
    }

    @Override // com.hecorat.screenrecorder.free.helpers.zoom.ImageViewTouchBase
    protected void w(Context context, AttributeSet attributeSet, int i10) {
        super.w(context, attributeSet, i10);
        this.H = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.J = getGestureListener();
        this.K = getScaleListener();
        this.F = new ScaleGestureDetector(getContext(), this.K);
        this.G = new GestureDetector(getContext(), this.J, null, true);
        this.I = 1;
        setQuickScaleEnabled(false);
    }

    @Override // com.hecorat.screenrecorder.free.helpers.zoom.ImageViewTouchBase
    protected void z(int i10, int i11, int i12, int i13) {
        super.z(i10, i11, i12, i13);
        this.E = ((getMaxScale() - getMinScale()) / 2.0f) + 0.5f;
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.L = true;
        this.M = true;
        this.N = true;
    }

    public void setDoubleTapListener(b bVar) {
    }
}
