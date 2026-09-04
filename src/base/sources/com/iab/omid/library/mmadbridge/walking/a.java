package com.iab.omid.library.mmadbridge.walking;

import android.view.View;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24166a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0356a> f24167b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24168c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24169d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24170e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f24171f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24172g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f24173h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f24174i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24175j;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.a$a, reason: collision with other inner class name */
    public static class C0356a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f24176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24177b = new ArrayList<>();

        public C0356a(e eVar, String str) {
            this.f24176a = eVar;
            a(str);
        }

        public e a() {
            return this.f24176a;
        }

        public ArrayList<String> b() {
            return this.f24177b;
        }

        public void a(String str) {
            this.f24177b.add(str);
        }
    }

    public View a(String str) {
        return this.f24168c.get(str);
    }

    public C0356a b(View view) {
        C0356a c0356a = this.f24167b.get(view);
        if (c0356a != null) {
            this.f24167b.remove(view);
        }
        return c0356a;
    }

    public String c(View view) {
        if (this.f24166a.size() == 0) {
            return null;
        }
        String str = this.f24166a.get(view);
        if (str != null) {
            this.f24166a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f24169d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f24175j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.mmadbridge.internal.c cVarC = com.iab.omid.library.mmadbridge.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.mmadbridge.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f24173h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f24170e.add(adSessionId);
                            this.f24166a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f24171f.add(adSessionId);
                            this.f24168c.put(adSessionId, viewC);
                            this.f24172g.put(adSessionId, strA);
                        }
                    } else {
                        this.f24171f.add(adSessionId);
                        this.f24172g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f24174i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24174i.containsKey(view)) {
            return this.f24174i.get(view);
        }
        Map<View, Boolean> map = this.f24174i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f24172g.get(str);
    }

    public HashSet<String> c() {
        return this.f24170e;
    }

    public void d() {
        this.f24175j = true;
    }

    public boolean e(View view) {
        if (!this.f24174i.containsKey(view)) {
            return true;
        }
        this.f24174i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z10) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f24169d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f24171f;
    }

    public boolean c(String str) {
        return this.f24173h.contains(str);
    }

    public void a() {
        this.f24166a.clear();
        this.f24167b.clear();
        this.f24168c.clear();
        this.f24169d.clear();
        this.f24170e.clear();
        this.f24171f.clear();
        this.f24172g.clear();
        this.f24175j = false;
        this.f24173h.clear();
    }

    private void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.mmadbridge.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0356a c0356a = this.f24167b.get(view);
        if (c0356a != null) {
            c0356a.a(aVar.getAdSessionId());
        } else {
            this.f24167b.put(view, new C0356a(eVar, aVar.getAdSessionId()));
        }
    }
}
