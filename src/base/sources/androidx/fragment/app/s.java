package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends androidx.activity.p implements androidx.core.app.b.d {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final v mFragments = v.b(new a());
    final androidx.lifecycle.f0 mFragmentLifecycleRegistry = new androidx.lifecycle.f0(this);
    boolean mStopped = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends x implements androidx.core.content.d, androidx.core.content.e, androidx.core.app.q, androidx.core.app.r, u1, androidx.activity.j0, f.g, n4.j, j0, n0.p {
        public a() {
            super(s.this);
        }

        @Override // androidx.fragment.app.j0
        public void a(f0 f0Var, Fragment fragment) {
            s.this.onAttachFragment(fragment);
        }

        @Override // n0.p
        public void addMenuProvider(n0.u uVar) {
            s.this.addMenuProvider(uVar);
        }

        @Override // androidx.core.content.d
        public void addOnConfigurationChangedListener(m0.a aVar) {
            s.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.q
        public void addOnMultiWindowModeChangedListener(m0.a aVar) {
            s.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.r
        public void addOnPictureInPictureModeChangedListener(m0.a aVar) {
            s.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // androidx.core.content.e
        public void addOnTrimMemoryListener(m0.a aVar) {
            s.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.u
        public View c(int i10) {
            return s.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.u
        public boolean d() {
            Window window = s.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // f.g
        public f.f getActivityResultRegistry() {
            return s.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.b0
        public androidx.lifecycle.s getLifecycle() {
            return s.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.j0
        public androidx.activity.i0 getOnBackPressedDispatcher() {
            return s.this.getOnBackPressedDispatcher();
        }

        @Override // n4.j
        public n4.g getSavedStateRegistry() {
            return s.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.u1
        public t1 getViewModelStore() {
            return s.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.x
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            s.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.x
        public LayoutInflater j() {
            return s.this.getLayoutInflater().cloneInContext(s.this);
        }

        @Override // androidx.fragment.app.x
        public boolean l(String str) {
            return androidx.core.app.b.j(s.this, str);
        }

        @Override // androidx.fragment.app.x
        public void o() {
            p();
        }

        public void p() {
            s.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.x
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public s i() {
            return s.this;
        }

        @Override // n0.p
        public void removeMenuProvider(n0.u uVar) {
            s.this.removeMenuProvider(uVar);
        }

        @Override // androidx.core.content.d
        public void removeOnConfigurationChangedListener(m0.a aVar) {
            s.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.q
        public void removeOnMultiWindowModeChangedListener(m0.a aVar) {
            s.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.r
        public void removeOnPictureInPictureModeChangedListener(m0.a aVar) {
            s.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // androidx.core.content.e
        public void removeOnTrimMemoryListener(m0.a aVar) {
            s.this.removeOnTrimMemoryListener(aVar);
        }

        @Override // n0.p
        public void addMenuProvider(n0.u uVar, androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.b bVar) {
            s.this.addMenuProvider(uVar, b0Var, bVar);
        }
    }

    public s() {
        i0();
    }

    public static /* synthetic */ Bundle g0(s sVar) {
        sVar.markFragmentsCreated();
        sVar.mFragmentLifecycleRegistry.m(androidx.lifecycle.s.a.ON_STOP);
        return new Bundle();
    }

    private void i0() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new n4.g.b() { // from class: androidx.fragment.app.o
            @Override // n4.g.b
            public final Bundle a() {
                return s.g0(this.f4205a);
            }
        });
        addOnConfigurationChangedListener(new m0.a() { // from class: androidx.fragment.app.p
            @Override // m0.a
            public final void accept(Object obj) {
                this.f4234a.mFragments.m();
            }
        });
        addOnNewIntentListener(new m0.a() { // from class: androidx.fragment.app.q
            @Override // m0.a
            public final void accept(Object obj) {
                this.f4238a.mFragments.m();
            }
        });
        addOnContextAvailableListener(new e.b() { // from class: androidx.fragment.app.r
            @Override // e.b
            public final void a(Context context) {
                this.f4255a.mFragments.a(null);
            }
        });
    }

    private static boolean j0(f0 f0Var, androidx.lifecycle.s.b bVar) {
        boolean zJ0 = false;
        for (Fragment fragment : f0Var.z0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zJ0 |= j0(fragment.getChildFragmentManager(), bVar);
                }
                s0 s0Var = fragment.mViewLifecycleOwner;
                if (s0Var != null && s0Var.getLifecycle().b().e(androidx.lifecycle.s.b.STARTED)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    zJ0 = true;
                }
                if (fragment.mLifecycleRegistry.b().e(androidx.lifecycle.s.b.STARTED)) {
                    fragment.mLifecycleRegistry.p(bVar);
                    zJ0 = true;
                }
            }
        }
        return zJ0;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().Z(str, fileDescriptor, printWriter, strArr);
        }
    }

    public f0 getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        while (j0(getSupportFragmentManager(), androidx.lifecycle.s.b.CREATED)) {
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m(androidx.lifecycle.s.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.m(androidx.lifecycle.s.a.ON_DESTROY);
    }

    @Override // androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.m(androidx.lifecycle.s.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m(androidx.lifecycle.s.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.m(androidx.lifecycle.s.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.m(androidx.lifecycle.s.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.z zVar) {
        androidx.core.app.b.h(this, zVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.z zVar) {
        androidx.core.app.b.i(this, zVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.l(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.c(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.d(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.m(this);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.k(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.core.app.b.d
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
