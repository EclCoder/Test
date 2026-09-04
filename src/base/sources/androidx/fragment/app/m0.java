package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.u1;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f4192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f4193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fragment f4194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4195d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4196e = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4199a;

        static {
            int[] iArr = new int[androidx.lifecycle.s.b.values().length];
            f4199a = iArr;
            try {
                iArr[androidx.lifecycle.s.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4199a[androidx.lifecycle.s.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4199a[androidx.lifecycle.s.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4199a[androidx.lifecycle.s.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    m0(z zVar, n0 n0Var, Fragment fragment) {
        this.f4192a = zVar;
        this.f4193b = n0Var;
        this.f4194c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f4194c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4194c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4194c);
        }
        Bundle bundle = this.f4194c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f4194c.performActivityCreated(bundle2);
        this.f4192a.a(this.f4194c, bundle2, false);
    }

    void b() {
        Fragment fragmentN0 = f0.n0(this.f4194c.mContainer);
        Fragment parentFragment = this.f4194c.getParentFragment();
        if (fragmentN0 != null && !fragmentN0.equals(parentFragment)) {
            Fragment fragment = this.f4194c;
            j1.b.o(fragment, fragmentN0, fragment.mContainerId);
        }
        int iJ = this.f4193b.j(this.f4194c);
        Fragment fragment2 = this.f4194c;
        fragment2.mContainer.addView(fragment2.mView, iJ);
    }

    void c() {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4194c);
        }
        Fragment fragment = this.f4194c;
        Fragment fragment2 = fragment.mTarget;
        m0 m0VarN = null;
        if (fragment2 != null) {
            m0 m0VarN2 = this.f4193b.n(fragment2.mWho);
            if (m0VarN2 == null) {
                throw new IllegalStateException("Fragment " + this.f4194c + " declared target fragment " + this.f4194c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f4194c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            m0VarN = m0VarN2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (m0VarN = this.f4193b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4194c + " declared target fragment " + this.f4194c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (m0VarN != null) {
            m0VarN.m();
        }
        Fragment fragment4 = this.f4194c;
        fragment4.mHost = fragment4.mFragmentManager.A0();
        Fragment fragment5 = this.f4194c;
        fragment5.mParentFragment = fragment5.mFragmentManager.D0();
        this.f4192a.g(this.f4194c, false);
        this.f4194c.performAttach();
        this.f4192a.b(this.f4194c, false);
    }

    int d() {
        Fragment fragment = this.f4194c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f4196e;
        int i10 = b.f4199a[fragment.mMaxState.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment2 = this.f4194c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f4196e, 2);
                View view = this.f4194c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f4196e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f4194c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f4194c;
        ViewGroup viewGroup = fragment3.mContainer;
        x0.c.a aVarP = viewGroup != null ? x0.r(viewGroup, fragment3.getParentFragmentManager()).p(this) : null;
        if (aVarP == x0.c.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarP == x0.c.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f4194c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f4194c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (f0.N0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f4194c);
        }
        return iMin;
    }

    void e() {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4194c);
        }
        Bundle bundle = this.f4194c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.f4194c;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f4192a.h(fragment, bundle2, false);
            this.f4194c.performCreate(bundle2);
            this.f4192a.c(this.f4194c, bundle2, false);
        }
    }

    void f() {
        String resourceName;
        if (this.f4194c.mFromLayout) {
            return;
        }
        if (f0.N0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4194c);
        }
        Bundle bundle = this.f4194c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f4194c.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f4194c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4194c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.u0().c(this.f4194c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f4194c;
                    if (!fragment2.mRestored) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f4194c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4194c.mContainerId) + " (" + resourceName + ") for fragment " + this.f4194c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    j1.b.n(this.f4194c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f4194c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f4194c.mView != null) {
            if (f0.N0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f4194c);
            }
            this.f4194c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f4194c;
            fragment4.mView.setTag(i1.b.f40739a, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.f4194c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (n0.q0.S(this.f4194c.mView)) {
                n0.q0.j0(this.f4194c.mView);
            } else {
                View view = this.f4194c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f4194c.performViewCreated();
            z zVar = this.f4192a;
            Fragment fragment6 = this.f4194c;
            zVar.m(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f4194c.mView.getVisibility();
            this.f4194c.setPostOnViewCreatedAlpha(this.f4194c.mView.getAlpha());
            Fragment fragment7 = this.f4194c;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f4194c.setFocusedView(viewFindFocus);
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f4194c);
                    }
                }
                this.f4194c.mView.setAlpha(0.0f);
            }
        }
        this.f4194c.mState = 2;
    }

    void g() {
        Fragment fragmentF;
        if (f0.N0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4194c);
        }
        Fragment fragment = this.f4194c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        if (z10) {
            Fragment fragment2 = this.f4194c;
            if (!fragment2.mBeingSaved) {
                this.f4193b.B(fragment2.mWho, null);
            }
        }
        if (!z10 && !this.f4193b.p().v(this.f4194c)) {
            String str = this.f4194c.mTargetWho;
            if (str != null && (fragmentF = this.f4193b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f4194c.mTarget = fragmentF;
            }
            this.f4194c.mState = 0;
            return;
        }
        x xVar = this.f4194c.mHost;
        if (xVar instanceof u1) {
            zIsChangingConfigurations = this.f4193b.p().s();
        } else if (xVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) xVar.f()).isChangingConfigurations();
        }
        if ((z10 && !this.f4194c.mBeingSaved) || zIsChangingConfigurations) {
            this.f4193b.p().k(this.f4194c, false);
        }
        this.f4194c.performDestroy();
        this.f4192a.d(this.f4194c, false);
        for (m0 m0Var : this.f4193b.k()) {
            if (m0Var != null) {
                Fragment fragmentK = m0Var.k();
                if (this.f4194c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f4194c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f4194c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f4193b.f(str2);
        }
        this.f4193b.s(this);
    }

    void h() {
        View view;
        if (f0.N0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4194c);
        }
        Fragment fragment = this.f4194c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f4194c.performDestroyView();
        this.f4192a.n(this.f4194c, false);
        Fragment fragment2 = this.f4194c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.q(null);
        this.f4194c.mInLayout = false;
    }

    void i() {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4194c);
        }
        this.f4194c.performDetach();
        this.f4192a.e(this.f4194c, false);
        Fragment fragment = this.f4194c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f4193b.p().v(this.f4194c)) {
            return;
        }
        if (f0.N0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f4194c);
        }
        this.f4194c.initState();
    }

    void j() {
        Fragment fragment = this.f4194c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (f0.N0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4194c);
            }
            Bundle bundle = this.f4194c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.f4194c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f4194c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4194c;
                fragment3.mView.setTag(i1.b.f40739a, fragment3);
                Fragment fragment4 = this.f4194c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f4194c.performViewCreated();
                z zVar = this.f4192a;
                Fragment fragment5 = this.f4194c;
                zVar.m(fragment5, fragment5.mView, bundle2, false);
                this.f4194c.mState = 2;
            }
        }
    }

    Fragment k() {
        return this.f4194c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4195d) {
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f4195d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f4194c;
                int i10 = fragment.mState;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f4194c.mBeingSaved) {
                        if (f0.N0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f4194c);
                        }
                        this.f4193b.p().k(this.f4194c, true);
                        this.f4193b.s(this);
                        if (f0.N0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f4194c);
                        }
                        this.f4194c.initState();
                    }
                    Fragment fragment2 = this.f4194c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            x0 x0VarR = x0.r(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f4194c.mHidden) {
                                x0VarR.g(this);
                            } else {
                                x0VarR.i(this);
                            }
                        }
                        Fragment fragment3 = this.f4194c;
                        f0 f0Var = fragment3.mFragmentManager;
                        if (f0Var != null) {
                            f0Var.L0(fragment3);
                        }
                        Fragment fragment4 = this.f4194c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f4194c.mChildFragmentManager.L();
                    }
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f4193b.q(fragment.mWho) == null) {
                                this.f4193b.B(this.f4194c.mWho, r());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f4194c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (f0.N0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4194c);
                            }
                            Fragment fragment5 = this.f4194c;
                            if (fragment5.mBeingSaved) {
                                this.f4193b.B(fragment5.mWho, r());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.f4194c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                x0.r(viewGroup2, fragment6.getParentFragmentManager()).h(this);
                            }
                            this.f4194c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                x0.r(viewGroup3, fragment.getParentFragmentManager()).f(x0.c.b.g(this.f4194c.mView.getVisibility()), this);
                            }
                            this.f4194c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f4195d = false;
        }
    }

    void n() {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4194c);
        }
        this.f4194c.performPause();
        this.f4192a.f(this.f4194c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f4194c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f4194c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f4194c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        Fragment fragment = this.f4194c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        Fragment fragment2 = this.f4194c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
        l0 l0Var = (l0) this.f4194c.mSavedFragmentState.getParcelable("state");
        if (l0Var != null) {
            Fragment fragment3 = this.f4194c;
            fragment3.mTargetWho = l0Var.f4183l;
            fragment3.mTargetRequestCode = l0Var.f4184m;
            Boolean bool = fragment3.mSavedUserVisibleHint;
            if (bool != null) {
                fragment3.mUserVisibleHint = bool.booleanValue();
                this.f4194c.mSavedUserVisibleHint = null;
            } else {
                fragment3.mUserVisibleHint = l0Var.f4185n;
            }
        }
        Fragment fragment4 = this.f4194c;
        if (fragment4.mUserVisibleHint) {
            return;
        }
        fragment4.mDeferStart = true;
    }

    void p() {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4194c);
        }
        View focusedView = this.f4194c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (f0.N0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f4194c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f4194c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f4194c.setFocusedView(null);
        this.f4194c.performResume();
        this.f4192a.i(this.f4194c, false);
        this.f4193b.B(this.f4194c.mWho, null);
        Fragment fragment = this.f4194c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    Fragment.n q() {
        if (this.f4194c.mState > -1) {
            return new Fragment.n(r());
        }
        return null;
    }

    void s() {
        if (this.f4194c.mView == null) {
            return;
        }
        if (f0.N0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f4194c + " with view " + this.f4194c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4194c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4194c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4194c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f4194c.mSavedViewRegistryState = bundle;
    }

    void t(int i10) {
        this.f4196e = i10;
    }

    void u() {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4194c);
        }
        this.f4194c.performStart();
        this.f4192a.k(this.f4194c, false);
    }

    void v() {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4194c);
        }
        this.f4194c.performStop();
        this.f4192a.l(this.f4194c, false);
    }

    Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f4194c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new l0(this.f4194c));
        if (this.f4194c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f4194c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f4192a.j(this.f4194c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f4194c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleS1 = this.f4194c.mChildFragmentManager.s1();
            if (!bundleS1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleS1);
            }
            if (this.f4194c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f4194c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f4194c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f4194c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle(NpmRNZ.kRNfciWnAJ, bundle6);
        }
        return bundle2;
    }

    m0(z zVar, n0 n0Var, ClassLoader classLoader, w wVar, Bundle bundle) {
        this.f4192a = zVar;
        this.f4193b = n0Var;
        Fragment fragmentA = ((l0) bundle.getParcelable("state")).a(wVar, classLoader);
        this.f4194c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (f0.N0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    m0(z zVar, n0 n0Var, Fragment fragment, Bundle bundle) {
        this.f4192a = zVar;
        this.f4193b = n0Var;
        this.f4194c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f4197a;

        a(View view) {
            this.f4197a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4197a.removeOnAttachStateChangeListener(this);
            n0.q0.j0(this.f4197a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
