package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f34180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f34184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f34185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<String> f34188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f34190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f34191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f34193q;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements InterfaceC0464c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f34194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f34195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f34196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f34197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f34198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f34199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f34200g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f34201h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f34202i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f34203j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f34204k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<String> f34205l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f34206m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f34207n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f34208o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f34209p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f34210q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c fileDirs(List<String> list) {
            this.f34205l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c orientation(int i10) {
            this.f34199f = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c a(Context context) {
            this.f34194a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c b(int i10) {
            this.f34196c = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c c(String str) {
            this.f34195b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c d(int i10) {
            this.f34206m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c e(int i10) {
            this.f34209p = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c f(int i10) {
            this.f34208o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c a(float f10) {
            this.f34198e = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c b(float f10) {
            this.f34197d = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c c(int i10) {
            this.f34200g = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c a(View view) {
            this.f34201h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c b(String str) {
            this.f34210q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c a(List<CampaignEx> list) {
            this.f34202i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c a(int i10) {
            this.f34203j = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c a(boolean z10) {
            this.f34204k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0464c
        public InterfaceC0464c a(String str) {
            this.f34207n = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0464c {
        InterfaceC0464c a(float f10);

        InterfaceC0464c a(int i10);

        InterfaceC0464c a(Context context);

        InterfaceC0464c a(View view);

        InterfaceC0464c a(String str);

        InterfaceC0464c a(List<CampaignEx> list);

        InterfaceC0464c a(boolean z10);

        InterfaceC0464c b(float f10);

        InterfaceC0464c b(int i10);

        InterfaceC0464c b(String str);

        c build();

        InterfaceC0464c c(int i10);

        InterfaceC0464c c(String str);

        InterfaceC0464c d(int i10);

        InterfaceC0464c e(int i10);

        InterfaceC0464c f(int i10);

        InterfaceC0464c fileDirs(List<String> list);

        InterfaceC0464c orientation(int i10);
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.f34185i;
    }

    public Context c() {
        return this.f34177a;
    }

    public List<String> d() {
        return this.f34188l;
    }

    public int e() {
        return this.f34191o;
    }

    public String f() {
        return this.f34178b;
    }

    public int g() {
        return this.f34179c;
    }

    public int h() {
        return this.f34182f;
    }

    public View i() {
        return this.f34184h;
    }

    public int j() {
        return this.f34183g;
    }

    public float k() {
        return this.f34180d;
    }

    public int l() {
        return this.f34186j;
    }

    public float m() {
        return this.f34181e;
    }

    public String n() {
        return this.f34193q;
    }

    public int o() {
        return this.f34192p;
    }

    public boolean p() {
        return this.f34187k;
    }

    private c(b bVar) {
        this.f34181e = bVar.f34198e;
        this.f34180d = bVar.f34197d;
        this.f34182f = bVar.f34199f;
        this.f34183g = bVar.f34200g;
        this.f34177a = bVar.f34194a;
        this.f34178b = bVar.f34195b;
        this.f34179c = bVar.f34196c;
        this.f34184h = bVar.f34201h;
        this.f34185i = bVar.f34202i;
        this.f34186j = bVar.f34203j;
        this.f34187k = bVar.f34204k;
        this.f34188l = bVar.f34205l;
        this.f34189m = bVar.f34206m;
        this.f34190n = bVar.f34207n;
        this.f34191o = bVar.f34208o;
        this.f34192p = bVar.f34209p;
        this.f34193q = bVar.f34210q;
    }
}
