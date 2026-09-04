package j1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import gl.l0;
import gl.r;
import gl.s0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41897a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f41898b = c.f41910d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: renamed from: j1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface InterfaceC0633b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41909c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f41910d = new c(s0.d(), null, l0.h());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f41911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f41912b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public c(Set flags, InterfaceC0633b interfaceC0633b, Map allowedViolations) {
            s.h(flags, "flags");
            s.h(allowedViolations, "allowedViolations");
            this.f41911a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f41912b = linkedHashMap;
        }

        public final Set a() {
            return this.f41911a;
        }

        public final InterfaceC0633b b() {
            return null;
        }

        public final Map c() {
            return this.f41912b;
        }
    }

    private b() {
    }

    private final c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                f0 parentFragmentManager = fragment.getParentFragmentManager();
                s.g(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.G0() != null) {
                    c cVarG0 = parentFragmentManager.G0();
                    s.e(cVarG0);
                    return cVarG0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f41898b;
    }

    private final void c(c cVar, final Violation violation) {
        Fragment fragmentD = violation.getFragment();
        final String name = fragmentD.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            p(fragmentD, new Runnable() { // from class: j1.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.d(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, Violation violation) {
        s.h(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(Violation violation) {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        s.h(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        b bVar = f41897a;
        bVar.e(fragmentTagUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && bVar.q(cVarB, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            bVar.c(cVarB, fragmentTagUsageViolation);
        }
    }

    public static final void h(Fragment fragment) {
        s.h(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        b bVar = f41897a;
        bVar.e(getRetainInstanceUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && bVar.q(cVarB, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            bVar.c(cVarB, getRetainInstanceUsageViolation);
        }
    }

    public static final void i(Fragment fragment) {
        s.h(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        b bVar = f41897a;
        bVar.e(getTargetFragmentRequestCodeUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(cVarB, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            bVar.c(cVarB, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    public static final void j(Fragment fragment) {
        s.h(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        b bVar = f41897a;
        bVar.e(getTargetFragmentUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(cVarB, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            bVar.c(cVarB, getTargetFragmentUsageViolation);
        }
    }

    public static final void k(Fragment fragment) {
        s.h(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        b bVar = f41897a;
        bVar.e(setRetainInstanceUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && bVar.q(cVarB, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            bVar.c(cVarB, setRetainInstanceUsageViolation);
        }
    }

    public static final void l(Fragment violatingFragment, Fragment targetFragment, int i10) {
        s.h(violatingFragment, "violatingFragment");
        s.h(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, i10);
        b bVar = f41897a;
        bVar.e(setTargetFragmentUsageViolation);
        c cVarB = bVar.b(violatingFragment);
        if (cVarB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(cVarB, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            bVar.c(cVarB, setTargetFragmentUsageViolation);
        }
    }

    public static final void m(Fragment fragment, boolean z10) {
        s.h(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z10);
        b bVar = f41897a;
        bVar.e(setUserVisibleHintViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && bVar.q(cVarB, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            bVar.c(cVarB, setUserVisibleHintViolation);
        }
    }

    public static final void n(Fragment fragment, ViewGroup container) {
        s.h(fragment, "fragment");
        s.h(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        b bVar = f41897a;
        bVar.e(wrongFragmentContainerViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && bVar.q(cVarB, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            bVar.c(cVarB, wrongFragmentContainerViolation);
        }
    }

    public static final void o(Fragment fragment, Fragment expectedParentFragment, int i10) {
        s.h(fragment, "fragment");
        s.h(expectedParentFragment, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, expectedParentFragment, i10);
        b bVar = f41897a;
        bVar.e(wrongNestedHierarchyViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && bVar.q(cVarB, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            bVar.c(cVarB, wrongNestedHierarchyViolation);
        }
    }

    private final void p(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerG = fragment.getParentFragmentManager().A0().g();
        s.g(handlerG, "fragment.parentFragmentManager.host.handler");
        if (s.c(handlerG.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerG.post(runnable);
        }
    }

    private final boolean q(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (s.c(cls2.getSuperclass(), Violation.class) || !r.U(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    public static final void f(Fragment fragment, String previousFragmentId) {
        s.h(fragment, SVWsZyNSAChGIA.cffhITS);
        s.h(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        b bVar = f41897a;
        bVar.e(fragmentReuseViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_REUSE) && bVar.q(cVarB, fragment.getClass(), fragmentReuseViolation.getClass())) {
            bVar.c(cVarB, fragmentReuseViolation);
        }
    }
}
