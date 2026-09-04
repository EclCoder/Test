package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.L0;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f25153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3322t9 f25154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f25155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f25157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f25158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdQualityControl f25159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Yn f25160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdQualityResult f25161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JSONObject f25163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f25164l;

    public final void a(String str, byte[] bArr, boolean z10) {
        Context context = Xi.f26021a;
        if (context != null) {
            Vj vj2 = new Vj(context.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
            if (!z10) {
                this.f25158f.add(vj2);
            }
            AbstractC2924e.a(vj2, new J0(this, z10, vj2, str), null, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002e: INVOKE 
                  (r1v1 'vj2' com.inmobi.media.Vj)
                  (wrap com.inmobi.media.J0:0x002b: CONSTRUCTOR 
                  (r2v0 'this' com.inmobi.media.L0 A[IMMUTABLE_TYPE, THIS])
                  (r5v0 'z10' boolean)
                  (r1v1 'vj2' com.inmobi.media.Vj)
                  (r3v0 'str' java.lang.String)
                 A[MD:(com.inmobi.media.L0, boolean, com.inmobi.media.Vj, java.lang.String):void (m), WRAPPED] (LINE:5) call: com.inmobi.media.J0.<init>(com.inmobi.media.L0, boolean, com.inmobi.media.Vj, java.lang.String):void type: CONSTRUCTOR)
                  (null java.lang.Long)
                  (wrap tl.a:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:2) call: yh.i8.<init>():void type: CONSTRUCTOR)
                 STATIC call: com.inmobi.media.e.a(com.inmobi.media.M0, com.inmobi.media.Ng, java.lang.Long, tl.a):void A[MD:(com.inmobi.media.M0, com.inmobi.media.Ng, java.lang.Long, tl.a):void (m)] (LINE:3) in method: com.inmobi.media.L0.a(java.lang.String, byte[], boolean):void, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: yh.i8, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 23 more
                */
            /*
                this = this;
                android.content.Context r0 = com.inmobi.media.Xi.f26021a
                if (r0 == 0) goto L31
                java.io.File r0 = r0.getFilesDir()
                java.lang.String r0 = r0.getAbsolutePath()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = "/adQuality/screenshots"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.inmobi.media.Vj r1 = new com.inmobi.media.Vj
                r1.<init>(r0, r4)
                if (r5 != 0) goto L29
                java.util.concurrent.CopyOnWriteArrayList r4 = r2.f25158f
                r4.add(r1)
            L29:
                com.inmobi.media.J0 r4 = new com.inmobi.media.J0
                r4.<init>(r2, r5, r1, r3)
                com.inmobi.media.AbstractC2924e.a(r1, r4)
            L31:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L0.a(java.lang.String, byte[], boolean):void");
        }

        public L0(AdConfig.AdQualityConfig adQualityConfig, InterfaceC3322t9 interfaceC3322t9) {
            kotlin.jvm.internal.s.h(adQualityConfig, "adQualityConfig");
            this.f25153a = adQualityConfig;
            this.f25154b = interfaceC3322t9;
            this.f25155c = new AtomicBoolean(false);
            this.f25156d = new AtomicBoolean(false);
            this.f25157e = new AtomicBoolean(false);
            this.f25158f = new CopyOnWriteArrayList();
            this.f25160h = Yn.UNKNOWN;
            this.f25162j = QGbBllacZSmHKn.ljrtGpYHejE;
            this.f25163k = new JSONObject();
            this.f25164l = new AtomicBoolean(false);
        }

        public final void a(Activity activity, String url, boolean z10, JSONObject extras, Zh listener) {
            kotlin.jvm.internal.s.h(activity, "activity");
            kotlin.jvm.internal.s.h(url, "url");
            kotlin.jvm.internal.s.h(extras, "extras");
            kotlin.jvm.internal.s.h(listener, "listener");
            if (extras.length() > 0 && url.length() > 0) {
                this.f25162j = url;
                this.f25163k = extras;
                a("report ad starting");
                if (z10) {
                    a("report ad capture");
                    a(activity, 0L, true, listener);
                    return;
                } else {
                    a("report ad report");
                    a(new AdQualityResult("", null, url, extras.toString()), false);
                    return;
                }
            }
            listener.f26152a.h("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + url + " , extras - " + extras, (Exception) null);
        }

        public final void a(GestureDetectorOnGestureListenerC3228pi view, String url, boolean z10, JSONObject extras, Zh listener) {
            kotlin.jvm.internal.s.h(view, "view");
            kotlin.jvm.internal.s.h(url, "url");
            kotlin.jvm.internal.s.h(extras, "extras");
            kotlin.jvm.internal.s.h(listener, "listener");
            if (extras.length() > 0 && url.length() > 0) {
                this.f25162j = url;
                this.f25163k = extras;
                if (z10) {
                    a(view, 0L, true, listener);
                    return;
                } else {
                    a(new AdQualityResult("", null, url, extras.toString()), false);
                    return;
                }
            }
            listener.f26152a.h("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + url + " , extras - " + extras, (Exception) null);
        }

        public final boolean a() {
            if (this.f25155c.get()) {
                a("ad quality session is already in progress. skipping...");
                return false;
            }
            if (!this.f25153a.getEnabled()) {
                a("config kill switch while state check - false. ad quality will skip");
                return false;
            }
            if (this.f25159g == null) {
                a("setup not done. skipping");
                return false;
            }
            Yn yn2 = this.f25160h;
            if (yn2 != Yn.UNKNOWN && yn2 != Yn.HIDDEN) {
                return true;
            }
            a("ad view is not visible. skipping");
            return false;
        }

        public final void a(AdQualityResult adQualityResult, boolean z10) {
            if (adQualityResult.getBeaconUrl().length() != 0) {
                AbstractC2924e.a(new C3356uh(adQualityResult), new I0(this, z10), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: INVOKE 
                      (wrap com.inmobi.media.uh:0x0012: CONSTRUCTOR (r2v0 'adQualityResult' com.inmobi.adquality.models.AdQualityResult) A[MD:(com.inmobi.adquality.models.AdQualityResult):void (m), WRAPPED] (LINE:38) call: com.inmobi.media.uh.<init>(com.inmobi.adquality.models.AdQualityResult):void type: CONSTRUCTOR)
                      (wrap com.inmobi.media.I0:0x0017: CONSTRUCTOR (r1v0 'this' com.inmobi.media.L0 A[IMMUTABLE_TYPE, THIS]), (r3v0 'z10' boolean) A[MD:(com.inmobi.media.L0, boolean):void (m), WRAPPED] (LINE:39) call: com.inmobi.media.I0.<init>(com.inmobi.media.L0, boolean):void type: CONSTRUCTOR)
                      (null java.lang.Long)
                      (wrap tl.a:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:2) call: yh.i8.<init>():void type: CONSTRUCTOR)
                     STATIC call: com.inmobi.media.e.a(com.inmobi.media.M0, com.inmobi.media.Ng, java.lang.Long, tl.a):void A[MD:(com.inmobi.media.M0, com.inmobi.media.Ng, java.lang.Long, tl.a):void (m)] (LINE:3) in method: com.inmobi.media.L0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: yh.i8, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 21 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = r2.getBeaconUrl()
                    int r0 = r0.length()
                    if (r0 != 0) goto L10
                    java.lang.String r2 = "beacon is empty"
                    r1.a(r2)
                    return
                L10:
                    com.inmobi.media.uh r0 = new com.inmobi.media.uh
                    r0.<init>(r2)
                    com.inmobi.media.I0 r2 = new com.inmobi.media.I0
                    r2.<init>(r1, r3)
                    com.inmobi.media.AbstractC2924e.a(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void");
            }

            public final void a(final GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, final long j10, final boolean z10, final Zh zh2) {
                a("isCapture started - " + this.f25164l.get() + ", isReporting - " + z10);
                if (this.f25164l.get() && !z10) {
                    a("Screenshot process already in progress... skipping...", (Exception) null);
                } else {
                    gestureDetectorOnGestureListenerC3228pi.post(new Runnable() { // from class: yh.g2
                        @Override // java.lang.Runnable
                        public final void run() {
                            L0.a(this.f57723a, gestureDetectorOnGestureListenerC3228pi, j10, z10, zh2);
                        }
                    });
                }
            }

            public static final void a(L0 l10, View adView, long j10, boolean z10, Zh zh2) {
                l10.getClass();
                kotlin.jvm.internal.s.h(adView, "adView");
                l10.a(new Vi(adView, l10.f25153a), j10, z10, zh2);
                l10.f25164l.set(!z10);
            }

            public final void a(final Activity activity, final long j10, final boolean z10, final Zh zh2) {
                a("isCapture started - " + this.f25164l.get() + ", isReporting - " + z10);
                if (this.f25164l.get() && !z10) {
                    a("Screenshot process already in progress... skipping...", (Exception) null);
                } else {
                    activity.getWindow().getDecorView().post(new Runnable() { // from class: yh.e2
                        @Override // java.lang.Runnable
                        public final void run() {
                            L0.a(this.f57680a, activity, j10, z10, zh2);
                        }
                    });
                }
            }

            public static final void a(L0 l10, Activity activity, long j10, boolean z10, Zh zh2) {
                l10.a("activity is visible");
                Window window = activity.getWindow();
                kotlin.jvm.internal.s.g(window, "getWindow(...)");
                kotlin.jvm.internal.s.h(window, "window");
                l10.a(new C3483zg(window, l10.f25153a), j10, z10, zh2);
                l10.f25164l.set(!z10);
            }

            public final void a(AbstractC3341u2 abstractC3341u2, long j10, boolean z10, Zh zh2) {
                if (!z10) {
                    this.f25158f.add(abstractC3341u2);
                }
                AbstractC2924e.a(abstractC3341u2, new K0(this, abstractC3341u2, z10, zh2), Long.valueOf(j10), new tl.a() { // from class: yh.f2
                    @Override // tl.a
                    public final Object invoke() {
                        return Boolean.valueOf(L0.a(this.f57703a));
                    }
                });
            }

            public static final boolean a(L0 l10) {
                return l10.f25160h == Yn.VISIBLE;
            }

            public final void a(Bitmap bitmap, M0 process, boolean z10, Zh zh2) {
                String beacon;
                kotlin.jvm.internal.s.h(process, "process");
                a("Screen shot result received - isReporting - " + z10);
                this.f25158f.remove(process);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmap != null) {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (bitmap != null && zh2 != null) {
                    zh2.f26152a.h("window.mraidview.broadcastEvent('ScreenshotSuccess')");
                }
                if (!z10) {
                    AdQualityControl adQualityControl = this.f25159g;
                    if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                        a("saving to file - beacon - " + beacon);
                        kotlin.jvm.internal.s.e(byteArray);
                        a(beacon, byteArray, false);
                    }
                } else {
                    String str = this.f25162j;
                    kotlin.jvm.internal.s.e(byteArray);
                    a(str, byteArray, true);
                }
                this.f25164l.set(false);
            }

            public final void a(Exception exc, M0 process) {
                kotlin.jvm.internal.s.h(process, "process");
                a("error in running process - " + process.getClass().getSimpleName(), exc);
                this.f25158f.remove(process);
                a(true);
            }

            public final void a(String result, M0 process, String beacon, boolean z10) {
                kotlin.jvm.internal.s.h(result, "result");
                kotlin.jvm.internal.s.h(process, "process");
                kotlin.jvm.internal.s.h(beacon, "beacon");
                if (z10) {
                    a(new AdQualityResult(result, null, beacon, this.f25163k.toString()), false);
                    return;
                }
                this.f25158f.remove(process);
                AdQualityResult adQualityResult = this.f25161i;
                if (adQualityResult != null) {
                    adQualityResult.setImageLocation(result);
                } else {
                    this.f25161i = new AdQualityResult(result, null, beacon, null, 8, null);
                }
                a("file is saved. result - " + this.f25161i);
                a(true);
            }

            public final void a(boolean z10) {
                String beacon;
                AdQualityControl adQualityControl = this.f25159g;
                if (adQualityControl == null || (beacon = adQualityControl.getBeacon()) == null) {
                    return;
                }
                if (this.f25158f.isEmpty() && this.f25156d.get() && !this.f25157e.get()) {
                    this.f25157e.set(true);
                    a("session end - queuing result");
                    AdQualityResult adQualityResult = this.f25161i;
                    if (adQualityResult == null) {
                        adQualityResult = new AdQualityResult("null", null, beacon, null, 8, null);
                    }
                    a(adQualityResult, true);
                    return;
                }
                if (this.f25156d.get() && !z10 && !this.f25157e.get()) {
                    this.f25157e.set(true);
                    a("session stop - queuing result");
                    em.o0 o0Var = E0.f24687e;
                    if (o0Var != null) {
                        em.p0.b(o0Var, new CancellationException("Shutdown"));
                    }
                    E0.f24687e = null;
                    AdQualityResult adQualityResult2 = this.f25161i;
                    if (adQualityResult2 == null) {
                        adQualityResult2 = new AdQualityResult("null", null, beacon, null, 8, null);
                    }
                    a(adQualityResult2, true);
                    return;
                }
                this.f25158f.size();
                this.f25156d.get();
                Objects.toString(this.f25157e);
            }

            public final void a(String str) {
                InterfaceC3322t9 interfaceC3322t9 = this.f25154b;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).a("AdQualityManager", str);
                }
            }

            public final void a(String str, Exception exc) {
                fl.g0 g0Var;
                if (exc != null) {
                    InterfaceC3322t9 interfaceC3322t9 = this.f25154b;
                    if (interfaceC3322t9 != null) {
                        ((C3348u9) interfaceC3322t9).a("AdQualityManager", str, exc);
                        g0Var = fl.g0.f38750a;
                    } else {
                        g0Var = null;
                    }
                    if (g0Var != null) {
                        return;
                    }
                }
                InterfaceC3322t9 interfaceC3322t10 = this.f25154b;
                if (interfaceC3322t10 != null) {
                    ((C3348u9) interfaceC3322t10).b("AdQualityManager", "Error with null exception : " + str);
                    fl.g0 g0Var2 = fl.g0.f38750a;
                }
            }
        }
