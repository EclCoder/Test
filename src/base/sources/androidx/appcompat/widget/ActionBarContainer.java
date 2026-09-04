package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.api.client.googleapis.media.MediaHttpUploader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f1152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f1153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f1154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f1155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f1156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f1157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f1158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f1159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1160j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f39995a);
        this.f1155e = typedArrayObtainStyledAttributes.getDrawable(h.j.f40001b);
        this.f1156f = typedArrayObtainStyledAttributes.getDrawable(h.j.f40013d);
        this.f1160j = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.f40048j, -1);
        boolean z10 = true;
        if (getId() == h.f.N) {
            this.f1158h = true;
            this.f1157g = typedArrayObtainStyledAttributes.getDrawable(h.j.f40007c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1158h ? this.f1155e != null || this.f1156f != null : this.f1157g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1155e;
        if (drawable != null && drawable.isStateful()) {
            this.f1155e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1156f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1156f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1157g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1157g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1152b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1155e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1156f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1157g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1153c = findViewById(h.f.f39922a);
        this.f1154d = findViewById(h.f.f39927f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1151a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f1152b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f1158h) {
            Drawable drawable2 = this.f1157g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f1155e != null) {
                if (this.f1153c.getVisibility() == 0) {
                    this.f1155e.setBounds(this.f1153c.getLeft(), this.f1153c.getTop(), this.f1153c.getRight(), this.f1153c.getBottom());
                } else {
                    View view2 = this.f1154d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1155e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1155e.setBounds(this.f1154d.getLeft(), this.f1154d.getTop(), this.f1154d.getRight(), this.f1154d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f1159i = z13;
            if (!z13 || (drawable = this.f1156f) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f1153c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f1160j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f1153c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f1152b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f1153c)) {
            iA = !b(this.f1154d) ? a(this.f1154d) : 0;
        } else {
            iA = a(this.f1153c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f1152b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1155e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1155e);
        }
        this.f1155e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1153c;
            if (view != null) {
                this.f1155e.setBounds(view.getLeft(), this.f1153c.getTop(), this.f1153c.getRight(), this.f1153c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1158h ? !(this.f1155e != null || this.f1156f != null) : this.f1157g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1157g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1157g);
        }
        this.f1157g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1158h && (drawable2 = this.f1157g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1158h ? !(this.f1155e != null || this.f1156f != null) : this.f1157g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1156f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1156f);
        }
        this.f1156f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1159i && (drawable2 = this.f1156f) != null) {
                drawable2.setBounds(this.f1152b.getLeft(), this.f1152b.getTop(), this.f1152b.getRight(), this.f1152b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1158h ? !(this.f1155e != null || this.f1156f != null) : this.f1157g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(i0 i0Var) {
        View view = this.f1152b;
        if (view != null) {
            removeView(view);
        }
        this.f1152b = i0Var;
    }

    public void setTransitioning(boolean z10) {
        this.f1151a = z10;
        setDescendantFocusability(z10 ? 393216 : MediaHttpUploader.MINIMUM_CHUNK_SIZE);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1155e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1156f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1157g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f1155e && !this.f1158h) {
            return true;
        }
        if (drawable == this.f1156f && this.f1159i) {
            return true;
        }
        return (drawable == this.f1157g && this.f1158h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
