package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements g {
    private static final v0 I = new b().G();
    private static final String J = ob.r0.y0(0);
    private static final String K = ob.r0.y0(1);
    private static final String L = ob.r0.y0(2);
    private static final String M = ob.r0.y0(3);
    private static final String N = ob.r0.y0(4);
    private static final String O = ob.r0.y0(5);
    private static final String P = ob.r0.y0(6);
    private static final String Q = ob.r0.y0(7);
    private static final String R = ob.r0.y0(8);
    private static final String S = ob.r0.y0(9);
    private static final String T = ob.r0.y0(10);
    private static final String U = ob.r0.y0(11);
    private static final String V = ob.r0.y0(12);
    private static final String W = ob.r0.y0(13);
    private static final String X = ob.r0.y0(14);
    private static final String Y = ob.r0.y0(15);
    private static final String Z = ob.r0.y0(16);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f18841a0 = ob.r0.y0(17);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f18842b0 = ob.r0.y0(18);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f18843c0 = ob.r0.y0(19);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f18844d0 = ob.r0.y0(20);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f18845e0 = ob.r0.y0(21);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final String f18846f0 = ob.r0.y0(22);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f18847g0 = ob.r0.y0(23);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String f18848h0 = ob.r0.y0(24);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f18849i0 = ob.r0.y0(25);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f18850j0 = ob.r0.y0(26);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final String f18851k0 = ob.r0.y0(27);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f18852l0 = ob.r0.y0(28);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f18853m0 = ob.r0.y0(29);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final String f18854n0 = ob.r0.y0(30);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final String f18855o0 = ob.r0.y0(31);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g.a f18856p0 = new g.a() { // from class: o9.o
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return v0.e(bundle);
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    private int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ha.a f18866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f18867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f18868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f18870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.h f18871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f18872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f18875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f18876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f18877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f18878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f18879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final pb.c f18880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f18881y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f18882z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f18886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f18887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f18890h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ha.a f18891i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f18892j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f18893k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f18894l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List f18895m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.google.android.exoplayer2.drm.h f18896n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f18897o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f18898p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f18899q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f18900r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f18901s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f18902t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private byte[] f18903u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f18904v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private pb.c f18905w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f18906x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f18907y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f18908z;

        public v0 G() {
            return new v0(this);
        }

        public b H(int i10) {
            this.C = i10;
            return this;
        }

        public b I(int i10) {
            this.f18888f = i10;
            return this;
        }

        public b J(int i10) {
            this.f18906x = i10;
            return this;
        }

        public b K(String str) {
            this.f18890h = str;
            return this;
        }

        public b L(pb.c cVar) {
            this.f18905w = cVar;
            return this;
        }

        public b M(String str) {
            this.f18892j = str;
            return this;
        }

        public b N(int i10) {
            this.F = i10;
            return this;
        }

        public b O(com.google.android.exoplayer2.drm.h hVar) {
            this.f18896n = hVar;
            return this;
        }

        public b P(int i10) {
            this.A = i10;
            return this;
        }

        public b Q(int i10) {
            this.B = i10;
            return this;
        }

        public b R(float f10) {
            this.f18900r = f10;
            return this;
        }

        public b S(int i10) {
            this.f18899q = i10;
            return this;
        }

        public b T(int i10) {
            this.f18883a = Integer.toString(i10);
            return this;
        }

        public b U(String str) {
            this.f18883a = str;
            return this;
        }

        public b V(List list) {
            this.f18895m = list;
            return this;
        }

        public b W(String str) {
            this.f18884b = str;
            return this;
        }

        public b X(String str) {
            this.f18885c = str;
            return this;
        }

        public b Y(int i10) {
            this.f18894l = i10;
            return this;
        }

        public b Z(ha.a aVar) {
            this.f18891i = aVar;
            return this;
        }

        public b a0(int i10) {
            this.f18908z = i10;
            return this;
        }

        public b b0(int i10) {
            this.f18889g = i10;
            return this;
        }

        public b c0(float f10) {
            this.f18902t = f10;
            return this;
        }

        public b d0(byte[] bArr) {
            this.f18903u = bArr;
            return this;
        }

        public b e0(int i10) {
            this.f18887e = i10;
            return this;
        }

        public b f0(int i10) {
            this.f18901s = i10;
            return this;
        }

        public b g0(String str) {
            this.f18893k = str;
            return this;
        }

        public b h0(int i10) {
            this.f18907y = i10;
            return this;
        }

        public b i0(int i10) {
            this.f18886d = i10;
            return this;
        }

        public b j0(int i10) {
            this.f18904v = i10;
            return this;
        }

        public b k0(long j10) {
            this.f18897o = j10;
            return this;
        }

        public b l0(int i10) {
            this.D = i10;
            return this;
        }

        public b m0(int i10) {
            this.E = i10;
            return this;
        }

        public b n0(int i10) {
            this.f18898p = i10;
            return this;
        }

        public b() {
            this.f18888f = -1;
            this.f18889g = -1;
            this.f18894l = -1;
            this.f18897o = Long.MAX_VALUE;
            this.f18898p = -1;
            this.f18899q = -1;
            this.f18900r = -1.0f;
            this.f18902t = 1.0f;
            this.f18904v = -1;
            this.f18906x = -1;
            this.f18907y = -1;
            this.f18908z = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
        }

        private b(v0 v0Var) {
            this.f18883a = v0Var.f18857a;
            this.f18884b = v0Var.f18858b;
            this.f18885c = v0Var.f18859c;
            this.f18886d = v0Var.f18860d;
            this.f18887e = v0Var.f18861e;
            this.f18888f = v0Var.f18862f;
            this.f18889g = v0Var.f18863g;
            this.f18890h = v0Var.f18865i;
            this.f18891i = v0Var.f18866j;
            this.f18892j = v0Var.f18867k;
            this.f18893k = v0Var.f18868l;
            this.f18894l = v0Var.f18869m;
            this.f18895m = v0Var.f18870n;
            this.f18896n = v0Var.f18871o;
            this.f18897o = v0Var.f18872p;
            this.f18898p = v0Var.f18873q;
            this.f18899q = v0Var.f18874r;
            this.f18900r = v0Var.f18875s;
            this.f18901s = v0Var.f18876t;
            this.f18902t = v0Var.f18877u;
            this.f18903u = v0Var.f18878v;
            this.f18904v = v0Var.f18879w;
            this.f18905w = v0Var.f18880x;
            this.f18906x = v0Var.f18881y;
            this.f18907y = v0Var.f18882z;
            this.f18908z = v0Var.A;
            this.A = v0Var.B;
            this.B = v0Var.C;
            this.C = v0Var.D;
            this.D = v0Var.E;
            this.E = v0Var.F;
            this.F = v0Var.G;
        }
    }

    private static Object d(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v0 e(Bundle bundle) {
        b bVar = new b();
        ob.c.c(bundle);
        String string = bundle.getString(J);
        v0 v0Var = I;
        bVar.U((String) d(string, v0Var.f18857a)).W((String) d(bundle.getString(K), v0Var.f18858b)).X((String) d(bundle.getString(L), v0Var.f18859c)).i0(bundle.getInt(M, v0Var.f18860d)).e0(bundle.getInt(N, v0Var.f18861e)).I(bundle.getInt(O, v0Var.f18862f)).b0(bundle.getInt(P, v0Var.f18863g)).K((String) d(bundle.getString(Q), v0Var.f18865i)).Z((ha.a) d((ha.a) bundle.getParcelable(R), v0Var.f18866j)).M((String) d(bundle.getString(S), v0Var.f18867k)).g0((String) d(bundle.getString(T), v0Var.f18868l)).Y(bundle.getInt(U, v0Var.f18869m));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(h(i10));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        b bVarO = bVar.V(arrayList).O((com.google.android.exoplayer2.drm.h) bundle.getParcelable(W));
        String str = X;
        v0 v0Var2 = I;
        bVarO.k0(bundle.getLong(str, v0Var2.f18872p)).n0(bundle.getInt(Y, v0Var2.f18873q)).S(bundle.getInt(Z, v0Var2.f18874r)).R(bundle.getFloat(f18841a0, v0Var2.f18875s)).f0(bundle.getInt(f18842b0, v0Var2.f18876t)).c0(bundle.getFloat(f18843c0, v0Var2.f18877u)).d0(bundle.getByteArray(f18844d0)).j0(bundle.getInt(f18845e0, v0Var2.f18879w));
        Bundle bundle2 = bundle.getBundle(f18846f0);
        if (bundle2 != null) {
            bVar.L((pb.c) pb.c.f49829l.a(bundle2));
        }
        bVar.J(bundle.getInt(f18847g0, v0Var2.f18881y)).h0(bundle.getInt(f18848h0, v0Var2.f18882z)).a0(bundle.getInt(f18849i0, v0Var2.A)).P(bundle.getInt(f18850j0, v0Var2.B)).Q(bundle.getInt(f18851k0, v0Var2.C)).H(bundle.getInt(f18852l0, v0Var2.D)).l0(bundle.getInt(f18854n0, v0Var2.E)).m0(bundle.getInt(f18855o0, v0Var2.F)).N(bundle.getInt(f18853m0, v0Var2.G));
        return bVar.G();
    }

    private static String h(int i10) {
        return V + "_" + Integer.toString(i10, 36);
    }

    public static String j(v0 v0Var) {
        if (v0Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(v0Var.f18857a);
        sb2.append(", mimeType=");
        sb2.append(v0Var.f18868l);
        if (v0Var.f18864h != -1) {
            sb2.append(", bitrate=");
            sb2.append(v0Var.f18864h);
        }
        if (v0Var.f18865i != null) {
            sb2.append(", codecs=");
            sb2.append(v0Var.f18865i);
        }
        if (v0Var.f18871o != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                com.google.android.exoplayer2.drm.h hVar = v0Var.f18871o;
                if (i10 >= hVar.f16857d) {
                    break;
                }
                UUID uuid = hVar.f(i10).f16859b;
                if (uuid.equals(o9.b.f48263b)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(o9.b.f48264c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(o9.b.f48266e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(o9.b.f48265d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(o9.b.f48262a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i10++;
            }
            sb2.append(", drm=[");
            sc.i.f(',').b(sb2, linkedHashSet);
            sb2.append(']');
        }
        if (v0Var.f18873q != -1 && v0Var.f18874r != -1) {
            sb2.append(", res=");
            sb2.append(v0Var.f18873q);
            sb2.append("x");
            sb2.append(v0Var.f18874r);
        }
        pb.c cVar = v0Var.f18880x;
        if (cVar != null && cVar.g()) {
            sb2.append(", color=");
            sb2.append(v0Var.f18880x.j());
        }
        if (v0Var.f18875s != -1.0f) {
            sb2.append(", fps=");
            sb2.append(v0Var.f18875s);
        }
        if (v0Var.f18881y != -1) {
            sb2.append(", channels=");
            sb2.append(v0Var.f18881y);
        }
        if (v0Var.f18882z != -1) {
            sb2.append(", sample_rate=");
            sb2.append(v0Var.f18882z);
        }
        if (v0Var.f18859c != null) {
            sb2.append(", language=");
            sb2.append(v0Var.f18859c);
        }
        if (v0Var.f18858b != null) {
            sb2.append(", label=");
            sb2.append(v0Var.f18858b);
        }
        if (v0Var.f18860d != 0) {
            ArrayList arrayList = new ArrayList();
            if ((v0Var.f18860d & 4) != 0) {
                arrayList.add("auto");
            }
            if ((v0Var.f18860d & 1) != 0) {
                arrayList.add("default");
            }
            if ((v0Var.f18860d & 2) != 0) {
                arrayList.add("forced");
            }
            sb2.append(", selectionFlags=[");
            sc.i.f(',').b(sb2, arrayList);
            sb2.append("]");
        }
        if (v0Var.f18861e != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((v0Var.f18861e & 1) != 0) {
                arrayList2.add("main");
            }
            if ((v0Var.f18861e & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((v0Var.f18861e & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((v0Var.f18861e & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((v0Var.f18861e & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((v0Var.f18861e & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((v0Var.f18861e & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((v0Var.f18861e & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((v0Var.f18861e & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((v0Var.f18861e & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((v0Var.f18861e & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                arrayList2.add("describes-music");
            }
            if ((v0Var.f18861e & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((v0Var.f18861e & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((v0Var.f18861e & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((v0Var.f18861e & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sb2.append(", roleFlags=[");
            sc.i.f(',').b(sb2, arrayList2);
            sb2.append("]");
        }
        return sb2.toString();
    }

    public b b() {
        return new b();
    }

    public v0 c(int i10) {
        return b().N(i10).G();
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            int i11 = this.H;
            if ((i11 == 0 || (i10 = v0Var.H) == 0 || i11 == i10) && this.f18860d == v0Var.f18860d && this.f18861e == v0Var.f18861e && this.f18862f == v0Var.f18862f && this.f18863g == v0Var.f18863g && this.f18869m == v0Var.f18869m && this.f18872p == v0Var.f18872p && this.f18873q == v0Var.f18873q && this.f18874r == v0Var.f18874r && this.f18876t == v0Var.f18876t && this.f18879w == v0Var.f18879w && this.f18881y == v0Var.f18881y && this.f18882z == v0Var.f18882z && this.A == v0Var.A && this.B == v0Var.B && this.C == v0Var.C && this.D == v0Var.D && this.E == v0Var.E && this.F == v0Var.F && this.G == v0Var.G && Float.compare(this.f18875s, v0Var.f18875s) == 0 && Float.compare(this.f18877u, v0Var.f18877u) == 0 && ob.r0.c(this.f18857a, v0Var.f18857a) && ob.r0.c(this.f18858b, v0Var.f18858b) && ob.r0.c(this.f18865i, v0Var.f18865i) && ob.r0.c(this.f18867k, v0Var.f18867k) && ob.r0.c(this.f18868l, v0Var.f18868l) && ob.r0.c(this.f18859c, v0Var.f18859c) && Arrays.equals(this.f18878v, v0Var.f18878v) && ob.r0.c(this.f18866j, v0Var.f18866j) && ob.r0.c(this.f18880x, v0Var.f18880x) && ob.r0.c(this.f18871o, v0Var.f18871o) && g(v0Var)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        int i10;
        int i11 = this.f18873q;
        if (i11 == -1 || (i10 = this.f18874r) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean g(v0 v0Var) {
        if (this.f18870n.size() != v0Var.f18870n.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f18870n.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f18870n.get(i10), (byte[]) v0Var.f18870n.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.H == 0) {
            String str = this.f18857a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f18858b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f18859c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f18860d) * 31) + this.f18861e) * 31) + this.f18862f) * 31) + this.f18863g) * 31;
            String str4 = this.f18865i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ha.a aVar = this.f18866j;
            int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f18867k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f18868l;
            this.H = ((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f18869m) * 31) + ((int) this.f18872p)) * 31) + this.f18873q) * 31) + this.f18874r) * 31) + Float.floatToIntBits(this.f18875s)) * 31) + this.f18876t) * 31) + Float.floatToIntBits(this.f18877u)) * 31) + this.f18879w) * 31) + this.f18881y) * 31) + this.f18882z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G;
        }
        return this.H;
    }

    public Bundle i(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putString(J, this.f18857a);
        bundle.putString(K, this.f18858b);
        bundle.putString(L, this.f18859c);
        bundle.putInt(M, this.f18860d);
        bundle.putInt(N, this.f18861e);
        bundle.putInt(O, this.f18862f);
        bundle.putInt(P, this.f18863g);
        bundle.putString(Q, this.f18865i);
        if (!z10) {
            bundle.putParcelable(R, this.f18866j);
        }
        bundle.putString(S, this.f18867k);
        bundle.putString(T, this.f18868l);
        bundle.putInt(U, this.f18869m);
        for (int i10 = 0; i10 < this.f18870n.size(); i10++) {
            bundle.putByteArray(h(i10), (byte[]) this.f18870n.get(i10));
        }
        bundle.putParcelable(W, this.f18871o);
        bundle.putLong(X, this.f18872p);
        bundle.putInt(Y, this.f18873q);
        bundle.putInt(Z, this.f18874r);
        bundle.putFloat(f18841a0, this.f18875s);
        bundle.putInt(f18842b0, this.f18876t);
        bundle.putFloat(f18843c0, this.f18877u);
        bundle.putByteArray(f18844d0, this.f18878v);
        bundle.putInt(f18845e0, this.f18879w);
        pb.c cVar = this.f18880x;
        if (cVar != null) {
            bundle.putBundle(f18846f0, cVar.toBundle());
        }
        bundle.putInt(f18847g0, this.f18881y);
        bundle.putInt(f18848h0, this.f18882z);
        bundle.putInt(f18849i0, this.A);
        bundle.putInt(f18850j0, this.B);
        bundle.putInt(f18851k0, this.C);
        bundle.putInt(f18852l0, this.D);
        bundle.putInt(f18854n0, this.E);
        bundle.putInt(f18855o0, this.F);
        bundle.putInt(f18853m0, this.G);
        return bundle;
    }

    public v0 k(v0 v0Var) {
        String str;
        if (this == v0Var) {
            return this;
        }
        int iK = ob.y.k(this.f18868l);
        String str2 = v0Var.f18857a;
        String str3 = v0Var.f18858b;
        if (str3 == null) {
            str3 = this.f18858b;
        }
        String str4 = this.f18859c;
        if ((iK == 3 || iK == 1) && (str = v0Var.f18859c) != null) {
            str4 = str;
        }
        int i10 = this.f18862f;
        if (i10 == -1) {
            i10 = v0Var.f18862f;
        }
        int i11 = this.f18863g;
        if (i11 == -1) {
            i11 = v0Var.f18863g;
        }
        String str5 = this.f18865i;
        if (str5 == null) {
            String strM = ob.r0.M(v0Var.f18865i, iK);
            if (ob.r0.a1(strM).length == 1) {
                str5 = strM;
            }
        }
        ha.a aVar = this.f18866j;
        ha.a aVarB = aVar == null ? v0Var.f18866j : aVar.b(v0Var.f18866j);
        float f10 = this.f18875s;
        if (f10 == -1.0f && iK == 2) {
            f10 = v0Var.f18875s;
        }
        return b().U(str2).W(str3).X(str4).i0(this.f18860d | v0Var.f18860d).e0(this.f18861e | v0Var.f18861e).I(i10).b0(i11).K(str5).Z(aVarB).O(com.google.android.exoplayer2.drm.h.e(v0Var.f18871o, this.f18871o)).R(f10).G();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        return i(false);
    }

    public String toString() {
        return "Format(" + this.f18857a + ", " + this.f18858b + ", " + this.f18867k + ", " + this.f18868l + ", " + this.f18865i + ", " + this.f18864h + ", " + this.f18859c + ", [" + this.f18873q + ", " + this.f18874r + ", " + this.f18875s + ", " + this.f18880x + "], [" + this.f18881y + ", " + this.f18882z + "])";
    }

    private v0(b bVar) {
        this.f18857a = bVar.f18883a;
        this.f18858b = bVar.f18884b;
        this.f18859c = ob.r0.J0(bVar.f18885c);
        this.f18860d = bVar.f18886d;
        this.f18861e = bVar.f18887e;
        int i10 = bVar.f18888f;
        this.f18862f = i10;
        int i11 = bVar.f18889g;
        this.f18863g = i11;
        this.f18864h = i11 != -1 ? i11 : i10;
        this.f18865i = bVar.f18890h;
        this.f18866j = bVar.f18891i;
        this.f18867k = bVar.f18892j;
        this.f18868l = bVar.f18893k;
        this.f18869m = bVar.f18894l;
        this.f18870n = bVar.f18895m == null ? Collections.EMPTY_LIST : bVar.f18895m;
        com.google.android.exoplayer2.drm.h hVar = bVar.f18896n;
        this.f18871o = hVar;
        this.f18872p = bVar.f18897o;
        this.f18873q = bVar.f18898p;
        this.f18874r = bVar.f18899q;
        this.f18875s = bVar.f18900r;
        this.f18876t = bVar.f18901s == -1 ? 0 : bVar.f18901s;
        this.f18877u = bVar.f18902t == -1.0f ? 1.0f : bVar.f18902t;
        this.f18878v = bVar.f18903u;
        this.f18879w = bVar.f18904v;
        this.f18880x = bVar.f18905w;
        this.f18881y = bVar.f18906x;
        this.f18882z = bVar.f18907y;
        this.A = bVar.f18908z;
        this.B = bVar.A == -1 ? 0 : bVar.A;
        this.C = bVar.B != -1 ? bVar.B : 0;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = bVar.E;
        if (bVar.F != 0 || hVar == null) {
            this.G = bVar.F;
        } else {
            this.G = 1;
        }
    }
}
