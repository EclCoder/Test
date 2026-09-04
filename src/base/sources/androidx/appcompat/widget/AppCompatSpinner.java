package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f1289i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.widget.e f1290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b0 f1292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f1293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f1295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f1297h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class a extends b0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f1298j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f1298j = fVar;
        }

        @Override // androidx.appcompat.widget.b0
        public m.e b() {
            return this.f1298j;
        }

        @Override // androidx.appcompat.widget.b0
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().a()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().a()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (m0.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class d implements h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.c f1301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f1302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f1303c;

        d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public boolean a() {
            androidx.appcompat.app.c cVar = this.f1301a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1301a;
            if (cVar != null) {
                cVar.dismiss();
                this.f1301a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public CharSequence f() {
            return this.f1303c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void h(CharSequence charSequence) {
            this.f1303c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void k(int i10, int i11) {
            if (this.f1302b == null) {
                return;
            }
            androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f1303c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.c cVarCreate = aVar.k(this.f1302b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f1301a = cVarCreate;
            ListView listViewT = cVarCreate.t();
            listViewT.setTextDirection(i10);
            listViewT.setTextAlignment(i11);
            this.f1301a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void m(ListAdapter listAdapter) {
            this.f1302b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f1302b.getItemId(i10));
            }
            dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f1305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f1306b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1305a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1306b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1306b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1305a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1305a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1305a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1305a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1305a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1306b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1305a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1305a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class f extends ListPopupWindow implements h {
        private CharSequence I;
        ListAdapter J;
        private final Rect K;
        private int L;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f1307a;

            a(AppCompatSpinner appCompatSpinner) {
                this.f1307a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    AppCompatSpinner.this.performItemClick(view, i10, fVar.J.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.U(AppCompatSpinner.this)) {
                    f.this.dismiss();
                } else {
                    f.this.S();
                    f.super.show();
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1310a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1310a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1310a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.K = new Rect();
            C(AppCompatSpinner.this);
            I(true);
            O(0);
            K(new a(AppCompatSpinner.this));
        }

        void S() {
            int i10;
            Drawable drawableG = g();
            if (drawableG != null) {
                drawableG.getPadding(AppCompatSpinner.this.f1297h);
                i10 = z0.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f1297h.right : -AppCompatSpinner.this.f1297h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f1297h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f1296g;
            if (i11 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.J, g());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1297h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                E(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                E((width - paddingLeft) - paddingRight);
            } else {
                E(i11);
            }
            e(z0.b(AppCompatSpinner.this) ? i10 + (((width - paddingRight) - y()) - T()) : i10 + paddingLeft + T());
        }

        public int T() {
            return this.L;
        }

        boolean U(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.K);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public CharSequence f() {
            return this.I;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void h(CharSequence charSequence) {
            this.I = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void j(int i10) {
            this.L = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void k(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            S();
            H(2);
            super.show();
            ListView listViewO = o();
            listViewO.setChoiceMode(1);
            listViewO.setTextDirection(i10);
            listViewO.setTextAlignment(i11);
            P(AppCompatSpinner.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            J(new c(bVar));
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.h
        public void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.J = listAdapter;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1312a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1312a ? (byte) 1 : (byte) 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f1312a = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    interface h {
        boolean a();

        void b(Drawable drawable);

        int c();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i10);

        void j(int i10);

        void k(int i10, int i11);

        int l();

        void m(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.K);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f1297h);
        Rect rect = this.f1297h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f1295f.k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1290a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f1295f;
        return hVar != null ? hVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f1295f;
        return hVar != null ? hVar.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1295f != null ? this.f1296g : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f1295f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f1295f;
        return hVar != null ? hVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1291b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f1295f;
        return hVar != null ? hVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1290a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1290a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f1295f;
        if (hVar == null || !hVar.a()) {
            return;
        }
        this.f1295f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1295f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f1312a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f1295f;
        gVar.f1312a = hVar != null && hVar.a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b0 b0Var = this.f1292c;
        if (b0Var == null || !b0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f1295f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1290a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1290a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f1295f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            hVar.j(i10);
            this.f1295f.e(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f1295f;
        if (hVar != null) {
            hVar.i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1295f != null) {
            this.f1296g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f1295f;
        if (hVar != null) {
            hVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(i.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f1295f;
        if (hVar != null) {
            hVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1290a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1290a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1294e) {
            this.f1293d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1295f != null) {
            Context context = this.f1291b;
            if (context == null) {
                context = getContext();
            }
            this.f1295f.m(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrQ;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f1297h = new Rect();
        k0.a(this, getContext());
        o0 o0VarV = o0.v(context, attributeSet, h.j.H2, i10, 0);
        this.f1290a = new androidx.appcompat.widget.e(this);
        if (theme != null) {
            this.f1291b = new androidx.appcompat.view.d(context, theme);
        } else {
            int iN = o0VarV.n(h.j.M2, 0);
            if (iN != 0) {
                this.f1291b = new androidx.appcompat.view.d(context, iN);
            } else {
                this.f1291b = context;
            }
        }
        ?? r11 = -1;
        ?? r10 = 0;
        try {
            if (i11 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1289i, i10, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r11 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r11 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        Log.i("AppCompatSpinner", dOIDCKnIR.jboV, e);
                        r11 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i11 != 0) {
                            d dVar = new d();
                            this.f1295f = dVar;
                            dVar.h(o0VarV.o(h.j.K2));
                        } else if (i11 == 1) {
                            f fVar = new f(this.f1291b, attributeSet, i10);
                            o0 o0VarV2 = o0.v(this.f1291b, attributeSet, h.j.H2, i10, 0);
                            this.f1296g = o0VarV2.m(h.j.L2, -2);
                            fVar.b(o0VarV2.g(h.j.J2));
                            fVar.h(o0VarV.o(h.j.K2));
                            o0VarV2.x();
                            this.f1295f = fVar;
                            this.f1292c = new a(this, fVar);
                        }
                        charSequenceArrQ = o0VarV.q(h.j.I2);
                        if (charSequenceArrQ != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                            arrayAdapter.setDropDownViewResource(h.g.f39969v);
                            setAdapter(arrayAdapter);
                        }
                        o0VarV.x();
                        this.f1294e = true;
                        spinnerAdapter = this.f1293d;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f1293d = null;
                        }
                        this.f1290a.e(attributeSet, i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r10 != 0) {
                        r10.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i11 != 0) {
                d dVar2 = new d();
                this.f1295f = dVar2;
                dVar2.h(o0VarV.o(h.j.K2));
            } else if (i11 == 1) {
                f fVar2 = new f(this.f1291b, attributeSet, i10);
                o0 o0VarV3 = o0.v(this.f1291b, attributeSet, h.j.H2, i10, 0);
                this.f1296g = o0VarV3.m(h.j.L2, -2);
                fVar2.b(o0VarV3.g(h.j.J2));
                fVar2.h(o0VarV.o(h.j.K2));
                o0VarV3.x();
                this.f1295f = fVar2;
                this.f1292c = new a(this, fVar2);
            }
            charSequenceArrQ = o0VarV.q(h.j.I2);
            if (charSequenceArrQ != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                arrayAdapter2.setDropDownViewResource(h.g.f39969v);
                setAdapter(arrayAdapter2);
            }
            o0VarV.x();
            this.f1294e = true;
            spinnerAdapter = this.f1293d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f1293d = null;
            }
            this.f1290a.e(attributeSet, i10);
        } catch (Throwable th3) {
            th = th3;
            r10 = r11;
        }
    }
}
