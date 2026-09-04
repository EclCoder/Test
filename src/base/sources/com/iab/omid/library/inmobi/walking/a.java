package com.iab.omid.library.inmobi.walking;

import android.view.View;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24031a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0352a> f24032b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24033c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24034d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24035e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f24036f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24037g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f24038h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f24039i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24040j;

    /* JADX INFO: renamed from: com.iab.omid.library.inmobi.walking.a$a, reason: collision with other inner class name */
    public static class C0352a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f24041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24042b = new ArrayList<>();

        public C0352a(e eVar, String str) {
            this.f24041a = eVar;
            a(str);
        }

        public e a() {
            return this.f24041a;
        }

        public ArrayList<String> b() {
            return this.f24042b;
        }

        public void a(String str) {
            this.f24042b.add(str);
        }
    }

    public View a(String str) {
        return this.f24033c.get(str);
    }

    public C0352a b(View view) {
        C0352a c0352a = this.f24032b.get(view);
        if (c0352a != null) {
            this.f24032b.remove(view);
        }
        return c0352a;
    }

    public String c(View view) {
        if (this.f24031a.size() == 0) {
            return null;
        }
        String str = this.f24031a.get(view);
        if (str != null) {
            this.f24031a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f24034d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f24040j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.inmobi.internal.c cVarC = com.iab.omid.library.inmobi.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f24038h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f24035e.add(strC);
                            this.f24031a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f24036f.add(strC);
                            this.f24033c.put(strC, viewE);
                            this.f24037g.put(strC, strA);
                        }
                    } else {
                        this.f24036f.add(strC);
                        this.f24037g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f24039i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24039i.containsKey(view)) {
            return this.f24039i.get(view);
        }
        Map<View, Boolean> map = this.f24039i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f24037g.get(str);
    }

    public HashSet<String> c() {
        return this.f24035e;
    }

    public void d() {
        this.f24040j = true;
    }

    public boolean e(View view) {
        if (!this.f24039i.containsKey(view)) {
            return true;
        }
        this.f24039i.put(view, Boolean.TRUE);
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
        this.f24034d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f24036f;
    }

    public boolean c(String str) {
        return this.f24038h.contains(str);
    }

    public void a() {
        this.f24031a.clear();
        this.f24032b.clear();
        this.f24033c.clear();
        this.f24034d.clear();
        this.f24035e.clear();
        this.f24036f.clear();
        this.f24037g.clear();
        this.f24040j = false;
        this.f24038h.clear();
    }

    private void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.inmobi.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0352a c0352a = this.f24032b.get(view);
        if (c0352a != null) {
            c0352a.a(aVar.c());
        } else {
            this.f24032b.put(view, new C0352a(eVar, aVar.c()));
        }
    }
}
