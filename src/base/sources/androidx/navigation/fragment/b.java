package androidx.navigation.fragment;

import a4.p;
import am.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.o0;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.p1;
import androidx.lifecycle.q0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.y;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import fl.g;
import fl.g0;
import fl.q;
import fl.w;
import gl.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import y3.b2;
import y3.d1;
import y3.m1;
import y3.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003STUB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J1\u00103\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010,\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u001dR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001f0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010CR,\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0F0E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010MR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020L0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010P¨\u0006V"}, d2 = {"Landroidx/navigation/fragment/b;", "Ly3/z1;", "Landroidx/navigation/fragment/b$c;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/f0;", "fragmentManager", "", "containerId", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/f0;I)V", "level", "", "N", "(I)Z", "Ly3/y;", "entry", "Landroidx/fragment/app/Fragment;", "fragment", "Lfl/g0;", "F", "(Ly3/y;Landroidx/fragment/app/Fragment;)V", "Ly3/m1;", "navOptions", "Ly3/z1$a;", "navigatorExtras", "O", "(Ly3/y;Ly3/m1;Ly3/z1$a;)V", "Landroidx/fragment/app/o0;", "I", "(Ly3/y;Ly3/m1;)Landroidx/fragment/app/o0;", "", "id", "isPop", "deduplicate", "z", "(Ljava/lang/String;ZZ)V", "Ly3/b2;", "state", "i", "(Ly3/b2;)V", "E", "(Landroidx/fragment/app/Fragment;Ly3/y;Ly3/b2;)V", "popUpTo", "savedState", "n", "(Ly3/y;Z)V", "H", "()Landroidx/navigation/fragment/b$c;", "", "entries", "g", "(Ljava/util/List;Ly3/m1;Ly3/z1$a;)V", "backStackEntry", "j", "(Ly3/y;)V", "Landroid/os/Bundle;", "m", "()Landroid/os/Bundle;", "l", "(Landroid/os/Bundle;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/content/Context;", "e", "Landroidx/fragment/app/f0;", "f", "", "Ljava/util/Set;", "savedIds", "", "Lfl/q;", "h", "Ljava/util/List;", "M", "()Ljava/util/List;", "pendingOps", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/y;", "fragmentObserver", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "fragmentViewObserver", CampaignEx.JSON_KEY_AD_K, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@z1.b("fragment")
public class b extends z1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C0066b f6281k = new C0066b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f0 fragmentManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Set savedIds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List pendingOps;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final y fragmentObserver;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Function1 fragmentViewObserver;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends p1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference f6289b;

        @Override // androidx.lifecycle.p1
        protected void g() {
            super.g();
            tl.a aVar = (tl.a) j().get();
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final WeakReference j() {
            WeakReference weakReference = this.f6289b;
            if (weakReference != null) {
                return weakReference;
            }
            s.w("completeTransition");
            return null;
        }

        public final void k(WeakReference weakReference) {
            s.h(weakReference, "<set-?>");
            this.f6289b = weakReference;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.fragment.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0066b {
        public /* synthetic */ C0066b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0066b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends d1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f6290h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z1 fragmentNavigator) {
            super(fragmentNavigator);
            s.h(fragmentNavigator, "fragmentNavigator");
        }

        @Override // y3.d1
        public void B(Context context, AttributeSet attrs) {
            s.h(context, "context");
            s.h(attrs, "attrs");
            super.B(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, p.f142c);
            s.g(typedArrayObtainAttributes, "obtainAttributes(...)");
            String string = typedArrayObtainAttributes.getString(p.f143d);
            if (string != null) {
                J(string);
            }
            g0 g0Var = g0.f38750a;
            typedArrayObtainAttributes.recycle();
        }

        public final String I() {
            String str = this.f6290h;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            s.f(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        public final c J(String className) {
            s.h(className, "className");
            this.f6290h = className;
            return this;
        }

        @Override // y3.d1
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof c) && super.equals(obj) && s.c(this.f6290h, ((c) obj).f6290h);
        }

        @Override // y3.d1
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f6290h;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // y3.d1
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f6290h;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String string = sb2.toString();
            s.g(string, "toString(...)");
            return string;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class d implements f0.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b2 f6291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f6292b;

        d(b2 b2Var, b bVar) {
            this.f6291a = b2Var;
            this.f6292b = bVar;
        }

        @Override // androidx.fragment.app.f0.o
        public void b(Fragment fragment, boolean z10) {
            Object objPrevious;
            s.h(fragment, "fragment");
            if (z10) {
                List list = (List) this.f6291a.c().getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!s.c(((y3.y) objPrevious).f(), fragment.getTag()));
                y3.y yVar = (y3.y) objPrevious;
                if (this.f6292b.N(2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + yVar);
                }
                if (yVar != null) {
                    this.f6291a.k(yVar);
                }
            }
        }

        @Override // androidx.fragment.app.f0.o
        public void onBackStackChanged() {
        }

        @Override // androidx.fragment.app.f0.o
        public void a(Fragment fragment, boolean z10) {
            Object obj;
            Object objPrevious;
            s.h(fragment, giNWGaNAgVQoO.MjFskRiJttcBOv);
            List listS0 = r.s0((Collection) this.f6291a.c().getValue(), (Iterable) this.f6291a.d().getValue());
            ListIterator listIterator = listS0.listIterator(listS0.size());
            do {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!s.c(((y3.y) objPrevious).f(), fragment.getTag()));
            y3.y yVar = (y3.y) objPrevious;
            boolean z11 = z10 && this.f6292b.getPendingOps().isEmpty() && fragment.isRemoving();
            for (Object obj2 : this.f6292b.getPendingOps()) {
                if (s.c(((q) obj2).h(), fragment.getTag())) {
                    obj = obj2;
                    break;
                }
            }
            q qVar = (q) obj;
            if (qVar != null) {
                this.f6292b.getPendingOps().remove(qVar);
            }
            if (!z11 && this.f6292b.N(2)) {
                Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + yVar);
            }
            boolean z12 = qVar != null && ((Boolean) qVar.i()).booleanValue();
            if (!z10 && !z12 && yVar == null) {
                throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (yVar != null) {
                this.f6292b.E(fragment, yVar, this.f6291a);
                if (z11) {
                    if (this.f6292b.N(2)) {
                        Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + yVar + " via system back");
                    }
                    this.f6291a.j(yVar, false);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e implements q0, m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f6293a;

        e(Function1 function) {
            s.h(function, "function");
            this.f6293a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final g a() {
            return this.f6293a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f6293a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof m)) {
                return s.c(a(), ((m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public b(Context context, f0 fragmentManager, int i10) {
        s.h(context, "context");
        s.h(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i10;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new y() { // from class: a4.c
            @Override // androidx.lifecycle.y
            public final void c(b0 b0Var, androidx.lifecycle.s.a aVar) {
                androidx.navigation.fragment.b.J(this.f122a, b0Var, aVar);
            }
        };
        this.fragmentViewObserver = new Function1() { // from class: a4.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return androidx.navigation.fragment.b.K(this.f123a, (y3.y) obj);
            }
        };
    }

    static /* synthetic */ void A(b bVar, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        bVar.z(str, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(String str, q it) {
        s.h(it, "it");
        return s.c(it.h(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 C(y3.y yVar, b2 b2Var, b bVar, Fragment fragment) {
        for (y3.y yVar2 : (Iterable) b2Var.d().getValue()) {
            if (bVar.N(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + yVar2 + " due to fragment " + fragment + " viewmodel being cleared");
            }
            b2Var.f(yVar2);
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a D(q1.a initializer) {
        s.h(initializer, "$this$initializer");
        return new a();
    }

    private final void F(final y3.y entry, final Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().j(fragment, new e(new Function1() { // from class: a4.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return androidx.navigation.fragment.b.G(this.f128a, fragment, entry, (b0) obj);
            }
        }));
        fragment.getLifecycle().a(this.fragmentObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 G(b bVar, Fragment fragment, y3.y yVar, b0 b0Var) {
        List list = bVar.pendingOps;
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (s.c(((q) it.next()).h(), fragment.getTag())) {
                    z10 = true;
                    break;
                }
            }
        }
        if (b0Var != null && !z10) {
            androidx.lifecycle.s lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.b().e(androidx.lifecycle.s.b.CREATED)) {
                lifecycle.a((a0) bVar.fragmentViewObserver.invoke(yVar));
            }
        }
        return g0.f38750a;
    }

    private final o0 I(y3.y entry, m1 navOptions) {
        d1 d1VarD = entry.d();
        s.f(d1VarD, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleB = entry.b();
        String strI = ((c) d1VarD).I();
        if (strI.charAt(0) == '.') {
            strI = this.context.getPackageName() + strI;
        }
        Fragment fragmentA = this.fragmentManager.x0().a(this.context.getClassLoader(), strI);
        s.g(fragmentA, "instantiate(...)");
        fragmentA.setArguments(bundleB);
        o0 o0VarQ = this.fragmentManager.q();
        s.g(o0VarQ, "beginTransaction(...)");
        int iA = navOptions != null ? navOptions.a() : -1;
        int iB = navOptions != null ? navOptions.b() : -1;
        int iC = navOptions != null ? navOptions.c() : -1;
        int iD = navOptions != null ? navOptions.d() : -1;
        if (iA != -1 || iB != -1 || iC != -1 || iD != -1) {
            if (iA == -1) {
                iA = 0;
            }
            if (iB == -1) {
                iB = 0;
            }
            if (iC == -1) {
                iC = 0;
            }
            o0VarQ.q(iA, iB, iC, iD != -1 ? iD : 0);
        }
        o0VarQ.p(this.containerId, fragmentA, entry.f());
        o0VarQ.s(fragmentA);
        o0VarQ.t(true);
        return o0VarQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(b bVar, b0 source, androidx.lifecycle.s.a event) {
        s.h(source, "source");
        s.h(event, "event");
        if (event == androidx.lifecycle.s.a.ON_DESTROY) {
            Fragment fragment = (Fragment) source;
            Object obj = null;
            for (Object obj2 : (Iterable) bVar.d().d().getValue()) {
                if (s.c(((y3.y) obj2).f(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            y3.y yVar = (y3.y) obj;
            if (yVar != null) {
                if (bVar.N(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + yVar + " due to fragment " + source + " lifecycle reaching DESTROYED");
                }
                bVar.d().f(yVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y K(final b bVar, final y3.y entry) {
        s.h(entry, "entry");
        return new y() { // from class: a4.e
            @Override // androidx.lifecycle.y
            public final void c(b0 b0Var, androidx.lifecycle.s.a aVar) {
                androidx.navigation.fragment.b.L(this.f124a, entry, b0Var, aVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(b bVar, y3.y yVar, b0 owner, androidx.lifecycle.s.a event) {
        s.h(owner, "owner");
        s.h(event, "event");
        if (event == androidx.lifecycle.s.a.ON_RESUME && ((List) bVar.d().c().getValue()).contains(yVar)) {
            if (bVar.N(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + yVar + " due to fragment " + owner + " view lifecycle reaching RESUMED");
            }
            bVar.d().f(yVar);
        }
        if (event == androidx.lifecycle.s.a.ON_DESTROY) {
            if (bVar.N(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + yVar + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
            }
            bVar.d().f(yVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N(int level) {
        return Log.isLoggable("FragmentManager", level) || Log.isLoggable("FragmentNavigator", level);
    }

    private final void O(y3.y entry, m1 navOptions, z1.a navigatorExtras) {
        boolean zIsEmpty = ((List) d().c().getValue()).isEmpty();
        if (navOptions != null && !zIsEmpty && navOptions.l() && this.savedIds.remove(entry.f())) {
            this.fragmentManager.o1(entry.f());
            d().m(entry);
            return;
        }
        o0 o0VarI = I(entry, navOptions);
        if (!zIsEmpty) {
            y3.y yVar = (y3.y) r.o0((List) d().c().getValue());
            if (yVar != null) {
                A(this, yVar.f(), false, false, 6, null);
            }
            A(this, entry.f(), false, false, 6, null);
            o0VarI.f(entry.f());
        }
        o0VarI.g();
        if (N(2)) {
            Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + entry);
        }
        d().m(entry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(b2 b2Var, b bVar, f0 f0Var, Fragment fragment) {
        Object objPrevious;
        s.h(f0Var, "<unused var>");
        s.h(fragment, "fragment");
        List list = (List) b2Var.c().getValue();
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!s.c(((y3.y) objPrevious).f(), fragment.getTag()));
        y3.y yVar = (y3.y) objPrevious;
        if (bVar.N(2)) {
            Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + yVar + " to FragmentManager " + bVar.fragmentManager);
        }
        if (yVar != null) {
            bVar.F(yVar, fragment);
            bVar.E(fragment, yVar, b2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Q(q it) {
        s.h(it, "it");
        return (String) it.h();
    }

    private final void z(final String id2, boolean isPop, boolean deduplicate) {
        if (deduplicate) {
            r.F(this.pendingOps, new Function1() { // from class: a4.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(androidx.navigation.fragment.b.B(id2, (q) obj));
                }
            });
        }
        this.pendingOps.add(w.a(id2, Boolean.valueOf(isPop)));
    }

    public final void E(final Fragment fragment, final y3.y entry, final b2 state) {
        s.h(fragment, "fragment");
        s.h(entry, "entry");
        s.h(state, "state");
        t1 viewModelStore = fragment.getViewModelStore();
        s.g(viewModelStore, "<get-viewModelStore>(...)");
        q1.c cVar = new q1.c();
        cVar.a(l0.b(a.class), new Function1() { // from class: a4.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return androidx.navigation.fragment.b.D((q1.a) obj);
            }
        });
        ((a) new s1(viewModelStore, cVar.b(), q1.a.b.f50288c).a(a.class)).k(new WeakReference(new tl.a() { // from class: a4.k
            @Override // tl.a
            public final Object invoke() {
                return androidx.navigation.fragment.b.C(entry, state, this, fragment);
            }
        }));
    }

    @Override // y3.z1
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public c c() {
        return new c(this);
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final List getPendingOps() {
        return this.pendingOps;
    }

    @Override // y3.z1
    public void g(List entries, m1 navOptions, z1.a navigatorExtras) {
        s.h(entries, "entries");
        if (this.fragmentManager.U0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            O((y3.y) it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // y3.z1
    public void i(final b2 state) {
        s.h(state, "state");
        super.i(state);
        if (N(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        this.fragmentManager.k(new j0() { // from class: a4.f
            @Override // androidx.fragment.app.j0
            public final void a(f0 f0Var, Fragment fragment) {
                androidx.navigation.fragment.b.P(state, this, f0Var, fragment);
            }
        });
        this.fragmentManager.l(new d(state, this));
    }

    @Override // y3.z1
    public void j(y3.y backStackEntry) {
        s.h(backStackEntry, "backStackEntry");
        if (this.fragmentManager.U0()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        o0 o0VarI = I(backStackEntry, null);
        List list = (List) d().c().getValue();
        if (list.size() > 1) {
            y3.y yVar = (y3.y) r.e0(list, r.n(list) - 1);
            if (yVar != null) {
                A(this, yVar.f(), false, false, 6, null);
            }
            A(this, backStackEntry.f(), true, false, 4, null);
            this.fragmentManager.d1(backStackEntry.f(), 1);
            A(this, backStackEntry.f(), false, false, 2, null);
            o0VarI.f(backStackEntry.f());
        }
        o0VarI.g();
        d().g(backStackEntry);
    }

    @Override // y3.z1
    public void l(Bundle savedState) {
        s.h(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.savedIds.clear();
            r.z(this.savedIds, stringArrayList);
        }
    }

    @Override // y3.z1
    public Bundle m() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return j0.e.a(w.a("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.savedIds)));
    }

    @Override // y3.z1
    public void n(y3.y popUpTo, boolean savedState) {
        s.h(popUpTo, "popUpTo");
        if (this.fragmentManager.U0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) d().c().getValue();
        int iIndexOf = list.indexOf(popUpTo);
        List listSubList = list.subList(iIndexOf, list.size());
        y3.y yVar = (y3.y) r.b0(list);
        y3.y yVar2 = (y3.y) r.e0(list, iIndexOf - 1);
        if (yVar2 != null) {
            A(this, yVar2.f(), false, false, 6, null);
        }
        List list2 = listSubList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            y3.y yVar3 = (y3.y) obj;
            if (j.m(j.y(r.T(this.pendingOps), new Function1() { // from class: a4.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return androidx.navigation.fragment.b.Q((q) obj2);
                }
            }), yVar3.f()) || !s.c(yVar3.f(), yVar.f())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            A(this, ((y3.y) arrayList.get(i10)).f(), true, false, 4, null);
        }
        if (savedState) {
            for (y3.y yVar4 : r.u0(list2)) {
                if (s.c(yVar4, yVar)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + yVar4);
                } else {
                    this.fragmentManager.t1(yVar4.f());
                    this.savedIds.add(yVar4.f());
                }
            }
        } else {
            this.fragmentManager.d1(popUpTo.f(), 1);
        }
        if (N(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + savedState);
        }
        d().j(popUpTo, savedState);
    }
}
