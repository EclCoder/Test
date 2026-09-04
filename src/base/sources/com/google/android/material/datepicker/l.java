package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.t0;
import androidx.fragment.app.Fragment;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.c0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n0.b0;
import n0.k1;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class l<S> extends androidx.fragment.app.m {
    static final Object C = "CONFIRM_BUTTON_TAG";
    static final Object D = "CANCEL_BUTTON_TAG";
    static final Object E = "TOGGLE_BUTTON_TAG";
    private CharSequence A;
    private CharSequence B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f19951a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f19952b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f19953c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f19954d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s f19956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.material.datepicker.a f19957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i f19958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f19960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f19964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f19966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f19968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19969s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f19970t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f19971u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f19972v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CheckableImageButton f19973w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private mc.i f19974x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Button f19975y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f19976z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f19978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f19980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f19981e;

        a(int i10, View view, int i11, int i12, int i13) {
            this.f19977a = i10;
            this.f19978b = view;
            this.f19979c = i11;
            this.f19980d = i12;
            this.f19981e = i13;
        }

        @Override // n0.b0
        public k1 a(View view, k1 k1Var) {
            e0.b bVarG = k1Var.g(k1.s.g());
            if (this.f19977a >= 0) {
                this.f19978b.getLayoutParams().height = this.f19977a + bVarG.f37001b;
                View view2 = this.f19978b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f19978b;
            view3.setPadding(this.f19979c + bVarG.f37000a, this.f19980d + bVarG.f37001b, this.f19981e + bVarG.f37002c, view3.getPaddingBottom());
            return k1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends r {
        b() {
        }
    }

    private static int A(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(sb.e.F0);
        int i10 = n.e().f19990d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(sb.e.H0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(sb.e.K0));
    }

    private int B(Context context) {
        int i10 = this.f19955e;
        if (i10 != 0) {
            return i10;
        }
        w();
        throw null;
    }

    private void C(Context context) {
        this.f19973w.setTag(E);
        this.f19973w.setImageDrawable(u(context));
        this.f19973w.setChecked(this.f19962l != 0);
        q0.m0(this.f19973w, null);
        K(this.f19973w);
        L(this.f19973w);
        this.f19973w.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.t(this.f19950a, view);
            }
        });
    }

    static boolean D(Context context) {
        return G(context, R.attr.windowFullscreen);
    }

    private boolean E() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean F(Context context) {
        return G(context, sb.c.f51601c0);
    }

    static boolean G(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(jc.b.j(context, sb.c.D, i.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.material.datepicker.s] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.google.android.material.datepicker.i] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.material.datepicker.m] */
    private void H() {
        ?? N;
        s sVar;
        int iB = B(requireContext());
        String str = this.f19962l == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        Fragment fragmentK0 = getChildFragmentManager().k0(str);
        if (fragmentK0 instanceof s) {
            sVar = (s) fragmentK0;
        } else {
            N = 0;
        }
        if (N == 0) {
            if (this.f19962l == 1) {
                N = sVar;
                w();
                N = m.t(null, iB, this.f19957g);
            } else {
                N = sVar;
                w();
                N = i.N(null, iB, this.f19957g, null);
                this.f19958h = N;
            }
        }
        N = sVar;
        this.f19956f = N;
        N.q(new b());
        J();
        I(z());
        getChildFragmentManager().q().p(sb.g.f51797z, this.f19956f, str).i();
    }

    private void J() {
        this.f19971u.setText((this.f19962l == 1 && E()) ? this.B : this.A);
    }

    private void K(CheckableImageButton checkableImageButton) {
        this.f19973w.setContentDescription(this.f19962l == 1 ? checkableImageButton.getContext().getString(sb.k.R) : checkableImageButton.getContext().getString(sb.k.U));
    }

    private void L(CheckableImageButton checkableImageButton) {
        t0.a(this.f19973w, this.f19962l == 1 ? checkableImageButton.getContext().getString(sb.k.S) : checkableImageButton.getContext().getString(sb.k.V));
    }

    public static /* synthetic */ void t(l lVar, View view) {
        lVar.w();
        throw null;
    }

    private static Drawable u(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, i.a.b(context, sb.f.f51738e));
        stateListDrawable.addState(new int[0], i.a.b(context, sb.f.f51739f));
        return stateListDrawable;
    }

    private void v(Window window) {
        if (this.f19976z) {
            return;
        }
        View viewFindViewById = requireView().findViewById(sb.g.f51763i);
        com.google.android.material.internal.e.a(window, true, c0.h(viewFindViewById), null);
        int paddingTop = viewFindViewById.getPaddingTop();
        q0.w0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), paddingTop, viewFindViewById.getPaddingRight()));
        this.f19976z = true;
    }

    private d w() {
        android.support.v4.media.session.b.a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence x(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String y() {
        w();
        requireContext();
        throw null;
    }

    void I(String str) {
        this.f19972v.setContentDescription(y());
        this.f19972v.setText(str);
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f19953c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f19955e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f19957g = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f19959i = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f19960j = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f19962l = bundle.getInt("INPUT_MODE_KEY");
        this.f19963m = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f19964n = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f19965o = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f19966p = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f19967q = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f19968r = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f19969s = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f19970t = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f19960j;
        if (text == null) {
            text = requireContext().getResources().getText(this.f19959i);
        }
        this.A = text;
        this.B = x(text);
    }

    @Override // androidx.fragment.app.m
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), B(requireContext()));
        Context context = dialog.getContext();
        this.f19961k = D(context);
        int i10 = sb.c.D;
        int i11 = sb.l.T;
        this.f19974x = new mc.i(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, sb.m.O5, i10, i11);
        int color = typedArrayObtainStyledAttributes.getColor(sb.m.P5, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f19974x.Y(context);
        this.f19974x.l0(ColorStateList.valueOf(color));
        this.f19974x.k0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f19961k ? sb.i.J : sb.i.I, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f19961k) {
            viewInflate.findViewById(sb.g.f51797z).setLayoutParams(new LinearLayout.LayoutParams(A(context), -2));
        } else {
            viewInflate.findViewById(sb.g.A).setLayoutParams(new LinearLayout.LayoutParams(A(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(sb.g.G);
        this.f19972v = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f19973w = (CheckableImageButton) viewInflate.findViewById(sb.g.H);
        this.f19971u = (TextView) viewInflate.findViewById(sb.g.I);
        C(context);
        this.f19975y = (Button) viewInflate.findViewById(sb.g.f51753d);
        w();
        throw null;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f19954d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f19955e);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        com.google.android.material.datepicker.a.b bVar = new com.google.android.material.datepicker.a.b(this.f19957g);
        i iVar = this.f19958h;
        n nVarH = iVar == null ? null : iVar.H();
        if (nVarH != null) {
            bVar.b(nVarH.f19992f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f19959i);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f19960j);
        bundle.putInt("INPUT_MODE_KEY", this.f19962l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f19963m);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f19964n);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f19965o);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f19966p);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f19967q);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f19968r);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f19969s);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f19970t);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f19961k) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f19974x);
            v(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(sb.e.J0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f19974x, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new bc.a(requireDialog(), rect));
        }
        H();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStop() {
        this.f19956f.s();
        super.onStop();
    }

    public String z() {
        w();
        getContext();
        throw null;
    }
}
