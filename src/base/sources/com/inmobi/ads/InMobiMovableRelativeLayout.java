package com.inmobi.ads;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.media.C3451y9;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/inmobi/ads/InMobiMovableRelativeLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/ViewGroup;", "parentView", "Lfl/g0;", "setParentView", "(Landroid/view/ViewGroup;)V", "", "isMovable", "setIsMovable", "(Z)V", "resetPosition", "()V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Companion", "com/inmobi/media/y9", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiMovableRelativeLayout extends RelativeLayout {
    public static final C3451y9 Companion = new C3451y9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f24391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup.LayoutParams f24392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24395e;

    public InMobiMovableRelativeLayout(Context context) {
        super(context);
        this.f24391a = new WeakReference(null);
        this.f24393c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    private final void setParentView(ViewGroup parentView) {
        this.f24391a = new WeakReference(parentView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        s.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        setParentView((ViewGroup) parent);
        if (this.f24392b == null) {
            this.f24392b = getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setParentView(null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        ViewGroup viewGroup;
        s.h(ev, "ev");
        if (this.f24393c) {
            float rawX = ev.getRawX();
            float rawY = ev.getRawY();
            int action = ev.getAction();
            if (action == 0) {
                this.f24394d = rawX;
                this.f24395e = rawY;
            } else if (action == 2 && (viewGroup = (ViewGroup) this.f24391a.get()) != null) {
                float f10 = rawX - this.f24394d;
                float f11 = rawY - this.f24395e;
                int left = (int) (getLeft() + f10);
                int top = (int) (getTop() + f11);
                int paddingLeft = viewGroup.getPaddingLeft();
                int paddingTop = viewGroup.getPaddingTop();
                int width = viewGroup.getWidth() - viewGroup.getPaddingRight();
                int height = viewGroup.getHeight() - viewGroup.getPaddingBottom();
                int iMax = Math.max(paddingLeft, Math.min(left, width - getWidth()));
                int iMax2 = Math.max(paddingTop, Math.min(top, height - getHeight()));
                layout(iMax, iMax2, getWidth() + iMax, getHeight() + iMax2);
                this.f24394d = rawX;
                this.f24395e = rawY;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void resetPosition() {
        setLayoutParams(this.f24392b);
    }

    public final void setIsMovable(boolean isMovable) {
        this.f24393c = isMovable;
    }

    public InMobiMovableRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24391a = new WeakReference(null);
        this.f24393c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public InMobiMovableRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f24391a = new WeakReference(null);
        this.f24393c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }
}
