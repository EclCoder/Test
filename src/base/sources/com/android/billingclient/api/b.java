package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzca;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f10228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zzca f10229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f10230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10231g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f10234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c.a f10236e;

        /* synthetic */ a(l5.u uVar) {
            c.a aVarA = c.a();
            c.a.e(aVarA);
            this.f10236e = aVarA;
        }

        public b a() {
            List list = this.f10234c;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            List list2 = this.f10234c;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((C0141b) it.next()) == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
            }
            b bVar = new b(null);
            bVar.f10225a = !((C0141b) this.f10234c.get(0)).c().h().isEmpty();
            bVar.f10226b = this.f10232a;
            bVar.f10227c = this.f10233b;
            bVar.f10228d = this.f10236e.a();
            bVar.f10230f = new ArrayList();
            bVar.f10231g = this.f10235d;
            List list3 = this.f10234c;
            bVar.f10229e = list3 != null ? zzca.zzj(list3) : zzca.zzk();
            bVar.getClass();
            return bVar;
        }

        public a b(List list) {
            this.f10234c = new ArrayList(list);
            return this;
        }

        public a c(c cVar) {
            this.f10236e = c.c(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0141b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f10237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10238b;

        /* JADX INFO: renamed from: com.android.billingclient.api.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private g f10239a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10240b;

            /* synthetic */ a(l5.u uVar) {
            }

            static /* bridge */ /* synthetic */ C0142b d(a aVar) {
                aVar.getClass();
                return null;
            }

            public C0141b a() {
                zzbl.zzc(this.f10239a, "ProductDetails is required for constructing ProductDetailsParams.");
                return new C0141b(this, null);
            }

            public a b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f10240b = str;
                return this;
            }

            public a c(g gVar) {
                this.f10239a = gVar;
                if (gVar.b() != null) {
                    gVar.b().getClass();
                    g.b bVarB = gVar.b();
                    if (bVarB.b() != null) {
                        this.f10240b = bVarB.b();
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class C0142b {
        }

        /* synthetic */ C0141b(a aVar, l5.u uVar) {
            this.f10237a = aVar.f10239a;
            this.f10238b = aVar.f10240b;
            a.d(aVar);
        }

        public static a b() {
            return new a(null);
        }

        public C0142b a() {
            return null;
        }

        public final g c() {
            return this.f10237a;
        }

        public final String d() {
            return this.f10238b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10243c = 0;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10244a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10245b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f10246c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f10247d = 0;

            /* synthetic */ a(l5.u uVar) {
            }

            static /* synthetic */ a e(a aVar) {
                aVar.f10246c = true;
                return aVar;
            }

            public c a() {
                boolean z10 = true;
                l5.u uVar = null;
                if (TextUtils.isEmpty(this.f10244a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f10245b);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f10246c && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(uVar);
                cVar.f10241a = this.f10244a;
                cVar.f10243c = this.f10247d;
                cVar.f10242b = this.f10245b;
                return cVar;
            }

            public a b(String str) {
                this.f10244a = str;
                return this;
            }

            public a c(String str) {
                this.f10245b = str;
                return this;
            }

            public a d(int i10) {
                this.f10247d = i10;
                return this;
            }
        }

        /* synthetic */ c(l5.u uVar) {
        }

        public static a a() {
            return new a(null);
        }

        static /* bridge */ /* synthetic */ a c(c cVar) {
            a aVarA = a();
            aVarA.b(cVar.f10241a);
            aVarA.d(cVar.f10243c);
            aVarA.c(cVar.f10242b);
            return aVarA;
        }

        final int b() {
            return this.f10243c;
        }

        final String d() {
            return this.f10241a;
        }

        final String e() {
            return this.f10242b;
        }
    }

    /* synthetic */ b(l5.u uVar) {
    }

    public static a b() {
        return new a(null);
    }

    public l5.f a() {
        return null;
    }

    public int c() {
        return 0;
    }

    public final int d() {
        return this.f10228d.b();
    }

    public long e() {
        return 0L;
    }

    final com.android.billingclient.api.c f() {
        g.b bVar;
        if (this.f10229e.isEmpty()) {
            return w0.f10438i;
        }
        C0141b c0141b = (C0141b) this.f10229e.get(0);
        for (int i10 = 1; i10 < this.f10229e.size(); i10++) {
            C0141b c0141b2 = (C0141b) this.f10229e.get(i10);
            if (!c0141b2.c().e().equals(c0141b.c().e()) && !c0141b2.c().e().equals("play_pass_subs")) {
                return w0.a(5, "All products should have same ProductType.");
            }
        }
        String strH = c0141b.c().h();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        zzca zzcaVar = this.f10229e;
        int size = zzcaVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0141b c0141b3 = (C0141b) zzcaVar.get(i11);
            c0141b3.a();
            if (c0141b3.c().f() != null && c0141b3.d() == null) {
                return w0.a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", c0141b3.c().d()));
            }
            if (map.containsKey(c0141b3.c().d())) {
                return w0.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", c0141b3.c().d()));
            }
            map.put(c0141b3.c().d(), c0141b3);
            if (!c0141b.c().e().equals("play_pass_subs") && !c0141b3.c().e().equals("play_pass_subs") && !strH.equals(c0141b3.c().h())) {
                return w0.a(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet) {
            if (map.containsKey(str)) {
                ((C0141b) map.get(str)).a();
                return w0.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        List listC = c0141b.c().c();
        String strD = c0141b.d();
        if (strD != null && listC != null) {
            Iterator it = listC.iterator();
            do {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = (g.b) it.next();
            } while (!strD.equals(bVar.b()));
            if (bVar != null && bVar.e() != null) {
                return w0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return w0.f10438i;
    }

    public final String g() {
        return this.f10226b;
    }

    public final String h() {
        return this.f10227c;
    }

    public String i() {
        return null;
    }

    public final String j() {
        return this.f10228d.d();
    }

    public final String k() {
        return this.f10228d.e();
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f10230f);
        return arrayList;
    }

    public final List m() {
        return this.f10229e;
    }

    public final boolean v() {
        return this.f10231g;
    }

    final boolean w() {
        if (this.f10226b != null || this.f10227c != null || this.f10228d.e() != null || this.f10228d.b() != 0 || this.f10225a || this.f10231g) {
            return true;
        }
        zzca zzcaVar = this.f10229e;
        if (zzcaVar != null) {
            int size = zzcaVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C0141b) zzcaVar.get(i10)).a();
            }
        }
        return false;
    }
}
