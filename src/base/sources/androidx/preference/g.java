package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Fragment implements j.c, j.a, j.b, DialogPreference.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f6369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RecyclerView f6370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6372e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f6374g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f6368a = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6373f = p.f6445c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Handler f6375h = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f6376i = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            g.this.s();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = g.this.f6370c;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f6379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6381c = true;

        c() {
        }

        private boolean g(View view, RecyclerView recyclerView) {
            RecyclerView.g0 g0VarO0 = recyclerView.o0(view);
            if (!(g0VarO0 instanceof l) || !((l) g0VarO0).d()) {
                return false;
            }
            boolean z10 = this.f6381c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z10;
            }
            RecyclerView.g0 g0VarO1 = recyclerView.o0(recyclerView.getChildAt(iIndexOfChild + 1));
            return (g0VarO1 instanceof l) && ((l) g0VarO1).c();
        }

        public void d(boolean z10) {
            this.f6381c = z10;
        }

        public void e(Drawable drawable) {
            if (drawable != null) {
                this.f6380b = drawable.getIntrinsicHeight();
            } else {
                this.f6380b = 0;
            }
            this.f6379a = drawable;
            g.this.f6370c.D0();
        }

        public void f(int i10) {
            this.f6380b = i10;
            g.this.f6370c.D0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            if (g(view, recyclerView)) {
                rect.bottom = this.f6380b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            if (this.f6379a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (g(childAt, recyclerView)) {
                    int y10 = ((int) childAt.getY()) + childAt.getHeight();
                    this.f6379a.setBounds(0, y10, width, this.f6380b + y10);
                    this.f6379a.draw(canvas);
                }
            }
        }
    }

    private void C() {
        if (this.f6375h.hasMessages(1)) {
            return;
        }
        this.f6375h.obtainMessage(1).sendToTarget();
    }

    private void D() {
        if (this.f6369b == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void I() {
        u().setAdapter(null);
        PreferenceScreen preferenceScreenV = v();
        if (preferenceScreenV != null) {
            preferenceScreenV.V();
        }
        B();
    }

    public RecyclerView A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(o.f6438b)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(p.f6446d, viewGroup, false);
        recyclerView2.setLayoutManager(y());
        recyclerView2.setAccessibilityDelegateCompat(new k(recyclerView2));
        return recyclerView2;
    }

    public void E(Drawable drawable) {
        this.f6368a.e(drawable);
    }

    public void F(int i10) {
        this.f6368a.f(i10);
    }

    public void G(PreferenceScreen preferenceScreen) {
        if (!this.f6369b.r(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        B();
        this.f6371d = true;
        if (this.f6372e) {
            C();
        }
    }

    public void H(int i10, String str) {
        Preference preferenceQ0;
        D();
        PreferenceScreen preferenceScreenM = this.f6369b.m(requireContext(), i10, null);
        PreferenceScreen preferenceScreen = preferenceScreenM;
        if (str != null) {
            preferenceQ0 = preferenceScreenM.Q0(str);
            if (!(preferenceQ0 instanceof PreferenceScreen)) {
                preferenceScreen = preferenceQ0;
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        preferenceScreen = preferenceQ0;
        G(preferenceScreen);
    }

    @Override // androidx.preference.j.b
    public void i(PreferenceScreen preferenceScreen) {
        t();
        for (Fragment parentFragment = this; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
        }
        getContext();
        getActivity();
    }

    @Override // androidx.preference.DialogPreference.a
    public Preference j(CharSequence charSequence) {
        j jVar = this.f6369b;
        if (jVar == null) {
            return null;
        }
        return jVar.a(charSequence);
    }

    @Override // androidx.preference.j.a
    public void m(Preference preference) {
        androidx.fragment.app.m mVarC;
        t();
        for (Fragment parentFragment = this; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
        }
        getContext();
        getActivity();
        if (getParentFragmentManager().k0("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            mVarC = androidx.preference.a.D(preference.q());
        } else if (preference instanceof ListPreference) {
            mVarC = androidx.preference.c.C(preference.q());
        } else {
            if (!(preference instanceof MultiSelectListPreference)) {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            mVarC = d.C(preference.q());
        }
        mVarC.setTargetFragment(this, 0);
        mVarC.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    @Override // androidx.preference.j.c
    public boolean n(Preference preference) {
        if (preference.n() == null) {
            return false;
        }
        t();
        for (Fragment parentFragment = this; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
        }
        getContext();
        getActivity();
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        f0 parentFragmentManager = getParentFragmentManager();
        Bundle bundleK = preference.k();
        Fragment fragmentA = parentFragmentManager.x0().a(requireActivity().getClassLoader(), preference.n());
        fragmentA.setArguments(bundleK);
        fragmentA.setTargetFragment(this, 0);
        parentFragmentManager.q().o(((View) requireView().getParent()).getId(), fragmentA).f(null).g();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(m.f6432i, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = r.f6452a;
        }
        requireContext().getTheme().applyStyle(i10, false);
        j jVar = new j(requireContext());
        this.f6369b = jVar;
        jVar.p(this);
        z(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, s.f6506v0, m.f6429f, 0);
        this.f6373f = typedArrayObtainStyledAttributes.getResourceId(s.f6508w0, this.f6373f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(s.f6510x0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(s.f6512y0, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(s.f6514z0, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f6373f, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewA = A(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewA == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f6370c = recyclerViewA;
        recyclerViewA.j(this.f6368a);
        E(drawable);
        if (dimensionPixelSize != -1) {
            F(dimensionPixelSize);
        }
        this.f6368a.d(z10);
        if (this.f6370c.getParent() == null) {
            viewGroup2.addView(this.f6370c);
        }
        this.f6375h.post(this.f6376i);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f6375h.removeCallbacks(this.f6376i);
        this.f6375h.removeMessages(1);
        if (this.f6371d) {
            I();
        }
        this.f6370c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreenV = v();
        if (preferenceScreenV != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenV.p0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f6369b.q(this);
        this.f6369b.o(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f6369b.q(null);
        this.f6369b.o(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenV;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenV = v()) != null) {
            preferenceScreenV.o0(bundle2);
        }
        if (this.f6371d) {
            s();
            Runnable runnable = this.f6374g;
            if (runnable != null) {
                runnable.run();
                this.f6374g = null;
            }
        }
        this.f6372e = true;
    }

    public void q(int i10) {
        D();
        G(this.f6369b.m(requireContext(), i10, v()));
    }

    void s() {
        PreferenceScreen preferenceScreenV = v();
        if (preferenceScreenV != null) {
            u().setAdapter(x(preferenceScreenV));
            preferenceScreenV.P();
        }
        w();
    }

    public Fragment t() {
        return null;
    }

    public final RecyclerView u() {
        return this.f6370c;
    }

    public PreferenceScreen v() {
        return this.f6369b.k();
    }

    protected RecyclerView.h x(PreferenceScreen preferenceScreen) {
        return new h(preferenceScreen);
    }

    public RecyclerView.q y() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void z(Bundle bundle, String str);

    protected void B() {
    }

    protected void w() {
    }
}
