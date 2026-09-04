package com.mbridge.msdk.config.component.style;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.style.model.b;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class StyleCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f29127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private XMLView f29128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.style.inter.a f29129j;

    private void c(View view) {
        if (view != null) {
            view.setVisibility(0);
            HashMap map = new HashMap();
            map.put(c.c("view_tag"), view.getTag());
            a(a("903008", (Map<String, Object>) map));
        }
    }

    private void h() {
        String strA = this.f29127h.a();
        if (TextUtils.isEmpty(strA)) {
            a("2000005", "Component command is null");
            return;
        }
        try {
            if (strA.equals(c.c("319"))) {
                q();
                return;
            }
            if (strA.equals(c.c("325"))) {
                l();
            } else if (strA.equals(c.c("326"))) {
                a(8);
            } else if (strA.equals(c.c("307"))) {
                g();
            }
        } catch (Exception e10) {
            q0.b("StyleCpt", "Error in doRenderTemplateAction", e10);
            a("", "Command execute error " + e10.getMessage());
        }
    }

    private void i() {
        b bVar = this.f29127h;
        if (bVar == null || bVar.e() == null) {
            return;
        }
        for (com.mbridge.msdk.config.component.style.model.a aVar : this.f29127h.e()) {
            if (aVar != null) {
                String strA = aVar.a();
                String strD = aVar.d();
                if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strD)) {
                    View viewC = c(strD);
                    if (viewC == null) {
                        q0.b("StyleCpt", "Widget view not found: " + strD);
                    } else {
                        try {
                            if (strA.equals(c.c("319"))) {
                                c(viewC);
                            } else if (strA.equals(c.c("325"))) {
                                a(viewC);
                            } else if (strA.equals(c.c("328"))) {
                                a(viewC, aVar);
                            } else if (strA.equals(c.c("327"))) {
                                b(viewC);
                            }
                            c(viewC, aVar);
                            b(viewC, aVar);
                        } catch (Exception e10) {
                            q0.b("StyleCpt", "Error in doWidgetViewAction", e10);
                        }
                    }
                }
            }
        }
    }

    private void j() {
        b bVar = this.f29127h;
        if (bVar == null || TextUtils.isEmpty(bVar.d())) {
            return;
        }
        this.f29128i = com.mbridge.msdk.config.dynamic.utils.d.a(e(), SameMD5.getMD5(this.f29127h.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> k() {
        String strC;
        List<com.mbridge.msdk.config.component.style.model.a> listE = this.f29127h.e();
        if (listE != null && !listE.isEmpty()) {
            for (com.mbridge.msdk.config.component.style.model.a aVar : listE) {
                if (aVar != null && (strC = aVar.c()) != null) {
                    strC.equals("1");
                }
            }
        }
        return com.mbridge.msdk.config.dynamic.utils.d.a((ViewGroup) this.f29128i);
    }

    private void l() {
        XMLView xMLView = this.f29128i;
        if (xMLView == null) {
            return;
        }
        xMLView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        h();
        i();
    }

    private void p() {
        if (this.f29129j != null) {
            return;
        }
        this.f29129j = new a();
    }

    private void q() {
        HashMap map = new HashMap();
        a(a("903002", (Map<String, Object>) map));
        XMLView xMLView = this.f29128i;
        if (xMLView == null) {
            a(0);
        } else if (xMLView.getVisibility() != 0) {
            this.f29128i.setVisibility(0);
        }
        Map<String, Object> mapK = k();
        if (!mapK.isEmpty()) {
            map.putAll(mapK);
        }
        a(a("903006", (Map<String, Object>) map));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f28523f = "903001";
        this.f29127h = new b(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        j();
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.style.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f29131a.m();
            }
        });
        a("903011", (HashMap<String, Object>) null);
    }

    public void n() {
        a(a("903004", (Map<String, Object>) new HashMap()));
    }

    public void o() {
        a(a("903003", (Map<String, Object>) new HashMap()));
    }

    private void g() {
        if (this.f29128i != null && e() != null) {
            HashMap map = new HashMap();
            e().removeView(this.f29128i);
            Map<String, Object> mapK = k();
            if (!mapK.isEmpty()) {
                map.putAll(mapK);
            }
            a(a("903005", (Map<String, Object>) map));
        }
        Object objB = this.f28521d.b((Object) c.c("sdk_context"));
        if (objB instanceof Map) {
            Object obj = ((Map) objB).get("lifecycleListeners");
            if (obj instanceof List) {
                ((List) obj).clear();
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        p();
    }

    private void b(View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.c("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.c("116"));
                if (obj2 instanceof String) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        return strValueOf.equals(this.f29127h.d());
                    }
                }
            }
        }
        return false;
    }

    private void b(int i10) {
        XMLView xMLView;
        String strD = this.f29127h.d();
        if (TextUtils.isEmpty(strD)) {
            a("2000001", "Template URL is empty");
            return;
        }
        if (TextUtils.isEmpty(this.f29127h.b())) {
            a("2000003", "XML paths is error");
            return;
        }
        try {
            XMLView xMLView2 = (XMLView) new com.mbridge.msdk.config.dynamic.a().a(this.f29127h.b(), e(), this.f28521d);
            this.f29128i = xMLView2;
            if (xMLView2 == null) {
                a("2000004", "xml render fail");
                return;
            }
            xMLView2.setRenderMap(strD);
            this.f29128i.setXmlViewActionListener(this.f29129j);
            if (e() == null || (xMLView = this.f29128i) == null) {
                return;
            }
            xMLView.setVisibility(i10);
        } catch (Exception e10) {
            a("2000004", e10.getMessage());
        }
    }

    private void c(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("StyleCpt", "Widget view is null");
                return;
            }
            String strF = aVar.f();
            if (TextUtils.isEmpty(strF)) {
                return;
            }
            String[] strArrD = d(strF);
            if (strArrD.length != 2) {
                q0.b("StyleCpt", "Invalid widget size format: " + strF);
                return;
            }
            int i10 = Integer.parseInt(strArrD[0]);
            int i11 = Integer.parseInt(strArrD[1]);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i10;
                layoutParams.height = i11;
                view.setLayoutParams(layoutParams);
            }
        } catch (Exception e10) {
            q0.b("StyleCpt", "Error resizing widget: " + e10.getMessage());
        }
    }

    private String[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.replaceAll("[\\[\\]]", "").split(",");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.config.component.style.inter.a {
        a() {
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(String str, Map<String, Object> map) {
            if (TextUtils.isEmpty(str)) {
                q0.b("StyleCpt", "Click tag is empty");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put(c.c("view_tag"), str);
            if (map != null && !map.isEmpty()) {
                map2.putAll(map);
            }
            Map mapK = StyleCpt.this.k();
            if (!mapK.isEmpty()) {
                map2.put("all_properties", mapK);
            }
            StyleCpt styleCpt = StyleCpt.this;
            styleCpt.a(styleCpt.a("903010", (Map<String, Object>) map2));
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(Map<String, Object> map) {
            if (map != null) {
                StyleCpt styleCpt = StyleCpt.this;
                styleCpt.a(styleCpt.a("903008", map));
            }
        }
    }

    private void a(String str, String str2) {
        q0.b("StyleCpt", str2);
        HashMap map = new HashMap();
        map.put(c.c("reason"), str2);
        map.put(c.c("code"), str);
        if (this.f29127h.e() != null) {
            q0.b("StyleCpt", map.toString());
        } else {
            a(a("903007", (Map<String, Object>) map));
        }
    }

    private void b(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("StyleCpt", "Widget view is null");
                return;
            }
            String strE = aVar.e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            String[] strArrD = d(strE);
            if (strArrD.length != 2) {
                q0.b("StyleCpt", "Invalid widget location format: " + strE);
                return;
            }
            int i10 = Integer.parseInt(strArrD[0]);
            int i11 = Integer.parseInt(strArrD[1]);
            view.setX(i10);
            view.setY(i11);
        } catch (Exception e10) {
            q0.b("StyleCpt", "Error relocating widget: " + e10.getMessage());
        }
    }

    private View c(String str) {
        XMLView xMLView = this.f29128i;
        if (xMLView == null) {
            return e().findViewWithTag(str);
        }
        return xMLView.findViewWithTag(str);
    }

    private void a(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            Object objB = aVar.b();
            View view2 = objB instanceof View ? (View) objB : null;
            if (view2 == null) {
                q0.b("StyleCpt", "Action view is null");
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                viewGroup.addView(view2);
            }
        } catch (Exception e10) {
            q0.b("StyleCpt", "Error adding widget: " + e10.getMessage());
        }
    }

    private void a(View view) {
        if (view != null) {
            view.setVisibility(4);
            HashMap map = new HashMap();
            map.put(c.c("view_tag"), view.getTag());
            a(a("903009", (Map<String, Object>) map));
        }
    }

    private void a(int i10) {
        b(i10);
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        str.getClass();
        if (str.equals("onStop")) {
            o();
        } else if (str.equals("onResume")) {
            n();
        }
    }
}
