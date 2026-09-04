package qb;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f50607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f50608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GestureDetector f50609e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f50605a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f50606b = new PointF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile float f50610f = 3.1415927f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f10) {
        this.f50607c = aVar;
        this.f50608d = f10;
        this.f50609e = new GestureDetector(context, this);
    }

    @Override // qb.d.a
    public void a(float[] fArr, float f10) {
        this.f50610f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f50605a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f50605a.x) / this.f50608d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f50605a;
        float f12 = (y10 - pointF.y) / this.f50608d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f50610f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f50606b;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = pointF2.y + (fSin * x10) + (fCos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f50607c.b(this.f50606b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f50607c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f50609e.onTouchEvent(motionEvent);
    }
}
