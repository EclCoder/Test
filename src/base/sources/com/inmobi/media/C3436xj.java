package com.inmobi.media;

import com.inmobi.media.C3436xj;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.xj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3436xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3322t9 f27867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27868b = 101;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f27869c = gl.r.g(101);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f27870d;

    public C3436xj(InterfaceC3322t9 interfaceC3322t9) {
        this.f27867a = interfaceC3322t9;
        List listO = gl.r.o(new Pk(101, 1, 102, new tl.a() { // from class: yh.pc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.a(this.f57884a);
            }
        }), new Pk(101, 4, 104, new tl.a() { // from class: yh.qc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.b(this.f57897a);
            }
        }), new Pk(102, 2, 103, new tl.a() { // from class: yh.rc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.l(this.f57913a);
            }
        }), new Pk(102, 3, 104, new tl.a() { // from class: yh.sc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.m(this.f57929a);
            }
        }), new Pk(102, 4, 104, new tl.a() { // from class: yh.tc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.n(this.f57949a);
            }
        }), new Pk(102, 8, 107, new tl.a() { // from class: yh.uc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.o(this.f57964a);
            }
        }), new Pk(102, 5, 105, new tl.a() { // from class: yh.vc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.p(this.f57978a);
            }
        }), new Pk(103, 5, 105, new tl.a() { // from class: yh.wc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.q(this.f57994a);
            }
        }), new Pk(106, 5, 105, new tl.a() { // from class: yh.xc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.r(this.f58011a);
            }
        }), new Pk(106, 7, 105, new tl.a() { // from class: yh.yc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.s(this.f58030a);
            }
        }), new Pk(103, 8, 107, new tl.a() { // from class: yh.zc
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.c(this.f58050a);
            }
        }), new Pk(103, 4, 104, new tl.a() { // from class: yh.ad
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.d(this.f57606a);
            }
        }), new Pk(106, 2, 106, new tl.a() { // from class: yh.bd
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.e(this.f57626a);
            }
        }), new Pk(106, 4, 104, new tl.a() { // from class: yh.cd
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.f(this.f57648a);
            }
        }), new Pk(106, 8, 107, new tl.a() { // from class: yh.dd
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.g(this.f57671a);
            }
        }), new Pk(104, 8, 107, new tl.a() { // from class: yh.ed
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.h(this.f57701a);
            }
        }), new Pk(105, 7, 106, new tl.a() { // from class: yh.fd
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.i(this.f57720a);
            }
        }), new Pk(105, 4, 104, new tl.a() { // from class: yh.gd
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.j(this.f57745a);
            }
        }), new Pk(105, 2, 105, new tl.a() { // from class: yh.hd
            @Override // tl.a
            public final Object invoke() {
                return C3436xj.k(this.f57762a);
            }
        }));
        LinkedHashMap linkedHashMap = new LinkedHashMap(yl.g.d(gl.l0.e(gl.r.v(listO, 10)), 16));
        for (Object obj : listO) {
            Pk pk2 = (Pk) obj;
            linkedHashMap.put(fl.w.a(Integer.valueOf(pk2.f25506a), Integer.valueOf(pk2.f25507b)), obj);
        }
        this.f27870d = linkedHashMap;
    }

    public static final fl.g0 a(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "SDK loads HTML in EndCardWebView");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 b(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "Error: Render process gone from IDLE");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 c(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "WebView destroyed from LOADED");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 d(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "Error: WebView load FAILED due to Render Process Gone from LOADED");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 e(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "FireAdReady came in shown and Invisible state, no change in state");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 f(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "Error: Render process gone from INVISIBLE");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 g(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "WebView destroyed when it is not visible");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 h(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "WebView destroyed from FAILED");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 i(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "WebView invisible from SHOWN");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 j(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "Error: Render process gone from SHOWN");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 k(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "FireAdReady came in SHOWN state, no change in state");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 l(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", " Fire Ad ready from LOADING");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 m(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", " Fire Ad failed from LOADING");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 n(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "Error: Render process gone from LOADING");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 o(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", " WebView destroyed from LOADING");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 p(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", " WebView Show called and started rendering from LOADING");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 q(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "WebView Show called and started rendering from LOADED");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 r(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "WebView Show called on a view part of viewHierarchy but not on top");
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 s(C3436xj c3436xj) {
        InterfaceC3322t9 interfaceC3322t9 = c3436xj.f27867a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("StateMachine", "Focus changed from Invisible to show");
        }
        return fl.g0.f38750a;
    }

    public final Integer a(int i10) {
        String str;
        Pk pk2 = (Pk) this.f27870d.get(fl.w.a(Integer.valueOf(this.f27868b), Integer.valueOf(i10)));
        if (pk2 != null) {
            pk2.f25509d.invoke();
            Map map = AbstractC3461yj.f27959a;
            int i11 = this.f27868b;
            Map map2 = AbstractC3461yj.f27959a;
            String str2 = (String) map2.get(Integer.valueOf(i11));
            switch (i10) {
                case 1:
                    str = "IMRAID_LOAD_WEBVIEW";
                    break;
                case 2:
                    str = "FIRE_AD_READY";
                    break;
                case 3:
                    str = "FIRE_AD_FAILED";
                    break;
                case 4:
                    str = "ON_RENDER_PROCESS_GONE";
                    break;
                case 5:
                    str = "SHOW_WEBVIEW";
                    break;
                case 6:
                    str = "IMRAID_RENDERED";
                    break;
                case 7:
                    str = "IMRAID_FOCUS_CHANGE";
                    break;
                case 8:
                    str = "IMRAID_DESTROY_WEBVIEW";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            System.out.println((Object) ("Transition: " + str2 + " --[" + str + "]--> " + ((String) map2.get(Integer.valueOf(pk2.f25508c)))));
            this.f27869c.add(Integer.valueOf(pk2.f25508c));
            InterfaceC3322t9 interfaceC3322t9 = this.f27867a;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("StateMachine", "history - " + this.f27869c);
            }
            this.f27868b = pk2.f25508c;
            return null;
        }
        return Integer.valueOf(this.f27868b);
    }
}
