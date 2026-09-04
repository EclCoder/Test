package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RadioButton f979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CheckBox f981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f987k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LayoutInflater f992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f993q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.E);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f985i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(h.g.f39957j, (ViewGroup) this, false);
        this.f981e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(h.g.f39958k, (ViewGroup) this, false);
        this.f978b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(h.g.f39960m, (ViewGroup) this, false);
        this.f979c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f992p == null) {
            this.f992p = LayoutInflater.from(getContext());
        }
        return this.f992p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f983g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f984h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f984h.getLayoutParams();
        rect.top += this.f984h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f977a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f977a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f977a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f982f.setText(this.f977a.h());
        }
        if (this.f982f.getVisibility() != i10) {
            this.f982f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f986j);
        TextView textView = (TextView) findViewById(h.f.S);
        this.f980d = textView;
        int i10 = this.f987k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f988l, i10);
        }
        this.f982f = (TextView) findViewById(h.f.L);
        ImageView imageView = (ImageView) findViewById(h.f.O);
        this.f983g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f990n);
        }
        this.f984h = (ImageView) findViewById(h.f.f39942u);
        this.f985i = (LinearLayout) findViewById(h.f.f39934m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f978b != null && this.f989m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f978b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f979c == null && this.f981e == null) {
            return;
        }
        if (this.f977a.m()) {
            if (this.f979c == null) {
                g();
            }
            compoundButton = this.f979c;
            view = this.f981e;
        } else {
            if (this.f981e == null) {
                e();
            }
            compoundButton = this.f981e;
            view = this.f979c;
        }
        if (z10) {
            compoundButton.setChecked(this.f977a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f981e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f979c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f977a.m()) {
            if (this.f979c == null) {
                g();
            }
            compoundButton = this.f979c;
        } else {
            if (this.f981e == null) {
                e();
            }
            compoundButton = this.f981e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f993q = z10;
        this.f989m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f984h;
        if (imageView != null) {
            imageView.setVisibility((this.f991o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f977a.z() || this.f993q;
        if (z10 || this.f989m) {
            ImageView imageView = this.f978b;
            if (imageView == null && drawable == null && !this.f989m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f989m) {
                this.f978b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f978b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f978b.getVisibility() != 0) {
                this.f978b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f980d.getVisibility() != 8) {
                this.f980d.setVisibility(8);
            }
        } else {
            this.f980d.setText(charSequence);
            if (this.f980d.getVisibility() != 0) {
                this.f980d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        o0 o0VarV = o0.v(getContext(), attributeSet, h.j.f40016d2, i10, 0);
        this.f986j = o0VarV.g(h.j.f40028f2);
        this.f987k = o0VarV.n(h.j.f40022e2, -1);
        this.f989m = o0VarV.a(h.j.f40034g2, false);
        this.f988l = context;
        this.f990n = o0VarV.g(h.j.f40040h2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, h.a.A, 0);
        this.f991o = typedArrayObtainStyledAttributes.hasValue(0);
        o0VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
