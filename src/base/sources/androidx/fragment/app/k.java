package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k extends x0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f4151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f4152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private t.a f4153e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.c operation, j0.f signal, boolean z10) {
            super(operation, signal);
            kotlin.jvm.internal.s.h(operation, "operation");
            kotlin.jvm.internal.s.h(signal, "signal");
            this.f4151c = z10;
        }

        public final t.a e(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            if (this.f4152d) {
                return this.f4153e;
            }
            t.a aVarB = t.b(context, b().h(), b().g() == x0.c.b.VISIBLE, this.f4151c);
            this.f4153e = aVarB;
            this.f4152d = true;
            return aVarB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x0.c f4154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j0.f f4155b;

        public b(x0.c operation, j0.f signal) {
            kotlin.jvm.internal.s.h(operation, "operation");
            kotlin.jvm.internal.s.h(signal, "signal");
            this.f4154a = operation;
            this.f4155b = signal;
        }

        public final void a() {
            this.f4154a.f(this.f4155b);
        }

        public final x0.c b() {
            return this.f4154a;
        }

        public final j0.f c() {
            return this.f4155b;
        }

        public final boolean d() {
            x0.c.b.a aVar = x0.c.b.f4317a;
            View view = this.f4154a.h().mView;
            kotlin.jvm.internal.s.g(view, "operation.fragment.mView");
            x0.c.b bVarA = aVar.a(view);
            x0.c.b bVarG = this.f4154a.g();
            if (bVarA == bVarG) {
                return true;
            }
            x0.c.b bVar = x0.c.b.VISIBLE;
            return (bVarA == bVar || bVarG == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f4156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f4157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Object f4158e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x0.c operation, j0.f signal, boolean z10, boolean z11) {
            Object returnTransition;
            super(operation, signal);
            kotlin.jvm.internal.s.h(operation, "operation");
            kotlin.jvm.internal.s.h(signal, "signal");
            x0.c.b bVarG = operation.g();
            x0.c.b bVar = x0.c.b.VISIBLE;
            if (bVarG == bVar) {
                Fragment fragmentH = operation.h();
                returnTransition = z10 ? fragmentH.getReenterTransition() : fragmentH.getEnterTransition();
            } else {
                Fragment fragmentH2 = operation.h();
                returnTransition = z10 ? fragmentH2.getReturnTransition() : fragmentH2.getExitTransition();
            }
            this.f4156c = returnTransition;
            this.f4157d = operation.g() == bVar ? z10 ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.f4158e = z11 ? z10 ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        private final r0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            r0 r0Var = p0.f4236b;
            if (r0Var != null && r0Var.e(obj)) {
                return r0Var;
            }
            r0 r0Var2 = p0.f4237c;
            if (r0Var2 != null && r0Var2.e(obj)) {
                return r0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final r0 e() {
            r0 r0VarF = f(this.f4156c);
            r0 r0VarF2 = f(this.f4158e);
            if (r0VarF == null || r0VarF2 == null || r0VarF == r0VarF2) {
                return r0VarF == null ? r0VarF2 : r0VarF;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.f4156c + " which uses a different Transition  type than its shared element transition " + this.f4158e).toString());
        }

        public final Object g() {
            return this.f4158e;
        }

        public final Object h() {
            return this.f4156c;
        }

        public final boolean i() {
            return this.f4158e != null;
        }

        public final boolean j() {
            return this.f4157d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.jvm.internal.t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f4159a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Collection collection) {
            super(1);
            this.f4159a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            kotlin.jvm.internal.s.h(entry, "entry");
            return Boolean.valueOf(gl.r.U(this.f4159a, n0.q0.K((View) entry.getValue())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x0.c f4163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f4164e;

        e(View view, boolean z10, x0.c cVar, a aVar) {
            this.f4161b = view;
            this.f4162c = z10;
            this.f4163d = cVar;
            this.f4164e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator anim) {
            kotlin.jvm.internal.s.h(anim, "anim");
            k.this.q().endViewTransition(this.f4161b);
            if (this.f4162c) {
                x0.c.b bVarG = this.f4163d.g();
                View viewToAnimate = this.f4161b;
                kotlin.jvm.internal.s.g(viewToAnimate, "viewToAnimate");
                bVarG.e(viewToAnimate);
            }
            this.f4164e.a();
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f4163d + " has ended.");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.c f4165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f4166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f4167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f4168d;

        f(x0.c cVar, k kVar, View view, a aVar) {
            this.f4165a = cVar;
            this.f4166b = kVar;
            this.f4167c = view;
            this.f4168d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(k this$0, View view, a animationInfo) {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(animationInfo, "$animationInfo");
            this$0.q().endViewTransition(view);
            animationInfo.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
            ViewGroup viewGroupQ = this.f4166b.q();
            final k kVar = this.f4166b;
            final View view = this.f4167c;
            final a aVar = this.f4168d;
            viewGroupQ.post(new Runnable() { // from class: androidx.fragment.app.l
                @Override // java.lang.Runnable
                public final void run() {
                    k.f.b(kVar, view, aVar);
                }
            });
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4165a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4165a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ViewGroup container) {
        super(container);
        kotlin.jvm.internal.s.h(container, "container");
    }

    private final void D(x0.c cVar) {
        View view = cVar.h().mView;
        x0.c.b bVarG = cVar.g();
        kotlin.jvm.internal.s.g(view, "view");
        bVarG.e(view);
    }

    private final void E(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (n0.v0.c(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            if (child.getVisibility() == 0) {
                kotlin.jvm.internal.s.g(child, "child");
                E(arrayList, child);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(List awaitingContainerChanges, x0.c operation, k this$0) {
        kotlin.jvm.internal.s.h(awaitingContainerChanges, "$awaitingContainerChanges");
        kotlin.jvm.internal.s.h(operation, "$operation");
        kotlin.jvm.internal.s.h(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.D(operation);
        }
    }

    private final void G(Map map, View view) {
        String strK = n0.q0.K(view);
        if (strK != null) {
            map.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    kotlin.jvm.internal.s.g(child, "child");
                    G(map, child);
                }
            }
        }
    }

    private final void H(androidx.collection.a aVar, Collection collection) {
        Set entries = aVar.entrySet();
        kotlin.jvm.internal.s.g(entries, "entries");
        gl.r.J(entries, new d(collection));
    }

    private final void I(List list, List list2, boolean z10, Map map) {
        Context context = q().getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i10 = 0;
        boolean z11 = false;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.d()) {
                aVar.a();
            } else {
                kotlin.jvm.internal.s.g(context, "context");
                t.a aVarE = aVar.e(context);
                if (aVarE == null) {
                    aVar.a();
                } else {
                    final Animator animator = aVarE.f4279b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        final x0.c cVarB = aVar.b();
                        Fragment fragmentH = cVarB.h();
                        if (kotlin.jvm.internal.s.c(map.get(cVarB), Boolean.TRUE)) {
                            if (f0.N0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragmentH + " as this Fragment was involved in a Transition.");
                            }
                            aVar.a();
                        } else {
                            boolean z12 = cVarB.g() == x0.c.b.GONE;
                            if (z12) {
                                list2.remove(cVarB);
                            }
                            View view = fragmentH.mView;
                            q().startViewTransition(view);
                            animator.addListener(new e(view, z12, cVarB, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (f0.N0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + cVarB + " has started.");
                            }
                            aVar.c().b(new j0.f.a() { // from class: androidx.fragment.app.e
                                @Override // j0.f.a
                                public final void onCancel() {
                                    k.J(animator, cVarB);
                                }
                            });
                            z11 = true;
                        }
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            final a aVar2 = (a) obj;
            final x0.c cVarB2 = aVar2.b();
            Fragment fragmentH2 = cVarB2.h();
            if (z10) {
                if (f0.N0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentH2 + " as Animations cannot run alongside Transitions.");
                }
                aVar2.a();
            } else if (z11) {
                if (f0.N0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentH2 + " as Animations cannot run alongside Animators.");
                }
                aVar2.a();
            } else {
                final View view2 = fragmentH2.mView;
                kotlin.jvm.internal.s.g(context, "context");
                t.a aVarE2 = aVar2.e(context);
                if (aVarE2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = aVarE2.f4278a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (cVarB2.g() != x0.c.b.REMOVED) {
                    view2.startAnimation(animation);
                    aVar2.a();
                } else {
                    q().startViewTransition(view2);
                    t.b bVar = new t.b(animation, q(), view2);
                    bVar.setAnimationListener(new f(cVarB2, this, view2, aVar2));
                    view2.startAnimation(bVar);
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + cVarB2 + " has started.");
                    }
                }
                aVar2.c().b(new j0.f.a() { // from class: androidx.fragment.app.f
                    @Override // j0.f.a
                    public final void onCancel() {
                        k.K(view2, this, aVar2, cVarB2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Animator animator, x0.c operation) {
        kotlin.jvm.internal.s.h(operation, "$operation");
        animator.end();
        if (f0.N0(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(View view, k this$0, a animationInfo, x0.c operation) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(animationInfo, "$animationInfo");
        kotlin.jvm.internal.s.h(operation, "$operation");
        view.clearAnimation();
        this$0.q().endViewTransition(view);
        animationInfo.a();
        if (f0.N0(2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }

    private final Map L(List list, List list2, final boolean z10, final x0.c cVar, final x0.c cVar2) {
        Object obj;
        String str;
        View view;
        String str2;
        Object obj2;
        Object obj3;
        Object obj4;
        ArrayList arrayList;
        View view2;
        x0.c cVar3;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        View view3;
        fl.q qVarA;
        int i10;
        final View view4;
        this = this;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : list) {
            if (!((c) obj5).d()) {
                arrayList3.add(obj5);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj6 = arrayList3.get(i11);
            i11++;
            if (((c) obj6).e() != null) {
                arrayList4.add(obj6);
            }
        }
        int size2 = arrayList4.size();
        final r0 r0Var = null;
        int i12 = 0;
        while (i12 < size2) {
            Object obj7 = arrayList4.get(i12);
            i12++;
            c cVar4 = (c) obj7;
            r0 r0VarE = cVar4.e();
            if (r0Var != null && r0VarE != r0Var) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar4.b().h() + " returned Transition " + cVar4.h() + " which uses a different Transition type than other Fragments.").toString());
            }
            r0Var = r0VarE;
        }
        if (r0Var == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar5 = (c) it.next();
                linkedHashMap2.put(cVar5.b(), Boolean.FALSE);
                cVar5.a();
            }
        } else {
            View view5 = new View(this.q().getContext());
            final Rect rect = new Rect();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            androidx.collection.a aVar = new androidx.collection.a();
            Iterator it2 = list.iterator();
            Object obj8 = null;
            View view6 = null;
            boolean z11 = false;
            while (true) {
                obj = obj8;
                str = "FragmentManager";
                view = view6;
                if (!it2.hasNext()) {
                    break;
                }
                c cVar6 = (c) it2.next();
                if (!cVar6.i() || cVar == null || cVar2 == null) {
                    arrayList2 = arrayList6;
                    linkedHashMap = linkedHashMap2;
                    view3 = view5;
                    arrayList5 = arrayList5;
                    obj8 = obj;
                    view6 = view;
                    aVar = aVar;
                    view5 = view3;
                    linkedHashMap2 = linkedHashMap;
                    arrayList6 = arrayList2;
                } else {
                    Object objU = r0Var.u(r0Var.f(cVar6.g()));
                    ArrayList<String> sharedElementSourceNames = cVar2.h().getSharedElementSourceNames();
                    kotlin.jvm.internal.s.g(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames2 = cVar.h().getSharedElementSourceNames();
                    kotlin.jvm.internal.s.g(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = cVar.h().getSharedElementTargetNames();
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    kotlin.jvm.internal.s.g(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size3 = sharedElementTargetNames.size();
                    View view7 = view5;
                    int i13 = 0;
                    while (i13 < size3) {
                        int i14 = size3;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i13));
                        ArrayList<String> arrayList7 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i13));
                        }
                        i13++;
                        size3 = i14;
                        sharedElementTargetNames = arrayList7;
                    }
                    ArrayList<String> sharedElementTargetNames2 = cVar2.h().getSharedElementTargetNames();
                    kotlin.jvm.internal.s.g(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    if (z10) {
                        cVar.h().getEnterTransitionCallback();
                        cVar2.h().getExitTransitionCallback();
                        qVarA = fl.w.a(null, null);
                    } else {
                        cVar.h().getExitTransitionCallback();
                        cVar2.h().getEnterTransitionCallback();
                        qVarA = fl.w.a(null, null);
                    }
                    android.support.v4.media.session.b.a(qVarA.d());
                    android.support.v4.media.session.b.a(qVarA.g());
                    int i15 = 0;
                    for (int size4 = sharedElementSourceNames.size(); i15 < size4; size4 = size4) {
                        aVar.put(sharedElementSourceNames.get(i15), sharedElementTargetNames2.get(i15));
                        i15++;
                    }
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        int i16 = 0;
                        for (int size5 = sharedElementTargetNames2.size(); i16 < size5; size5 = size5) {
                            String str3 = sharedElementTargetNames2.get(i16);
                            Log.v("FragmentManager", "Name: " + str3);
                            i16++;
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        int i17 = 0;
                        for (int size6 = sharedElementSourceNames.size(); i17 < size6; size6 = size6) {
                            String str4 = sharedElementSourceNames.get(i17);
                            Log.v("FragmentManager", "Name: " + str4);
                            i17++;
                        }
                    }
                    androidx.collection.a aVar2 = new androidx.collection.a();
                    View view8 = cVar.h().mView;
                    kotlin.jvm.internal.s.g(view8, "firstOut.fragment.mView");
                    this.G(aVar2, view8);
                    aVar2.q(sharedElementSourceNames);
                    aVar.q(aVar2.keySet());
                    final androidx.collection.a aVar3 = new androidx.collection.a();
                    View view9 = cVar2.h().mView;
                    kotlin.jvm.internal.s.g(view9, "lastIn.fragment.mView");
                    this.G(aVar3, view9);
                    aVar3.q(sharedElementTargetNames2);
                    aVar3.q(aVar.values());
                    p0.c(aVar, aVar3);
                    Set setKeySet = aVar.keySet();
                    kotlin.jvm.internal.s.g(setKeySet, "sharedElementNameMapping.keys");
                    this.H(aVar2, setKeySet);
                    Collection collectionValues = aVar.values();
                    kotlin.jvm.internal.s.g(collectionValues, "sharedElementNameMapping.values");
                    this.H(aVar3, collectionValues);
                    if (aVar.isEmpty()) {
                        arrayList5.clear();
                        arrayList6.clear();
                        view6 = view;
                        linkedHashMap2 = linkedHashMap3;
                        view5 = view7;
                        obj8 = null;
                    } else {
                        androidx.collection.a aVar4 = aVar;
                        p0.a(cVar2.h(), cVar.h(), z10, aVar2, true);
                        n0.e0.a(this.q(), new Runnable() { // from class: androidx.fragment.app.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                k.P(cVar2, cVar, z10, aVar3);
                            }
                        });
                        arrayList5.addAll(aVar2.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            View view10 = (View) aVar2.get(sharedElementSourceNames.get(0));
                            r0Var.p(objU, view10);
                            view = view10;
                        }
                        arrayList6.addAll(aVar3.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view4 = (View) aVar3.get(sharedElementTargetNames2.get(i10))) != null) {
                            n0.e0.a(this.q(), new Runnable() { // from class: androidx.fragment.app.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    k.M(r0Var, view4, rect);
                                }
                            });
                            z11 = true;
                        }
                        view3 = view7;
                        r0Var.s(objU, view3, arrayList5);
                        ArrayList arrayList8 = arrayList6;
                        r0Var.n(objU, null, null, null, null, objU, arrayList8);
                        arrayList2 = arrayList8;
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap = linkedHashMap3;
                        linkedHashMap.put(cVar, bool);
                        linkedHashMap.put(cVar2, bool);
                        obj8 = objU;
                        view6 = view;
                        aVar = aVar4;
                        arrayList5 = arrayList5;
                        view5 = view3;
                        linkedHashMap2 = linkedHashMap;
                        arrayList6 = arrayList2;
                    }
                }
            }
            androidx.collection.a aVar5 = aVar;
            ArrayList arrayList9 = arrayList6;
            boolean z12 = true;
            LinkedHashMap linkedHashMap4 = linkedHashMap2;
            View view11 = view5;
            ArrayList arrayList10 = arrayList5;
            ArrayList arrayList11 = new ArrayList();
            Iterator it3 = list.iterator();
            Object objK = null;
            Object objK2 = null;
            while (it3.hasNext()) {
                c cVar7 = (c) it3.next();
                if (cVar7.d()) {
                    linkedHashMap4.put(cVar7.b(), Boolean.FALSE);
                    cVar7.a();
                } else {
                    Object objF = r0Var.f(cVar7.h());
                    x0.c cVarB = cVar7.b();
                    boolean z13 = obj != null && (cVarB == cVar || cVarB == cVar2);
                    if (objF != null) {
                        LinkedHashMap linkedHashMap5 = linkedHashMap4;
                        final ArrayList arrayList12 = new ArrayList();
                        it3 = it3;
                        View view12 = cVarB.h().mView;
                        Object obj9 = objK;
                        kotlin.jvm.internal.s.g(view12, "operation.fragment.mView");
                        this.E(arrayList12, view12);
                        if (z13) {
                            if (cVarB == cVar) {
                                arrayList12.removeAll(gl.r.N0(arrayList10));
                            } else {
                                arrayList12.removeAll(gl.r.N0(arrayList9));
                            }
                        }
                        if (arrayList12.isEmpty()) {
                            r0Var.a(objF, view11);
                            view11 = view11;
                            linkedHashMap4 = linkedHashMap5;
                            arrayList = arrayList9;
                            obj2 = objF;
                            str = str;
                            obj4 = objK2;
                            cVar3 = cVarB;
                            view2 = view;
                            obj3 = obj9;
                            z12 = true;
                            arrayList10 = arrayList10;
                            obj = obj;
                        } else {
                            r0Var.b(objF, arrayList12);
                            obj2 = objF;
                            view11 = view11;
                            linkedHashMap4 = linkedHashMap5;
                            obj3 = obj9;
                            str = str;
                            obj4 = objK2;
                            z12 = true;
                            arrayList = arrayList9;
                            view2 = view;
                            arrayList10 = arrayList10;
                            obj = obj;
                            r0Var.n(obj2, objF, arrayList12, null, null, null, null);
                            if (cVarB.g() == x0.c.b.GONE) {
                                cVar3 = cVarB;
                                list2.remove(cVar3);
                                ArrayList arrayList13 = new ArrayList(arrayList12);
                                arrayList13.remove(cVar3.h().mView);
                                r0Var.m(obj2, cVar3.h().mView, arrayList13);
                                n0.e0.a(q(), new Runnable() { // from class: androidx.fragment.app.i
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        k.N(arrayList12);
                                    }
                                });
                            } else {
                                cVar3 = cVarB;
                            }
                        }
                        if (cVar3.g() == x0.c.b.VISIBLE) {
                            arrayList11.addAll(arrayList12);
                            if (z11) {
                                r0Var.o(obj2, rect);
                            }
                        } else {
                            r0Var.p(obj2, view2);
                        }
                        linkedHashMap4.put(cVar3, Boolean.TRUE);
                        if (cVar7.j()) {
                            objK = r0Var.k(obj3, obj2, null);
                            objK2 = obj4;
                        } else {
                            objK2 = r0Var.k(obj4, obj2, null);
                            objK = obj3;
                        }
                        view = view2;
                        arrayList9 = arrayList;
                    } else if (!z13) {
                        linkedHashMap4.put(cVarB, Boolean.FALSE);
                        cVar7.a();
                    }
                }
                z12 = true;
            }
            ArrayList arrayList14 = arrayList10;
            ArrayList arrayList15 = arrayList9;
            boolean z14 = z12;
            linkedHashMap2 = linkedHashMap4;
            String str5 = str;
            Object obj10 = obj;
            Object objJ = r0Var.j(objK, objK2, obj10);
            if (objJ != null) {
                ArrayList arrayList16 = new ArrayList();
                for (Object obj11 : list) {
                    if (!((c) obj11).d()) {
                        arrayList16.add(obj11);
                    }
                }
                int size7 = arrayList16.size();
                int i18 = 0;
                while (i18 < size7) {
                    Object obj12 = arrayList16.get(i18);
                    i18++;
                    final c cVar8 = (c) obj12;
                    Object objH = cVar8.h();
                    final x0.c cVarB2 = cVar8.b();
                    boolean z15 = (obj10 == null || !(cVarB2 == cVar || cVarB2 == cVar2)) ? false : z14;
                    if (objH == null && !z15) {
                        str2 = str5;
                    } else if (n0.q0.T(q())) {
                        str2 = str5;
                        r0Var.q(cVar8.b().h(), objJ, cVar8.c(), new Runnable() { // from class: androidx.fragment.app.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                k.O(cVar8, cVarB2);
                            }
                        });
                    } else {
                        if (f0.N0(2)) {
                            str2 = str5;
                            Log.v(str2, "SpecialEffectsController: Container " + q() + " has not been laid out. Completing operation " + cVarB2);
                        } else {
                            str2 = str5;
                        }
                        cVar8.a();
                    }
                    str5 = str2;
                }
                String str6 = str5;
                if (n0.q0.T(q())) {
                    p0.d(arrayList11, 4);
                    ArrayList arrayListL = r0Var.l(arrayList15);
                    if (f0.N0(2)) {
                        Log.v(str6, ">>>>> Beginning transition <<<<<");
                        Log.v(str6, ">>>>> SharedElementFirstOutViews <<<<<");
                        int size8 = arrayList14.size();
                        int i19 = 0;
                        while (i19 < size8) {
                            Object sharedElementFirstOutViews = arrayList14.get(i19);
                            i19++;
                            kotlin.jvm.internal.s.g(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                            View view13 = (View) sharedElementFirstOutViews;
                            Log.v(str6, "View: " + view13 + " Name: " + n0.q0.K(view13));
                        }
                        Log.v(str6, ">>>>> SharedElementLastInViews <<<<<");
                        int size9 = arrayList15.size();
                        int i20 = 0;
                        while (i20 < size9) {
                            Object sharedElementLastInViews = arrayList15.get(i20);
                            i20++;
                            kotlin.jvm.internal.s.g(sharedElementLastInViews, "sharedElementLastInViews");
                            View view14 = (View) sharedElementLastInViews;
                            Log.v(str6, "View: " + view14 + " Name: " + n0.q0.K(view14));
                        }
                    }
                    r0Var.c(q(), objJ);
                    r0Var.r(q(), arrayList14, arrayList15, arrayListL, aVar5);
                    p0.d(arrayList11, 0);
                    r0Var.t(obj10, arrayList14, arrayList15);
                    return linkedHashMap2;
                }
            }
        }
        return linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(r0 impl, View view, Rect lastInEpicenterRect) {
        kotlin.jvm.internal.s.h(impl, "$impl");
        kotlin.jvm.internal.s.h(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.h(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(ArrayList transitioningViews) {
        kotlin.jvm.internal.s.h(transitioningViews, "$transitioningViews");
        p0.d(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(c transitionInfo, x0.c operation) {
        kotlin.jvm.internal.s.h(transitionInfo, "$transitionInfo");
        kotlin.jvm.internal.s.h(operation, "$operation");
        transitionInfo.a();
        if (f0.N0(2)) {
            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(x0.c cVar, x0.c cVar2, boolean z10, androidx.collection.a lastInViews) {
        kotlin.jvm.internal.s.h(lastInViews, "$lastInViews");
        p0.a(cVar.h(), cVar2.h(), z10, lastInViews, false);
    }

    private final void Q(List list) {
        Fragment fragmentH = ((x0.c) gl.r.n0(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x0.c cVar = (x0.c) it.next();
            cVar.h().mAnimationInfo.f4014c = fragmentH.mAnimationInfo.f4014c;
            cVar.h().mAnimationInfo.f4015d = fragmentH.mAnimationInfo.f4015d;
            cVar.h().mAnimationInfo.f4016e = fragmentH.mAnimationInfo.f4016e;
            cVar.h().mAnimationInfo.f4017f = fragmentH.mAnimationInfo.f4017f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d5  */
    @Override // androidx.fragment.app.x0
    public void j(List operations, boolean z10) {
        Object obj;
        Object next;
        kotlin.jvm.internal.s.h(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            x0.c cVar = (x0.c) next;
            x0.c.b.a aVar = x0.c.b.f4317a;
            View view = cVar.h().mView;
            kotlin.jvm.internal.s.g(view, "operation.fragment.mView");
            x0.c.b bVarA = aVar.a(view);
            x0.c.b bVar = x0.c.b.VISIBLE;
            if (bVarA == bVar && cVar.g() != bVar) {
                break;
            }
        }
        x0.c cVar2 = (x0.c) next;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            x0.c cVar3 = (x0.c) objPrevious;
            x0.c.b.a aVar2 = x0.c.b.f4317a;
            View view2 = cVar3.h().mView;
            kotlin.jvm.internal.s.g(view2, "operation.fragment.mView");
            x0.c.b bVarA2 = aVar2.a(view2);
            x0.c.b bVar2 = x0.c.b.VISIBLE;
            if (bVarA2 != bVar2 && cVar3.g() == bVar2) {
                obj = objPrevious;
                break;
            }
        }
        x0.c cVar4 = (x0.c) obj;
        if (f0.N0(2)) {
            Log.v("FragmentManager", "Executing operations from " + cVar2 + " to " + cVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List listL0 = gl.r.L0(operations);
        Q(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            final x0.c cVar5 = (x0.c) it2.next();
            j0.f fVar = new j0.f();
            cVar5.l(fVar);
            arrayList.add(new a(cVar5, fVar, z10));
            j0.f fVar2 = new j0.f();
            cVar5.l(fVar2);
            boolean z11 = false;
            if (z10) {
                if (cVar5 == cVar2) {
                    z11 = true;
                }
            } else if (cVar5 == cVar4) {
                z11 = true;
            }
            arrayList2.add(new c(cVar5, fVar2, z10, z11));
            cVar5.c(new Runnable() { // from class: androidx.fragment.app.d
                @Override // java.lang.Runnable
                public final void run() {
                    k.F(listL0, cVar5, this);
                }
            });
        }
        Map mapL = L(arrayList2, listL0, z10, cVar2, cVar4);
        I(arrayList, listL0, mapL.containsValue(Boolean.TRUE), mapL);
        Iterator it3 = listL0.iterator();
        while (it3.hasNext()) {
            D((x0.c) it3.next());
        }
        listL0.clear();
        if (f0.N0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + cVar2 + " to " + cVar4);
        }
    }
}
