package androidx.navigation.fragment;

import a4.o;
import a4.p;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.f0;
import androidx.fragment.app.m;
import androidx.lifecycle.t1;
import androidx.navigation.fragment.NavHostFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fl.k;
import fl.l;
import fl.w;
import j0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import n4.g;
import y3.a2;
import y3.e2;
import y3.g0;
import y3.j1;
import y3.w1;
import y3.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH\u0017¢\u0006\u0004\b)\u0010\rJ\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0004R\u001b\u0010\u000f\u001a\u00020\u000e8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lfl/g0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Ly3/j1;", "navHostController", "C", "(Ly3/j1;)V", "Ly3/g0;", "navController", "B", "(Ly3/g0;)V", "Ly3/z1;", "Landroidx/navigation/fragment/b$c;", "u", "()Ly3/z1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/util/AttributeSet;", "attrs", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onDestroyView", "a", "Lfl/k;", "x", "()Ly3/j1;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/view/View;", "viewParent", "", "c", "I", "graphId", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "defaultNavHost", "v", "()I", "containerId", "w", "()Ly3/g0;", "e", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavHostFragment extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k navHostController = l.b(new tl.a() { // from class: a4.l
        @Override // tl.a
        public final Object invoke() {
            return NavHostFragment.y(this.f136a);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private View viewParent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int graphId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean defaultNavHost;

    /* JADX INFO: renamed from: androidx.navigation.fragment.NavHostFragment$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g0 a(Fragment fragment) {
            Dialog dialog;
            Window window;
            s.h(fragment, "fragment");
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) parentFragment).x();
                }
                Fragment fragmentE0 = parentFragment.getParentFragmentManager().E0();
                if (fragmentE0 instanceof NavHostFragment) {
                    return ((NavHostFragment) fragmentE0).x();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return w1.d(view);
            }
            View decorView = null;
            m mVar = fragment instanceof m ? (m) fragment : null;
            if (mVar != null && (dialog = mVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return w1.d(decorView);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle A(NavHostFragment navHostFragment) {
        int i10 = navHostFragment.graphId;
        if (i10 != 0) {
            return e.a(w.a("android-support-nav:fragment:graphId", Integer.valueOf(i10)));
        }
        Bundle bundle = Bundle.EMPTY;
        s.e(bundle);
        return bundle;
    }

    private final int v() {
        int id2 = getId();
        return (id2 == 0 || id2 == -1) ? o.f139a : id2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 y(final NavHostFragment navHostFragment) {
        Context context = navHostFragment.getContext();
        if (context == null) {
            throw new IllegalStateException("NavController cannot be created before the fragment is attached");
        }
        final j1 j1Var = new j1(context);
        j1Var.X(navHostFragment);
        t1 viewModelStore = navHostFragment.getViewModelStore();
        s.g(viewModelStore, "<get-viewModelStore>(...)");
        j1Var.Y(viewModelStore);
        navHostFragment.C(j1Var);
        Bundle bundleA = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
        if (bundleA != null) {
            j1Var.T(bundleA);
        }
        navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new g.b() { // from class: a4.m
            @Override // n4.g.b
            public final Bundle a() {
                return NavHostFragment.z(j1Var);
            }
        });
        Bundle bundleA2 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
        if (bundleA2 != null) {
            navHostFragment.graphId = bundleA2.getInt("android-support-nav:fragment:graphId");
        }
        navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new g.b() { // from class: a4.n
            @Override // n4.g.b
            public final Bundle a() {
                return NavHostFragment.A(this.f138a);
            }
        });
        int i10 = navHostFragment.graphId;
        if (i10 != 0) {
            j1Var.V(i10);
            return j1Var;
        }
        Bundle arguments = navHostFragment.getArguments();
        int i11 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
        Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
        if (i11 != 0) {
            j1Var.W(i11, bundle);
        }
        return j1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle z(j1 j1Var) {
        Bundle bundleU = j1Var.U();
        if (bundleU != null) {
            return bundleU;
        }
        Bundle EMPTY = Bundle.EMPTY;
        s.g(EMPTY, "EMPTY");
        return EMPTY;
    }

    protected void B(g0 navController) {
        s.h(navController, "navController");
        a2 a2VarX = navController.x();
        Context contextRequireContext = requireContext();
        s.g(contextRequireContext, "requireContext(...)");
        f0 childFragmentManager = getChildFragmentManager();
        s.g(childFragmentManager, "getChildFragmentManager(...)");
        a2VarX.c(new a4.b(contextRequireContext, childFragmentManager));
        navController.x().c(u());
    }

    protected void C(j1 navHostController) {
        s.h(navHostController, "navHostController");
        B(navHostController);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        s.h(context, "context");
        super.onAttach(context);
        if (this.defaultNavHost) {
            getParentFragmentManager().q().s(this).g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        x();
        if (savedInstanceState != null && savedInstanceState.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.defaultNavHost = true;
            getParentFragmentManager().q().s(this).g();
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.h(inflater, "inflater");
        Context context = inflater.getContext();
        s.g(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(v());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && w1.d(view) == x()) {
            w1.i(view, null);
        }
        this.viewParent = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        s.h(context, "context");
        s.h(attrs, "attrs");
        super.onInflate(context, attrs, savedInstanceState);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, e2.f57196g);
        s.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(e2.f57197h, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        fl.g0 g0Var = fl.g0.f38750a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, p.f144e);
        s.g(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes2.getBoolean(p.f145f, false)) {
            this.defaultNavHost = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        s.h(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.defaultNavHost) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        w1.i(view, x());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            s.f(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.viewParent = view2;
            s.e(view2);
            if (view2.getId() == getId()) {
                View view3 = this.viewParent;
                s.e(view3);
                w1.i(view3, x());
            }
        }
    }

    protected z1 u() {
        Context contextRequireContext = requireContext();
        s.g(contextRequireContext, "requireContext(...)");
        f0 childFragmentManager = getChildFragmentManager();
        s.g(childFragmentManager, "getChildFragmentManager(...)");
        return new b(contextRequireContext, childFragmentManager, v());
    }

    public final g0 w() {
        return x();
    }

    public final j1 x() {
        return (j1) this.navHostController.getValue();
    }
}
