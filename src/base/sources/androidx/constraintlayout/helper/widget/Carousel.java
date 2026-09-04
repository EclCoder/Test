package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.widget.f;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {
    private int A;
    private float B;
    private int C;
    private int D;
    int E;
    Runnable F;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f1982n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1983o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1984p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MotionLayout f1985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1988t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1989u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1990v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f1992x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1993y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1994z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.f1985q.setProgress(0.0f);
            Carousel.this.K();
            Carousel.I(Carousel.this);
            int unused = Carousel.this.f1984p;
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    public Carousel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1982n = new ArrayList();
        this.f1983o = 0;
        this.f1984p = 0;
        this.f1986r = -1;
        this.f1987s = false;
        this.f1988t = -1;
        this.f1989u = -1;
        this.f1990v = -1;
        this.f1991w = -1;
        this.f1992x = 0.9f;
        this.f1993y = 0;
        this.f1994z = 4;
        this.A = 1;
        this.B = 2.0f;
        this.C = -1;
        this.D = 200;
        this.E = -1;
        this.F = new a();
        J(context, attributeSet);
    }

    static /* synthetic */ b I(Carousel carousel) {
        carousel.getClass();
        return null;
    }

    private void J(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f2791a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f2830d) {
                    this.f1986r = typedArrayObtainStyledAttributes.getResourceId(index, this.f1986r);
                } else if (index == f.f2804b) {
                    this.f1988t = typedArrayObtainStyledAttributes.getResourceId(index, this.f1988t);
                } else if (index == f.f2843e) {
                    this.f1989u = typedArrayObtainStyledAttributes.getResourceId(index, this.f1989u);
                } else if (index == f.f2817c) {
                    this.f1994z = typedArrayObtainStyledAttributes.getInt(index, this.f1994z);
                } else if (index == f.f2882h) {
                    this.f1990v = typedArrayObtainStyledAttributes.getResourceId(index, this.f1990v);
                } else if (index == f.f2869g) {
                    this.f1991w = typedArrayObtainStyledAttributes.getResourceId(index, this.f1991w);
                } else if (index == f.f2908j) {
                    this.f1992x = typedArrayObtainStyledAttributes.getFloat(index, this.f1992x);
                } else if (index == f.f2895i) {
                    this.A = typedArrayObtainStyledAttributes.getInt(index, this.A);
                } else if (index == f.f2921k) {
                    this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
                } else if (index == f.f2856f) {
                    this.f1987s = typedArrayObtainStyledAttributes.getBoolean(index, this.f1987s);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.i
    public void a(MotionLayout motionLayout, int i10, int i11, float f10) {
        this.E = i10;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.i
    public void b(MotionLayout motionLayout, int i10) {
        int i11 = this.f1984p;
        this.f1983o = i11;
        if (i10 == this.f1991w) {
            this.f1984p = i11 + 1;
        } else if (i10 == this.f1990v) {
            this.f1984p = i11 - 1;
        }
        if (!this.f1987s) {
            throw null;
        }
        throw null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.f1984p;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            this.f1982n.clear();
            for (int i10 = 0; i10 < this.f2540b; i10++) {
                int i11 = this.f2539a[i10];
                View viewQ = motionLayout.q(i11);
                if (this.f1986r == i11) {
                    this.f1993y = i10;
                }
                this.f1982n.add(viewQ);
            }
            this.f1985q = motionLayout;
            if (this.A == 2) {
                p.b bVarR0 = motionLayout.r0(this.f1989u);
                if (bVarR0 != null) {
                    bVarR0.G(5);
                }
                p.b bVarR1 = this.f1985q.r0(this.f1988t);
                if (bVarR1 != null) {
                    bVarR1.G(5);
                }
            }
            K();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1982n.clear();
    }

    public void setInfinite(boolean z10) {
        this.f1987s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
    }

    public void setAdapter(b bVar) {
    }
}
