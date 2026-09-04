package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f16539g = new e().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f16540h = r0.y0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f16541i = r0.y0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f16542j = r0.y0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f16543k = r0.y0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f16544l = r0.y0(4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a f16545m = new com.google.android.exoplayer2.g.a() { // from class: q9.d
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return com.google.android.exoplayer2.audio.a.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f16551f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f16552a;

        private d(a aVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(aVar.f16546a).setFlags(aVar.f16547b).setUsage(aVar.f16548c);
            int i10 = r0.f48425a;
            if (i10 >= 29) {
                b.a(usage, aVar.f16549d);
            }
            if (i10 >= 32) {
                c.a(usage, aVar.f16550e);
            }
            this.f16552a = usage.build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16553a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16554b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16555c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16556d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f16557e = 0;

        public a a() {
            return new a(this.f16553a, this.f16554b, this.f16555c, this.f16556d, this.f16557e);
        }

        public e b(int i10) {
            this.f16556d = i10;
            return this;
        }

        public e c(int i10) {
            this.f16553a = i10;
            return this;
        }

        public e d(int i10) {
            this.f16554b = i10;
            return this;
        }

        public e e(int i10) {
            this.f16557e = i10;
            return this;
        }

        public e f(int i10) {
            this.f16555c = i10;
            return this;
        }
    }

    public static /* synthetic */ a a(Bundle bundle) {
        e eVar = new e();
        String str = f16540h;
        if (bundle.containsKey(str)) {
            eVar.c(bundle.getInt(str));
        }
        String str2 = f16541i;
        if (bundle.containsKey(str2)) {
            eVar.d(bundle.getInt(str2));
        }
        String str3 = f16542j;
        if (bundle.containsKey(str3)) {
            eVar.f(bundle.getInt(str3));
        }
        String str4 = f16543k;
        if (bundle.containsKey(str4)) {
            eVar.b(bundle.getInt(str4));
        }
        String str5 = f16544l;
        if (bundle.containsKey(str5)) {
            eVar.e(bundle.getInt(str5));
        }
        return eVar.a();
    }

    public d b() {
        if (this.f16551f == null) {
            this.f16551f = new d();
        }
        return this.f16551f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f16546a == aVar.f16546a && this.f16547b == aVar.f16547b && this.f16548c == aVar.f16548c && this.f16549d == aVar.f16549d && this.f16550e == aVar.f16550e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f16546a) * 31) + this.f16547b) * 31) + this.f16548c) * 31) + this.f16549d) * 31) + this.f16550e;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f16540h, this.f16546a);
        bundle.putInt(f16541i, this.f16547b);
        bundle.putInt(f16542j, this.f16548c);
        bundle.putInt(f16543k, this.f16549d);
        bundle.putInt(f16544l, this.f16550e);
        return bundle;
    }

    private a(int i10, int i11, int i12, int i13, int i14) {
        this.f16546a = i10;
        this.f16547b = i11;
        this.f16548c = i12;
        this.f16549d = i13;
        this.f16550e = i14;
    }
}
