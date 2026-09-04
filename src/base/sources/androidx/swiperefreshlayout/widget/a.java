package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class a extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animation.AnimationListener f7291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7292b;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class C0091a extends OvalShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RadialGradient f7293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Paint f7294b = new Paint();

        C0091a(int i10) {
            a.this.f7292b = i10;
            b((int) rect().width());
        }

        private void b(int i10) {
            float f10 = i10 / 2;
            RadialGradient radialGradient = new RadialGradient(f10, f10, a.this.f7292b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f7293a = radialGradient;
            this.f7294b.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = a.this.getWidth() / 2;
            float f10 = width;
            float height = a.this.getHeight() / 2;
            canvas.drawCircle(f10, height, f10, this.f7294b);
            canvas.drawCircle(f10, height, width - a.this.f7292b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            b((int) f10);
        }
    }

    a(Context context, int i10) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i11 = (int) (1.75f * f10);
        int i12 = (int) (0.0f * f10);
        this.f7292b = (int) (3.5f * f10);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            q0.s0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0091a(this.f7292b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f7292b, i12, i11, 503316480);
            int i13 = this.f7292b;
            setPadding(i13, i13, i13, i13);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i10);
        q0.p0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f7291a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f7291a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f7291a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f7292b * 2), getMeasuredHeight() + (this.f7292b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
        }
    }
}
