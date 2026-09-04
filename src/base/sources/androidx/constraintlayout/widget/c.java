package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import x.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f2679i = {0, 4, 8};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static SparseIntArray f2680j = new SparseIntArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static SparseIntArray f2681k = new SparseIntArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2684c = NhHRaDJCHtCTJR.IgB;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f2685d = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2686e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap f2687f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2688g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap f2689h = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f2691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f2692c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0026c f2693d = new C0026c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f2694e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f2695f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap f2696g = new HashMap();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C0025a f2697h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static class C0025a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int[] f2698a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int[] f2699b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f2700c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int[] f2701d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            float[] f2702e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f2703f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int[] f2704g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            String[] f2705h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f2706i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int[] f2707j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            boolean[] f2708k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f2709l = 0;

            C0025a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f2703f;
                int[] iArr = this.f2701d;
                if (i11 >= iArr.length) {
                    this.f2701d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2702e;
                    this.f2702e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2701d;
                int i12 = this.f2703f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f2702e;
                this.f2703f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f2700c;
                int[] iArr = this.f2698a;
                if (i12 >= iArr.length) {
                    this.f2698a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2699b;
                    this.f2699b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2698a;
                int i13 = this.f2700c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f2699b;
                this.f2700c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f2706i;
                int[] iArr = this.f2704g;
                if (i11 >= iArr.length) {
                    this.f2704g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2705h;
                    this.f2705h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2704g;
                int i12 = this.f2706i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f2705h;
                this.f2706i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f2709l;
                int[] iArr = this.f2707j;
                if (i11 >= iArr.length) {
                    this.f2707j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2708k;
                    this.f2708k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2707j;
                int i12 = this.f2709l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f2708k;
                this.f2709l = i12 + 1;
                zArr2[i12] = z10;
            }

            void e(a aVar) {
                for (int i10 = 0; i10 < this.f2700c; i10++) {
                    c.N(aVar, this.f2698a[i10], this.f2699b[i10]);
                }
                for (int i11 = 0; i11 < this.f2703f; i11++) {
                    c.M(aVar, this.f2701d[i11], this.f2702e[i11]);
                }
                for (int i12 = 0; i12 < this.f2706i; i12++) {
                    c.O(aVar, this.f2704g[i12], this.f2705h[i12]);
                }
                for (int i13 = 0; i13 < this.f2709l; i13++) {
                    c.P(aVar, this.f2707j[i13], this.f2708k[i13]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i10, ConstraintLayout.b bVar) {
            this.f2690a = i10;
            b bVar2 = this.f2694e;
            bVar2.f2729j = bVar.f2582e;
            bVar2.f2731k = bVar.f2584f;
            bVar2.f2733l = bVar.f2586g;
            bVar2.f2735m = bVar.f2588h;
            bVar2.f2737n = bVar.f2590i;
            bVar2.f2739o = bVar.f2592j;
            bVar2.f2741p = bVar.f2594k;
            bVar2.f2743q = bVar.f2596l;
            bVar2.f2745r = bVar.f2598m;
            bVar2.f2746s = bVar.f2600n;
            bVar2.f2747t = bVar.f2602o;
            bVar2.f2748u = bVar.f2610s;
            bVar2.f2749v = bVar.f2612t;
            bVar2.f2750w = bVar.f2614u;
            bVar2.f2751x = bVar.f2616v;
            bVar2.f2752y = bVar.G;
            bVar2.f2753z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f2604p;
            bVar2.C = bVar.f2606q;
            bVar2.D = bVar.f2608r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f2725h = bVar.f2578c;
            bVar2.f2721f = bVar.f2574a;
            bVar2.f2723g = bVar.f2576b;
            bVar2.f2717d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f2719e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f2738n0 = bVar.f2575a0;
            bVar2.f2740o0 = bVar.f2577b0;
            bVar2.Z = bVar.P;
            bVar2.f2712a0 = bVar.Q;
            bVar2.f2714b0 = bVar.T;
            bVar2.f2716c0 = bVar.U;
            bVar2.f2718d0 = bVar.R;
            bVar2.f2720e0 = bVar.S;
            bVar2.f2722f0 = bVar.V;
            bVar2.f2724g0 = bVar.W;
            bVar2.f2736m0 = bVar.f2579c0;
            bVar2.P = bVar.f2620x;
            bVar2.R = bVar.f2622z;
            bVar2.O = bVar.f2618w;
            bVar2.Q = bVar.f2621y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f2744q0 = bVar.f2581d0;
            bVar2.L = bVar.getMarginEnd();
            this.f2694e.M = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(int i10, Constraints.a aVar) {
            g(i10, aVar);
            this.f2692c.f2772d = aVar.f2633x0;
            e eVar = this.f2695f;
            eVar.f2776b = aVar.A0;
            eVar.f2777c = aVar.B0;
            eVar.f2778d = aVar.C0;
            eVar.f2779e = aVar.D0;
            eVar.f2780f = aVar.E0;
            eVar.f2781g = aVar.F0;
            eVar.f2782h = aVar.G0;
            eVar.f2784j = aVar.H0;
            eVar.f2785k = aVar.I0;
            eVar.f2786l = aVar.J0;
            eVar.f2788n = aVar.f2635z0;
            eVar.f2787m = aVar.f2634y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(ConstraintHelper constraintHelper, int i10, Constraints.a aVar) {
            h(i10, aVar);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f2694e;
                bVar.f2730j0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f2726h0 = barrier.getType();
                this.f2694e.f2732k0 = barrier.getReferencedIds();
                this.f2694e.f2728i0 = barrier.getMargin();
            }
        }

        public void d(a aVar) {
            C0025a c0025a = this.f2697h;
            if (c0025a != null) {
                c0025a.e(aVar);
            }
        }

        public void e(ConstraintLayout.b bVar) {
            b bVar2 = this.f2694e;
            bVar.f2582e = bVar2.f2729j;
            bVar.f2584f = bVar2.f2731k;
            bVar.f2586g = bVar2.f2733l;
            bVar.f2588h = bVar2.f2735m;
            bVar.f2590i = bVar2.f2737n;
            bVar.f2592j = bVar2.f2739o;
            bVar.f2594k = bVar2.f2741p;
            bVar.f2596l = bVar2.f2743q;
            bVar.f2598m = bVar2.f2745r;
            bVar.f2600n = bVar2.f2746s;
            bVar.f2602o = bVar2.f2747t;
            bVar.f2610s = bVar2.f2748u;
            bVar.f2612t = bVar2.f2749v;
            bVar.f2614u = bVar2.f2750w;
            bVar.f2616v = bVar2.f2751x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f2620x = bVar2.P;
            bVar.f2622z = bVar2.R;
            bVar.G = bVar2.f2752y;
            bVar.H = bVar2.f2753z;
            bVar.f2604p = bVar2.B;
            bVar.f2606q = bVar2.C;
            bVar.f2608r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f2575a0 = bVar2.f2738n0;
            bVar.f2577b0 = bVar2.f2740o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f2712a0;
            bVar.T = bVar2.f2714b0;
            bVar.U = bVar2.f2716c0;
            bVar.R = bVar2.f2718d0;
            bVar.S = bVar2.f2720e0;
            bVar.V = bVar2.f2722f0;
            bVar.W = bVar2.f2724g0;
            bVar.Z = bVar2.G;
            bVar.f2578c = bVar2.f2725h;
            bVar.f2574a = bVar2.f2721f;
            bVar.f2576b = bVar2.f2723g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f2717d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f2719e;
            String str = bVar2.f2736m0;
            if (str != null) {
                bVar.f2579c0 = str;
            }
            bVar.f2581d0 = bVar2.f2744q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f2694e.L);
            bVar.c();
        }

        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f2694e.a(this.f2694e);
            aVar.f2693d.a(this.f2693d);
            aVar.f2692c.a(this.f2692c);
            aVar.f2695f.a(this.f2695f);
            aVar.f2690a = this.f2690a;
            aVar.f2697h = this.f2697h;
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class b {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        private static SparseIntArray f2710r0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2719e;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int[] f2732k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f2734l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public String f2736m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2711a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2713b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2715c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2721f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2723g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f2725h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f2727i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2729j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2731k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f2733l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2735m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2737n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f2739o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2741p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2743q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2745r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2746s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2747t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f2748u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2749v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f2750w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f2751x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f2752y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f2753z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f2712a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f2714b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f2716c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f2718d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f2720e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f2722f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public float f2724g0 = 1.0f;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f2726h0 = -1;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f2728i0 = 0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f2730j0 = -1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f2738n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f2740o0 = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f2742p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f2744q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2710r0 = sparseIntArray;
            sparseIntArray.append(f.f2956m8, 24);
            f2710r0.append(f.f2969n8, 25);
            f2710r0.append(f.f2995p8, 28);
            f2710r0.append(f.f3008q8, 29);
            f2710r0.append(f.f3073v8, 35);
            f2710r0.append(f.f3060u8, 34);
            f2710r0.append(f.V7, 4);
            f2710r0.append(f.U7, 3);
            f2710r0.append(f.S7, 1);
            f2710r0.append(f.D8, 6);
            f2710r0.append(f.E8, 7);
            f2710r0.append(f.f2826c8, 17);
            f2710r0.append(f.f2839d8, 18);
            f2710r0.append(f.f2852e8, 19);
            SparseIntArray sparseIntArray2 = f2710r0;
            int i10 = f.O7;
            sparseIntArray2.append(i10, 90);
            f2710r0.append(f.A7, 26);
            f2710r0.append(f.f3021r8, 31);
            f2710r0.append(f.f3034s8, 32);
            f2710r0.append(f.f2813b8, 10);
            f2710r0.append(f.f2800a8, 9);
            f2710r0.append(f.H8, 13);
            f2710r0.append(f.K8, 16);
            f2710r0.append(f.I8, 14);
            f2710r0.append(f.F8, 11);
            f2710r0.append(f.J8, 15);
            f2710r0.append(f.G8, 12);
            f2710r0.append(f.f3112y8, 38);
            f2710r0.append(f.f2930k8, 37);
            f2710r0.append(f.f2917j8, 39);
            f2710r0.append(f.f3099x8, 40);
            f2710r0.append(f.f2904i8, 20);
            f2710r0.append(f.f3086w8, 36);
            f2710r0.append(f.Z7, 5);
            f2710r0.append(f.f2943l8, 91);
            f2710r0.append(f.f3047t8, 91);
            f2710r0.append(f.f2982o8, 91);
            f2710r0.append(f.T7, 91);
            f2710r0.append(f.R7, 91);
            f2710r0.append(f.D7, 23);
            f2710r0.append(f.F7, 27);
            f2710r0.append(f.H7, 30);
            f2710r0.append(f.I7, 8);
            f2710r0.append(f.E7, 33);
            f2710r0.append(f.G7, 2);
            f2710r0.append(f.B7, 22);
            f2710r0.append(f.C7, 21);
            SparseIntArray sparseIntArray3 = f2710r0;
            int i11 = f.f3125z8;
            sparseIntArray3.append(i11, 41);
            SparseIntArray sparseIntArray4 = f2710r0;
            int i12 = f.f2865f8;
            sparseIntArray4.append(i12, 42);
            f2710r0.append(f.Q7, 87);
            f2710r0.append(f.P7, 88);
            f2710r0.append(f.L8, 76);
            f2710r0.append(f.W7, 61);
            f2710r0.append(f.Y7, 62);
            f2710r0.append(f.X7, 63);
            f2710r0.append(f.C8, 69);
            f2710r0.append(f.f2891h8, 70);
            f2710r0.append(f.M7, 71);
            f2710r0.append(f.K7, 72);
            f2710r0.append(f.L7, 73);
            f2710r0.append(f.N7, 74);
            f2710r0.append(f.J7, 75);
            SparseIntArray sparseIntArray5 = f2710r0;
            int i13 = f.A8;
            sparseIntArray5.append(i13, 84);
            f2710r0.append(f.B8, 86);
            f2710r0.append(i13, 83);
            f2710r0.append(f.f2878g8, 85);
            f2710r0.append(i11, 87);
            f2710r0.append(i12, 88);
            f2710r0.append(f.H2, 89);
            f2710r0.append(i10, 90);
        }

        public void a(b bVar) {
            this.f2711a = bVar.f2711a;
            this.f2717d = bVar.f2717d;
            this.f2713b = bVar.f2713b;
            this.f2719e = bVar.f2719e;
            this.f2721f = bVar.f2721f;
            this.f2723g = bVar.f2723g;
            this.f2725h = bVar.f2725h;
            this.f2727i = bVar.f2727i;
            this.f2729j = bVar.f2729j;
            this.f2731k = bVar.f2731k;
            this.f2733l = bVar.f2733l;
            this.f2735m = bVar.f2735m;
            this.f2737n = bVar.f2737n;
            this.f2739o = bVar.f2739o;
            this.f2741p = bVar.f2741p;
            this.f2743q = bVar.f2743q;
            this.f2745r = bVar.f2745r;
            this.f2746s = bVar.f2746s;
            this.f2747t = bVar.f2747t;
            this.f2748u = bVar.f2748u;
            this.f2749v = bVar.f2749v;
            this.f2750w = bVar.f2750w;
            this.f2751x = bVar.f2751x;
            this.f2752y = bVar.f2752y;
            this.f2753z = bVar.f2753z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f2712a0 = bVar.f2712a0;
            this.f2714b0 = bVar.f2714b0;
            this.f2716c0 = bVar.f2716c0;
            this.f2718d0 = bVar.f2718d0;
            this.f2720e0 = bVar.f2720e0;
            this.f2722f0 = bVar.f2722f0;
            this.f2724g0 = bVar.f2724g0;
            this.f2726h0 = bVar.f2726h0;
            this.f2728i0 = bVar.f2728i0;
            this.f2730j0 = bVar.f2730j0;
            this.f2736m0 = bVar.f2736m0;
            int[] iArr = bVar.f2732k0;
            if (iArr == null || bVar.f2734l0 != null) {
                this.f2732k0 = null;
            } else {
                this.f2732k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f2734l0 = bVar.f2734l0;
            this.f2738n0 = bVar.f2738n0;
            this.f2740o0 = bVar.f2740o0;
            this.f2742p0 = bVar.f2742p0;
            this.f2744q0 = bVar.f2744q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f3124z7);
            this.f2713b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f2710r0.get(index);
                switch (i11) {
                    case 1:
                        this.f2745r = c.E(typedArrayObtainStyledAttributes, index, this.f2745r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f2743q = c.E(typedArrayObtainStyledAttributes, index, this.f2743q);
                        break;
                    case 4:
                        this.f2741p = c.E(typedArrayObtainStyledAttributes, index, this.f2741p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f2751x = c.E(typedArrayObtainStyledAttributes, index, this.f2751x);
                        break;
                    case 10:
                        this.f2750w = c.E(typedArrayObtainStyledAttributes, index, this.f2750w);
                        break;
                    case 11:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f2721f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2721f);
                        break;
                    case 18:
                        this.f2723g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2723g);
                        break;
                    case 19:
                        this.f2725h = typedArrayObtainStyledAttributes.getFloat(index, this.f2725h);
                        break;
                    case 20:
                        this.f2752y = typedArrayObtainStyledAttributes.getFloat(index, this.f2752y);
                        break;
                    case 21:
                        this.f2719e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2719e);
                        break;
                    case 22:
                        this.f2717d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2717d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f2729j = c.E(typedArrayObtainStyledAttributes, index, this.f2729j);
                        break;
                    case 25:
                        this.f2731k = c.E(typedArrayObtainStyledAttributes, index, this.f2731k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f2733l = c.E(typedArrayObtainStyledAttributes, index, this.f2733l);
                        break;
                    case 29:
                        this.f2735m = c.E(typedArrayObtainStyledAttributes, index, this.f2735m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f2748u = c.E(typedArrayObtainStyledAttributes, index, this.f2748u);
                        break;
                    case 32:
                        this.f2749v = c.E(typedArrayObtainStyledAttributes, index, this.f2749v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f2739o = c.E(typedArrayObtainStyledAttributes, index, this.f2739o);
                        break;
                    case 35:
                        this.f2737n = c.E(typedArrayObtainStyledAttributes, index, this.f2737n);
                        break;
                    case 36:
                        this.f2753z = typedArrayObtainStyledAttributes.getFloat(index, this.f2753z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        c.F(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.F(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                this.B = c.E(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case DEPRECATED_API_USED_VALUE:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i11) {
                                    case NATIVE_AD_DISPLAY_DURATION_VALUE:
                                        this.f2722f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case ASSET_DOWNLOAD_RETRY_STATUS_VALUE:
                                        this.f2724g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case AD_VISIBLE_DURATION_MS_VALUE:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case XtraBox.MP4_XTRA_BT_GUID /* 72 */:
                                        this.f2726h0 = typedArrayObtainStyledAttributes.getInt(index, this.f2726h0);
                                        break;
                                    case 73:
                                        this.f2728i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2728i0);
                                        break;
                                    case 74:
                                        this.f2734l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f2742p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2742p0);
                                        break;
                                    case 76:
                                        this.f2744q0 = typedArrayObtainStyledAttributes.getInt(index, this.f2744q0);
                                        break;
                                    case 77:
                                        this.f2746s = c.E(typedArrayObtainStyledAttributes, index, this.f2746s);
                                        break;
                                    case 78:
                                        this.f2747t = c.E(typedArrayObtainStyledAttributes, index, this.f2747t);
                                        break;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f2712a0 = typedArrayObtainStyledAttributes.getInt(index, this.f2712a0);
                                        break;
                                    case 83:
                                        this.f2716c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2716c0);
                                        break;
                                    case 84:
                                        this.f2714b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2714b0);
                                        break;
                                    case 85:
                                        this.f2720e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2720e0);
                                        break;
                                    case 86:
                                        this.f2718d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2718d0);
                                        break;
                                    case 87:
                                        this.f2738n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2738n0);
                                        break;
                                    case 88:
                                        this.f2740o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2740o0);
                                        break;
                                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                        this.f2736m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f2727i = typedArrayObtainStyledAttributes.getBoolean(index, this.f2727i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2710r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2710r0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class C0026c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f2754o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2755a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2756b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2757c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f2758d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2759e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2760f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2761g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2762h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f2763i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f2764j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2765k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f2766l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2767m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2768n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2754o = sparseIntArray;
            sparseIntArray.append(f.X8, 1);
            f2754o.append(f.Z8, 2);
            f2754o.append(f.f2840d9, 3);
            f2754o.append(f.W8, 4);
            f2754o.append(f.V8, 5);
            f2754o.append(f.U8, 6);
            f2754o.append(f.Y8, 7);
            f2754o.append(f.f2827c9, 8);
            f2754o.append(f.f2814b9, 9);
            f2754o.append(f.f2801a9, 10);
        }

        public void a(C0026c c0026c) {
            this.f2755a = c0026c.f2755a;
            this.f2756b = c0026c.f2756b;
            this.f2758d = c0026c.f2758d;
            this.f2759e = c0026c.f2759e;
            this.f2760f = c0026c.f2760f;
            this.f2763i = c0026c.f2763i;
            this.f2761g = c0026c.f2761g;
            this.f2762h = c0026c.f2762h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.T8);
            this.f2755a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f2754o.get(index)) {
                    case 1:
                        this.f2763i = typedArrayObtainStyledAttributes.getFloat(index, this.f2763i);
                        break;
                    case 2:
                        this.f2759e = typedArrayObtainStyledAttributes.getInt(index, this.f2759e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2758d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f2758d = v.c.f54896c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f2760f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2756b = c.E(typedArrayObtainStyledAttributes, index, this.f2756b);
                        break;
                    case 6:
                        this.f2757c = typedArrayObtainStyledAttributes.getInteger(index, this.f2757c);
                        break;
                    case 7:
                        this.f2761g = typedArrayObtainStyledAttributes.getFloat(index, this.f2761g);
                        break;
                    case 8:
                        this.f2765k = typedArrayObtainStyledAttributes.getInteger(index, this.f2765k);
                        break;
                    case 9:
                        this.f2764j = typedArrayObtainStyledAttributes.getFloat(index, this.f2764j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f2768n = resourceId;
                            if (resourceId != -1) {
                                this.f2767m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f2766l = string;
                            if (string.indexOf("/") > 0) {
                                this.f2768n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f2767m = -2;
                            } else {
                                this.f2767m = -1;
                            }
                        } else {
                            this.f2767m = typedArrayObtainStyledAttributes.getInteger(index, this.f2768n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2769a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2770b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2771c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2772d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2773e = Float.NaN;

        public void a(d dVar) {
            this.f2769a = dVar.f2769a;
            this.f2770b = dVar.f2770b;
            this.f2772d = dVar.f2772d;
            this.f2773e = dVar.f2773e;
            this.f2771c = dVar.f2771c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f3127za);
            this.f2769a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.Ba) {
                    this.f2772d = typedArrayObtainStyledAttributes.getFloat(index, this.f2772d);
                } else if (index == f.Aa) {
                    this.f2770b = typedArrayObtainStyledAttributes.getInt(index, this.f2770b);
                    this.f2770b = c.f2679i[this.f2770b];
                } else if (index == f.Da) {
                    this.f2771c = typedArrayObtainStyledAttributes.getInt(index, this.f2771c);
                } else if (index == f.Ca) {
                    this.f2773e = typedArrayObtainStyledAttributes.getFloat(index, this.f2773e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f2774o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2775a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2776b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2777c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2778d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2779e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2780f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2781g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f2782h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2783i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f2784j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f2785k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f2786l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f2787m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f2788n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2774o = sparseIntArray;
            sparseIntArray.append(f.Ra, 1);
            f2774o.append(f.Sa, 2);
            f2774o.append(f.Ta, 3);
            f2774o.append(f.Pa, 4);
            f2774o.append(f.Qa, 5);
            f2774o.append(f.La, 6);
            f2774o.append(f.Ma, 7);
            f2774o.append(f.Na, 8);
            f2774o.append(f.Oa, 9);
            f2774o.append(f.Ua, 10);
            f2774o.append(f.Va, 11);
            f2774o.append(f.Wa, 12);
        }

        public void a(e eVar) {
            this.f2775a = eVar.f2775a;
            this.f2776b = eVar.f2776b;
            this.f2777c = eVar.f2777c;
            this.f2778d = eVar.f2778d;
            this.f2779e = eVar.f2779e;
            this.f2780f = eVar.f2780f;
            this.f2781g = eVar.f2781g;
            this.f2782h = eVar.f2782h;
            this.f2783i = eVar.f2783i;
            this.f2784j = eVar.f2784j;
            this.f2785k = eVar.f2785k;
            this.f2786l = eVar.f2786l;
            this.f2787m = eVar.f2787m;
            this.f2788n = eVar.f2788n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.Ka);
            this.f2775a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f2774o.get(index)) {
                    case 1:
                        this.f2776b = typedArrayObtainStyledAttributes.getFloat(index, this.f2776b);
                        break;
                    case 2:
                        this.f2777c = typedArrayObtainStyledAttributes.getFloat(index, this.f2777c);
                        break;
                    case 3:
                        this.f2778d = typedArrayObtainStyledAttributes.getFloat(index, this.f2778d);
                        break;
                    case 4:
                        this.f2779e = typedArrayObtainStyledAttributes.getFloat(index, this.f2779e);
                        break;
                    case 5:
                        this.f2780f = typedArrayObtainStyledAttributes.getFloat(index, this.f2780f);
                        break;
                    case 6:
                        this.f2781g = typedArrayObtainStyledAttributes.getDimension(index, this.f2781g);
                        break;
                    case 7:
                        this.f2782h = typedArrayObtainStyledAttributes.getDimension(index, this.f2782h);
                        break;
                    case 8:
                        this.f2784j = typedArrayObtainStyledAttributes.getDimension(index, this.f2784j);
                        break;
                    case 9:
                        this.f2785k = typedArrayObtainStyledAttributes.getDimension(index, this.f2785k);
                        break;
                    case 10:
                        this.f2786l = typedArrayObtainStyledAttributes.getDimension(index, this.f2786l);
                        break;
                    case 11:
                        this.f2787m = true;
                        this.f2788n = typedArrayObtainStyledAttributes.getDimension(index, this.f2788n);
                        break;
                    case 12:
                        this.f2783i = c.E(typedArrayObtainStyledAttributes, index, this.f2783i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f2680j.append(f.f3026s0, 25);
        f2680j.append(f.f3039t0, 26);
        f2680j.append(f.f3065v0, 29);
        f2680j.append(f.f3078w0, 30);
        f2680j.append(f.C0, 36);
        f2680j.append(f.B0, 35);
        f2680j.append(f.Z, 4);
        f2680j.append(f.Y, 3);
        f2680j.append(f.U, 1);
        f2680j.append(f.W, 91);
        f2680j.append(f.V, 92);
        f2680j.append(f.L0, 6);
        f2680j.append(f.M0, 7);
        f2680j.append(f.f2870g0, 17);
        f2680j.append(f.f2883h0, 18);
        f2680j.append(f.f2896i0, 19);
        f2680j.append(f.Q, 99);
        f2680j.append(f.f2947m, 27);
        f2680j.append(f.f3091x0, 32);
        f2680j.append(f.f3104y0, 33);
        f2680j.append(f.f2857f0, 10);
        f2680j.append(f.f2844e0, 9);
        f2680j.append(f.P0, 13);
        f2680j.append(f.S0, 16);
        f2680j.append(f.Q0, 14);
        f2680j.append(f.N0, 11);
        f2680j.append(f.R0, 15);
        f2680j.append(f.O0, 12);
        f2680j.append(f.F0, 40);
        f2680j.append(f.f3000q0, 39);
        f2680j.append(f.f2987p0, 41);
        f2680j.append(f.E0, 42);
        f2680j.append(f.f2974o0, 20);
        f2680j.append(f.D0, 37);
        f2680j.append(f.f2831d0, 5);
        f2680j.append(f.f3013r0, 87);
        f2680j.append(f.A0, 87);
        f2680j.append(f.f3052u0, 87);
        f2680j.append(f.X, 87);
        f2680j.append(f.T, 87);
        f2680j.append(f.f3012r, 24);
        f2680j.append(f.f3038t, 28);
        f2680j.append(f.F, 31);
        f2680j.append(f.G, 8);
        f2680j.append(f.f3025s, 34);
        f2680j.append(f.f3051u, 2);
        f2680j.append(f.f2986p, 23);
        f2680j.append(f.f2999q, 21);
        f2680j.append(f.G0, 95);
        f2680j.append(f.f2909j0, 96);
        f2680j.append(f.f2973o, 22);
        f2680j.append(f.f3064v, 43);
        f2680j.append(f.I, 44);
        f2680j.append(f.D, 45);
        f2680j.append(f.E, 46);
        f2680j.append(f.C, 60);
        f2680j.append(f.A, 47);
        f2680j.append(f.B, 48);
        f2680j.append(f.f3077w, 49);
        f2680j.append(f.f3090x, 50);
        f2680j.append(f.f3103y, 51);
        f2680j.append(f.f3116z, 52);
        f2680j.append(f.H, 53);
        f2680j.append(f.H0, 54);
        f2680j.append(f.f2922k0, 55);
        f2680j.append(f.I0, 56);
        f2680j.append(f.f2935l0, 57);
        f2680j.append(f.J0, 58);
        f2680j.append(f.f2948m0, 59);
        f2680j.append(f.f2792a0, 61);
        f2680j.append(f.f2818c0, 62);
        f2680j.append(f.f2805b0, 63);
        f2680j.append(f.J, 64);
        f2680j.append(f.f2819c1, 65);
        f2680j.append(f.P, 66);
        f2680j.append(f.f2832d1, 67);
        f2680j.append(f.V0, 79);
        f2680j.append(f.f2960n, 38);
        f2680j.append(f.U0, 68);
        f2680j.append(f.K0, 69);
        f2680j.append(f.f2961n0, 70);
        f2680j.append(f.T0, 97);
        f2680j.append(f.N, 71);
        f2680j.append(f.L, 72);
        f2680j.append(f.M, 73);
        f2680j.append(f.O, 74);
        f2680j.append(f.K, 75);
        f2680j.append(f.W0, 76);
        f2680j.append(f.f3117z0, 77);
        f2680j.append(f.f2845e1, 78);
        f2680j.append(f.S, 80);
        f2680j.append(f.R, 81);
        f2680j.append(f.X0, 82);
        f2680j.append(f.f2806b1, 83);
        f2680j.append(f.f2793a1, 84);
        f2680j.append(f.Z0, 85);
        f2680j.append(f.Y0, 86);
        SparseIntArray sparseIntArray = f2681k;
        int i10 = f.f3043t4;
        sparseIntArray.append(i10, 6);
        f2681k.append(i10, 7);
        f2681k.append(f.f2977o3, 27);
        f2681k.append(f.f3082w4, 13);
        f2681k.append(f.f3121z4, 16);
        f2681k.append(f.f3095x4, 14);
        f2681k.append(f.f3056u4, 11);
        f2681k.append(f.f3108y4, 15);
        f2681k.append(f.f3069v4, 12);
        f2681k.append(f.f2965n4, 40);
        f2681k.append(f.f2874g4, 39);
        f2681k.append(f.f2861f4, 41);
        f2681k.append(f.f2952m4, 42);
        f2681k.append(f.f2848e4, 20);
        f2681k.append(f.f2939l4, 37);
        f2681k.append(f.Y3, 5);
        f2681k.append(f.f2887h4, 87);
        f2681k.append(f.f2926k4, 87);
        f2681k.append(f.f2900i4, 87);
        f2681k.append(f.V3, 87);
        f2681k.append(f.U3, 87);
        f2681k.append(f.f3042t3, 24);
        f2681k.append(f.f3068v3, 28);
        f2681k.append(f.H3, 31);
        f2681k.append(f.I3, 8);
        f2681k.append(f.f3055u3, 34);
        f2681k.append(f.f3081w3, 2);
        f2681k.append(f.f3016r3, 23);
        f2681k.append(f.f3029s3, 21);
        f2681k.append(f.f2978o4, 95);
        f2681k.append(f.Z3, 96);
        f2681k.append(f.f3003q3, 22);
        f2681k.append(f.f3094x3, 43);
        f2681k.append(f.K3, 44);
        f2681k.append(f.F3, 45);
        f2681k.append(f.G3, 46);
        f2681k.append(f.E3, 60);
        f2681k.append(f.C3, 47);
        f2681k.append(f.D3, 48);
        f2681k.append(f.f3107y3, 49);
        f2681k.append(f.f3120z3, 50);
        f2681k.append(f.A3, 51);
        f2681k.append(f.B3, 52);
        f2681k.append(f.J3, 53);
        f2681k.append(f.f2991p4, 54);
        f2681k.append(f.f2796a4, 55);
        f2681k.append(f.f3004q4, 56);
        f2681k.append(f.f2809b4, 57);
        f2681k.append(f.f3017r4, 58);
        f2681k.append(f.f2822c4, 59);
        f2681k.append(f.X3, 62);
        f2681k.append(f.W3, 63);
        f2681k.append(f.L3, 64);
        f2681k.append(f.K4, 65);
        f2681k.append(f.R3, 66);
        f2681k.append(f.L4, 67);
        f2681k.append(f.C4, 79);
        f2681k.append(f.f2990p3, 38);
        f2681k.append(f.D4, 98);
        f2681k.append(f.B4, 68);
        f2681k.append(f.f3030s4, 69);
        f2681k.append(f.f2835d4, 70);
        f2681k.append(f.P3, 71);
        f2681k.append(f.N3, 72);
        f2681k.append(f.O3, 73);
        f2681k.append(f.Q3, 74);
        f2681k.append(f.M3, 75);
        f2681k.append(f.E4, 76);
        f2681k.append(f.f2913j4, 77);
        f2681k.append(f.M4, 78);
        f2681k.append(f.T3, 80);
        f2681k.append(f.S3, 81);
        f2681k.append(f.F4, 82);
        f2681k.append(f.J4, 83);
        f2681k.append(f.I4, 84);
        f2681k.append(f.H4, 85);
        f2681k.append(f.G4, 86);
        f2681k.append(f.A4, 97);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int E(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    static void F(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        boolean z10;
        a.C0025a c0025a;
        b bVar;
        ConstraintLayout.b bVar2;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 == 3) {
            G(obj, typedArray.getString(i10), i11);
            return;
        }
        int i13 = 0;
        if (i12 != 5) {
            dimensionPixelSize = typedArray.getInt(i10, 0);
            if (dimensionPixelSize == -4) {
                z10 = true;
                i13 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z10 = false;
            }
            if (obj instanceof ConstraintLayout.b) {
                bVar2 = (ConstraintLayout.b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar2).width = i13;
                    bVar2.f2575a0 = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                    bVar2.f2577b0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i11 == 0) {
                    bVar.f2717d = i13;
                    bVar.f2738n0 = z10;
                    return;
                } else {
                    bVar.f2719e = i13;
                    bVar.f2740o0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0025a) {
                c0025a = (a.C0025a) obj;
                if (i11 == 0) {
                    c0025a.b(23, i13);
                    c0025a.d(80, z10);
                } else {
                    c0025a.b(21, i13);
                    c0025a.d(81, z10);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        i13 = dimensionPixelSize;
        z10 = false;
        if (obj instanceof ConstraintLayout.b) {
            bVar2 = (ConstraintLayout.b) obj;
            if (i11 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar2).width = i13;
                bVar2.f2575a0 = z10;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                bVar2.f2577b0 = z10;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i11 == 0) {
                bVar.f2717d = i13;
                bVar.f2738n0 = z10;
                return;
            } else {
                bVar.f2719e = i13;
                bVar.f2740o0 = z10;
                return;
            }
        }
        if (obj instanceof a.C0025a) {
            c0025a = (a.C0025a) obj;
            if (i11 == 0) {
                c0025a.b(23, i13);
                c0025a.d(80, z10);
            } else {
                c0025a.b(21, i13);
                c0025a.d(81, z10);
            }
        }
    }

    static void G(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    H(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0025a) {
                        ((a.C0025a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f10;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f2717d = 0;
                            bVar3.W = f10;
                            return;
                        } else {
                            bVar3.f2719e = 0;
                            bVar3.V = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0025a) {
                        a.C0025a c0025a = (a.C0025a) obj;
                        if (i10 == 0) {
                            c0025a.b(23, 0);
                            c0025a.a(39, f10);
                            return;
                        } else {
                            c0025a.b(21, 0);
                            c0025a.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f2717d = 0;
                            bVar5.f2722f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f2719e = 0;
                            bVar5.f2724g0 = fMax;
                            bVar5.f2712a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0025a) {
                        a.C0025a c0025a2 = (a.C0025a) obj;
                        if (i10 == 0) {
                            c0025a2.b(23, 0);
                            c0025a2.b(54, 2);
                        } else {
                            c0025a2.b(21, 0);
                            c0025a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void H(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i10;
    }

    private void I(a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            J(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != f.f2960n && f.F != index && f.G != index) {
                aVar.f2693d.f2755a = true;
                aVar.f2694e.f2713b = true;
                aVar.f2692c.f2769a = true;
                aVar.f2695f.f2775a = true;
            }
            switch (f2680j.get(index)) {
                case 1:
                    b bVar = aVar.f2694e;
                    bVar.f2745r = E(typedArray, index, bVar.f2745r);
                    break;
                case 2:
                    b bVar2 = aVar.f2694e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f2694e;
                    bVar3.f2743q = E(typedArray, index, bVar3.f2743q);
                    break;
                case 4:
                    b bVar4 = aVar.f2694e;
                    bVar4.f2741p = E(typedArray, index, bVar4.f2741p);
                    break;
                case 5:
                    aVar.f2694e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f2694e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f2694e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f2694e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f2694e;
                    bVar8.f2751x = E(typedArray, index, bVar8.f2751x);
                    break;
                case 10:
                    b bVar9 = aVar.f2694e;
                    bVar9.f2750w = E(typedArray, index, bVar9.f2750w);
                    break;
                case 11:
                    b bVar10 = aVar.f2694e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f2694e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f2694e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f2694e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f2694e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f2694e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f2694e;
                    bVar16.f2721f = typedArray.getDimensionPixelOffset(index, bVar16.f2721f);
                    break;
                case 18:
                    b bVar17 = aVar.f2694e;
                    bVar17.f2723g = typedArray.getDimensionPixelOffset(index, bVar17.f2723g);
                    break;
                case 19:
                    b bVar18 = aVar.f2694e;
                    bVar18.f2725h = typedArray.getFloat(index, bVar18.f2725h);
                    break;
                case 20:
                    b bVar19 = aVar.f2694e;
                    bVar19.f2752y = typedArray.getFloat(index, bVar19.f2752y);
                    break;
                case 21:
                    b bVar20 = aVar.f2694e;
                    bVar20.f2719e = typedArray.getLayoutDimension(index, bVar20.f2719e);
                    break;
                case 22:
                    d dVar = aVar.f2692c;
                    dVar.f2770b = typedArray.getInt(index, dVar.f2770b);
                    d dVar2 = aVar.f2692c;
                    dVar2.f2770b = f2679i[dVar2.f2770b];
                    break;
                case 23:
                    b bVar21 = aVar.f2694e;
                    bVar21.f2717d = typedArray.getLayoutDimension(index, bVar21.f2717d);
                    break;
                case 24:
                    b bVar22 = aVar.f2694e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f2694e;
                    bVar23.f2729j = E(typedArray, index, bVar23.f2729j);
                    break;
                case 26:
                    b bVar24 = aVar.f2694e;
                    bVar24.f2731k = E(typedArray, index, bVar24.f2731k);
                    break;
                case 27:
                    b bVar25 = aVar.f2694e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f2694e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f2694e;
                    bVar27.f2733l = E(typedArray, index, bVar27.f2733l);
                    break;
                case 30:
                    b bVar28 = aVar.f2694e;
                    bVar28.f2735m = E(typedArray, index, bVar28.f2735m);
                    break;
                case 31:
                    b bVar29 = aVar.f2694e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.f2694e;
                    bVar30.f2748u = E(typedArray, index, bVar30.f2748u);
                    break;
                case 33:
                    b bVar31 = aVar.f2694e;
                    bVar31.f2749v = E(typedArray, index, bVar31.f2749v);
                    break;
                case 34:
                    b bVar32 = aVar.f2694e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f2694e;
                    bVar33.f2739o = E(typedArray, index, bVar33.f2739o);
                    break;
                case 36:
                    b bVar34 = aVar.f2694e;
                    bVar34.f2737n = E(typedArray, index, bVar34.f2737n);
                    break;
                case 37:
                    b bVar35 = aVar.f2694e;
                    bVar35.f2753z = typedArray.getFloat(index, bVar35.f2753z);
                    break;
                case 38:
                    aVar.f2690a = typedArray.getResourceId(index, aVar.f2690a);
                    break;
                case 39:
                    b bVar36 = aVar.f2694e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f2694e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.f2694e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f2694e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.f2692c;
                    dVar3.f2772d = typedArray.getFloat(index, dVar3.f2772d);
                    break;
                case 44:
                    e eVar = aVar.f2695f;
                    eVar.f2787m = true;
                    eVar.f2788n = typedArray.getDimension(index, eVar.f2788n);
                    break;
                case SDK_INIT_API_VALUE:
                    e eVar2 = aVar.f2695f;
                    eVar2.f2777c = typedArray.getFloat(index, eVar2.f2777c);
                    break;
                case AD_START_EVENT_VALUE:
                    e eVar3 = aVar.f2695f;
                    eVar3.f2778d = typedArray.getFloat(index, eVar3.f2778d);
                    break;
                case AD_CLICK_EVENT_VALUE:
                    e eVar4 = aVar.f2695f;
                    eVar4.f2779e = typedArray.getFloat(index, eVar4.f2779e);
                    break;
                case 48:
                    e eVar5 = aVar.f2695f;
                    eVar5.f2780f = typedArray.getFloat(index, eVar5.f2780f);
                    break;
                case 49:
                    e eVar6 = aVar.f2695f;
                    eVar6.f2781g = typedArray.getDimension(index, eVar6.f2781g);
                    break;
                case 50:
                    e eVar7 = aVar.f2695f;
                    eVar7.f2782h = typedArray.getDimension(index, eVar7.f2782h);
                    break;
                case 51:
                    e eVar8 = aVar.f2695f;
                    eVar8.f2784j = typedArray.getDimension(index, eVar8.f2784j);
                    break;
                case 52:
                    e eVar9 = aVar.f2695f;
                    eVar9.f2785k = typedArray.getDimension(index, eVar9.f2785k);
                    break;
                case 53:
                    e eVar10 = aVar.f2695f;
                    eVar10.f2786l = typedArray.getDimension(index, eVar10.f2786l);
                    break;
                case 54:
                    b bVar40 = aVar.f2694e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f2694e;
                    bVar41.f2712a0 = typedArray.getInt(index, bVar41.f2712a0);
                    break;
                case AD_VISIBILITY_VALUE:
                    b bVar42 = aVar.f2694e;
                    bVar42.f2714b0 = typedArray.getDimensionPixelSize(index, bVar42.f2714b0);
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    b bVar43 = aVar.f2694e;
                    bVar43.f2716c0 = typedArray.getDimensionPixelSize(index, bVar43.f2716c0);
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    b bVar44 = aVar.f2694e;
                    bVar44.f2718d0 = typedArray.getDimensionPixelSize(index, bVar44.f2718d0);
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    b bVar45 = aVar.f2694e;
                    bVar45.f2720e0 = typedArray.getDimensionPixelSize(index, bVar45.f2720e0);
                    break;
                case 60:
                    e eVar11 = aVar.f2695f;
                    eVar11.f2776b = typedArray.getFloat(index, eVar11.f2776b);
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    b bVar46 = aVar.f2694e;
                    bVar46.B = E(typedArray, index, bVar46.B);
                    break;
                case DEPRECATED_API_USED_VALUE:
                    b bVar47 = aVar.f2694e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    b bVar48 = aVar.f2694e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    C0026c c0026c = aVar.f2693d;
                    c0026c.f2756b = E(typedArray, index, c0026c.f2756b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f2693d.f2758d = typedArray.getString(index);
                    } else {
                        aVar.f2693d.f2758d = v.c.f54896c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    aVar.f2693d.f2760f = typedArray.getInt(index, 0);
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    C0026c c0026c2 = aVar.f2693d;
                    c0026c2.f2763i = typedArray.getFloat(index, c0026c2.f2763i);
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    d dVar4 = aVar.f2692c;
                    dVar4.f2773e = typedArray.getFloat(index, dVar4.f2773e);
                    break;
                case NATIVE_AD_DISPLAY_DURATION_VALUE:
                    aVar.f2694e.f2722f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case ASSET_DOWNLOAD_RETRY_STATUS_VALUE:
                    aVar.f2694e.f2724g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case AD_VISIBLE_DURATION_MS_VALUE:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case XtraBox.MP4_XTRA_BT_GUID /* 72 */:
                    b bVar49 = aVar.f2694e;
                    bVar49.f2726h0 = typedArray.getInt(index, bVar49.f2726h0);
                    break;
                case 73:
                    b bVar50 = aVar.f2694e;
                    bVar50.f2728i0 = typedArray.getDimensionPixelSize(index, bVar50.f2728i0);
                    break;
                case 74:
                    aVar.f2694e.f2734l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f2694e;
                    bVar51.f2742p0 = typedArray.getBoolean(index, bVar51.f2742p0);
                    break;
                case 76:
                    C0026c c0026c3 = aVar.f2693d;
                    c0026c3.f2759e = typedArray.getInt(index, c0026c3.f2759e);
                    break;
                case 77:
                    aVar.f2694e.f2736m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f2692c;
                    dVar5.f2771c = typedArray.getInt(index, dVar5.f2771c);
                    break;
                case 79:
                    C0026c c0026c4 = aVar.f2693d;
                    c0026c4.f2761g = typedArray.getFloat(index, c0026c4.f2761g);
                    break;
                case 80:
                    b bVar52 = aVar.f2694e;
                    bVar52.f2738n0 = typedArray.getBoolean(index, bVar52.f2738n0);
                    break;
                case 81:
                    b bVar53 = aVar.f2694e;
                    bVar53.f2740o0 = typedArray.getBoolean(index, bVar53.f2740o0);
                    break;
                case 82:
                    C0026c c0026c5 = aVar.f2693d;
                    c0026c5.f2757c = typedArray.getInteger(index, c0026c5.f2757c);
                    break;
                case 83:
                    e eVar12 = aVar.f2695f;
                    eVar12.f2783i = E(typedArray, index, eVar12.f2783i);
                    break;
                case 84:
                    C0026c c0026c6 = aVar.f2693d;
                    c0026c6.f2765k = typedArray.getInteger(index, c0026c6.f2765k);
                    break;
                case 85:
                    C0026c c0026c7 = aVar.f2693d;
                    c0026c7.f2764j = typedArray.getFloat(index, c0026c7.f2764j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f2693d.f2768n = typedArray.getResourceId(index, -1);
                        C0026c c0026c8 = aVar.f2693d;
                        if (c0026c8.f2768n != -1) {
                            c0026c8.f2767m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f2693d.f2766l = typedArray.getString(index);
                        if (aVar.f2693d.f2766l.indexOf("/") > 0) {
                            aVar.f2693d.f2768n = typedArray.getResourceId(index, -1);
                            aVar.f2693d.f2767m = -2;
                        } else {
                            aVar.f2693d.f2767m = -1;
                        }
                    } else {
                        C0026c c0026c9 = aVar.f2693d;
                        c0026c9.f2767m = typedArray.getInteger(index, c0026c9.f2768n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2680j.get(index));
                    break;
                case 88:
                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2680j.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f2694e;
                    bVar54.f2746s = E(typedArray, index, bVar54.f2746s);
                    break;
                case 92:
                    b bVar55 = aVar.f2694e;
                    bVar55.f2747t = E(typedArray, index, bVar55.f2747t);
                    break;
                case 93:
                    b bVar56 = aVar.f2694e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                    b bVar57 = aVar.f2694e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    F(aVar.f2694e, typedArray, index, 0);
                    break;
                case 96:
                    F(aVar.f2694e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f2694e;
                    bVar58.f2744q0 = typedArray.getInt(index, bVar58.f2744q0);
                    break;
            }
        }
        b bVar59 = aVar.f2694e;
        if (bVar59.f2734l0 != null) {
            bVar59.f2732k0 = null;
        }
    }

    private static void J(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0025a c0025a = new a.C0025a();
        aVar.f2697h = c0025a;
        aVar.f2693d.f2755a = false;
        aVar.f2694e.f2713b = false;
        aVar.f2692c.f2769a = false;
        aVar.f2695f.f2775a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f2681k.get(index)) {
                case 2:
                    c0025a.b(2, typedArray.getDimensionPixelSize(index, aVar.f2694e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                case 88:
                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2680j.get(index));
                    break;
                case 5:
                    c0025a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0025a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f2694e.E));
                    break;
                case 7:
                    c0025a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f2694e.F));
                    break;
                case 8:
                    c0025a.b(8, typedArray.getDimensionPixelSize(index, aVar.f2694e.L));
                    break;
                case 11:
                    c0025a.b(11, typedArray.getDimensionPixelSize(index, aVar.f2694e.R));
                    break;
                case 12:
                    c0025a.b(12, typedArray.getDimensionPixelSize(index, aVar.f2694e.S));
                    break;
                case 13:
                    c0025a.b(13, typedArray.getDimensionPixelSize(index, aVar.f2694e.O));
                    break;
                case 14:
                    c0025a.b(14, typedArray.getDimensionPixelSize(index, aVar.f2694e.Q));
                    break;
                case 15:
                    c0025a.b(15, typedArray.getDimensionPixelSize(index, aVar.f2694e.T));
                    break;
                case 16:
                    c0025a.b(16, typedArray.getDimensionPixelSize(index, aVar.f2694e.P));
                    break;
                case 17:
                    c0025a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f2694e.f2721f));
                    break;
                case 18:
                    c0025a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f2694e.f2723g));
                    break;
                case 19:
                    c0025a.a(19, typedArray.getFloat(index, aVar.f2694e.f2725h));
                    break;
                case 20:
                    c0025a.a(20, typedArray.getFloat(index, aVar.f2694e.f2752y));
                    break;
                case 21:
                    c0025a.b(21, typedArray.getLayoutDimension(index, aVar.f2694e.f2719e));
                    break;
                case 22:
                    c0025a.b(22, f2679i[typedArray.getInt(index, aVar.f2692c.f2770b)]);
                    break;
                case 23:
                    c0025a.b(23, typedArray.getLayoutDimension(index, aVar.f2694e.f2717d));
                    break;
                case 24:
                    c0025a.b(24, typedArray.getDimensionPixelSize(index, aVar.f2694e.H));
                    break;
                case 27:
                    c0025a.b(27, typedArray.getInt(index, aVar.f2694e.G));
                    break;
                case 28:
                    c0025a.b(28, typedArray.getDimensionPixelSize(index, aVar.f2694e.I));
                    break;
                case 31:
                    c0025a.b(31, typedArray.getDimensionPixelSize(index, aVar.f2694e.M));
                    break;
                case 34:
                    c0025a.b(34, typedArray.getDimensionPixelSize(index, aVar.f2694e.J));
                    break;
                case 37:
                    c0025a.a(37, typedArray.getFloat(index, aVar.f2694e.f2753z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f2690a);
                    aVar.f2690a = resourceId;
                    c0025a.b(38, resourceId);
                    break;
                case 39:
                    c0025a.a(39, typedArray.getFloat(index, aVar.f2694e.W));
                    break;
                case 40:
                    c0025a.a(40, typedArray.getFloat(index, aVar.f2694e.V));
                    break;
                case 41:
                    c0025a.b(41, typedArray.getInt(index, aVar.f2694e.X));
                    break;
                case 42:
                    c0025a.b(42, typedArray.getInt(index, aVar.f2694e.Y));
                    break;
                case 43:
                    c0025a.a(43, typedArray.getFloat(index, aVar.f2692c.f2772d));
                    break;
                case 44:
                    c0025a.d(44, true);
                    c0025a.a(44, typedArray.getDimension(index, aVar.f2695f.f2788n));
                    break;
                case SDK_INIT_API_VALUE:
                    c0025a.a(45, typedArray.getFloat(index, aVar.f2695f.f2777c));
                    break;
                case AD_START_EVENT_VALUE:
                    c0025a.a(46, typedArray.getFloat(index, aVar.f2695f.f2778d));
                    break;
                case AD_CLICK_EVENT_VALUE:
                    c0025a.a(47, typedArray.getFloat(index, aVar.f2695f.f2779e));
                    break;
                case 48:
                    c0025a.a(48, typedArray.getFloat(index, aVar.f2695f.f2780f));
                    break;
                case 49:
                    c0025a.a(49, typedArray.getDimension(index, aVar.f2695f.f2781g));
                    break;
                case 50:
                    c0025a.a(50, typedArray.getDimension(index, aVar.f2695f.f2782h));
                    break;
                case 51:
                    c0025a.a(51, typedArray.getDimension(index, aVar.f2695f.f2784j));
                    break;
                case 52:
                    c0025a.a(52, typedArray.getDimension(index, aVar.f2695f.f2785k));
                    break;
                case 53:
                    c0025a.a(53, typedArray.getDimension(index, aVar.f2695f.f2786l));
                    break;
                case 54:
                    c0025a.b(54, typedArray.getInt(index, aVar.f2694e.Z));
                    break;
                case 55:
                    c0025a.b(55, typedArray.getInt(index, aVar.f2694e.f2712a0));
                    break;
                case AD_VISIBILITY_VALUE:
                    c0025a.b(56, typedArray.getDimensionPixelSize(index, aVar.f2694e.f2714b0));
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    c0025a.b(57, typedArray.getDimensionPixelSize(index, aVar.f2694e.f2716c0));
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    c0025a.b(58, typedArray.getDimensionPixelSize(index, aVar.f2694e.f2718d0));
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    c0025a.b(59, typedArray.getDimensionPixelSize(index, aVar.f2694e.f2720e0));
                    break;
                case 60:
                    c0025a.a(60, typedArray.getFloat(index, aVar.f2695f.f2776b));
                    break;
                case DEPRECATED_API_USED_VALUE:
                    c0025a.b(62, typedArray.getDimensionPixelSize(index, aVar.f2694e.C));
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    c0025a.a(63, typedArray.getFloat(index, aVar.f2694e.D));
                    break;
                case 64:
                    c0025a.b(64, E(typedArray, index, aVar.f2693d.f2756b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0025a.c(65, typedArray.getString(index));
                    } else {
                        c0025a.c(65, v.c.f54896c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    c0025a.b(66, typedArray.getInt(index, 0));
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    c0025a.a(67, typedArray.getFloat(index, aVar.f2693d.f2763i));
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    c0025a.a(68, typedArray.getFloat(index, aVar.f2692c.f2773e));
                    break;
                case NATIVE_AD_DISPLAY_DURATION_VALUE:
                    c0025a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case ASSET_DOWNLOAD_RETRY_STATUS_VALUE:
                    c0025a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case AD_VISIBLE_DURATION_MS_VALUE:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case XtraBox.MP4_XTRA_BT_GUID /* 72 */:
                    c0025a.b(72, typedArray.getInt(index, aVar.f2694e.f2726h0));
                    break;
                case 73:
                    c0025a.b(73, typedArray.getDimensionPixelSize(index, aVar.f2694e.f2728i0));
                    break;
                case 74:
                    c0025a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0025a.d(75, typedArray.getBoolean(index, aVar.f2694e.f2742p0));
                    break;
                case 76:
                    c0025a.b(76, typedArray.getInt(index, aVar.f2693d.f2759e));
                    break;
                case 77:
                    c0025a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0025a.b(78, typedArray.getInt(index, aVar.f2692c.f2771c));
                    break;
                case 79:
                    c0025a.a(79, typedArray.getFloat(index, aVar.f2693d.f2761g));
                    break;
                case 80:
                    c0025a.d(80, typedArray.getBoolean(index, aVar.f2694e.f2738n0));
                    break;
                case 81:
                    c0025a.d(81, typedArray.getBoolean(index, aVar.f2694e.f2740o0));
                    break;
                case 82:
                    c0025a.b(82, typedArray.getInteger(index, aVar.f2693d.f2757c));
                    break;
                case 83:
                    c0025a.b(83, E(typedArray, index, aVar.f2695f.f2783i));
                    break;
                case 84:
                    c0025a.b(84, typedArray.getInteger(index, aVar.f2693d.f2765k));
                    break;
                case 85:
                    c0025a.a(85, typedArray.getFloat(index, aVar.f2693d.f2764j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f2693d.f2768n = typedArray.getResourceId(index, -1);
                        c0025a.b(89, aVar.f2693d.f2768n);
                        C0026c c0026c = aVar.f2693d;
                        if (c0026c.f2768n != -1) {
                            c0026c.f2767m = -2;
                            c0025a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f2693d.f2766l = typedArray.getString(index);
                        c0025a.c(90, aVar.f2693d.f2766l);
                        if (aVar.f2693d.f2766l.indexOf("/") > 0) {
                            aVar.f2693d.f2768n = typedArray.getResourceId(index, -1);
                            c0025a.b(89, aVar.f2693d.f2768n);
                            aVar.f2693d.f2767m = -2;
                            c0025a.b(88, -2);
                        } else {
                            aVar.f2693d.f2767m = -1;
                            c0025a.b(88, -1);
                        }
                    } else {
                        C0026c c0026c2 = aVar.f2693d;
                        c0026c2.f2767m = typedArray.getInteger(index, c0026c2.f2768n);
                        c0025a.b(88, aVar.f2693d.f2767m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2680j.get(index));
                    break;
                case 93:
                    c0025a.b(93, typedArray.getDimensionPixelSize(index, aVar.f2694e.N));
                    break;
                case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                    c0025a.b(94, typedArray.getDimensionPixelSize(index, aVar.f2694e.U));
                    break;
                case 95:
                    F(c0025a, typedArray, index, 0);
                    break;
                case 96:
                    F(c0025a, typedArray, index, 1);
                    break;
                case 97:
                    c0025a.b(97, typedArray.getInt(index, aVar.f2694e.f2744q0));
                    break;
                case 98:
                    if (MotionLayout.f2054d1) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f2690a);
                        aVar.f2690a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f2691b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f2691b = typedArray.getString(index);
                    } else {
                        aVar.f2690a = typedArray.getResourceId(index, aVar.f2690a);
                    }
                    break;
                case 99:
                    c0025a.d(99, typedArray.getBoolean(index, aVar.f2694e.f2727i));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(a aVar, int i10, float f10) {
        if (i10 == 19) {
            aVar.f2694e.f2725h = f10;
            return;
        }
        if (i10 == 20) {
            aVar.f2694e.f2752y = f10;
            return;
        }
        if (i10 == 37) {
            aVar.f2694e.f2753z = f10;
            return;
        }
        if (i10 == 60) {
            aVar.f2695f.f2776b = f10;
            return;
        }
        if (i10 == 63) {
            aVar.f2694e.D = f10;
            return;
        }
        if (i10 == 79) {
            aVar.f2693d.f2761g = f10;
            return;
        }
        if (i10 == 85) {
            aVar.f2693d.f2764j = f10;
            return;
        }
        if (i10 != 87) {
            if (i10 == 39) {
                aVar.f2694e.W = f10;
                return;
            }
            if (i10 == 40) {
                aVar.f2694e.V = f10;
                return;
            }
            switch (i10) {
                case 43:
                    aVar.f2692c.f2772d = f10;
                    break;
                case 44:
                    e eVar = aVar.f2695f;
                    eVar.f2788n = f10;
                    eVar.f2787m = true;
                    break;
                case SDK_INIT_API_VALUE:
                    aVar.f2695f.f2777c = f10;
                    break;
                case AD_START_EVENT_VALUE:
                    aVar.f2695f.f2778d = f10;
                    break;
                case AD_CLICK_EVENT_VALUE:
                    aVar.f2695f.f2779e = f10;
                    break;
                case 48:
                    aVar.f2695f.f2780f = f10;
                    break;
                case 49:
                    aVar.f2695f.f2781g = f10;
                    break;
                case 50:
                    aVar.f2695f.f2782h = f10;
                    break;
                case 51:
                    aVar.f2695f.f2784j = f10;
                    break;
                case 52:
                    aVar.f2695f.f2785k = f10;
                    break;
                case 53:
                    aVar.f2695f.f2786l = f10;
                    break;
                default:
                    switch (i10) {
                        case NATIVE_PLAY_ASSET_TYPE_VALUE:
                            aVar.f2693d.f2763i = f10;
                            break;
                        case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                            aVar.f2692c.f2773e = f10;
                            break;
                        case NATIVE_AD_DISPLAY_DURATION_VALUE:
                            aVar.f2694e.f2722f0 = f10;
                            break;
                        case ASSET_DOWNLOAD_RETRY_STATUS_VALUE:
                            aVar.f2694e.f2724g0 = f10;
                            break;
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(a aVar, int i10, int i11) {
        if (i10 == 6) {
            aVar.f2694e.E = i11;
            return;
        }
        if (i10 == 7) {
            aVar.f2694e.F = i11;
            return;
        }
        if (i10 == 8) {
            aVar.f2694e.L = i11;
            return;
        }
        if (i10 == 27) {
            aVar.f2694e.G = i11;
            return;
        }
        if (i10 == 28) {
            aVar.f2694e.I = i11;
            return;
        }
        if (i10 == 41) {
            aVar.f2694e.X = i11;
            return;
        }
        if (i10 == 42) {
            aVar.f2694e.Y = i11;
            return;
        }
        if (i10 == 61) {
            aVar.f2694e.B = i11;
            return;
        }
        if (i10 == 62) {
            aVar.f2694e.C = i11;
            return;
        }
        if (i10 == 72) {
            aVar.f2694e.f2726h0 = i11;
            return;
        }
        if (i10 == 73) {
            aVar.f2694e.f2728i0 = i11;
            return;
        }
        switch (i10) {
            case 2:
                aVar.f2694e.K = i11;
                break;
            case 11:
                aVar.f2694e.R = i11;
                break;
            case 12:
                aVar.f2694e.S = i11;
                break;
            case 13:
                aVar.f2694e.O = i11;
                break;
            case 14:
                aVar.f2694e.Q = i11;
                break;
            case 15:
                aVar.f2694e.T = i11;
                break;
            case 16:
                aVar.f2694e.P = i11;
                break;
            case 17:
                aVar.f2694e.f2721f = i11;
                break;
            case 18:
                aVar.f2694e.f2723g = i11;
                break;
            case 31:
                aVar.f2694e.M = i11;
                break;
            case 34:
                aVar.f2694e.J = i11;
                break;
            case 38:
                aVar.f2690a = i11;
                break;
            case 64:
                aVar.f2693d.f2756b = i11;
                break;
            case BLACK_SCREEN_IS_DETECTED_VALUE:
                aVar.f2693d.f2760f = i11;
                break;
            case 76:
                aVar.f2693d.f2759e = i11;
                break;
            case 78:
                aVar.f2692c.f2771c = i11;
                break;
            case 93:
                aVar.f2694e.N = i11;
                break;
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                aVar.f2694e.U = i11;
                break;
            case 97:
                aVar.f2694e.f2744q0 = i11;
                break;
            default:
                switch (i10) {
                    case 21:
                        aVar.f2694e.f2719e = i11;
                        break;
                    case 22:
                        aVar.f2692c.f2770b = i11;
                        break;
                    case 23:
                        aVar.f2694e.f2717d = i11;
                        break;
                    case 24:
                        aVar.f2694e.H = i11;
                        break;
                    default:
                        switch (i10) {
                            case 54:
                                aVar.f2694e.Z = i11;
                                break;
                            case 55:
                                aVar.f2694e.f2712a0 = i11;
                                break;
                            case AD_VISIBILITY_VALUE:
                                aVar.f2694e.f2714b0 = i11;
                                break;
                            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                aVar.f2694e.f2716c0 = i11;
                                break;
                            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                                aVar.f2694e.f2718d0 = i11;
                                break;
                            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                                aVar.f2694e.f2720e0 = i11;
                                break;
                            default:
                                switch (i10) {
                                    case 82:
                                        aVar.f2693d.f2757c = i11;
                                        break;
                                    case 83:
                                        aVar.f2695f.f2783i = i11;
                                        break;
                                    case 84:
                                        aVar.f2693d.f2765k = i11;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 87:
                                                break;
                                            case 88:
                                                aVar.f2693d.f2767m = i11;
                                                break;
                                            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                                aVar.f2693d.f2768n = i11;
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(a aVar, int i10, String str) {
        if (i10 == 5) {
            aVar.f2694e.A = str;
            return;
        }
        if (i10 == 65) {
            aVar.f2693d.f2758d = str;
            return;
        }
        if (i10 == 74) {
            b bVar = aVar.f2694e;
            bVar.f2734l0 = str;
            bVar.f2732k0 = null;
        } else if (i10 == 77) {
            aVar.f2694e.f2736m0 = str;
        } else if (i10 != 87) {
            if (i10 != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f2693d.f2766l = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(a aVar, int i10, boolean z10) {
        if (i10 == 44) {
            aVar.f2695f.f2787m = z10;
            return;
        }
        if (i10 == 75) {
            aVar.f2694e.f2742p0 = z10;
            return;
        }
        if (i10 != 87) {
            if (i10 == 80) {
                aVar.f2694e.f2738n0 = z10;
            } else if (i10 != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f2694e.f2740o0 = z10;
            }
        }
    }

    public static a m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, f.f2964n3);
        J(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private int[] s(View view, String str) {
        int iIntValue;
        Object objL;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = androidx.constraintlayout.widget.e.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objL = ((ConstraintLayout) view.getParent()).l(0, strTrim)) != null && (objL instanceof Integer)) {
                iIntValue = ((Integer) objL).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a t(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? f.f2964n3 : f.f2934l);
        I(aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a u(int i10) {
        if (!this.f2689h.containsKey(Integer.valueOf(i10))) {
            this.f2689h.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f2689h.get(Integer.valueOf(i10));
    }

    public int A(int i10) {
        return u(i10).f2692c.f2771c;
    }

    public int B(int i10) {
        return u(i10).f2694e.f2717d;
    }

    public void C(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarT = t(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarT.f2694e.f2711a = true;
                    }
                    this.f2689h.put(Integer.valueOf(aVarT.f2690a), aVarT);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void D(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarT = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVarT == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarT.f2694e.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarT == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarT.f2693d.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                aVarT = t(context, Xml.asAttributeSet(xmlPullParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVarT == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarT.f2692c.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarT == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarT.f2695f.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarT = t(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarT.f2694e;
                                bVar.f2711a = true;
                                bVar.f2713b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                aVarT = t(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVarT.f2694e.f2730j0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                aVarT = t(context, Xml.asAttributeSet(xmlPullParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (aVarT == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                    }
                    androidx.constraintlayout.widget.a.i(context, xmlPullParser, aVarT.f2696g);
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f2689h.put(Integer.valueOf(aVarT.f2690a), aVarT);
                    aVarT = null;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing XML resource", e11);
        }
    }

    public void K(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2688g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2689h.containsKey(Integer.valueOf(id2))) {
                this.f2689h.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f2689h.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (!aVar.f2694e.f2713b) {
                    aVar.g(id2, bVar);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.f2694e.f2732k0 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f2694e.f2742p0 = barrier.getAllowsGoneWidget();
                            aVar.f2694e.f2726h0 = barrier.getType();
                            aVar.f2694e.f2728i0 = barrier.getMargin();
                        }
                    }
                    aVar.f2694e.f2713b = true;
                }
                d dVar = aVar.f2692c;
                if (!dVar.f2769a) {
                    dVar.f2770b = childAt.getVisibility();
                    aVar.f2692c.f2772d = childAt.getAlpha();
                    aVar.f2692c.f2769a = true;
                }
                e eVar = aVar.f2695f;
                if (!eVar.f2775a) {
                    eVar.f2775a = true;
                    eVar.f2776b = childAt.getRotation();
                    aVar.f2695f.f2777c = childAt.getRotationX();
                    aVar.f2695f.f2778d = childAt.getRotationY();
                    aVar.f2695f.f2779e = childAt.getScaleX();
                    aVar.f2695f.f2780f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = aVar.f2695f;
                        eVar2.f2781g = pivotX;
                        eVar2.f2782h = pivotY;
                    }
                    aVar.f2695f.f2784j = childAt.getTranslationX();
                    aVar.f2695f.f2785k = childAt.getTranslationY();
                    aVar.f2695f.f2786l = childAt.getTranslationZ();
                    e eVar3 = aVar.f2695f;
                    if (eVar3.f2787m) {
                        eVar3.f2788n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void L(c cVar) {
        for (Integer num : cVar.f2689h.keySet()) {
            num.intValue();
            a aVar = (a) cVar.f2689h.get(num);
            if (!this.f2689h.containsKey(num)) {
                this.f2689h.put(num, new a());
            }
            a aVar2 = (a) this.f2689h.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.f2694e;
                if (!bVar.f2713b) {
                    bVar.a(aVar.f2694e);
                }
                d dVar = aVar2.f2692c;
                if (!dVar.f2769a) {
                    dVar.a(aVar.f2692c);
                }
                e eVar = aVar2.f2695f;
                if (!eVar.f2775a) {
                    eVar.a(aVar.f2695f);
                }
                C0026c c0026c = aVar2.f2693d;
                if (!c0026c.f2755a) {
                    c0026c.a(aVar.f2693d);
                }
                for (String str : aVar.f2696g.keySet()) {
                    if (!aVar2.f2696g.containsKey(str)) {
                        aVar2.f2696g.put(str, (androidx.constraintlayout.widget.a) aVar.f2696g.get(str));
                    }
                }
            }
        }
    }

    public void Q(boolean z10) {
        this.f2688g = z10;
    }

    public void R(String str) {
        this.f2685d = str.split(",");
        int i10 = 0;
        while (true) {
            String[] strArr = this.f2685d;
            if (i10 >= strArr.length) {
                return;
            }
            strArr[i10] = strArr[i10].trim();
            i10++;
        }
    }

    public void S(boolean z10) {
        this.f2682a = z10;
    }

    public void g(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f2689h.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.d(childAt));
            } else {
                if (this.f2688g && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f2689h.containsKey(Integer.valueOf(id2)) && (aVar = (a) this.f2689h.get(Integer.valueOf(id2))) != null) {
                    androidx.constraintlayout.widget.a.j(childAt, aVar.f2696g);
                }
            }
        }
    }

    public void h(c cVar) {
        for (a aVar : cVar.f2689h.values()) {
            if (aVar.f2697h != null) {
                if (aVar.f2691b == null) {
                    aVar.f2697h.e(v(aVar.f2690a));
                } else {
                    Iterator it = this.f2689h.keySet().iterator();
                    while (it.hasNext()) {
                        a aVarV = v(((Integer) it.next()).intValue());
                        String str = aVarV.f2694e.f2736m0;
                        if (str != null && aVar.f2691b.matches(str)) {
                            aVar.f2697h.e(aVarV);
                            aVarV.f2696g.putAll((HashMap) aVar.f2696g.clone());
                        }
                    }
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
        k(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void j(ConstraintHelper constraintHelper, x.e eVar, ConstraintLayout.b bVar, SparseArray sparseArray) {
        a aVar;
        int id2 = constraintHelper.getId();
        if (this.f2689h.containsKey(Integer.valueOf(id2)) && (aVar = (a) this.f2689h.get(Integer.valueOf(id2))) != null && (eVar instanceof j)) {
            constraintHelper.p(aVar, (j) eVar, bVar, sparseArray);
        }
    }

    void k(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f2689h.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f2689h.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.d(childAt));
            } else {
                if (this.f2688g && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f2689h.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = (a) this.f2689h.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f2694e.f2730j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f2694e.f2726h0);
                                barrier.setMargin(aVar.f2694e.f2728i0);
                                barrier.setAllowsGoneWidget(aVar.f2694e.f2742p0);
                                b bVar = aVar.f2694e;
                                int[] iArr = bVar.f2732k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f2734l0;
                                    if (str != null) {
                                        bVar.f2732k0 = s(barrier, str);
                                        barrier.setReferencedIds(aVar.f2694e.f2732k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.c();
                            aVar.e(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.j(childAt, aVar.f2696g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f2692c;
                            if (dVar.f2771c == 0) {
                                childAt.setVisibility(dVar.f2770b);
                            }
                            childAt.setAlpha(aVar.f2692c.f2772d);
                            childAt.setRotation(aVar.f2695f.f2776b);
                            childAt.setRotationX(aVar.f2695f.f2777c);
                            childAt.setRotationY(aVar.f2695f.f2778d);
                            childAt.setScaleX(aVar.f2695f.f2779e);
                            childAt.setScaleY(aVar.f2695f.f2780f);
                            e eVar = aVar.f2695f;
                            if (eVar.f2783i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f2695f.f2783i);
                                if (viewFindViewById != null) {
                                    float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                    float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = left - childAt.getLeft();
                                        float top2 = top - childAt.getTop();
                                        childAt.setPivotX(left2);
                                        childAt.setPivotY(top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f2781g)) {
                                    childAt.setPivotX(aVar.f2695f.f2781g);
                                }
                                if (!Float.isNaN(aVar.f2695f.f2782h)) {
                                    childAt.setPivotY(aVar.f2695f.f2782h);
                                }
                            }
                            childAt.setTranslationX(aVar.f2695f.f2784j);
                            childAt.setTranslationY(aVar.f2695f.f2785k);
                            childAt.setTranslationZ(aVar.f2695f.f2786l);
                            e eVar2 = aVar.f2695f;
                            if (eVar2.f2787m) {
                                childAt.setElevation(eVar2.f2788n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = (a) this.f2689h.get(num);
            if (aVar2 != null) {
                if (aVar2.f2694e.f2730j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f2694e;
                    int[] iArr2 = bVar3.f2732k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f2734l0;
                        if (str2 != null) {
                            bVar3.f2732k0 = s(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f2694e.f2732k0);
                        }
                    }
                    barrier2.setType(aVar2.f2694e.f2726h0);
                    barrier2.setMargin(aVar2.f2694e.f2728i0);
                    ConstraintLayout.b bVarG = constraintLayout.generateDefaultLayoutParams();
                    barrier2.w();
                    aVar2.e(bVarG);
                    constraintLayout.addView(barrier2, bVarG);
                }
                if (aVar2.f2694e.f2711a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarG2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.e(bVarG2);
                    constraintLayout.addView(guideline, bVarG2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).j(constraintLayout);
            }
        }
    }

    public void l(int i10, ConstraintLayout.b bVar) {
        a aVar;
        if (!this.f2689h.containsKey(Integer.valueOf(i10)) || (aVar = (a) this.f2689h.get(Integer.valueOf(i10))) == null) {
            return;
        }
        aVar.e(bVar);
    }

    public void n(Context context, int i10) {
        o((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void o(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2689h.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2688g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2689h.containsKey(Integer.valueOf(id2))) {
                this.f2689h.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f2689h.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f2696g = androidx.constraintlayout.widget.a.b(this.f2687f, childAt);
                aVar.g(id2, bVar);
                aVar.f2692c.f2770b = childAt.getVisibility();
                aVar.f2692c.f2772d = childAt.getAlpha();
                aVar.f2695f.f2776b = childAt.getRotation();
                aVar.f2695f.f2777c = childAt.getRotationX();
                aVar.f2695f.f2778d = childAt.getRotationY();
                aVar.f2695f.f2779e = childAt.getScaleX();
                aVar.f2695f.f2780f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f2695f;
                    eVar.f2781g = pivotX;
                    eVar.f2782h = pivotY;
                }
                aVar.f2695f.f2784j = childAt.getTranslationX();
                aVar.f2695f.f2785k = childAt.getTranslationY();
                aVar.f2695f.f2786l = childAt.getTranslationZ();
                e eVar2 = aVar.f2695f;
                if (eVar2.f2787m) {
                    eVar2.f2788n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f2694e.f2742p0 = barrier.getAllowsGoneWidget();
                    aVar.f2694e.f2732k0 = barrier.getReferencedIds();
                    aVar.f2694e.f2726h0 = barrier.getType();
                    aVar.f2694e.f2728i0 = barrier.getMargin();
                }
            }
        }
    }

    public void p(c cVar) {
        this.f2689h.clear();
        for (Integer num : cVar.f2689h.keySet()) {
            a aVar = (a) cVar.f2689h.get(num);
            if (aVar != null) {
                this.f2689h.put(num, aVar.clone());
            }
        }
    }

    public void q(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f2689h.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraints.getChildAt(i10);
            Constraints.a aVar = (Constraints.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2688g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2689h.containsKey(Integer.valueOf(id2))) {
                this.f2689h.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = (a) this.f2689h.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof ConstraintHelper) {
                    aVar2.i((ConstraintHelper) childAt, id2, aVar);
                }
                aVar2.h(id2, aVar);
            }
        }
    }

    public void r(int i10, int i11, int i12, float f10) {
        b bVar = u(i10).f2694e;
        bVar.B = i11;
        bVar.C = i12;
        bVar.D = f10;
    }

    public a v(int i10) {
        if (this.f2689h.containsKey(Integer.valueOf(i10))) {
            return (a) this.f2689h.get(Integer.valueOf(i10));
        }
        return null;
    }

    public int w(int i10) {
        return u(i10).f2694e.f2719e;
    }

    public int[] x() {
        Integer[] numArr = (Integer[]) this.f2689h.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public a y(int i10) {
        return u(i10);
    }

    public int z(int i10) {
        return u(i10).f2692c.f2770b;
    }
}
