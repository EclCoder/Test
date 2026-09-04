package qc;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.w;
import com.google.android.material.internal.z;
import jc.d;
import mc.g;
import mc.h;
import mc.i;
import sb.c;
import sb.e;
import sb.l;
import sb.m;
import tb.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class a extends i implements w.b {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f50611b0 = l.f51858b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f50612c0 = c.f51645y0;
    private CharSequence J;
    private final Context K;
    private final Paint.FontMetrics L;
    private final w M;
    private final View.OnLayoutChangeListener N;
    private final Rect O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private int U;
    private int V;
    private float W;
    private float X;
    private float Y;
    private float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f50613a0;

    /* JADX INFO: renamed from: qc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class ViewOnLayoutChangeListenerC0780a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0780a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a.this.X0(view);
        }
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.L = new Paint.FontMetrics();
        w wVar = new w(this);
        this.M = wVar;
        this.N = new ViewOnLayoutChangeListenerC0780a();
        this.O = new Rect();
        this.W = 1.0f;
        this.X = 1.0f;
        this.Y = 0.5f;
        this.Z = 0.5f;
        this.f50613a0 = 1.0f;
        this.K = context;
        wVar.g().density = context.getResources().getDisplayMetrics().density;
        wVar.g().setTextAlign(Paint.Align.CENTER);
    }

    private float J0() {
        int i10;
        if (((this.O.right - getBounds().right) - this.V) - this.S < 0) {
            i10 = ((this.O.right - getBounds().right) - this.V) - this.S;
        } else {
            if (((this.O.left - getBounds().left) - this.V) + this.S <= 0) {
                return 0.0f;
            }
            i10 = ((this.O.left - getBounds().left) - this.V) + this.S;
        }
        return i10;
    }

    private float K0() {
        this.M.g().getFontMetrics(this.L);
        Paint.FontMetrics fontMetrics = this.L;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float L0(Rect rect) {
        return rect.centerY() - K0();
    }

    public static a M0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.R0(attributeSet, i10, i11);
        return aVar;
    }

    private g N0() {
        float f10 = -J0();
        float fWidth = (float) ((((double) getBounds().width()) - (((double) this.U) * Math.sqrt(2.0d))) / 2.0d);
        return new mc.l(new h(this.U), Math.min(Math.max(f10, -fWidth), fWidth));
    }

    private void P0(Canvas canvas) {
        if (this.J == null) {
            return;
        }
        Rect bounds = getBounds();
        int iL0 = (int) L0(bounds);
        if (this.M.e() != null) {
            this.M.g().drawableState = getState();
            this.M.n(this.K);
            this.M.g().setAlpha((int) (this.f50613a0 * 255.0f));
        }
        CharSequence charSequence = this.J;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), iL0, this.M.g());
    }

    private float Q0() {
        CharSequence charSequence = this.J;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.M.h(charSequence.toString());
    }

    private void R0(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = z.i(this.K, attributeSet, m.Ud, i10, i11, new int[0]);
        this.U = this.K.getResources().getDimensionPixelSize(e.f51717r1);
        boolean z10 = typedArrayI.getBoolean(m.f51946de, true);
        this.T = z10;
        if (z10) {
            setShapeAppearanceModel(M().F().s(N0()).m());
        } else {
            this.U = 0;
        }
        V0(typedArrayI.getText(m.f51914be));
        d dVarH = jc.c.h(this.K, typedArrayI, m.Vd);
        if (dVarH != null) {
            int i12 = m.Wd;
            if (typedArrayI.hasValue(i12)) {
                dVarH.p(jc.c.a(this.K, typedArrayI, i12));
            }
        }
        W0(dVarH);
        l0(ColorStateList.valueOf(typedArrayI.getColor(m.f51930ce, ac.a.i(e0.a.k(ac.a.c(this.K, R.attr.colorBackground, a.class.getCanonicalName()), 229), e0.a.k(ac.a.c(this.K, c.f51612i, a.class.getCanonicalName()), 153)))));
        y0(ColorStateList.valueOf(ac.a.c(this.K, c.f51620m, a.class.getCanonicalName())));
        this.P = typedArrayI.getDimensionPixelSize(m.Xd, 0);
        this.Q = typedArrayI.getDimensionPixelSize(m.Zd, 0);
        this.R = typedArrayI.getDimensionPixelSize(m.f51898ae, 0);
        this.S = typedArrayI.getDimensionPixelSize(m.Yd, 0);
        typedArrayI.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.V = iArr[0];
        view.getWindowVisibleDisplayFrame(this.O);
    }

    public void O0(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.N);
    }

    public void S0(float f10, float f11) {
        this.Y = f10;
        this.Z = f11;
        invalidateSelf();
    }

    public void T0(View view) {
        if (view == null) {
            return;
        }
        X0(view);
        view.addOnLayoutChangeListener(this.N);
    }

    public void U0(float f10) {
        this.W = f10;
        this.X = f10;
        this.f50613a0 = b.b(0.0f, 1.0f, 0.19f, 1.0f, f10);
        invalidateSelf();
    }

    public void V0(CharSequence charSequence) {
        if (TextUtils.equals(this.J, charSequence)) {
            return;
        }
        this.J = charSequence;
        this.M.m(true);
        invalidateSelf();
    }

    public void W0(d dVar) {
        this.M.k(dVar, this.K);
    }

    @Override // com.google.android.material.internal.w.b
    public void a() {
        invalidateSelf();
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float fJ0 = J0();
        float f10 = (float) (-((((double) this.U) * Math.sqrt(2.0d)) - ((double) this.U)));
        canvas.scale(this.W, this.X, getBounds().left + (getBounds().width() * this.Y), getBounds().top + (getBounds().height() * this.Z));
        canvas.translate(fJ0, f10);
        super.draw(canvas);
        P0(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.M.g().getTextSize(), this.R);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.P * 2) + Q0(), this.Q);
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.T) {
            setShapeAppearanceModel(M().F().s(N0()).m());
        }
    }

    @Override // mc.i, android.graphics.drawable.Drawable, com.google.android.material.internal.w.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
