package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.t0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g f962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    e.b f965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b0 f966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    b f967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f972r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a extends b0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.b0
        public m.e b() {
            b bVar = ActionMenuItemView.this.f967m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.b0
        protected boolean c() {
            m.e eVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f965k;
            return bVar != null && bVar.b(actionMenuItemView.f962h) && (eVarB = b()) != null && eVarB.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b {
        public abstract m.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void u() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f963i);
        if (this.f964j != null && (!this.f962h.B() || (!this.f968n && !this.f969o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f963i : null);
        CharSequence contentDescription = this.f962h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f962h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f962h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            t0.a(this, z12 ? null : this.f962h.getTitle());
        } else {
            t0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f962h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f962h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f966l == null) {
            this.f966l = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f962h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f965k;
        if (bVar != null) {
            bVar.b(this.f962h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f968n = t();
        u();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zS = s();
        if (zS && (i12 = this.f971q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f970p) : this.f970p;
        if (mode != 1073741824 && this.f970p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zS || this.f964j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f964j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b0 b0Var;
        if (this.f962h.hasSubMenu() && (b0Var = this.f966l) != null && b0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f969o != z10) {
            this.f969o = z10;
            g gVar = this.f962h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f964j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f972r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(e.b bVar) {
        this.f965k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f971q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f967m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f963i = charSequence;
        u();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f968n = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f40108v, i10, 0);
        this.f970p = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.f40113w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f972r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f971q = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
