package e7;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import bm.r;
import com.facebook.FacebookException;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.o0;
import com.facebook.internal.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f37193f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f37194g = g.class.getCanonicalName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static g f37195h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f37196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f37197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f37198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashSet f37199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f37200e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized g a() {
            g gVarB;
            try {
                if (g.b() == null) {
                    g.d(new g(null));
                }
                gVarB = g.b();
                s.f(gVarB, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            } catch (Throwable th2) {
                throw th2;
            }
            return gVarB;
        }

        public final Bundle b(f7.a aVar, View rootView, View hostView) {
            List<f7.b> listC;
            f7.a aVar2;
            View view;
            List<b> listA;
            s.h(rootView, "rootView");
            s.h(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (aVar != null && (listC = aVar.c()) != null) {
                for (f7.b bVar : listC) {
                    if (bVar.d() != null && bVar.d().length() > 0) {
                        bundle.putString(bVar.a(), bVar.d());
                    } else if (bVar.b().size() > 0) {
                        if (s.c(bVar.c(), "relative")) {
                            c.a aVar3 = c.f37203f;
                            List listB = bVar.b();
                            String simpleName = hostView.getClass().getSimpleName();
                            s.g(simpleName, "hostView.javaClass.simpleName");
                            f7.a aVar4 = aVar;
                            listA = aVar3.a(aVar4, hostView, listB, 0, -1, simpleName);
                            aVar2 = aVar4;
                            view = rootView;
                        } else {
                            aVar2 = aVar;
                            c.a aVar5 = c.f37203f;
                            List listB2 = bVar.b();
                            String simpleName2 = rootView.getClass().getSimpleName();
                            s.g(simpleName2, "rootView.javaClass.simpleName");
                            view = rootView;
                            listA = aVar5.a(aVar2, view, listB2, 0, -1, simpleName2);
                        }
                        for (b bVar2 : listA) {
                            if (bVar2.a() != null) {
                                String strK = f7.f.k(bVar2.a());
                                if (strK.length() > 0) {
                                    bundle.putString(bVar.a(), strK);
                                    break;
                                }
                            }
                        }
                        aVar = aVar2;
                        rootView = view;
                    }
                }
            }
            return bundle;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f37201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f37202b;

        public b(View view, String viewMapKey) {
            s.h(view, "view");
            s.h(viewMapKey, "viewMapKey");
            this.f37201a = new WeakReference(view);
            this.f37202b = viewMapKey;
        }

        public final View a() {
            WeakReference weakReference = this.f37201a;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public final String b() {
            return this.f37202b;
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ g b() {
        if (x7.a.c(g.class)) {
            return null;
        }
        try {
            return f37195h;
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (x7.a.c(g.class)) {
            return null;
        }
        try {
            return f37194g;
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (x7.a.c(g.class)) {
            return;
        }
        try {
            f37195h = gVar;
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
        }
    }

    private final void g() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            for (Activity activity : this.f37197b) {
                if (activity != null) {
                    View viewD = n7.h.d(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.f37196a;
                    HashSet hashSet = this.f37199d;
                    s.g(activityName, "activityName");
                    this.f37198c.add(new c(viewD, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void i() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                g();
            } else {
                this.f37196a.post(new Runnable() { // from class: e7.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.j(this.f37192a);
                    }
                });
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(g this$0) {
        if (x7.a.c(g.class)) {
            return;
        }
        try {
            s.h(this$0, "this$0");
            this$0.g();
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
        }
    }

    public final void e(Activity activity) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(activity, "activity");
            if (o0.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f37197b.add(activity);
            this.f37199d.clear();
            HashSet hashSet = (HashSet) this.f37200e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f37199d = hashSet;
            }
            i();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void f(Activity activity) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(activity, "activity");
            this.f37200e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void h(Activity activity) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(activity, "activity");
            if (o0.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f37197b.remove(activity);
            this.f37198c.clear();
            HashMap map = this.f37200e;
            Integer numValueOf = Integer.valueOf(activity.hashCode());
            Object objClone = this.f37199d.clone();
            s.f(objClone, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
            map.put(numValueOf, (HashSet) objClone);
            this.f37199d.clear();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f37203f = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f37204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f37205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f37206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HashSet f37207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f37208e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final List b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View child = viewGroup.getChildAt(i10);
                    if (child.getVisibility() == 0) {
                        s.g(child, "child");
                        arrayList.add(child);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
            
                if (kotlin.jvm.internal.s.c(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final boolean c(android.view.View r10, f7.c r11, int r12) {
                /*
                    Method dump skipped, instruction units count: 323
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e7.g.c.a.c(android.view.View, f7.c, int):boolean");
            }

            public final List a(f7.a aVar, View view, List path, int i10, int i11, String mapKey) {
                f7.a aVar2;
                List list;
                a aVar3;
                s.h(path, "path");
                s.h(mapKey, "mapKey");
                String str = mapKey + '.' + i11;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (i10 >= path.size()) {
                        arrayList.add(new b(view, str));
                        aVar2 = aVar;
                        list = path;
                        aVar3 = this;
                    } else {
                        f7.c cVar = (f7.c) path.get(i10);
                        if (s.c(cVar.a(), "..")) {
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                List listB = b((ViewGroup) parent);
                                int size = listB.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    f7.a aVar4 = aVar;
                                    List list2 = path;
                                    arrayList.addAll(a(aVar4, (View) listB.get(i12), list2, i10 + 1, i12, str));
                                    i12++;
                                    aVar = aVar4;
                                    path = list2;
                                }
                            }
                        } else {
                            aVar2 = aVar;
                            list = path;
                            aVar3 = this;
                            if (s.c(cVar.a(), ".")) {
                                arrayList.add(new b(view, str));
                                return arrayList;
                            }
                            if (c(view, cVar, i11)) {
                                if (i10 == list.size() - 1) {
                                    arrayList.add(new b(view, str));
                                }
                            }
                        }
                    }
                    if (view instanceof ViewGroup) {
                        List listB2 = b((ViewGroup) view);
                        int size2 = listB2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            arrayList.addAll(aVar3.a(aVar2, (View) listB2.get(i13), list, i10 + 1, i13, str));
                            i13++;
                            aVar3 = this;
                        }
                    }
                }
                return arrayList;
            }

            private a() {
            }
        }

        public c(View view, Handler handler, HashSet listenerSet, String activityName) {
            s.h(handler, "handler");
            s.h(listenerSet, "listenerSet");
            s.h(activityName, "activityName");
            this.f37204a = new WeakReference(view);
            this.f37206c = handler;
            this.f37207d = listenerSet;
            this.f37208e = activityName;
            handler.postDelayed(this, 200L);
        }

        private final void a(b bVar, View view, f7.a aVar) {
            if (aVar == null) {
                return;
            }
            try {
                View viewA = bVar.a();
                if (viewA == null) {
                    return;
                }
                View viewA2 = f7.f.a(viewA);
                if (viewA2 != null && f7.f.f38332a.p(viewA, viewA2)) {
                    d(bVar, view, aVar);
                    return;
                }
                String name = viewA.getClass().getName();
                s.g(name, "view.javaClass.name");
                if (r.N(name, "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(viewA instanceof AdapterView)) {
                    b(bVar, view, aVar);
                } else if (viewA instanceof ListView) {
                    c(bVar, view, aVar);
                }
            } catch (Exception e10) {
                e1.k0(g.c(), e10);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        private final void b(b bVar, View view, f7.a aVar) {
            boolean z10;
            View viewA = bVar.a();
            if (viewA == null) {
                return;
            }
            String strB = bVar.b();
            View.OnClickListener onClickListenerG = f7.f.g(viewA);
            if (onClickListenerG instanceof e7.b.a) {
                s.f(onClickListenerG, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                if (((e7.b.a) onClickListenerG).a()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (this.f37207d.contains(strB) || z10) {
                return;
            }
            viewA.setOnClickListener(e7.b.b(aVar, view, viewA));
            this.f37207d.add(strB);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        private final void d(b bVar, View view, f7.a aVar) {
            boolean z10;
            View viewA = bVar.a();
            if (viewA == null) {
                return;
            }
            String strB = bVar.b();
            View.OnTouchListener onTouchListenerH = f7.f.h(viewA);
            if (onTouchListenerH instanceof h.a) {
                s.f(onTouchListenerH, "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                if (((h.a) onTouchListenerH).a()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (this.f37207d.contains(strB) || z10) {
                return;
            }
            viewA.setOnTouchListener(h.a(aVar, view, viewA));
            this.f37207d.add(strB);
        }

        private final void e(f7.a aVar, View view) {
            if (aVar == null || view == null) {
                return;
            }
            String strA = aVar.a();
            if (strA == null || strA.length() == 0 || s.c(aVar.a(), this.f37208e)) {
                List listD = aVar.d();
                if (listD.size() > 25) {
                    return;
                }
                Iterator it = f37203f.a(aVar, view, listD, 0, -1, this.f37208e).iterator();
                while (it.hasNext()) {
                    a((b) it.next(), view, aVar);
                }
            }
        }

        private final void f() {
            List list = this.f37205b;
            if (list == null || this.f37204a.get() == null) {
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                e((f7.a) list.get(i10), (View) this.f37204a.get());
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (x7.a.c(this)) {
                return;
            }
            try {
                if (x7.a.c(this)) {
                    return;
                }
                try {
                    w wVarF = a0.f(h0.n());
                    if (wVarF != null && wVarF.d()) {
                        List listB = f7.a.f38290j.b(wVarF.i());
                        this.f37205b = listB;
                        if (listB != null && (view = (View) this.f37204a.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            f();
                        }
                    }
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                }
            } catch (Throwable th3) {
                x7.a.b(th3, this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        private final void c(b bVar, View view, f7.a aVar) {
            boolean z10;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView != null) {
                String strB = bVar.b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (onItemClickListener instanceof e7.b.C0559b) {
                    s.f(onItemClickListener, CIdIVqKnNZ.ogXNXHyEPr);
                    if (((e7.b.C0559b) onItemClickListener).a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (!this.f37207d.contains(strB) && !z10) {
                    adapterView.setOnItemClickListener(e7.b.c(aVar, view, adapterView));
                    this.f37207d.add(strB);
                }
            }
        }
    }

    private g() {
        this.f37196a = new Handler(Looper.getMainLooper());
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        s.g(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f37197b = setNewSetFromMap;
        this.f37198c = new LinkedHashSet();
        this.f37199d = new HashSet();
        this.f37200e = new HashMap();
    }
}
