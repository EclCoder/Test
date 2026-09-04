package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f23891a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0347a> f23892b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f23893c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f23894d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f23895e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f23896f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f23897g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f23898h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23899i;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0347a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f23900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f23901b = new ArrayList<>();

        public C0347a(e eVar, String str) {
            this.f23900a = eVar;
            a(str);
        }

        public e a() {
            return this.f23900a;
        }

        public ArrayList<String> b() {
            return this.f23901b;
        }

        public void a(String str) {
            this.f23901b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f23898h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f23898h.containsKey(view)) {
            return this.f23898h.get(view);
        }
        Map<View, Boolean> map = this.f23898h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f23893c.get(str);
    }

    public C0347a c(View view) {
        C0347a c0347a = this.f23892b.get(view);
        if (c0347a != null) {
            this.f23892b.remove(view);
        }
        return c0347a;
    }

    public String d(View view) {
        if (this.f23891a.size() == 0) {
            return null;
        }
        String str = this.f23891a.get(view);
        if (str != null) {
            this.f23891a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        if (this.f23894d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f23899i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f23898h.containsKey(view)) {
            return true;
        }
        this.f23898h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
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
        this.f23894d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f23897g.get(str);
    }

    public HashSet<String> c() {
        return this.f23895e;
    }

    public void d() {
        this.f23899i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f23895e.add(adSessionId);
                            this.f23891a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f23896f.add(adSessionId);
                            this.f23893c.put(adSessionId, viewC);
                            this.f23897g.put(adSessionId, strA);
                        }
                    } else {
                        this.f23896f.add(adSessionId);
                        this.f23897g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f23891a.clear();
        this.f23892b.clear();
        this.f23893c.clear();
        this.f23894d.clear();
        this.f23895e.clear();
        this.f23896f.clear();
        this.f23897g.clear();
        this.f23899i = false;
    }

    public HashSet<String> b() {
        return this.f23896f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0347a c0347a = this.f23892b.get(view);
        if (c0347a != null) {
            c0347a.a(aVar.getAdSessionId());
        } else {
            this.f23892b.put(view, new C0347a(eVar, aVar.getAdSessionId()));
        }
    }
}
