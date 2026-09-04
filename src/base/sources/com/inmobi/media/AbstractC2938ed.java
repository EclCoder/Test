package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.ed, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2938ed {
    public static final List a(C2865bh c2865bh) {
        kotlin.jvm.internal.s.h(c2865bh, "<this>");
        return gl.r.o(fl.w.a(c2865bh.f26266b, (short) 0), fl.w.a(c2865bh.f26265a.getTitleView(), (short) 3), fl.w.a(c2865bh.f26265a.getDescriptionView(), (short) 4), fl.w.a(c2865bh.f26265a.getIconView(), (short) 5), fl.w.a(c2865bh.f26265a.getCtaView(), (short) 6), fl.w.a(c2865bh.f26267c, (short) 7), fl.w.a(c2865bh.f26265a.getRatingView(), (short) 8), fl.w.a(c2865bh.f26265a.getAdvertiserView(), (short) 9));
    }

    public static final void a(C2865bh c2865bh, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(c2865bh, "<this>");
        kotlin.jvm.internal.s.h("NativeRenderedState", "tag");
        if (interfaceC3322t9 == null) {
            return;
        }
        List<fl.q> listA = a(c2865bh);
        ViewGroup parentView = c2865bh.f26265a.getParentView();
        JSONArray jSONArray = new JSONArray();
        for (fl.q qVar : listA) {
            View view = (View) qVar.d();
            short sShortValue = ((Number) qVar.g()).shortValue();
            if (view != null) {
                boolean z10 = view.getVisibility() == 0;
                jSONArray.put(((int) sShortValue) + " - " + z10 + " " + Mn.a(view, parentView));
            }
        }
        String string = jSONArray.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        ((C3348u9) interfaceC3322t9).a("NativeRenderedState", string);
    }
}
