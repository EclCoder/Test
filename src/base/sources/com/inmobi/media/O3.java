package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.inmobi.media.O3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class O3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f25383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z3 f25384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3348u9 f25385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hm.v f25386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public em.z1 f25387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f25388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Dl f25389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Ej f25390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public T3 f25391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Y3 f25392j;

    public O3(Context context, em.o0 coroutineScope, Z3 companionTelemetryHelper, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(companionTelemetryHelper, "companionTelemetryHelper");
        this.f25383a = coroutineScope;
        this.f25384b = companionTelemetryHelper;
        this.f25385c = c3348u9;
        this.f25386d = hm.b0.b(0, 0, null, 7, null);
        this.f25391i = Q3.f25535a;
        this.f25392j = new Y3(context, c3348u9);
    }

    public final void a(ArrayList companionAds) {
        kotlin.jvm.internal.s.h(companionAds, "companionAds");
        if (companionAds.isEmpty()) {
            return;
        }
        if (!kotlin.jvm.internal.s.c(this.f25391i, Q3.f25535a)) {
            Objects.toString(this.f25391i);
            return;
        }
        Map mapA = AbstractC3487zk.a(this.f25384b.f26112a);
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("CompanionAdAvailable", mapA, EnumC3281rk.SDK);
        this.f25387e = em.k.d(this.f25383a, null, null, new N3(this, companionAds, null), 3, null);
    }

    public final void b() {
        View view = this.f25388f;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: yh.t2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    O3.a(this.f57933a, view2);
                }
            });
        }
    }

    public static final void a(O3 o10, View view) {
        Dl dl2 = o10.f25389g;
        if (dl2 != null) {
            List listS0 = gl.r.s0(dl2.f24669b, dl2.f24670c);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listS0) {
                if (kotlin.jvm.internal.s.c(((De) obj).f24653b, HqKnbV.DyNVosyDuPtqww)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(gl.r.v(arrayList, 10));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                arrayList2.add(((De) obj2).f24652a);
            }
            T4.a(o10.f25386d, o10.f25383a, new U3(arrayList2));
        }
    }

    public final void a() {
        ViewParent parent;
        C3348u9 c3348u9 = this.f25385c;
        if (c3348u9 != null) {
            c3348u9.a("CompanionAdManager", "destroy");
        }
        Ej ej2 = this.f25390h;
        if (ej2 != null) {
            Picasso picasso = Yf.f26082a;
            Yf.b(ej2.f24728a).cancelTag(ej2.f24730c);
        }
        L6.a(this.f25387e);
        View view = this.f25388f;
        if (view != null && (parent = view.getParent()) != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f25388f);
            }
        }
        this.f25387e = null;
        this.f25390h = null;
        this.f25388f = null;
        this.f25391i = Q3.f25535a;
    }
}
