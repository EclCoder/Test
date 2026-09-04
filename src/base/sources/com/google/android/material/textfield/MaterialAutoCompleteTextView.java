package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ListPopupWindow f21296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AccessibilityManager f21297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f21298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f21299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f21301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f21302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f21304m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            Object objU = i10 < 0 ? materialAutoCompleteTextView.f21296e.u() : materialAutoCompleteTextView.getAdapter().getItem(i10);
            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = MaterialAutoCompleteTextView.this;
            materialAutoCompleteTextView2.setText(materialAutoCompleteTextView2.convertSelectionToString(objU), false);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = MaterialAutoCompleteTextView.this.f21296e.x();
                    i10 = MaterialAutoCompleteTextView.this.f21296e.w();
                    j10 = MaterialAutoCompleteTextView.this.f21296e.v();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f21296e.o(), view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.f21296e.dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends ArrayAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ColorStateList f21306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ColorStateList f21307b;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = MaterialAutoCompleteTextView.this.f21304m.getColorForState(iArr2, 0);
            int colorForState2 = MaterialAutoCompleteTextView.this.f21304m.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{ac.a.i(MaterialAutoCompleteTextView.this.f21303l, colorForState), ac.a.i(MaterialAutoCompleteTextView.this.f21303l, colorForState2), MaterialAutoCompleteTextView.this.f21303l});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f21303l);
            if (this.f21307b == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.f21306a);
            RippleDrawable rippleDrawable = new RippleDrawable(this.f21307b, colorDrawable, null);
            FocusRingDrawable focusRingDrawableW = FocusRingDrawable.w(getContext(), rippleDrawable);
            if (focusRingDrawableW != null) {
                focusRingDrawableW.F(MaterialAutoCompleteTextView.this.f21298g);
            }
            return rippleDrawable;
        }

        private boolean c() {
            return MaterialAutoCompleteTextView.this.f21303l != 0;
        }

        private boolean d() {
            return MaterialAutoCompleteTextView.this.f21304m != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f21304m.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f21307b = e();
            this.f21306a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.f39860m);
    }

    private TextInputLayout g() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean h() {
        return j() || i();
    }

    private boolean i() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f21297f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f21297f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean j() {
        AccessibilityManager accessibilityManager = this.f21297f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int k() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutG = g();
        int i10 = 0;
        if (adapter == null || textInputLayoutG == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f21296e.w()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutG);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableG = this.f21296e.g();
        if (drawableG != null) {
            drawableG.getPadding(this.f21299h);
            Rect rect = this.f21299h;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutG.getEndIconView().getMeasuredWidth();
    }

    private void l() {
        TextInputLayout textInputLayoutG = g();
        if (textInputLayoutG != null) {
            textInputLayoutG.s0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (h()) {
            this.f21296e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f21302k;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutG = g();
        return (textInputLayoutG == null || !textInputLayoutG.T()) ? super.getHint() : textInputLayoutG.getHint();
    }

    public float getPopupElevation() {
        return this.f21301j;
    }

    public int getSimpleItemSelectedColor() {
        return this.f21303l;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f21304m;
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean isPopupShowing() {
        ListPopupWindow listPopupWindow = this.f21296e;
        if (listPopupWindow == null || !listPopupWindow.a()) {
            return super.isPopupShowing();
        }
        return true;
    }

    boolean m(int i10) {
        boolean z10 = i10 == 66 || i10 == 23;
        boolean z11 = i10 == 62;
        if (getKeyListener() != null) {
            return z10 && getMaxLines() == 1;
        }
        return z10 || z11;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutG = g();
        if (textInputLayoutG != null && textInputLayoutG.T() && super.getHint() == null && com.google.android.material.internal.i.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21296e.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (!m(i10)) {
            return super.onKeyDown(i10, keyEvent);
        }
        TextInputLayout textInputLayoutG = g();
        if (textInputLayoutG == null) {
            return true;
        }
        textInputLayoutG.getEndIconView().performClick();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), k()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (h()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f21296e.m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f21296e;
        if (listPopupWindow != null) {
            listPopupWindow.b(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f21302k = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof mc.i) {
            ((mc.i) dropDownBackground).l0(this.f21302k);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f21296e.L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        l();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f21303l = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f21304m = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (h()) {
            this.f21296e.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(pc.a.d(context, attributeSet, i10, 0), attributeSet, i10);
        this.f21298g = new int[]{R.attr.state_selected};
        this.f21299h = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.z.i(context2, attributeSet, sb.m.N4, i10, h.i.f39994j, new int[0]);
        int i11 = sb.m.O4;
        if (typedArrayI.hasValue(i11) && typedArrayI.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f21300i = typedArrayI.getResourceId(sb.m.R4, sb.i.f51826y);
        this.f21301j = typedArrayI.getDimensionPixelOffset(sb.m.P4, sb.e.P0);
        int i12 = sb.m.Q4;
        if (typedArrayI.hasValue(i12)) {
            this.f21302k = ColorStateList.valueOf(typedArrayI.getColor(i12, 0));
        }
        this.f21303l = typedArrayI.getColor(sb.m.S4, 0);
        this.f21304m = jc.c.a(context2, typedArrayI, sb.m.T4);
        this.f21297f = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f21296e = listPopupWindow;
        listPopupWindow.I(true);
        listPopupWindow.C(this);
        listPopupWindow.H(2);
        listPopupWindow.m(getAdapter());
        listPopupWindow.K(new a());
        int i13 = sb.m.U4;
        if (typedArrayI.hasValue(i13)) {
            setSimpleItems(typedArrayI.getResourceId(i13, 0));
        }
        typedArrayI.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f21300i, strArr));
    }
}
