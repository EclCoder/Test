package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24331a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0362a> f24332b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24333c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24334d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24335e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f24336f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24337g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f24338h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f24339i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24340j;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.a$a, reason: collision with other inner class name */
    public static class C0362a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f24341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24342b = new ArrayList<>();

        public C0362a(e eVar, String str) {
            this.f24341a = eVar;
            a(str);
        }

        public e a() {
            return this.f24341a;
        }

        public ArrayList<String> b() {
            return this.f24342b;
        }

        public void a(String str) {
            this.f24342b.add(str);
        }
    }

    public View a(String str) {
        return this.f24333c.get(str);
    }

    public C0362a b(View view) {
        C0362a c0362a = this.f24332b.get(view);
        if (c0362a != null) {
            this.f24332b.remove(view);
        }
        return c0362a;
    }

    public String c(View view) {
        if (this.f24331a.size() == 0) {
            return null;
        }
        String str = this.f24331a.get(view);
        if (str != null) {
            this.f24331a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f24334d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f24340j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.vungle.internal.c cVarC = com.iab.omid.library.vungle.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f24338h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f24335e.add(strC);
                            this.f24331a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f24336f.add(strC);
                            this.f24333c.put(strC, viewE);
                            this.f24337g.put(strC, strA);
                        }
                    } else {
                        this.f24336f.add(strC);
                        this.f24337g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f24339i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24339i.containsKey(view)) {
            return this.f24339i.get(view);
        }
        Map<View, Boolean> map = this.f24339i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f24337g.get(str);
    }

    public HashSet<String> c() {
        return this.f24335e;
    }

    public void d() {
        this.f24340j = true;
    }

    public boolean e(View view) {
        if (!this.f24339i.containsKey(view)) {
            return true;
        }
        this.f24339i.put(view, Boolean.TRUE);
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
        this.f24334d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f24336f;
    }

    public boolean c(String str) {
        return this.f24338h.contains(str);
    }

    public void a() {
        this.f24331a.clear();
        this.f24332b.clear();
        this.f24333c.clear();
        this.f24334d.clear();
        this.f24335e.clear();
        this.f24336f.clear();
        this.f24337g.clear();
        this.f24340j = false;
        this.f24338h.clear();
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0362a c0362a = this.f24332b.get(view);
        if (c0362a != null) {
            c0362a.a(aVar.c());
        } else {
            this.f24332b.put(view, new C0362a(eVar, aVar.c()));
        }
    }
}
