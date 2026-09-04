package a4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import gl.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.s;
import y3.b2;
import y3.d1;
import y3.m1;
import y3.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006*\u00013\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002:;B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\"\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0014J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00104R \u00109\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0015068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, d2 = {"La4/b;", "Ly3/z1;", "La4/b$b;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/f0;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/f0;)V", "", "popUpToIndex", "Ly3/y;", "popUpTo", "", "savedState", "Lfl/g0;", "w", "(ILy3/y;Z)V", "entry", "u", "(Ly3/y;)V", "Landroidx/fragment/app/m;", "t", "(Ly3/y;)Landroidx/fragment/app/m;", "n", "(Ly3/y;Z)V", "s", "()La4/b$b;", "", "entries", "Ly3/m1;", "navOptions", "Ly3/z1$a;", "navigatorExtras", "g", "(Ljava/util/List;Ly3/m1;Ly3/z1$a;)V", "backStackEntry", "j", "Ly3/b2;", "state", "i", "(Ly3/b2;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/content/Context;", "e", "Landroidx/fragment/app/f0;", "", "", "f", "Ljava/util/Set;", "restoredTagsAwaitingAttach", "a4/b$c", "La4/b$c;", "observer", "", "h", "Ljava/util/Map;", "transitioningFragments", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@z1.b("dialog")
public final class b extends z1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f113i = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f0 fragmentManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set restoredTagsAwaitingAttach;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c observer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map transitioningFragments;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0001b extends d1 implements y3.n {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f119h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0001b(z1 fragmentNavigator) {
            super(fragmentNavigator);
            s.h(fragmentNavigator, "fragmentNavigator");
        }

        @Override // y3.d1
        public void B(Context context, AttributeSet attrs) {
            s.h(context, "context");
            s.h(attrs, "attrs");
            super.B(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, p.f140a);
            s.g(typedArrayObtainAttributes, "obtainAttributes(...)");
            String string = typedArrayObtainAttributes.getString(p.f141b);
            if (string != null) {
                J(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final String I() {
            String str = this.f119h;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
            }
            s.f(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        public final C0001b J(String className) {
            s.h(className, "className");
            this.f119h = className;
            return this;
        }

        @Override // y3.d1
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof C0001b) && super.equals(obj) && s.c(this.f119h, ((C0001b) obj).f119h);
        }

        @Override // y3.d1
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f119h;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements y {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f121a;

            static {
                int[] iArr = new int[androidx.lifecycle.s.a.values().length];
                try {
                    iArr[androidx.lifecycle.s.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.s.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.s.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.s.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f121a = iArr;
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.y
        public void c(b0 source, androidx.lifecycle.s.a event) {
            int iNextIndex;
            s.h(source, "source");
            s.h(event, "event");
            int i10 = a.f121a[event.ordinal()];
            if (i10 == 1) {
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) source;
                Iterable iterable = (Iterable) b.this.d().c().getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (s.c(((y3.y) it.next()).f(), mVar.getTag())) {
                            return;
                        }
                    }
                }
                mVar.dismiss();
                return;
            }
            Object obj = null;
            if (i10 == 2) {
                androidx.fragment.app.m mVar2 = (androidx.fragment.app.m) source;
                for (Object obj2 : (Iterable) b.this.d().d().getValue()) {
                    if (s.c(((y3.y) obj2).f(), mVar2.getTag())) {
                        obj = obj2;
                    }
                }
                y3.y yVar = (y3.y) obj;
                if (yVar != null) {
                    b.this.d().f(yVar);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                androidx.fragment.app.m mVar3 = (androidx.fragment.app.m) source;
                for (Object obj3 : (Iterable) b.this.d().d().getValue()) {
                    if (s.c(((y3.y) obj3).f(), mVar3.getTag())) {
                        obj = obj3;
                    }
                }
                y3.y yVar2 = (y3.y) obj;
                if (yVar2 != null) {
                    b.this.d().f(yVar2);
                }
                mVar3.getLifecycle().d(this);
                return;
            }
            androidx.fragment.app.m mVar4 = (androidx.fragment.app.m) source;
            if (mVar4.requireDialog().isShowing()) {
                return;
            }
            List list = (List) b.this.d().c().getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (s.c(((y3.y) listIterator.previous()).f(), mVar4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            y3.y yVar3 = (y3.y) r.e0(list, iNextIndex);
            if (!s.c(r.o0(list), yVar3)) {
                Log.i("DialogFragmentNavigator", "Dialog " + mVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (yVar3 != null) {
                b.this.w(iNextIndex, yVar3, false);
            }
        }
    }

    public b(Context context, f0 fragmentManager) {
        s.h(context, "context");
        s.h(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new c();
        this.transitioningFragments = new LinkedHashMap();
    }

    private final androidx.fragment.app.m t(y3.y entry) {
        d1 d1VarD = entry.d();
        s.f(d1VarD, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C0001b c0001b = (C0001b) d1VarD;
        String strI = c0001b.I();
        if (strI.charAt(0) == '.') {
            strI = this.context.getPackageName() + strI;
        }
        Fragment fragmentA = this.fragmentManager.x0().a(this.context.getClassLoader(), strI);
        s.g(fragmentA, "instantiate(...)");
        if (androidx.fragment.app.m.class.isAssignableFrom(fragmentA.getClass())) {
            androidx.fragment.app.m mVar = (androidx.fragment.app.m) fragmentA;
            mVar.setArguments(entry.b());
            mVar.getLifecycle().a(this.observer);
            this.transitioningFragments.put(entry.f(), mVar);
            return mVar;
        }
        throw new IllegalArgumentException(("Dialog destination " + c0001b.I() + " is not an instance of DialogFragment").toString());
    }

    private final void u(y3.y entry) {
        t(entry).show(this.fragmentManager, entry.f());
        y3.y yVar = (y3.y) r.o0((List) d().c().getValue());
        boolean zU = r.U((Iterable) d().d().getValue(), yVar);
        d().m(entry);
        if (yVar == null || zU) {
            return;
        }
        d().f(yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(b bVar, f0 f0Var, Fragment childFragment) {
        s.h(f0Var, "<unused var>");
        s.h(childFragment, "childFragment");
        Set set = bVar.restoredTagsAwaitingAttach;
        if (p0.a(set).remove(childFragment.getTag())) {
            childFragment.getLifecycle().a(bVar.observer);
        }
        Map map = bVar.transitioningFragments;
        p0.d(map).remove(childFragment.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int popUpToIndex, y3.y popUpTo, boolean savedState) {
        y3.y yVar = (y3.y) r.e0((List) d().c().getValue(), popUpToIndex - 1);
        boolean zU = r.U((Iterable) d().d().getValue(), yVar);
        d().j(popUpTo, savedState);
        if (yVar == null || zU) {
            return;
        }
        d().f(yVar);
    }

    @Override // y3.z1
    public void g(List entries, m1 navOptions, z1.a navigatorExtras) {
        s.h(entries, "entries");
        if (this.fragmentManager.U0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            u((y3.y) it.next());
        }
    }

    @Override // y3.z1
    public void i(b2 state) {
        androidx.lifecycle.s lifecycle;
        s.h(state, "state");
        super.i(state);
        for (y3.y yVar : (List) state.c().getValue()) {
            androidx.fragment.app.m mVar = (androidx.fragment.app.m) this.fragmentManager.k0(yVar.f());
            if (mVar == null || (lifecycle = mVar.getLifecycle()) == null) {
                this.restoredTagsAwaitingAttach.add(yVar.f());
            } else {
                lifecycle.a(this.observer);
            }
        }
        this.fragmentManager.k(new j0() { // from class: a4.a
            @Override // androidx.fragment.app.j0
            public final void a(f0 f0Var, Fragment fragment) {
                b.v(this.f112a, f0Var, fragment);
            }
        });
    }

    @Override // y3.z1
    public void j(y3.y backStackEntry) {
        s.h(backStackEntry, "backStackEntry");
        if (this.fragmentManager.U0()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.m mVar = (androidx.fragment.app.m) this.transitioningFragments.get(backStackEntry.f());
        if (mVar == null) {
            Fragment fragmentK0 = this.fragmentManager.k0(backStackEntry.f());
            mVar = fragmentK0 instanceof androidx.fragment.app.m ? (androidx.fragment.app.m) fragmentK0 : null;
        }
        if (mVar != null) {
            mVar.getLifecycle().d(this.observer);
            mVar.dismiss();
        }
        t(backStackEntry).show(this.fragmentManager, backStackEntry.f());
        d().h(backStackEntry);
    }

    @Override // y3.z1
    public void n(y3.y popUpTo, boolean savedState) {
        s.h(popUpTo, "popUpTo");
        if (this.fragmentManager.U0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) d().c().getValue();
        int iIndexOf = list.indexOf(popUpTo);
        Iterator it = r.u0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentK0 = this.fragmentManager.k0(((y3.y) it.next()).f());
            if (fragmentK0 != null) {
                ((androidx.fragment.app.m) fragmentK0).dismiss();
            }
        }
        w(iIndexOf, popUpTo, savedState);
    }

    @Override // y3.z1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0001b c() {
        return new C0001b(this);
    }
}
